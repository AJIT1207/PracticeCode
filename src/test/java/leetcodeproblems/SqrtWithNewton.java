package leetcodeproblems;

public class SqrtWithNewton {
    public static void main(String[] args) {
        System.out.println(findsqrt(36));
    }

    static double findsqrt(double n)
    {
        double x = n;
        double root;
        while (true)
        {
            root = 0.5 * (x + (n/x));
            if(Math.abs(root - x) < 0.5)
            {
                break;
            }

            else
            {
                x = root;
            }
        }
        return root;
    }
}
