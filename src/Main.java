import AllDrivers.BusDriver;
import AllDrivers.CarDriver;
import AllDrivers.TruckDriver;
import AllTransport.Bus;
import AllTransport.Car;
import AllTransport.Truck;

public class Main {
    public static void main(String[] args) {


        Car car1=new Car("Lada","Granta",1.7);
        System.out.println(car1);
        Car car2=new Car("Audi","A8 50 L TDI quattro",3.0);
        System.out.println(car2);
        Car car3= new Car("BMW","BMW",3.0);
        System.out.println(car3);
        Car car4 = new Car("KIA","Sportage",2.4 );
        System.out.println(car4);

        Bus bus1=new Bus("Volvo","B12",12.5);
        System.out.println(bus1);
        Bus bus2=new Bus("Golden Dragon","XML6127",10.5);
        System.out.println(bus2);
        Bus bus3=new Bus("MAN","Lion's Coach", 11.0);
        System.out.println(bus3);
        Bus bus4=new Bus("Scania","Irizar", 10.6);
        System.out.println(bus4);

        Truck truck1=new Truck("Mercedes-Benz","Actros",12.8);
        System.out.println(truck1);
        Truck truck2=new Truck("Freightliner","FLD",14.0);
        System.out.println(truck2);
        Truck truck3=new Truck("Daf","XF",13.2);
        System.out.println(truck3);
        Truck truck4=new Truck("Volvo","FH",12.8);
        System.out.println(truck4);


        CarDriver<Car> Ivan= new CarDriver<>("Ivan Ivanovich Ivanov", "B", 5);
        System.out.println(Ivan);
        BusDriver<Bus> Oleg= new BusDriver<>("Oleg Petrovich Petrov", "D", 10);
        System.out.println(Oleg);
        TruckDriver<Truck> Semen= new TruckDriver<>("Semen Semenovich Semenov", "C", 20);
        System.out.println(Semen);
        Ivan.goDrive(car1);
        Oleg.goDrive(bus1);
        Semen.goDrive(truck1);


    }
}

