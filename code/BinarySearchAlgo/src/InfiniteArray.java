public class InfiniteArray {
    public static void main(String[]args){
        int[]arr={3,5,8,10,22,28,30,45,65};
        int target = 30;
        int ans = Search(arr, target);
        System.out.println(ans);
    }

    static int Search(int []arr, int target){
        int start = 0;
        int end = 1;

        while (target > arr[end]){
            int temp = end + 1;  // cross-check this line
            end = end + (end - start + 1)*2;
            start = temp;
        }
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[]arr,int target,int start, int end) {
       // int start = arr[0];
       // int end = arr[arr.length -1 ];
        int mid = start +(end - start)/2;

        while(start <= end){
            if (target > arr[mid]){
                start = mid +1;
            }else if(target < arr[mid]){
                end = mid -1;
            }else {
                return mid;
            }
        }
        return -1;
    }


}
