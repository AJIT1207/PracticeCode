package hackerrank;

public class A {
 int a = 15;
    public void m1()
    {
        int a = 10;
        System.out.println(a + "first a value");
        System.out.println(this.a + "second a value");
    }

    public static void main(String[] args) {
        A a = new A();
        a.m1();
    }
}
