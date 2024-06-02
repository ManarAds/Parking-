public class Main {
    public static void main(String[] args) throws IllegalParkingException {


        Parking park = new Parking(5);
        park.park(new Car(false), 1);
       // park.park(new Car(true), 3);
        park.park(new Car(false), 0);
        park.displayParking();
        int a = park.avalble_spot();
        System.out.printf("we have "  + a +  "avalible sapace");

    }
}
