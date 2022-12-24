package AllTransport;



public class Cars  extends Transport implements Contest{



        public Cars(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
    public void goPitStop(boolean out_or_in) {
        if (out_or_in)
        {System.out.println("Автомобиль "+getBrand()+" "+getModel()+" заезжает на Пит Стоп!");}
        else {System.out.println("Автомобиль "+getBrand()+" "+getModel()+" покинул Пит Стоп!");}
    }

    @Override
    public void getBestTimeRound(double time) {
        System.out.println("Лучшее время круга у автомобиля " + getBrand() + " " + getModel() + " " + time + " минут");

    }

    @Override
    public void getMaximalSpeedTransport(int speed) {
        System.out.println("Максимальная скорость у автомобиля " + getBrand() + " " + getModel() + " " + speed + " км/ч");
    }

    @Override
    public void getStart() {
        System.out.println("Автомобиль "+getBrand()+" "+getModel()+" стартует");
    }

    @Override
    public void getStop() {
        System.out.println("Автомобиль "+getBrand()+" "+getModel()+" останавливается");
    }

    @Override
    public String toString() {
        return "Автомобиль " + getBrand() + " " + getModel() + ", объем двигателя " + getEngineVolume();
    }
}


