package io.worlds.api.model;

public enum ChronicleDocumentProducersSortField {

    ID("ID"),
    NAME("NAME");

    private final String graphqlName;

    private ChronicleDocumentProducersSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
