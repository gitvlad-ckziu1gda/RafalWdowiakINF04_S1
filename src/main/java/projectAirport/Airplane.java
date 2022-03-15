package projectAirport;

public class Airplane extends Airline {

    private int id;
    private String manufacturer;
    private String model;
    private String type;
    private float cruiseSpeed;
    private float maxRange;
    private String airportCode;
    private int numberOfPassengers;
    private float maxPayload;
    private int minLengthRunway;
    private float fuelCapacity;
    private float fuelConsumption;

    public Airplane(int id, String manufacturer, String model, String type, float cruiseSpeed, float maxRange, String airportCode,
                    int numberOfPassengers, float maxPayload, int minLengthRunway, float fuelCapacity, float fuelConsumption) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.type = type;
        this.cruiseSpeed = cruiseSpeed;
        this.maxRange = maxRange;
        this.airportCode = airportCode;
        this.numberOfPassengers = numberOfPassengers;
        this.maxPayload = maxPayload;
        this.minLengthRunway = minLengthRunway;
        this.fuelCapacity = fuelCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getCruiseSpeed() {
        return cruiseSpeed;
    }

    public void setCruiseSpeed(float cruiseSpeed) {
        this.cruiseSpeed = cruiseSpeed;
    }


    public float getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(float maxRange) {
        this.maxRange = maxRange;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }


    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public float getMaxPayload() {
        return maxPayload;
    }

    public void setMaxPayload(float maxPayload) {
        this.maxPayload = maxPayload;
    }

    public int getMinLengthRunway() {
        return minLengthRunway;
    }

    public void setMinLengthRunway(int minLengthRunway) {
        this.minLengthRunway = minLengthRunway;
    }

    public float getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(float fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(float fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", cruiseSpeed=" + cruiseSpeed +
                ", maxRange=" + maxRange +
                ", airportCode='" + airportCode + '\'' +
                ", numberOfPassengers=" + numberOfPassengers +
                ", maxPayload=" + maxPayload +
                ", minLengthRunway=" + minLengthRunway +
                ", fuelCapacity=" + fuelCapacity +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }

}
