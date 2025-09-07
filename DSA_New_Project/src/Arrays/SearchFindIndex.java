package Arrays;

public class SearchFindIndex {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 7, 10, 3, 8, 9, 7, 5, 25};

        int x = 7;
        int flag = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                flag = i;
                // if we don't add break statement, it will traverse thorugh entire array and
                // if there is any duplicate element present it will provide the wrong index
                break;
            }
        }
        if (flag > 1) {
            System.out.println(flag);
        } else {
            System.out.println("-1");
        }

    }
}
