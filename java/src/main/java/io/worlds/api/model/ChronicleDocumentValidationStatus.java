package io.worlds.api.model;

public enum ChronicleDocumentValidationStatus {

    VALID("VALID"),
    INVALID("INVALID");

    private final String graphqlName;

    private ChronicleDocumentValidationStatus(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
