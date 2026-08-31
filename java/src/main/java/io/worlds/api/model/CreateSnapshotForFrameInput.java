package io.worlds.api.model;

import java.util.Objects;

/**
 * This input type is used to create a snapshot [`Image`]({{Types.Image}}) for a frame identified by
its global frame ID.
 */
public class CreateSnapshotForFrameInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String frameId;

    public CreateSnapshotForFrameInput() {
    }

    public CreateSnapshotForFrameInput(String frameId) {
        this.frameId = frameId;
    }

    public String getFrameId() {
        return frameId;
    }
    public void setFrameId(String frameId) {
        this.frameId = frameId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final CreateSnapshotForFrameInput that = (CreateSnapshotForFrameInput) obj;
        return Objects.equals(frameId, that.frameId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frameId);
    }


    public static CreateSnapshotForFrameInput.Builder builder() {
        return new CreateSnapshotForFrameInput.Builder();
    }

    public static class Builder {

        private String frameId;

        public Builder() {
        }

        public Builder setFrameId(String frameId) {
            this.frameId = frameId;
            return this;
        }


        public CreateSnapshotForFrameInput build() {
            return new CreateSnapshotForFrameInput(frameId);
        }

    }
}
