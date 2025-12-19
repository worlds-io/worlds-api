package io.worlds.api.model;

/**
 * Indicates the field used for sorting an [`sites` query]({{Queries.sites}}).
 */
public enum SitesSortField {

    /**
     * Sort the resulting list by the [`sites`](({{Types.Site}}))'s unique identifier.
     */
    ID("ID"),
    /**
     * Sort the resulting list by the [`sites`](({{Types.Site}}))'s name.
     */
    NAME("NAME");

    private final String graphqlName;

    private SitesSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
