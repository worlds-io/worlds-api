package io.worlds.api.model;

/**
 * Indicates the resolution level for position bucketing. Higher resolutions produce smaller cells.
Options will either be a H3 resolution (`RESOLUTION_0` through `RESOLUTION_15`), or a semantic name referring to one of the H3 resolutions.
On average, the area of a cell divides by 7 at each new resolution.
Refer to [the H3 docs](https://h3geo.org/docs/core-library/restable) for more detailed statistics on resolution.
 */
public enum PositionBucketPrecision {

    /**
     * H3 resolution 0 (~4.3 million km² average cell area)
     */
    RESOLUTION_0("RESOLUTION_0"),
    /**
     * Extra-large-scale resolution, ~4.3 million km² per cell. Alias for `RESOLUTION_0`
     */
    CONTINENTAL("CONTINENTAL"),
    /**
     * H3 resolution 1 (~600,000 km²)
     */
    RESOLUTION_1("RESOLUTION_1"),
    /**
     * H3 resolution 2 (~87,000 km²)
     */
    RESOLUTION_2("RESOLUTION_2"),
    /**
     * H3 resolution 3 (~12,000 km²)
     */
    RESOLUTION_3("RESOLUTION_3"),
    /**
     * H3 resolution 4 (~1,770 km²)
     */
    RESOLUTION_4("RESOLUTION_4"),
    /**
     * Large-scale resolution, ~1,700 km² per cell. Alias for `RESOLUTION_5`
     */
    REGIONAL("REGIONAL"),
    /**
     * H3 resolution 5 (~253 km²)
     */
    RESOLUTION_5("RESOLUTION_5"),
    /**
     * H3 resolution 6 (~36 km²)
     */
    RESOLUTION_6("RESOLUTION_6"),
    /**
     * H3 resolution 7 (~5 km²)
     */
    RESOLUTION_7("RESOLUTION_7"),
    /**
     * Medium-scale resolution, ~5 km² per cell. Alias for `RESOLUTION_7`
     */
    DISTRICT("DISTRICT"),
    /**
     * H3 resolution 8 (~0.7 km²)
     */
    RESOLUTION_8("RESOLUTION_8"),
    /**
     * H3 resolution 9 (~0.1 km² or ~100,000 m²)
     */
    RESOLUTION_9("RESOLUTION_9"),
    /**
     * Small-scale resolution, ~100,000 m² per cell. Alias for `RESOLUTION_9`
     */
    NEIGHBORHOOD("NEIGHBORHOOD"),
    /**
     * H3 resolution 10 (~15,000 m²)
     */
    RESOLUTION_10("RESOLUTION_10"),
    /**
     * H3 resolution 11 (~2,000 m²)
     */
    RESOLUTION_11("RESOLUTION_11"),
    /**
     * Small-scale resolution, ~2,000 m² per cell. Alias for `RESOLUTION_11`
     */
    BUILDING("BUILDING"),
    /**
     * H3 resolution 12 (~300 m²)
     */
    RESOLUTION_12("RESOLUTION_12"),
    /**
     * H3 resolution 13 (~40 m²)
     */
    RESOLUTION_13("RESOLUTION_13"),
    /**
     * H3 resolution 14 (~6 m²)
     */
    RESOLUTION_14("RESOLUTION_14"),
    /**
     * H3 resolution 15 (~0.9 m²)
     */
    RESOLUTION_15("RESOLUTION_15");

    private final String graphqlName;

    private PositionBucketPrecision(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
