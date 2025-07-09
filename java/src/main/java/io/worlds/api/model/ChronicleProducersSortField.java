package io.worlds.api.model;

public enum ChronicleProducersSortField {

    ID("ID"),
    NAME("NAME");

    private final String graphqlName;

    private ChronicleProducersSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
