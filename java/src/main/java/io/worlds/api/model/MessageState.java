package io.worlds.api.model;

public enum MessageState {

    START("START"),
    UPDATE("UPDATE"),
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
