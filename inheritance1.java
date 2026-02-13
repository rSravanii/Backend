//inheritance vehicle to car
class vehicle {
    int speed;
    int mileage;

    public vehicle(int s, int m) {
        this.speed = s;
        this.mileage = m;
    }

    public void features() {
        System.out.println("speed " + speed);
        System.out.println("mileage " + mileage);
    }
}

class car extends vehicle {
    String carName;

    public car(String name, int s, int m) {
        super(s, m);
        this.carName = name;
    }

    public void honk() {
        System.out.println("car name " + carName);
    }
}

class vehicleInheritance {
    public static void main(String[] args) {
        car c = new car(" HONDA ", 250, 30);
        c.features();
        c.honk();
    }
}/*
  * output:speed 250
  * mileage 30
  * car name HONDA
  */
