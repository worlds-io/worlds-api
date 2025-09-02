package io.worlds.api.model;


public class TrackProperty implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String type;
    @jakarta.validation.constraints.NotNull
    private String value;

    public TrackProperty() {
    }

    public TrackProperty(String type, String value) {
        this.type = type;
        this.value = value;
    }

    /**
     * The type or name of the property
     */
    public String getType() {
        return type;
    }
    /**
     * The type or name of the property
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * The stored value of the property
     */
    public String getValue() {
        return value;
    }
    /**
     * The stored value of the property
     */
    public void setValue(String value) {
        this.value = value;
    }



    public static TrackProperty.Builder builder() {
        return new TrackProperty.Builder();
    }

    public static class Builder {

        private String type;
        private String value;

        public Builder() {
        }

        /**
         * The type or name of the property
         */
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        /**
         * The stored value of the property
         */
        public Builder setValue(String value) {
            this.value = value;
            return this;
        }


        public TrackProperty build() {
            return new TrackProperty(type, value);
        }

    }
}
