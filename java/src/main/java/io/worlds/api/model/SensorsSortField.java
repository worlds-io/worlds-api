package io.worlds.api.model;

/**
 * Indicates the field used for sorting an [`sensors` query]({{Queries.sensors}}).
 */
public enum SensorsSortField {

    /**
     * Sort the resulting list by the [`sensor`](({{Types.Sensor}}))'s unique identifier.
     */
    ID("ID"),
    /**
     * Sort the resulting list by the [`sensor`](({{Types.Sensor}}))'s name.
     */
    NAME("NAME");

    private final String graphqlName;

    private SensorsSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
