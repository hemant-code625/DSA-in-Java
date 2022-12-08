import java.util.Arrays;

public class MERGESORT {
    public static void main(String[] args) {
        int[]arr={5,4,3,2,1};

//        int[] ans = mergeSort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(ans));
        mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static int[] mergeSort(int[]arr){

        if(arr.length ==1){                //Base Condition
            return arr;
        }
        int mid= arr.length/2;
        int[] left= mergeSort(Arrays.copyOfRange(arr,0,mid)) ;          //this is exclusive which means this function exclude the last parameter
        int[] right= mergeSort(Arrays.copyOfRange(arr,mid,arr.length));      //thus we put arr.length not arr.length-1

        return merge(left,right);
    }
    static int[]merge(int[] first, int[] second){
        int[]mix = new int[first.length + second.length];
        int i =0;
        int j= 0;
        int k=0;

        while(i<first.length && j<second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] =second[j];
                j++;
            }
            k++;

        }
        //it may be possible that one of the array is not completed
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            mix[k] = second[j];
            k++;
            j++;
        }

        return mix;
    }


    static void mergeSortInPlace(int[]arr, int s, int e){

        if(e-s ==1){                //Base Condition
            return;
        }
        int mid= s+ (e-s)/2;
        mergeSortInPlace(arr,s,mid); ;
        mergeSortInPlace(arr,mid,e);

        mergeInPLace(arr,s,mid,e);
    }
    static void mergeInPLace(int[] arr, int s, int m, int e){
        int[]mix = new int[e-s];
        int i =s;
        int j= m;
        int k= 0;

        while(i< m && j< e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] =arr[j];
                j++;
            }
            k++;

        }
        //it may be possible that one of the array is not completed
        while(i < s){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < e){
            mix[k] = arr[j];
            k++;
            j++;
        }

        //merging array using loop
        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[k];
        }


    }



}
