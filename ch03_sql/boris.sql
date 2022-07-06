
SELECT * 
FROM tflStations  --410 rows


SELECT * 
from tflBikeUsage -- 21,200 rows

-- Q1. How many bike stations in Finsbury
SELECT * 
FROM tflStations

-- Inner join
SELECT * 
FROM tflStations AS STN 
INNER JOIN tflBikeUsage as BIKE
ON STN.ID = BIKE.stationId  --19,080 

-- All the stations even if there's no bike usage
SELECT * 
FROM tflStations AS STN 
LEFT OUTER JOIN tflBikeUsage AS BIKE
ON STN.ID = BIKE.stationId
WHERE BIKE.stationId IS NULL -- 401 rows of Stations with no bike usage data

-- All the Bike usage even if there's no station
SELECT * 
FROM tflBikeUsage AS BIKE
LEFT OUTER JOIN tflStations AS STN 
ON STN.ID = BIKE.stationId
WHERE STN.ID IS NULL -- 2120 ROWS

SELECT * 
FROM tflStations AS STN 
FULL OUTER JOIN tflBikeUsage AS BIKE
ON STN.ID = BIKE.stationId






-- SELECT * 
-- FROM tflBikeUsage AS BIKE 
-- RIGHT OUTER JOIN tflStations AS STN
-- ON STN.ID = BIKE.stationId
-- WHERE BIKE.stationId IS NULL