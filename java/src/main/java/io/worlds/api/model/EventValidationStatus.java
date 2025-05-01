package io.worlds.api.model;

public enum EventValidationStatus {

    VALID("VALID"),
    INVALID("INVALID");

    private final String graphqlName;

    private EventValidationStatus(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
