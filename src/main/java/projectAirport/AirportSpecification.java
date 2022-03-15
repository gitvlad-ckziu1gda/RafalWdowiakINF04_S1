package projectAirport;

public class AirportSpecification {
//    private Airport airport;
    private float lengthOfRunway;
    private float landingCharge;
    private float passengerCharge;
    private float parkingCharge;

    public AirportSpecification(int id, String name, String code, String city, String country, String continent, double latitude, double longitude, float lengthOfRunway, float landingCharge, float passengerCharge, float parkingCharge) {
       // super(id, name, code, city, country, continent, latitude, longitude);
        this.lengthOfRunway = lengthOfRunway;
        this.landingCharge = landingCharge;
        this.passengerCharge = passengerCharge;
        this.parkingCharge = parkingCharge;
    }

    public float getLengthOfRunway() {
        return lengthOfRunway;
    }

    public void setLengthOfRunway(float lengthOfRunway) {
        this.lengthOfRunway = lengthOfRunway;
    }

    public float getLandingCharge() {
        return landingCharge;
    }

    public void setLandingCharge(float landingCharge) {
        this.landingCharge = landingCharge;
    }

    public float getPassengerCharge() {
        return passengerCharge;
    }

    public void setPassengerCharge(float passengerCharge) {
        this.passengerCharge = passengerCharge;
    }

    public float getParkingCharge() {
        return parkingCharge;
    }

    public void setParkingCharge(float parkingCharge) {
        this.parkingCharge = parkingCharge;
    }

    @Override
    public String toString() {
        return "AirportSpecification{" +
                "lengthOfRunway=" + lengthOfRunway +
                ", landingCharge=" + landingCharge +
                ", passengerCharge=" + passengerCharge +
                ", parkingCharge=" + parkingCharge +
                '}';
    }
}
