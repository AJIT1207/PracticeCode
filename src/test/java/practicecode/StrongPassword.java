package practicecode;

import java.util.Map;

public class StrongPassword {
    public static void main(String[] args) {
        String password = "Ab1";
        int n = 3;
        System.out.println(makestrongpass(password, n));
    }



    public static int makestrongpass(String password, int n) {
        int minCharsAdd = 0;

        if(!password.matches(".*[a-z].*"));
        {
            minCharsAdd++;
        }

        if(!password.matches(".*[A-Z].*"));
        {
            minCharsAdd++;
        }

        if(!password.matches(".*[0-9].*"));
        {
            minCharsAdd++;
        }

        if(!password.matches(".*[!@#$%^&*()\\-+].*"));
        {
            minCharsAdd++;
        }

        if(n+minCharsAdd < 6)
        {
            minCharsAdd =  6 -n;
        }


        return minCharsAdd;
    }
}
