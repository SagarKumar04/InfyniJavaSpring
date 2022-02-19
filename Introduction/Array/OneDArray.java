package Introduction.Array;

public class OneDArray {
    public static void main(String[] args) {
        /*
        create an array

        syntax:
        data-type array-name[] = new array-name[size];
         */
        int num[] = new int[5];

        for(int i = 0; i < 5; i++) {
            num[i] = 6 * i;
            System.out.println(num[i]);
        }
    }
}
