package io.worlds.api.model;

public enum ChronicleValidationStatus {

    VALID("VALID"),
    INVALID("INVALID");

    private final String graphqlName;

    private ChronicleValidationStatus(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
