import array.Array;

public class main {
    public static void main(String[] args) {
        Array<Integer> integerArray = new Array<>();

        integerArray.addLast(77);
        integerArray.addLast(72);
        integerArray.addLast(77);
        integerArray.addLast(774);



        System.out.println( integerArray.toString());
    }
}
