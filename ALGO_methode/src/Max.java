import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        System.out.println(max(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    public static int max(int a, int... b){
        int[] array = new int[b.length-1];
        for (int i = 0; i < b.length-1; i++) {
            array[i] = b[i+1];
        }
        if(array.length == 1){
            return Math.max(a, array[0]);
        }

        return Math.max(a, max(b[0], array));
    }
}
