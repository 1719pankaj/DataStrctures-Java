package DataStructures.LinkedListInJava;

public class MyLLimpl {
    public static void main(String[] arse) {
        MyLinkedList<String> myLL = new MyLinkedList<>();

//        myLL.add(12);
//        myLL.add(56);

        for(int i=0; i<10; i++) {
            myLL.add(i + " added");
        }

        myLL.print();
    }
}
