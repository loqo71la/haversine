# Haversine
[![](https://github.com/loqo71la/haversine/actions/workflows/coverage.yml/badge.svg)](https://github.com/loqo71la/haversine/actions/workflows/coverage.yml)
[![](https://codecov.io/gh/loqo71la/haversine/branch/main/graph/badge.svg?token=T0AWQR4JWV)](https://codecov.io/gh/loqo71la/haversine)

Implements the Haversine formula to calculate the distance between two points on a sphere.

![](images/circle%20distance.png)

The formula allows to compute the haversine of θ (that is, **hav(θ)**) from the latitude (represented by **φ**) and longitude (represented by **λ**) of the two points:

![](images/haversine.svg)

Where:
* **φ1, φ2** are the latitude of point 1 and latitude of point 2,
* **λ1, λ2** are the longitude of point 1 and longitude of point 2.