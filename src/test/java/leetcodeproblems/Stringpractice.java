package leetcodeproblems;

public class Stringpractice {
    public static void main(String[] args) {
        String str = "java@test9";
        System.out.println(reverse(str));
    }

    public static String reverse(String str)
    {
        String finalstring =  "";
        str = str.replaceAll("[^a-zA-Z]","");

        String rev = "";
        for (int i  = str.length()-1; i >=0; i--)
        {
            rev =  rev + str.charAt(i);
        }

        return rev;
    }
}
