package projectAirport;

import java.util.Scanner;

public class Customer {
    private int id;
    private String name;
    private String surname;
    private String passportNumber;
    private String nationality;
    private String streetName;
    private String streetNumber;
    private String cityCode;
    private String city;
    private String country;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public Customer(int id, String name, String surname, String passportNumber, String nationality, String streetName, String streetNumber, String cityCode, String city, String country) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.passportNumber = passportNumber;
        this.nationality = nationality;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.cityCode = cityCode;
        this.city = city;
        this.country = country;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", nationality='" + nationality + '\'' +
                ", streetName='" + streetName + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    private static void getUserAirportInputs() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter departure city");
        String departureCity = input.nextLine();
        System.out.println("Enter arrival city ");
        String arrivalCity = input.nextLine();
        return;
    }

}
