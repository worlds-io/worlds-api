package io.worlds.api.model;

/**
 * The six planes of the World Model. Every node type belongs to exactly one.
 */
public enum WorldModelPlane {

    /**
     * What is supposed to happen: process, step, pattern and equipment definitions.
     */
    DEFINITIONAL("DEFINITIONAL"),
    /**
     * Where: sites, buildings, floors, zones, regions, fixtures, paths, sensors.
     */
    SPATIAL("SPATIAL"),
    /**
     * What things are: durable assets and the units that flow through a process.
     */
    ASSET("ASSET"),
    /**
     * What was seen: executions, deviations, associations.
     */
    OBSERVATION("OBSERVATION"),
    /**
     * Rules in force: thresholds, policies, SLAs, schedules, positions.
     */
    CONTEXT("CONTEXT"),
    /**
     * How other systems connect: systems, connectors, capabilities.
     */
    INTEGRATION("INTEGRATION");

    private final String graphqlName;

    private WorldModelPlane(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
