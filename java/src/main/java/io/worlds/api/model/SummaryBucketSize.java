package io.worlds.api.model;

public enum SummaryBucketSize {

    MINUTES("MINUTES"),
    HOURS("HOURS");

    private final String graphqlName;

    private SummaryBucketSize(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
