package Introduction.Array;

public class TwoDArray {
    public static void main(String[] args) {
        /*
        create an array

        syntax:
        data-type array-name[][] = new array-name[row-size][column-size];
         */
        int arr[][] = new int[3][5];

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 5; j++) {
                arr[i][j] = (i + j) + (i * j);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
