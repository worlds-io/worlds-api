package io.worlds.api.model;

public enum ActivityChronicleSortField {

    ID("ID"),
    START_TIME("START_TIME"),
    END_TIME("END_TIME"),
    NAME("NAME"),
    PRIORITY("PRIORITY"),
    STATUS("STATUS");

    private final String graphqlName;

    private ActivityChronicleSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
