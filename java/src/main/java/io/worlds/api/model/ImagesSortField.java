package io.worlds.api.model;

/**
 * Indicates the field used for sorting a [`images` query]({{Queries.images}}).
 */
public enum ImagesSortField {

    /**
     * Sort the resulting list in by its unique identifier.
     */
    ID("ID"),
    /**
     * Sort the resulting list in by the image's data source identifiers.
     */
    DATA_SOURCE_ID("DATA_SOURCE_ID"),
    /**
     * Sort the resulting list by the timestamp.
     */
    TIMESTAMP("TIMESTAMP");

    private final String graphqlName;

    private ImagesSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
