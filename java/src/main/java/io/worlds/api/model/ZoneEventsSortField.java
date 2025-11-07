package io.worlds.api.model;

/**
 * Indicates the field used for sorting a [zoneEvents query]({{Queries.zoneEvents}}).
 */
public enum ZoneEventsSortField {

    /**
     * Sort the resulting list in by its unique identifier.
     */
    ID("ID"),
    /**
     * Sort the resulting list by the track start time.
     */
    START_TIME("START_TIME");

    private final String graphqlName;

    private ZoneEventsSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
