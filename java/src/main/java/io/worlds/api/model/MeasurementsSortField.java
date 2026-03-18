package io.worlds.api.model;

/**
 * Indicates the field used for sorting a [`measurements` query]({{Queries.measurements}}).
 */
public enum MeasurementsSortField {

    /**
     * Sort the resulting list by the [`Measurement`](({{Types.Measurement}}))'s unique identifier.
     */
    ID("ID"),
    /**
     * Sort the resulting list by the [`Measurement`](({{Types.Measurement}}))'s timestamp.
     */
    TIMESTAMP("TIMESTAMP");

    private final String graphqlName;

    private MeasurementsSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
