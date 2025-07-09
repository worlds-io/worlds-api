package io.worlds.api.model;

public enum EventChronicleSortField {

    ID("ID"),
    TIMESTAMP("TIMESTAMP"),
    NAME("NAME"),
    PRIORITY("PRIORITY"),
    STATUS("STATUS");

    private final String graphqlName;

    private EventChronicleSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
