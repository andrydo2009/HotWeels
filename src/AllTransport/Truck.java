package AllTransport;

public class Truck extends Transport implements Contest {
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void goPitStop(boolean OutOrIn) {
        if (OutOrIn)
        {System.out.println("Грузовик "+getBrand()+" "+getModel()+" заезжает на Пит Стоп!");}
        else {System.out.println("Грузовик "+getBrand()+" "+getModel()+" покинул Пит Стоп!");}
    }

    @Override
    public void getBestTimeRound(double time) {
        System.out.println("Лучшее время круга у грузовика" + getBrand() + " " + getModel() + " " + time + " минут");
    }

    @Override
    public void getMaximalSpeedTransport(int speed) {
        System.out.println("Максимальная скорость у грузовика " + getBrand() + " " + getModel() + " " + speed + " км/ч");
    }

    @Override
    public void getStart() {
        System.out.println("Грузовик "+getBrand()+" "+getModel()+" стартует");
    }

    @Override
    public void getStop() {
        System.out.println("Грузовик "+getBrand()+" "+getModel()+" останавливается");
    }

    @Override
    public String toString() {
        return "Грузовик " + getBrand() + " " + getModel() + ", объем двигателя " + getEngineVolume();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}


