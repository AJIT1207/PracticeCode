package leetcodeproblems;

public class PowerXN {
    public static void main(String[] args) {
        double x  = 2.0000;
        int m = 10;
        System.out.println(pow(x,m));
    }

    static double pow(double x, int m)
    {
        double temp = x;
        if(m == 0)
        {
            return 1;
        }

        temp  = pow(x, m/2);
        if(m%2 == 0)
        {
            return temp*temp;
        }
        else
        {
            if(m > 0 )
            {
                return x*temp*temp;
            }
            else
            {
                return (temp*temp)/x;
            }
        }
    }
}
