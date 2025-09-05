package io.worlds.api.model;

/**
 * Indicates the field used for sorting an [`summaries` query]({{Queries.summaryChronicles}}).
 */
public enum SummaryChronicleSortField {

    /**
     * 
Sort the resulting list by the [`summaryChronicle`]({{Types.summaryChronicle}})'s unique identifier.
     */
    ID("ID"),
    /**
     * 
Sort the resulting list by the [`summaryChronicle`]({{Types.summaryChronicle}})'s start time.
     */
    START_TIME("START_TIME"),
    /**
     * 
Sort the resulting list by the [`summaryChronicle`]({{Types.summaryChronicle}})'s end time.
     */
    END_TIME("END_TIME"),
    /**
     * 
Sort the resulting list by the [`summaryChronicle`]({{Types.summaryChronicle}})'s name.
     */
    NAME("NAME"),
    /**
     * 
Sort the resulting list by the [`summaryChronicle`]({{Types.summaryChronicle}})'s priority.
     */
    PRIORITY("PRIORITY"),
    /**
     * 
Sort the resulting list by the [`summaryChronicle`]({{Types.summaryChronicle}})'s status.
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
