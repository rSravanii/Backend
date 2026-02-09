//car.java with constructor
class carDetails {
    String carBrand, carColour;
    int carCost;

    // constructor
    void car(String brand, String colour, int cost) {
        System.out.print(" brand: " + brand);
        System.out.print(" colour: " + colour);
        System.out.print(" cost : " + cost);
    }

    public static void main(String[] args) {
        carDetails car1 = new carDetails();
        carDetails car2 = new carDetails();

        car1.car("maruthi", "red", 200000);
        System.out.println();
        car2.car("honda ", "black ", 1000000);

    }
}