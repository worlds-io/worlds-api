package io.worlds.api.model;

/**
 * The state of a [video sync]({{Types.VideoSync}}).

Also covers videos with no sync request, so a caller can tell whether to offer one.
 */
public enum VideoSyncState {

    /**
     * The video cannot be synced. Its device has no site, or its site has no edge.
     */
    NOT_SYNCABLE("NOT_SYNCABLE"),
    /**
     * Still recording and not yet being synced.
     */
    RECORDING("RECORDING"),
    /**
     * Finished recording but not requested for sync.
     */
    NOT_REQUESTED("NOT_REQUESTED"),
    /**
     * Sync has been requested from the edge.
     */
    REQUESTED("REQUESTED"),
    /**
     * The edge has acknowledged the request but has not started copying.
     */
    ACCEPTED("ACCEPTED"),
    /**
     * The edge is copying the video's footage to the hub.
     */
    IN_PROGRESS("IN_PROGRESS"),
    /**
     * Recording with live sync, so the video is already cloud-available.
     */
    LIVE("LIVE"),
    /**
     * The video's footage has been copied to the hub.
     */
    SUCCEEDED("SUCCEEDED"),
    /**
     * The sync failed. See [`VideoSync.error`]({{Types.VideoSync}}).
     */
    FAILED("FAILED"),
    /**
     * A cancel has been requested.
     */
    CANCELLING("CANCELLING"),
    /**
     * The sync was cancelled before it completed.
     */
    CANCELLED("CANCELLED");

    private final String graphqlName;

    private VideoSyncState(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
