package geeksforgeeks;

import java.util.*;

class Patient
{
    String name;
    int mobile;
    int age;

    public Patient(String name, int mobile, int age)
    {
        this.name = name;
        this.mobile = mobile;
        this.age  = age;
    }
}

public class PateintInfo {
    public static void main(String[] args) {
        Map<Integer, Patient> map  = new HashMap<>();
      //  List<Patient> list = new ArrayList<>();
        map.put(12345, new Patient("Ajit",12345, 11));
        map.put(445346, new Patient("jaiswal",445346, 12));
        map.put(12655, new Patient("kaum",12655, 13));
        map.put(12325, new Patient("Raj",12325, 14));
        map.put(12334, new Patient("Saideep",12334, 15));

        Scanner sc = new Scanner(System.in);
        System.out.println("enter mobile number");
        int mob = sc.nextInt();


        Patient p = map.get(mob);

        System.out.println("Patient with mob = " + mob + " Patient name = " + p.name + " Patient age = "+ p.age );


    }
}
