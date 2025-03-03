package io.worlds.api.model;

public enum SensorType {

    NUMBER("NUMBER"),
    BOOLEAN("BOOLEAN"),
    TEXT("TEXT");

    private final String graphqlName;

    private SensorType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
