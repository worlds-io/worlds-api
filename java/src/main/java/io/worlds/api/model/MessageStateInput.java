package io.worlds.api.model;

public enum MessageStateInput {

    START("START"),
    END("END");

    private final String graphqlName;

    private MessageStateInput(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
