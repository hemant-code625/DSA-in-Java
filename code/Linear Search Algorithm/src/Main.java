public class Main {
    public static void main(String[] args) {
        int[] arr={34,56,66,6,5,8,90};
        int target = 90;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
        System.out.println(linearSearch2(arr, target));
        int ans3 = linearSearch3(arr, target);
        System.out.println(ans3);

    }
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;             //this code will execute when none of the above conditions have executed
    }

    static boolean linearSearch2(int[] arr,int target){
        if(arr.length==0){
            return false;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target){
                return true;
            }
        }
        return false;             //this code will execute when none of the above conditions have executed
    }
    static int linearSearch3(int[] arr,int target){
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;             //this code will execute when none of the above conditions have executed
    }

}