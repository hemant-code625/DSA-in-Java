public class FloorQuestion {
    public static void main(String[]args){
        int[] arr={2, 3, 5, 9, 14, 16, 8};
        int target = 1;

        //In sorted array Flooring is when take the largest number which is less than the target number in that array.
        int ans = flooring(arr, target);
        System.out.println(ans);

    }

    static int flooring(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // int mid = start + end/2 ......... (It may possible that start+end value might exceed the range of integer in java)

            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {                        // common error: we sometimes don't put arr[mid] instead we just write mid
                start = mid + 1;

            } else if (arr[mid] > target) {
                end = mid - 1;

            } else if (arr[mid] == target) {
                // target found
                return mid;
            }
            // what if the target element is the smallest index element in that array
            if(target == arr[0]){
                return -1;
            }


        }
        return end;
    }

}
