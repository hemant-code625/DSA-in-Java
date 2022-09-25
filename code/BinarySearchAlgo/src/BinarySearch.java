public class BinarySearch {
    public static void main(String[] args) {

        int[] arr={-18,-14,-10,-3,0,1,3,4,8,12,45,68};

        int target = 45;

        int ans = binarySearch(arr,target);

        System.out.println(ans);

    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            // int mid = start + end/2 ......... (It may possible that start+end value might exceed the range of integer in java)

            int mid = start +(end - start)/2;
            if(arr[mid] < target){                        // common error: we sometimes don't put arr[mid] instead we just write mid
                start = mid +1;

            }else if (arr[mid] > target){
                end = mid-1;

            } else if(arr[mid] == target){
                // target found
                return mid;
            }

        }
        // for target not found
        return -1;
    }
}