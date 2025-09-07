package Arrays;

public class ShallowCopy {

    private static void change_arr(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arrays = {1, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+" ");
        }
        change_arr(arrays);
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+" ");
        }
    }

}
