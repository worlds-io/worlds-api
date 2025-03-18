package io.worlds.api.model;


public class Frame implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int number;

    public Frame() {
    }

    public Frame(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }



    public static Frame.Builder builder() {
        return new Frame.Builder();
    }

    public static class Builder {

        private int number;

        public Builder() {
        }

        public Builder setNumber(int number) {
            this.number = number;
            return this;
        }


        public Frame build() {
            return new Frame(number);
        }

    }
}
