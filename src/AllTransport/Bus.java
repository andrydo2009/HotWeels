package AllTransport;

public class Bus extends Transport implements Contest{


    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void goPitStop(boolean out_or_in) {
        if (out_or_in)
        {System.out.println("Автобус "+getBrand()+" "+getModel()+" заезжает на Пит Стоп!");}
        else {System.out.println("Автобус "+getBrand()+" "+getModel()+" покинул Пит Стоп!");}
    }

    @Override
    public void getBestTimeRound(double time) {
        System.out.println("Лучшее время круга у автобуса" + getBrand() + " " + getModel() + " " + time + " минут");
    }

    @Override
    public void getMaximalSpeedTransport(int speed) {
        System.out.println("Максимальная скорость у автобуса " + getBrand() + " " + getModel() + " " + speed + " км/ч");
    }

    @Override
    public void getStart() {
        System.out.println("Автобус "+getBrand()+" "+getModel()+" стартует");
    }

    @Override
    public void getStop() {
        System.out.println("Автобус "+getBrand()+" "+getModel()+" останавливается");
    }

    @Override
    public String toString() {
        return "Автобус " + getBrand() + " " + getModel() + ", объем двигателя " + getEngineVolume();
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


