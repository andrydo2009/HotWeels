package AllDrivers;

import AllTransport.Contest;
import AllTransport.Transport;

public class BusDriver<D extends Transport & Contest> extends Driver{

    public BusDriver(String fullNameDriver, String driverLicenseCategory, int experienceDriver) {
        super(fullNameDriver, driverLicenseCategory, experienceDriver);
    }

    public void goDrive(D transport){

        System.out.println("Водитель "+getFullNameDriver() + " " + transport.getBrand()
                + " управляет автомобилем " +transport.getModel()+ " и будет участвовать в заезде ");
    }


    @Override
    public void getStart() {

    }

    @Override
    public void getStop() {

    }

    @Override
    public void refuelTransport() {

    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
