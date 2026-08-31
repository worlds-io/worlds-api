package io.worlds.api.model;

import java.util.Objects;

/**
 * `TimeRangeInput` describes a period of time as a closed interval. Either bound may be omitted to leave that
side of the interval unbounded — a null `start` means "since the beginning of time" and a null `end` means
"until the end of time".
 */
public class TimeRangeInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> start = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> end = org.springframework.graphql.data.ArgumentValue.omitted();

    public TimeRangeInput() {
    }

    public TimeRangeInput(org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> start, org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> end) {
        this.start = start;
        this.end = end;
    }

    public org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> getStart() {
        return start;
    }
    public void setStart(org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> start) {
        this.start = start;
    }

    public org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> getEnd() {
        return end;
    }
    public void setEnd(org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> end) {
        this.end = end;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final TimeRangeInput that = (TimeRangeInput) obj;
        return Objects.equals(start, that.start)
            && Objects.equals(end, that.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }


    public static TimeRangeInput.Builder builder() {
        return new TimeRangeInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> start = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> end = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setStart(org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> start) {
            this.start = start;
            return this;
        }

        public Builder setEnd(org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> end) {
            this.end = end;
            return this;
        }


        public TimeRangeInput build() {
            return new TimeRangeInput(start, end);
        }

    }
}
