package io.worlds.api.model;


public class TracksCountByTag implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String tag;
    private int count;

    public TracksCountByTag() {
    }

    public TracksCountByTag(String tag, int count) {
        this.tag = tag;
        this.count = count;
    }

    public String getTag() {
        return tag;
    }
    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }



    public static TracksCountByTag.Builder builder() {
        return new TracksCountByTag.Builder();
    }

    public static class Builder {

        private String tag;
        private int count;

        public Builder() {
        }

        public Builder setTag(String tag) {
            this.tag = tag;
            return this;
        }

        public Builder setCount(int count) {
            this.count = count;
            return this;
        }


        public TracksCountByTag build() {
            return new TracksCountByTag(tag, count);
        }

    }
}
