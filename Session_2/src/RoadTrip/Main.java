package RoadTrip;

public class Main
{

    public static void main(String[] args)
    {

        RoadTrip trip = new RoadTrip(new GeoLocation(37.7833, -122.4167, "San Francisco"));

        trip.addStop(34.052235, -118.243683, "Los Angeles");
        trip.addStop(36.114647, -115.172813, "Las Vegas");

    }

}
