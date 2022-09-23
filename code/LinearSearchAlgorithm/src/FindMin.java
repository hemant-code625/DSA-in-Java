public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};

        System.out.println(min(arr));
        System.out.println(max(arr));
    }

    static int min(int[] arr) {
        int ans = arr[0];   //assuming that array !=0
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }

        return ans;
    }

    static int max(int[] arr) {
        int ans = arr[0];   //assuming that array !=0
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
