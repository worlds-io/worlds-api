package io.worlds.api.model;


/**
 * A user is an object that represents an existing user in the database.
 */
public class User implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private String emailAddress;

    public User() {
    }

    public User(String id, String emailAddress) {
        this.id = id;
        this.emailAddress = emailAddress;
    }

    /**
     * The unique identifier for the user.
     */
    public String getId() {
        return id;
    }
    /**
     * The unique identifier for the user.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The email address of the user.
     */
    public String getEmailAddress() {
        return emailAddress;
    }
    /**
     * The email address of the user.
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }



    public static User.Builder builder() {
        return new User.Builder();
    }

    public static class Builder {

        private String id;
        private String emailAddress;

        public Builder() {
        }

        /**
         * The unique identifier for the user.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The email address of the user.
         */
        public Builder setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }


        public User build() {
            return new User(id, emailAddress);
        }

    }
}
