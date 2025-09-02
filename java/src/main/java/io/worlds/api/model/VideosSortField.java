package io.worlds.api.model;

/**
 * Indicates the field used for sorting a [Videos query]({{Queries.videos}}).
 */
public enum VideosSortField {

    /**
     * Sort the resulting list in by its unique identifier.
     */
    ID("ID"),
    /**
     * Sort the resulting list by the datasource identifier.
     */
    DATA_SOURCE_ID("DATA_SOURCE_ID"),
    /**
     * Sort the resulting list by start time.
     */
    START_TIME("START_TIME"),
    /**
     * Sort the resulting list by end time.
     */
    END_TIME("END_TIME");

    private final String graphqlName;

    private VideosSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
