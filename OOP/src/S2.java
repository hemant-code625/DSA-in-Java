public class S2 {
    public static void main(String[]args) {
        int [] arr = {5,5,5,5,5};   //{256741038, 623958417, 467905213, 714532089, 938071625}

        //Use long instead of int datatype because long can hold up to 64 bits of information

        // Write your code here
        int max =0;
        int min = arr[0];
        long totalSum=0;
        for (int i : arr){
            totalSum += i;
            if (i > max){
                max = i;
            }
            if (i < min){
                min = i;
            }
        }
        long minsum=0;
        long maxsum=0;

        //this below code sample will not work on array having same elements like {5,5,5,5,5}
        // so we will get the maxSum by subtracting min (value previously found) from totalSum

//        for (int j=0; j<= arr.length -1; j++){
//            if(arr[j] != max){
//                minsum = minsum + arr[j];
//            }
//            if(arr[j]!= min){
//                maxsum = maxsum +arr[j];
//            }
//
//        }

        minsum = totalSum - min;
        maxsum = totalSum - max;
        System.out.println(minsum + " "+maxsum);   //2063136757 2744467344

    }

}
