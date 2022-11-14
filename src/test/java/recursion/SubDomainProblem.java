package recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubDomainProblem {
    public static void main(String[] args) {
        String[] cpdomains = {"9001 discuss.leetcode.com"};
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String cpdomain : cpdomains) {
            String str[] = cpdomain.split(" ");
            int count = Integer.parseInt(str[0]);
            String domain = str[1];
            int n = domain.split("\\.").length;

            for (int i = 0; i < n; i++) {
                map.put(domain, map.getOrDefault(domain, 0) + count);
                if (domain.split("\\.").length >= 2) {
                    String first[] = domain.split("\\.", 2);
                    domain = first[1];
                }
            }

        }

        List<String> result = new ArrayList<>();

        for (Map.Entry<String, Integer> val : map.entrySet())
        {
            result.add(val.getKey() + " " + val.getValue());
        }

        System.out.println(result);
    }

}
