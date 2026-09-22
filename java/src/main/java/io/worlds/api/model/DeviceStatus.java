package io.worlds.api.model;

/**
 * The online status of a [`Device`]({{Types.Device}}), as judged from its heartbeats.
 */
public enum DeviceStatus {

    /**
     * The device has sent a heartbeat within the subscription's `ttl`.
     */
    ONLINE("ONLINE"),
    /**
     * The device's last heartbeat is older than the subscription's `ttl`, or it has never sent one.
     */
    OFFLINE("OFFLINE");

    private final String graphqlName;

    private DeviceStatus(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
