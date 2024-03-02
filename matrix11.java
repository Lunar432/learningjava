package learningjava;

public class matrix11 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        System.out.println("Original array is: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 201);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Reversed array is: ");
        int[][] reversArray = new int[arr.length][arr[0].length];
        reversArray = reversedArray(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(reversArray[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] reversedArray(int[][] arr) {
        int rowLen = arr.length;
        int colLen = arr[0].length;
        int[][] revArray = new int[rowLen][colLen];
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                revArray[rowLen - 1 - i][colLen - 1 - j] = arr[i][j];
            }
        }
        return revArray;
    }

}
