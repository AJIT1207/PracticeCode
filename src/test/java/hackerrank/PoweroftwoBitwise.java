package hackerrank;

public class PoweroftwoBitwise {
    public static void main(String[] args) {
        int n = 31;

        if(n == 0)
        {
            System.out.println(false);
        }

        boolean value = (n & (n-1)) == 0;

        System.out.println(value);
    }
}
