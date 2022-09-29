public class CeilingQuestion {
    public static void main(String[] args) {

        // Ceiling is the smallest among the larger number after target in an array

        int[] arr2 = {2, 3, 5, 9, 14, 16, 18};
        int target = 17;
        int ans = ceilingQ(arr2, target);
        System.out.println(ans);

    }

    static int ceilingQ(int[] arr, int target) {
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

            //What if the target element is the largest index element in that array
            if(target == arr[arr.length - 1]){
                return -1;
            }
        }
        return start;
    }
}




