package io.worlds.api.model;

/**
 * Indicates the type of data that is outputted by a [`sensor`]({{Types.Sensor}}).
 */
public enum SensorType {

    /**
     * Numeric data types, i.e integers, floats, and doubles.
     */
    NUMBER("NUMBER"),
    /**
     * Boolean data types, i.e true or false.
     */
    BOOLEAN("BOOLEAN"),
    /**
     * Text-based data types.
     */
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
