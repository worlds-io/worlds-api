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

    /**
     * True if the connection `edges` field does not contain the last element available, otherwise false.
     */
    public boolean getHasNextPage() {
        return hasNextPage;
    }
    /**
     * True if the connection `edges` field does not contain the last element available, otherwise false.
     */
    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    /**
     * True if the connection `edges` field does not contain the first element available, otherwise false.
     */
    public boolean getHasPreviousPage() {
        return hasPreviousPage;
    }
    /**
     * True if the connection `edges` field does not contain the first element available, otherwise false.
     */
    public void setHasPreviousPage(boolean hasPreviousPage) {
        this.hasPreviousPage = hasPreviousPage;
    }

    /**
     * The `cursor` of the first edge returned. Used for the query `after` argument.
     */
    public String getStartCursor() {
        return startCursor;
    }
    /**
     * The `cursor` of the first edge returned. Used for the query `after` argument.
     */
    public void setStartCursor(String startCursor) {
        this.startCursor = startCursor;
    }

    /**
     * The `cursor` of the last edge returned. Used for the query `after` argument.
     */
    public String getEndCursor() {
        return endCursor;
    }
    /**
     * The `cursor` of the last edge returned. Used for the query `after` argument.
     */
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

        /**
         * True if the connection `edges` field does not contain the last element available, otherwise false.
         */
        public Builder setHasNextPage(boolean hasNextPage) {
            this.hasNextPage = hasNextPage;
            return this;
        }

        /**
         * True if the connection `edges` field does not contain the first element available, otherwise false.
         */
        public Builder setHasPreviousPage(boolean hasPreviousPage) {
            this.hasPreviousPage = hasPreviousPage;
            return this;
        }

        /**
         * The `cursor` of the first edge returned. Used for the query `after` argument.
         */
        public Builder setStartCursor(String startCursor) {
            this.startCursor = startCursor;
            return this;
        }

        /**
         * The `cursor` of the last edge returned. Used for the query `after` argument.
         */
        public Builder setEndCursor(String endCursor) {
            this.endCursor = endCursor;
            return this;
        }


        public PageInfo build() {
            return new PageInfo(hasNextPage, hasPreviousPage, startCursor, endCursor);
        }

    }
}
