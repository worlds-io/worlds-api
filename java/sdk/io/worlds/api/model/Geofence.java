package io.worlds.api.model;


public class Geofence implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private String name;
    @jakarta.validation.constraints.NotNull
    private GeofenceBounds bounds;
    private boolean active;

    public Geofence() {
    }

    public Geofence(String id, String name, GeofenceBounds bounds, boolean active) {
        this.id = id;
        this.name = name;
        this.bounds = bounds;
        this.active = active;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public GeofenceBounds getBounds() {
        return bounds;
    }
    public void setBounds(GeofenceBounds bounds) {
        this.bounds = bounds;
    }

    public boolean getActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }



    public static Geofence.Builder builder() {
        return new Geofence.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private GeofenceBounds bounds;
        private boolean active;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setBounds(GeofenceBounds bounds) {
            this.bounds = bounds;
            return this;
        }

        public Builder setActive(boolean active) {
            this.active = active;
            return this;
        }


        public Geofence build() {
            return new Geofence(id, name, bounds, active);
        }

    }
}
