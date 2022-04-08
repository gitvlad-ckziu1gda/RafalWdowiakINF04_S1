package projectAirport;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main<dist> {
    public static void main(String[] args) {

        getUserAirportInputs();


        List<Airplane> airplanes = new ArrayList<>();
        airplanes.add(new Airplane(01, "Antonov", "An-148", "passengers", 800, 5000, "HEX", 68,
                5000, 2000, 5000, 3 ));
        airplanes.add(new Airplane(02, "Boeing", "737", "passengers", 876, 3445, "HEX", 133,
                7000, 2500, 10000, 1 ));

        System.out.println(airplanes);

        System.out.println("............");

        for (Airplane airplane: airplanes) {
            System.out.println(airplane);
        }
// aaa
        Customer customer1 = new Customer(1,"Adam", "Kowalski", "000123", "Polish",
                "Bucza","10", "XYZ","Warszawa", "Poland");
        Customer customer2 = new Customer(2,"Paweł", "Kalinowski", "000123", "Polish",
                "Kurza","1", "XYZ","Warszawa", "Poland");
        Customer customer3 = new Customer(3,"Magdalena", "Cygańska", "000123", "Polish",
                "Szara","100", "123","Warszawa", "Poland");
        Customer customer4 = new Customer(4,"John", "Smith", "000123", "English",
                "Blue","5", "BBB","London", "United Kingdom");
        Customer customer5 = new Customer(5,"Juan", "Ammorros", "000123", "Spanish",
                "Rossa","55", "AAA","Madrit", "Spain");

        Airport airport1 = new Airport(1, "Tokyo International Airport", "HND/RJTT", "Tokyo", "Japan", "Asia", 35.553333, 139.781111 );
        Airport airport2 = new Airport(2,"Rio de Janeiro/Galeão International Airport", "GIG/SBGL", "Rio de Janeiro", "Brasil", "South America", -22.81, -43.250556);
        Airport airport3 = new Airport(3, "John F. Kennedy International Airport", "JFK/KJFK", "New York", "USA", "North America", 40.639722, -73.778889);
        Airport airport4 = new Airport(4,"Katowice Airport", "KTW/EPKT", "Katowice", "Poland", "Europe", 50.474167, 19.08);
        Airport airport5 = new Airport(5,"Tehran International Airport", "IKA/OIIE", "Teheran", "Iran", "Asia", 35.416111, 51.152222);

        AirportSpecification airportSpecification1 = new AirportSpecification(1, "Tokyo International Airport", "HND/RJTT", "Tokyo", "Japan", "Asia",
                54.3775, 18.466111, 3360, 50, 10, 100);
        AirportSpecification airportSpecification2 = new AirportSpecification(airport2.getId(), airport2.getName(), airport2.getCode(),
                airport2.getCity(), airport2.getCountry(), airport2.getContinent(), airport2.getLatitude(), airport2.getLongitude(),
                4000, 50, 30, 100);
        AirportSpecification airportSpecification3 = new AirportSpecification(airport3.getId(), airport3.getName(), airport3.getCode(),
                airport3.getCity(), airport3.getCountry(), airport3.getContinent(), airport3.getLatitude(), airport3.getLongitude(),
                4423, 100, 50,200);
        AirportSpecification airportSpecification4 = new AirportSpecification(airport4.getId(), airport4.getName(), airport4.getCode(),
                airport4.getCity(), airport4.getCountry(), airport4.getContinent(), airport4.getLatitude(), airport4.getLongitude(),
                3200, 30, 20, 40);
        AirportSpecification airportSpecification5 = new AirportSpecification(airport5.getId(), airport5.getName(), airport5.getCode(),
                airport5.getCity(), airport5.getCountry(), airport5.getContinent(), airport5.getLatitude(), airport5.getLongitude(),
                4249, 70, 50, 150);


        double dist1 = distance(airport1.getLatitude(), airport1.getLongitude(), airport2.getLatitude(), airport2.getLongitude());
        double dist2 = distance(airport1.getLatitude(), airport1.getLongitude(), airport3.getLatitude(), airport3.getLongitude());
        double dist3 = distance(airport1.getLatitude(), airport1.getLongitude(), airport4.getLatitude(), airport4.getLongitude());
        double dist4 = distance(airport1.getLatitude(), airport1.getLongitude(), airport5.getLatitude(), airport5.getLongitude());
        double dist5 = distance(airport2.getLatitude(), airport2.getLongitude(), airport3.getLatitude(), airport3.getLongitude());

        System.out.println(dist1);
        System.out.println(dist2);
    }

    private static void getAirportID() {

    }

    private static void getUserAirportInputs() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter departure city");
        String departureCity = input.nextLine();
        System.out.println("Enter arrival city");
        String arrivalCity = input.nextLine();
        return;
    }

    private static double distance(double lat1, double lon1, double lat2, double lon2) {
        double theta = lon1 - lon2;
        double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60 * 1.1515;
        dist = dist * 1.609344;

        return (dist);
    }

    private static double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }

    private static double rad2deg(double rad) {
        return (rad * 180.0 / Math.PI);
    }


}
