package io.worlds.api.model;

/**
 * Indicates the bucket to group events by in an eventsSummary query.
 */
public enum EventsSummaryBucketField {

    /**
     * Bucket by the event's type
     */
    TYPE("TYPE"),
    /**
     * Bucket by the event's subType
     */
    SUB_TYPE("SUB_TYPE"),
    /**
     * Bucket by the event's eventProducer Id
     */
    EVENT_PRODUCER_ID("EVENT_PRODUCER_ID"),
    /**
     * Bucket by the event's priority
     */
    PRIORITY("PRIORITY"),
    /**
     * Bucket by the event's draft status
     */
    DRAFT("DRAFT"),
    /**
     * Bucket by the event's validation status
     */
    VALIDATION_STATUS("VALIDATION_STATUS");

    private final String graphqlName;

    private EventsSummaryBucketField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
