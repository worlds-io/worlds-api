package io.worlds.api.model;

/**
 * Indicates the field used for sorting a [`dataSources` query]({{Queries.dataSources}}).
 */
public enum DataSourceSortField {

    /**
     * Sort the resulting list in by its unique identifier.
     */
    ID("ID"),
    /**
     * Sort the resulting list by the device name.
     */
    NAME("NAME");

    private final String graphqlName;

    private DataSourceSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
