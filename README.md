# Haversine
[![](https://img.shields.io/maven-central/v/dev.loqo71la/haversine)](https://central.sonatype.com/artifact/dev.loqo71la/haversine/1.0)
[![](https://github.com/loqo71la/haversine/actions/workflows/coverage.yml/badge.svg)](https://github.com/loqo71la/haversine/actions/workflows/coverage.yml)
[![](https://codecov.io/gh/loqo71la/haversine/branch/main/graph/badge.svg?token=T0AWQR4JWV)](https://codecov.io/gh/loqo71la/haversine)
[![](https://img.shields.io/github/license/loqo71la/haversine)](https://github.com/loqo71la/haversine/blob/main/LICENSE)

Implements the Haversine formula to calculate the distance between two points on a sphere.

![](images/circle%20distance.png)

The formula allows to compute the haversine of θ (that is, **hav(θ)**) from the latitude (represented by **φ**) and longitude (represented by **λ**) of the two points:

![](images/haversine.svg)

Where:
* **φ1, φ2** are the latitude of point 1 and latitude of point 2,
* **λ1, λ2** are the longitude of point 1 and longitude of point 2.

## Installation
Add the dependency if you are using Maven:
```xml
<dependency>
    <groupId>dev.loqo71la</groupId>
    <artifactId>haversine</artifactId>
    <version>1.0</version>
</dependency>
```
Or if you are using Gradle:
```groovy
implementation group: 'dev.loqo71la', name: 'haversine', version: '1.0'
```

## Usage
To get the distance between two points, you can use the static method `calculateDistance(Coordinate source, Coordinate target)`.
```java
Haversine.calculateDistance(40.6892, 74.0445);
```
By default **Kilometers** is the unit of measure, but you can also use **Meters** and **Miles**.
```java
Haversine.calculateDistance(40.6892, 74.0445, Unit.Kilometers);
Haversine.calculateDistance(40.6892, 74.0445, Unit.Meters);
Haversine.calculateDistance(40.6892, 74.0445, Unit.Miles);
```