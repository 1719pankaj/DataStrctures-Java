package DataStructures.ArrayListInJava;

public class Pair<X, Y> {
    X x;
    Y y;
    //Used X and Y instead of defined Primitive types. Gets them from the constructor.

    public Pair(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    public void getDescription() {
        System.out.println(x+" and "+y);
    }

}
