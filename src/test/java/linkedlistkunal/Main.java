package linkedlistkunal;

public class Main {
    public static void main(String[] args) {

        LL list = new LL();
        list.insertfirst(1);
        list.insertfirst(2);
        list.insertfirst(3);
        list.insertfirst(1);

        list.insertLast(18);

        list.insertindex(10,4);

        list.display();

        list.deletefirst();
        list.display();

        list.deleteLast();
        list.display();

        list.deleteindex(2);
        list.display();



    }
}
