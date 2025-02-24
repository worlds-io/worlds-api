package io.worlds.api.model;

public enum MeasurementsSortField {

    ID("ID"),
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
