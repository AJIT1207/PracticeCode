package practicecode;

public class Permutation {
    static void newpemute(String s, String str) {
        if (str.length()==0)
            System.out.println(s);
        for (int i = 0; i < str.length(); i++) {
            newpemute(s + str.charAt(i), str.substring(0, i) + str.substring(i + 1, str.length()));
        }
    }

    public static void main(String[] args) {
        String str = "jsp";
        newpemute("", str);
    }
}



