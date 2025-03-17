package io.worlds.api.model;


/**
 * Pagination info for any connection
 */
public class PageInfo implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private boolean hasNextPage;
    private boolean hasPreviousPage;
    private String startCursor;
    private String endCursor;

    public PageInfo() {
    }

    public PageInfo(boolean hasNextPage, boolean hasPreviousPage, String startCursor, String endCursor) {
        this.hasNextPage = hasNextPage;
        this.hasPreviousPage = hasPreviousPage;
        this.startCursor = startCursor;
        this.endCursor = endCursor;
    }

    public boolean getHasNextPage() {
        return hasNextPage;
    }
    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public boolean getHasPreviousPage() {
        return hasPreviousPage;
    }
    public void setHasPreviousPage(boolean hasPreviousPage) {
        this.hasPreviousPage = hasPreviousPage;
    }

    public String getStartCursor() {
        return startCursor;
    }
    public void setStartCursor(String startCursor) {
        this.startCursor = startCursor;
    }

    public String getEndCursor() {
        return endCursor;
    }
    public void setEndCursor(String endCursor) {
        this.endCursor = endCursor;
    }



    public static PageInfo.Builder builder() {
        return new PageInfo.Builder();
    }

    public static class Builder {

        private boolean hasNextPage;
        private boolean hasPreviousPage;
        private String startCursor;
        private String endCursor;

        public Builder() {
        }

        public Builder setHasNextPage(boolean hasNextPage) {
            this.hasNextPage = hasNextPage;
            return this;
        }

        public Builder setHasPreviousPage(boolean hasPreviousPage) {
            this.hasPreviousPage = hasPreviousPage;
            return this;
        }

        public Builder setStartCursor(String startCursor) {
            this.startCursor = startCursor;
            return this;
        }

        public Builder setEndCursor(String endCursor) {
            this.endCursor = endCursor;
            return this;
        }


        public PageInfo build() {
            return new PageInfo(hasNextPage, hasPreviousPage, startCursor, endCursor);
        }

    }
}
