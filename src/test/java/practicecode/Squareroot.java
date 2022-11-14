package practicecode;

public class Squareroot {
    public static void main(String[] args) {
        int number = 40;
        int precision = 3;
        System.out.printf("%.3f", squarenumber(number, precision));
    }

    static double squarenumber(int number, int precision) {
        int start = 0;
        int end = number;
        double root = 0.0;
        while (start <= end) {
            int mid = start + (end - start)/2;

            if(mid * mid == number)
            {
                return  mid;
            }
            else if (mid * mid > number)
            {
                 end = mid - 1;
            }
            else
            {
                 start = mid + 1;
            }

        }
        double incr = 0.1;
        for (int i = 0; i < precision; i++)
        {
            while (root * root <= number)
            {
                root = root + incr;
            }

            root = root - incr;
            incr  = incr/10;
        }
        return root;
    }
}




