package io.worlds.api.model;

/**
 * Which edges of a [WorldModelNode]({{Types.WorldModelNode}}) to return, relative to the node.
 */
public enum WorldModelEdgeDirection {

    /**
     * Edges that start at this node.
     */
    OUTGOING("OUTGOING"),
    /**
     * Edges that end at this node.
     */
    INCOMING("INCOMING"),
    /**
     * Edges in either direction.
     */
    BOTH("BOTH");

    private final String graphqlName;

    private WorldModelEdgeDirection(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
