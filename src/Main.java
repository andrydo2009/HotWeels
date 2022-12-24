import AllDrivers.BusDriver;
import AllDrivers.CarDriver;
import AllDrivers.TruckDriver;
import AllTransport.Bus;
import AllTransport.Cars;
import AllTransport.Truck;

public class Main {
    public static void main(String[] args) {


        Cars cars_1=new Cars("Lada","Granta",1.7);
        System.out.println(cars_1);
        Cars cars_2=new Cars("Audi","A8 50 L TDI quattro",3.0);
        System.out.println(cars_2);
        Cars cars_3= new Cars("BMW","BMW",3.0);
        System.out.println(cars_3);
        Cars cars_4 = new Cars("KIA","Sportage",2.4 );
        System.out.println(cars_4);

        Bus bus_1=new Bus("Volvo","B12",12.5);
        System.out.println(bus_1);
        Bus bus_2=new Bus("Golden Dragon","XML6127",10.5);
        System.out.println(bus_2);
        Bus bus_3=new Bus("MAN","Lion's Coach", 11.0);
        System.out.println(bus_3);
        Bus bus_4=new Bus("Scania","Irizar", 10.6);
        System.out.println(bus_4);

        Truck truck_1=new Truck("Mercedes-Benz","Actros",12.8);
        System.out.println(truck_1);
        Truck truck_2=new Truck("Freightliner","FLD",14.0);
        System.out.println(truck_2);
        Truck truck_3=new Truck("Daf","XF",13.2);
        System.out.println(truck_3);
        Truck truck_4=new Truck("Volvo","FH",12.8);
        System.out.println(truck_4);


        CarDriver<Cars> Ivan= new CarDriver<>("Ivan Ivanovich Ivanov", "B", 5);
        System.out.println(Ivan);
        BusDriver<Bus> Oleg= new BusDriver<>("Oleg Petrovich Petrov", "D", 10);
        System.out.println(Oleg);
        TruckDriver<Truck> Semen= new TruckDriver<>("Semen Semenovich Semenov", "C", 20);
        System.out.println(Semen);
        Ivan.goDrive(cars_1);
        Oleg.goDrive(bus_1);
        Semen.goDrive(truck_1);



//







    }
}

