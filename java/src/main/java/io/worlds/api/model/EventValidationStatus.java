package io.worlds.api.model;

/**
 * Used in [EventValidationInput]({{Types.EventValidationInput}}) to indicate whether an event is `VALID` or `INVALID`.
 */
public enum EventValidationStatus {

    /**
     * The event is valid.
     */
    VALID("VALID"),
    /**
     * The event is invalid.
     */
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
