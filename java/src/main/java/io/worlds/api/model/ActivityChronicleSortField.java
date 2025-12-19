package io.worlds.api.model;

/**
 * Indicates the field used for sorting an [`activityChronicles` query]({{Queries.activityChronicles}}).
 */
public enum ActivityChronicleSortField {

    /**
     * Sort the resulting list by the [`activityChronicle`]({{Types.ActivityChronicle}})'s unique identifier.
     */
    ID("ID"),
    /**
     * Sort the resulting list by the [`activityChronicle`]({{Types.ActivityChronicle}})'s start time.
     */
    START_TIME("START_TIME"),
    /**
     * Sort the resulting list by the [`activityChronicle`]({{Types.ActivityChronicle}})'s end time.
     */
    END_TIME("END_TIME"),
    /**
     * Sort the resulting list by the [`activityChronicle`]({{Types.ActivityChronicle}})'s name.
     */
    NAME("NAME"),
    /**
     * Sort the resulting list by the [`activityChronicle`]({{Types.ActivityChronicle}})'s priority.
     */
    PRIORITY("PRIORITY"),
    /**
     * Sort the resulting list by the [`activityChronicle`]({{Types.ActivityChronicle}})'s status.
     */
    STATUS("STATUS");

    private final String graphqlName;

    private ActivityChronicleSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
