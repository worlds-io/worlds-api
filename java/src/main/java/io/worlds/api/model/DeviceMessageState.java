package io.worlds.api.model;

/**
 * Indicates the state of a message from a `devices` subscription.
 */
public enum DeviceMessageState {

    /**
     * A new device is created.
     */
    CREATE("CREATE"),
    /**
     * A device is updated.
     */
    UPDATE("UPDATE"),
    /**
     * A device receives a new `lastHeartbeat`.
     */
    HEARTBEAT("HEARTBEAT");

    private final String graphqlName;

    private DeviceMessageState(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
