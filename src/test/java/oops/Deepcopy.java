package oops;

import java.util.Arrays;

class Deep {

    private int[] data;

    // altered to make a deep copy of values
    public Deep(int[] values) {
        data = new int[values.length];
        for (int i = 0; i < data.length; i++) {
            data[i] = values[i];
        }
    }

    public void showData() {
        System.out.println(Arrays.toString(data));
    }
}
public class Deepcopy {
    public static void main(String[] args) {
        int[] vals = {3, 7, 9};
        Deep e = new Deep(vals);
        e.showData(); // prints out [3, 7, 9]
        vals[0] = 13;
        e.showData(); // prints out [3, 7, 9]

        // changes in array values will not be
        // shown in data values.
    }
}
