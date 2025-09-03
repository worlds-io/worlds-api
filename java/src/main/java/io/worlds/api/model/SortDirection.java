package io.worlds.api.model;

/**
 * Indicates the direction of sorting based on a particular field's value.
 */
public enum SortDirection {

    /**
     * Sort the resulting list in ascending order.
     */
    ASC("ASC"),
    /**
     * Sort the resulting list in descending order.
     */
    DESC("DESC");

    private final String graphqlName;

    private SortDirection(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
