package leetcodeproblems;

//Note : Please make this program without any method as it wont work in method...so keep it in mind

public class LargestChar {
    public static void main(String[] args) {
        String str = "AbfbjFDC";

        boolean uppercase[]  = new boolean[26];
        boolean lowercase[] = new boolean[26];

        char[] ch = str.toCharArray();

        for(char c : ch)
        {
            if(Character.isLowerCase(c))
            {
                lowercase[c-'a'] = true;
            }

            if(Character.isUpperCase(c))
            {
                uppercase[c-'A'] = true;
            }
        }
        //	char ch = 0;
        for(int i = 25; i>= 0; i--)
        {
            if(uppercase[i] && lowercase[i])
                System.out.println((char)(i + 'A'));



        }


    }
}
