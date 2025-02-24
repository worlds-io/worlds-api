package io.worlds.api.model;

public enum GeofenceEventsSortField {

    ID("ID"),
    OCCURRED("OCCURRED");

    private final String graphqlName;

    private GeofenceEventsSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
