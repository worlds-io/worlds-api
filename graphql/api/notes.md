
# Primitives

## Detections
- Detection - seeing something
  - ID
  - Camera ID
  - pixel positions (bounding box)
  - position (realspace)
  - zone collisions
    - collision type (enter, exit, dwell)
  - geofence collisions
    - collision type (enter, exit, dwell)
  - polygon
  - tag
  - timestamp
  - properties
    - color
    - size
    - shape
    - pose
    - relationships
  - _metadata_
  - Track
  - TrackID
- Track - ordered time sequence of seeing a thing
  - ID
  - start time
  - end time
  - tag
  - properties
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
- _Agent_  - container / association of events
  - ID
  - name
  - type (internally the provider)
  - description
  - timezone
  - active (for internal agents)

- _Event_ - single instance of an event
  - ID
  - Agent / AgentID
  - type
  - subtype ?
  - start time
  - end time
  - location
  - timezone
  - metadata


# Activities

- detectionActivity
  - Filters
    - Zone
    - Geofence
    - type (enter, exit, dwell)
  - Response
    - Detection
    
- measurementActivity
  - Filters
    - Sensor
    - Measurement Type
  - Response
    - Measurement

### Sample subscription

```
detectionActivity({ zoneId: { in: [1,2] }, entityType: { eq: "personWithoutPPE" }, eventType: { in: ["enter", "exit", "dwell"] } }) {
  position { lat, long }
  startDateTimeOffset
  ocr: metadata("OCR")
}
```


