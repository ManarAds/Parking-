import java.util.Arrays;

public class Parking {
    char spot[];

    public Parking(int size) {
        this.spot = new char[size];
        Arrays.fill(this.spot, ' ');
    }

    public void park(Car c, int position) throws IllegalParkingException {
        if (position < 0 || position > spot.length || spot[position] != ' ') {
            throw new IllegalParkingException("invalid parking spot at  " + position);
        }
        if (c.is_dangrouus && (position > 0 && spot[position - 1] != ' ' || position < spot.length - 1 && spot[position - 1] != ' ')) {
            throw new IllegalParkingException("you can not park nrea to carego Car");
        }
        spot[position] = c.is_dangrouus ? 'c' : 'C';
        System.out.println((c.is_dangrouus ? "Car with dangerous cargo parked at: " : "Car parked at: ") + position);
    }


    public int avalble_spot() {
        int avalble_spots = 0;
        for (int i = 0; i < spot.length; i++) {
            if (spot[i] == ' ') {
                if (i == 0 || spot[i - 1] == ' ') {
                    if (i == spot.length || spot[i + 1] == ' ') {
                        avalble_spots++;

                    }

                }
            }

        }
        return avalble_spots;

    }

    public void displayParking() {
        System.out.println(Arrays.toString(spot));
    }
}