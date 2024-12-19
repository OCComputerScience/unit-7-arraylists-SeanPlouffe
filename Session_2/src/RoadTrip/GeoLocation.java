package RoadTrip;

public class GeoLocation
{
    // Earth radius in miles
    public static final double RADIUS = 3963.1676;

    private double latitude;
    private double longitude;

    private String name;

    /**
     * Constructs a geolocation object with given latitude and longitude
     */
    public GeoLocation(double theLatitude, double theLongitude, String inputName)
    {
        latitude = theLatitude;
        longitude = theLongitude;
        name = inputName;
    }

    public String getName()
    {
        return name;
    }

    /**
     * Returns the latitude of this geolocation
     */
    public double getLatitude()
    {
        return latitude;
    }

    /**
     * returns the longitude of this geolocation
     */
    public double getLongitude()
    {
        return longitude;
    }

    // returns a string representation of this geolocation
    public String toString()
    {
        return "name: " + name + ", latitude: " + latitude + ", longitude: " + longitude;
    }

    // returns the distance in miles between this geolocation and the given
    // other geolocation
    public double distanceFrom(GeoLocation other)
    {
        double lat1 = Math.toRadians(latitude);
        double long1 = Math.toRadians(longitude);
        double lat2 = Math.toRadians(other.latitude);
        double long2 = Math.toRadians(other.longitude);
        // apply the spherical law of cosines with a triangle composed of the
        // two locations and the North Pole
        double theCos = Math.sin(lat1) * Math.sin(lat2) +
                Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2);
        double arcLength = Math.acos(theCos);
        return arcLength * RADIUS;
    }
}
