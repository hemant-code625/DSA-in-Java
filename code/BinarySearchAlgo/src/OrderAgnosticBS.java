public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] arr={-3,0,2,4,6,8,23,45,68};
        int[] arr = {45, 44, 40, 32, 29, 27, 18, 9, 7, 3, -2, -1};
        int target = 45;
        int ans = orderAgnosticBS(arr, target);

        System.out.println(ans);    // Printing the index of target value in array & if shows -1 then target is not found in array
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // boolean isAsc = (start < end);           ...... LOGICAL ERROR

        //Find whether the sorted array is ascending or descending
        boolean isAsc = arr[start] < arr[end];                             //Boolean Function

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else if (arr[mid] < target) {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}

