import java.util.ArrayList;

class binarySearch{
    public static void main(String args[]){
        int[] arr = {5,7,7,8,8,8,8,8,10};
        int result = ceiling(arr, 15);

        char[] letters = {'c','f','j'};
        int[] ans = firstAndLastIndex(arr, 8);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }

    //LeetCode 34 - Find First and Last Position of Element in Sorted Array
    static int[] firstAndLastIndex(int[] arr, int target){
        int[] result = {-1, -1};
        int start =0;
        int end = arr.length - 1;


        //first first index/position
        while(start <= end ){
            int mid = start + (end - start) /2 ;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else {
                result[0] = mid;
                end = mid - 1;
            }
        }


        //find last index/position
        int start2 = 0;
        int end2 = arr.length -1 ;
        //first first index/position
        while(start2 <= end2 ){
            int mid = start2 + (end2 - start2) /2 ;
            if(target < arr[mid]){
                end2 = mid - 1;
            }else if(target > arr[mid]){
                start2 = mid + 1;
            }else {
                result[1] = mid;
                start2 = mid + 1;
            }
        }

        return result;
    }

    // Find the greatest number in the array <= target
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end -start)/ 2;
            if(target < arr[mid]){
                end  = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }

        return end;
    }

    // Find the smallest number >= target
    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start) /2;

            if(target > arr[mid]){
                start = mid + 1;
            }else if(target <= arr[mid]){
                end = mid -1 ;
            }else {
                return mid;
            }

        }
        return start;
    }

    //leetcode 744
    static char  smallestLetterGreaterThenTarget(char[] arr,char target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) /2;

            if(target < arr[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }

}