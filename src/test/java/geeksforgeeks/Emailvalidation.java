package geeksforgeeks;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Emailvalidation {
    public static void main(String[] args) {

        ArrayList<String> address = new ArrayList<>();
        address.add("review-team@geeksforgeeks.org");
        address.add("writing.geeksforgeeks.org");
        for (String s : address)
        {
            if(isValid(s))
            {
                System.out.println(s + " - YES");
            }
            else
            {
                System.out.println(s + " - NO");
            }
        }
    }

    public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if(email == null)
        {
            return false;
        }

        return pat.matcher(email).matches();
    }
}
