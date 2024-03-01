
# Primitives

## Basic
- "Detections" - seeing something in 2D space
	- pixel positions
	- metadata
	- sensor that detected it
- "Global Track" - seeing something in 3D space
	- long/lat position info
	- velocity
	- metadata
		- associations with other tracked objects
		- external IDs
	- list of detections
- "Measurement" - value of a "virtual sensor"
	- booleans
	- integers
	- doubles
	- strings
- "Event" - combination of other things
- "Sensor" or "Device"

## Regions
- Zone - 2D collision region with "detections"
- Geofence - 3D collision region with "tracks"

# Events

- zoneEnter
- zoneExit
- zoneMove

- zoneChange (??)

### Sample subscription

```
zoneChange({ zoneId: { in: [1,2] }, entityType: { eq: "personWithoutPPE" }, eventType: { in: ["ingress", "egress", "dwell"] } }) {
	position { lat, long }
	startDateTimeOffset
	ocr: metadata("OCR")
}
```


