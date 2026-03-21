
    public class zigzagarray {
    public static void printzigzag(int[] arr, int rows) {
        int n = arr.length;

        for (int i = 0; i < rows; i++) {
            int index = i;

            while (index < n) {
                System.out.print(arr[index] + " ");

                index += (rows - 1) * 2;

                if (i > 0 && i < rows - 1) {
                    int zigIndex = index - 2 * i;

                    if (zigIndex < n) {
                        System.out.print(arr[zigIndex] + " ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int rows = 2;

        printzigzag(arr, rows);
    }
}

