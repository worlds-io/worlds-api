package io.worlds.api.model;

/**
 * Indicates the field used for sorting an `summaryChronicles` query.
 */
public enum SummaryChronicleSortField {

    /**
     * Sort the resulting list by the `summaryChronicle`'s unique identifier.
     */
    ID("ID"),
    /**
     * Sort the resulting list by the `summaryChronicle`'s start time.
     */
    START_TIME("START_TIME"),
    /**
     * Sort the resulting list by the `summaryChronicle`'s end time.
     */
    END_TIME("END_TIME"),
    /**
     * Sort the resulting list by the `summaryChronicle`'s name.
     */
    NAME("NAME"),
    /**
     * Sort the resulting list by the `summaryChronicle`'s priority.
     */
    PRIORITY("PRIORITY"),
    /**
     * Sort the resulting list by the `summaryChronicle`'s status.
     */
    STATUS("STATUS");

    private final String graphqlName;

    private SummaryChronicleSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
