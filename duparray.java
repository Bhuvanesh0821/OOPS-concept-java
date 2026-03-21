public class duparray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5 , 6 , 7 , 7 , 7 , 6 };
        int n = arr.length;

        System.out.println("Duplicate elements in the array:");
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i + 1; j < n ; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    System.out.println(arr[i] + " appears " + count + " times");
                }
            }
            
        }
    }
}    
    

