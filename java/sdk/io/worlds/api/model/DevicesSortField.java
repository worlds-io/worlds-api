package io.worlds.api.model;

public enum DevicesSortField {

    ID("ID"),
    NAME("NAME");

    private final String graphqlName;

    private DevicesSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
