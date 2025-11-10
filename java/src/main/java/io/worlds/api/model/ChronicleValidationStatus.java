package io.worlds.api.model;

/**
 * Used in [ChronicleValidationInput]({{Types.ChronicleValidationInput}}) to indicate whether an chronicle is `VALID` or `INVALID`.
 */
public enum ChronicleValidationStatus {

    /**
     * The chronicle is valid.
     */
    VALID("VALID"),
    /**
     * The chronicle is invalid.
     */
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
