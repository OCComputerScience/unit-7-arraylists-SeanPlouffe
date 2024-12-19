package RoadTrip;

import java.util.ArrayList;

public class RoadTrip
{

    private ArrayList<GeoLocation> locations = new ArrayList<>();

    public RoadTrip(GeoLocation initialLocation)
    {
        locations.add(initialLocation);
    }

    public void addStop(double latititude, double longitude, String name)
    {
        locations.add(new GeoLocation(latititude, longitude, name));
    }

    public int getNumberOfStops()
    {
        return locations.size();
    }

    public double getTripLength()
    {
        double length = 0;

        for(int i = 1; i < locations.size(); i++)
        {
            length += locations.get(i).distanceFrom(locations.get(i-1));
        }

        return length;

    }

    public void printGeoLocations() {

        for(GeoLocation location : locations)
        {
            System.out.println("1. " + location.getName() + " (" + location.getLatitude() + ", " + location.getLongitude() + ")");
        }

    }

}
