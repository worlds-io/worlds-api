package io.worlds.api.model;

import java.util.Objects;

public class TextDetection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private GeoJSONPolygon polygon;
    private double detectionConfidence;
    @jakarta.validation.constraints.NotNull
    private String text;
    private double textConfidence;

    public TextDetection() {
    }

    public TextDetection(GeoJSONPolygon polygon, double detectionConfidence, String text, double textConfidence) {
        this.polygon = polygon;
        this.detectionConfidence = detectionConfidence;
        this.text = text;
        this.textConfidence = textConfidence;
    }

    /**
     * The position and shape of the detection in the image
     */
    public GeoJSONPolygon getPolygon() {
        return polygon;
    }
    /**
     * The position and shape of the detection in the image
     */
    public void setPolygon(GeoJSONPolygon polygon) {
        this.polygon = polygon;
    }

    /**
     * The confidence score for the detection's existance.
     */
    public double getDetectionConfidence() {
        return detectionConfidence;
    }
    /**
     * The confidence score for the detection's existance.
     */
    public void setDetectionConfidence(double detectionConfidence) {
        this.detectionConfidence = detectionConfidence;
    }

    /**
     * The recognized text
     */
    public String getText() {
        return text;
    }
    /**
     * The recognized text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * The confidence score for the recognized text's accuracy.
     */
    public double getTextConfidence() {
        return textConfidence;
    }
    /**
     * The confidence score for the recognized text's accuracy.
     */
    public void setTextConfidence(double textConfidence) {
        this.textConfidence = textConfidence;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final TextDetection that = (TextDetection) obj;
        return Objects.equals(polygon, that.polygon)
            && Objects.equals(detectionConfidence, that.detectionConfidence)
            && Objects.equals(text, that.text)
            && Objects.equals(textConfidence, that.textConfidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(polygon, detectionConfidence, text, textConfidence);
    }


    public static TextDetection.Builder builder() {
        return new TextDetection.Builder();
    }

    public static class Builder {

        private GeoJSONPolygon polygon;
        private double detectionConfidence;
        private String text;
        private double textConfidence;

        public Builder() {
        }

        /**
         * The position and shape of the detection in the image
         */
        public Builder setPolygon(GeoJSONPolygon polygon) {
            this.polygon = polygon;
            return this;
        }

        /**
         * The confidence score for the detection's existance.
         */
        public Builder setDetectionConfidence(double detectionConfidence) {
            this.detectionConfidence = detectionConfidence;
            return this;
        }

        /**
         * The recognized text
         */
        public Builder setText(String text) {
            this.text = text;
            return this;
        }

        /**
         * The confidence score for the recognized text's accuracy.
         */
        public Builder setTextConfidence(double textConfidence) {
            this.textConfidence = textConfidence;
            return this;
        }


        public TextDetection build() {
            return new TextDetection(polygon, detectionConfidence, text, textConfidence);
        }

    }
}
