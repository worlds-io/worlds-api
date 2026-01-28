package io.worlds.api.model;

/**
 * A possible entity type of a `unifiedSearch` query.
 */
public enum UnifiedSearchEntityType {

    SITE("SITE"),
    POINT_OF_INTEREST("POINT_OF_INTEREST"),
    DATA_SOURCE("DATA_SOURCE"),
    TAG("TAG");

    private final String graphqlName;

    private UnifiedSearchEntityType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
