package hackerrank;

import java.util.HashMap;
import java.util.Map;

class Patient
{
    String name;
    int age;
    String mobilenumber;
    public Patient(String name, int age, String mobilenumber)
    {
        this.name = name;
        this.age = age;
        this.mobilenumber = mobilenumber;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getMobilenumber()
    {
        return mobilenumber;
    }
}

public class PatientINfo {
    public static void main(String[] args) {
        Map<String, Patient> map = new HashMap<String, Patient>();
        map.put("123456771", new Patient("Ajit1",15 ,"123456771"));
        map.put("123456772", new Patient("Ajit2",16,"123456772"));
        map.put("123456773", new Patient("Ajit3",17,"123456773"));
        map.put("123456774", new Patient("Ajit4",18,"123456774"));
        map.put("123456775", new Patient("Ajit5",19,"123456775"));

    //    Patient p = new Patient();

    }
}
