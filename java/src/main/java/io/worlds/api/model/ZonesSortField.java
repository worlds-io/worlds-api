package io.worlds.api.model;

/**
 * Indicates the field used for sorting a [zones query]({{Queries.zones}}).
 */
public enum ZonesSortField {

    /**
     * Sort the resulting list by the zone's unique identifiers.
     */
    ID("ID"),
    /**
     * Sort the resulting list by the zone's names
     */
    NAME("NAME");

    private final String graphqlName;

    private ZonesSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
