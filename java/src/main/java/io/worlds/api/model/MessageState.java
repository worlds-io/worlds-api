package io.worlds.api.model;

/**
 * Indicates the state of a message from a subscription.
 */
public enum MessageState {

    /**
     * The start of the messages for a given group of messages.
     */
    START("START"),
    /**
     * An update to an existing group of messages.
     */
    UPDATE("UPDATE"),
    /**
     * The ending of an existing group of messages.
     */
    END("END");

    private final String graphqlName;

    private MessageState(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
