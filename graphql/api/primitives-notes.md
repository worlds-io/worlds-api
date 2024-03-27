
# Primitives

## Basic
### 2D Objects
- Detection - seeing something in 2D space
  - ID
  - pixel positions (bounding box)
  - source camera
  - tag
  - timestamp
  - metadata
  - Track
- Track - list of detections
  - ID
  - start time
  - end time
  - tag
  - metadata

### 3D Objects
- Waypoint - seeing something in 3D space
  - ID
  - long/lat position info
  - tag
  - timestamp
  - metadata
  - Route
- Route - list of waypoints
  - ID
  - start time
  - end time
  - tag 
  - metadata
    - associations with other tracked objects
    - external IDs
    - direction
    - velocity
    
### Detectors
- "Measurement" - value of a "virtual sensor"
  - booleans
  - integers
  - doubles
  - strings

## Regions
- Zone - 2D collision region with "detections"
- Geofence - 3D collision region with "waypoints"

# Events

- zoneActivity
  - Zone
  - type (ingress, egress, dwell)
  - Detection
    
- geofenceActivity
  - Geofence
  - type (ingress, egress, dwell)
  - Waypoint
  - Active Routes
     
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


