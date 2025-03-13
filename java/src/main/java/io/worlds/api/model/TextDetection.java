package io.worlds.api.model;


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

    public GeoJSONPolygon getPolygon() {
        return polygon;
    }
    public void setPolygon(GeoJSONPolygon polygon) {
        this.polygon = polygon;
    }

    public double getDetectionConfidence() {
        return detectionConfidence;
    }
    public void setDetectionConfidence(double detectionConfidence) {
        this.detectionConfidence = detectionConfidence;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public double getTextConfidence() {
        return textConfidence;
    }
    public void setTextConfidence(double textConfidence) {
        this.textConfidence = textConfidence;
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

        public Builder setPolygon(GeoJSONPolygon polygon) {
            this.polygon = polygon;
            return this;
        }

        public Builder setDetectionConfidence(double detectionConfidence) {
            this.detectionConfidence = detectionConfidence;
            return this;
        }

        public Builder setText(String text) {
            this.text = text;
            return this;
        }

        public Builder setTextConfidence(double textConfidence) {
            this.textConfidence = textConfidence;
            return this;
        }


        public TextDetection build() {
            return new TextDetection(polygon, detectionConfidence, text, textConfidence);
        }

    }
}
