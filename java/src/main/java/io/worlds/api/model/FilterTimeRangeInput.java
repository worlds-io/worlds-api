package io.worlds.api.model;

import java.util.Objects;

/**
 * `FilterTimeRangeInput` allows for filtering time-bounded objects — those that span a period rather than
occurring at an instant — by the relationship between the object's own period and a given period. Exactly
one field must be provided per filter object.

An object whose period has not ended yet is treated as running until the end of time, which is why
`endingWithin` and `before` never match one.
 */
public class FilterTimeRangeInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<TimeRangeInput> containing = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<TimeRangeInput> containedBy = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<TimeRangeInput> intersecting = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<TimeRangeInput> startingWithin = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<TimeRangeInput> endingWithin = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> containingInstant = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> before = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> after = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterTimeRangeInput() {
    }

    public FilterTimeRangeInput(org.springframework.graphql.data.ArgumentValue<TimeRangeInput> containing, org.springframework.graphql.data.ArgumentValue<TimeRangeInput> containedBy, org.springframework.graphql.data.ArgumentValue<TimeRangeInput> intersecting, org.springframework.graphql.data.ArgumentValue<TimeRangeInput> startingWithin, org.springframework.graphql.data.ArgumentValue<TimeRangeInput> endingWithin, org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> containingInstant, org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> before, org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> after) {
        this.containing = containing;
        this.containedBy = containedBy;
        this.intersecting = intersecting;
        this.startingWithin = startingWithin;
        this.endingWithin = endingWithin;
        this.containingInstant = containingInstant;
        this.before = before;
        this.after = after;
    }

    public org.springframework.graphql.data.ArgumentValue<TimeRangeInput> getContaining() {
        return containing;
    }
    public void setContaining(org.springframework.graphql.data.ArgumentValue<TimeRangeInput> containing) {
        this.containing = containing;
    }

    public org.springframework.graphql.data.ArgumentValue<TimeRangeInput> getContainedBy() {
        return containedBy;
    }
    public void setContainedBy(org.springframework.graphql.data.ArgumentValue<TimeRangeInput> containedBy) {
        this.containedBy = containedBy;
    }

    public org.springframework.graphql.data.ArgumentValue<TimeRangeInput> getIntersecting() {
        return intersecting;
    }
    public void setIntersecting(org.springframework.graphql.data.ArgumentValue<TimeRangeInput> intersecting) {
        this.intersecting = intersecting;
    }

    public org.springframework.graphql.data.ArgumentValue<TimeRangeInput> getStartingWithin() {
        return startingWithin;
    }
    public void setStartingWithin(org.springframework.graphql.data.ArgumentValue<TimeRangeInput> startingWithin) {
        this.startingWithin = startingWithin;
    }

    public org.springframework.graphql.data.ArgumentValue<TimeRangeInput> getEndingWithin() {
        return endingWithin;
    }
    public void setEndingWithin(org.springframework.graphql.data.ArgumentValue<TimeRangeInput> endingWithin) {
        this.endingWithin = endingWithin;
    }

    public org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> getContainingInstant() {
        return containingInstant;
    }
    public void setContainingInstant(org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> containingInstant) {
        this.containingInstant = containingInstant;
    }

    public org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> getBefore() {
        return before;
    }
    public void setBefore(org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> before) {
        this.before = before;
    }

    public org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> getAfter() {
        return after;
    }
    public void setAfter(org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> after) {
        this.after = after;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final FilterTimeRangeInput that = (FilterTimeRangeInput) obj;
        return Objects.equals(containing, that.containing)
            && Objects.equals(containedBy, that.containedBy)
            && Objects.equals(intersecting, that.intersecting)
            && Objects.equals(startingWithin, that.startingWithin)
            && Objects.equals(endingWithin, that.endingWithin)
            && Objects.equals(containingInstant, that.containingInstant)
            && Objects.equals(before, that.before)
            && Objects.equals(after, that.after);
    }

    @Override
    public int hashCode() {
        return Objects.hash(containing, containedBy, intersecting, startingWithin, endingWithin, containingInstant, before, after);
    }


    public static FilterTimeRangeInput.Builder builder() {
        return new FilterTimeRangeInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<TimeRangeInput> containing = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<TimeRangeInput> containedBy = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<TimeRangeInput> intersecting = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<TimeRangeInput> startingWithin = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<TimeRangeInput> endingWithin = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> containingInstant = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> before = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> after = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setContaining(org.springframework.graphql.data.ArgumentValue<TimeRangeInput> containing) {
            this.containing = containing;
            return this;
        }

        public Builder setContainedBy(org.springframework.graphql.data.ArgumentValue<TimeRangeInput> containedBy) {
            this.containedBy = containedBy;
            return this;
        }

        public Builder setIntersecting(org.springframework.graphql.data.ArgumentValue<TimeRangeInput> intersecting) {
            this.intersecting = intersecting;
            return this;
        }

        public Builder setStartingWithin(org.springframework.graphql.data.ArgumentValue<TimeRangeInput> startingWithin) {
            this.startingWithin = startingWithin;
            return this;
        }

        public Builder setEndingWithin(org.springframework.graphql.data.ArgumentValue<TimeRangeInput> endingWithin) {
            this.endingWithin = endingWithin;
            return this;
        }

        public Builder setContainingInstant(org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> containingInstant) {
            this.containingInstant = containingInstant;
            return this;
        }

        public Builder setBefore(org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> before) {
            this.before = before;
            return this;
        }

        public Builder setAfter(org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> after) {
            this.after = after;
            return this;
        }


        public FilterTimeRangeInput build() {
            return new FilterTimeRangeInput(containing, containedBy, intersecting, startingWithin, endingWithin, containingInstant, before, after);
        }

    }
}
