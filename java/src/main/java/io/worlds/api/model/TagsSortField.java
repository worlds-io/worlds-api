package io.worlds.api.model;

/**
 * Indicates the field used for sorting a [Tags query]({{Queries.tags}}).
 */
public enum TagsSortField {

    /**
     * Sort the resulting list in by its unique identifier.
     */
    ID("ID"),
    /**
     * Sort the resulting list by the tag name.
     */
    LABEL_NAME("LABEL_NAME");

    private final String graphqlName;

    private TagsSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
