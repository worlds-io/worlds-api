package io.worlds.api.model;

/**
 * Indicates the field used for sorting an `activityChronicles` query.
 */
public enum ActivityChronicleSortField {

    /**
     * Sort the resulting list by the `activityChronicle`'s unique identifier.
     */
    ID("ID"),
    /**
     * Sort the resulting list by the `activityChronicle`'s start time.
     */
    START_TIME("START_TIME"),
    /**
     * Sort the resulting list by the `activityChronicle`'s end time.
     */
    END_TIME("END_TIME"),
    /**
     * Sort the resulting list by the `activityChronicle`'s name.
     */
    NAME("NAME"),
    /**
     * Sort the resulting list by the `activityChronicle`'s priority.
     */
    PRIORITY("PRIORITY"),
    /**
     * Sort the resulting list by the `activityChronicle`'s status.
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
