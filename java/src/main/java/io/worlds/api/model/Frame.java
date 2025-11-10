package io.worlds.api.model;

import java.util.Objects;

/**
 * A frame in a data source's video
 */
public class Frame implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int number;

    public Frame() {
    }

    public Frame(int number) {
        this.number = number;
    }

    /**
     * The index of the frame in the video
     */
    public int getNumber() {
        return number;
    }
    /**
     * The index of the frame in the video
     */
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Frame that = (Frame) obj;
        return Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }


    public static Frame.Builder builder() {
        return new Frame.Builder();
    }

    public static class Builder {

        private int number;

        public Builder() {
        }

        /**
         * The index of the frame in the video
         */
        public Builder setNumber(int number) {
            this.number = number;
            return this;
        }


        public Frame build() {
            return new Frame(number);
        }

    }
}
