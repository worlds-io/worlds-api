
# Primitives

## Basic
### Objects
- Detection - seeing something
  - ID
  - Camera ID
  - pixel positions (bounding box)
  - polygon
  - tag
  - timestamp
  - attributes
    - color
    - size
    - shape
    - pose
    - relationships
  - _metadata_
  - position (realspace)
  - Track
- Track - ordered time sequence of seeing a thing
  - ID
  - start time
  - end time
  - tag
  - attributes
    - vector (pixels)
    - motion (realspace)
    - identity
  - _metadata_
    
## Sensors
- _Sensor_
  - ID
  - name
  - description
  - value type
  - position (realspace)
  - metadata

- _Measurement_ - value of a sensor
  - ID
  - Sensor
  - timestamp
  - value

## Regions
- _Zone_ - 2D collision region of interest
  - ID
  - Camera ID
  - polygon
  - active flag

- _Geofence_ - 3D collision region of interest
  - ID
  - Location (center)
  - Dimensions
  - Rotation
  - active flag

## Events


# Activities

- zoneActivity
  - Zone
  - type (enter, exit, dwell)
  - overlap percentage
  - Detection
    
- geofenceActivity
  - Geofence
  - type (enter, exit, dwell)
  - Detection
     
- measurementActivity
  - Sensor
  - Measurement

### Sample subscription

```
zoneActivity({ zoneId: { in: [1,2] }, entityType: { eq: "personWithoutPPE" }, eventType: { in: ["ingress", "egress", "dwell"] } }) {
  position { lat, long }
  startDateTimeOffset
  ocr: metadata("OCR")
}
```


