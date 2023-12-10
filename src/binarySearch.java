class binarySearch{
    public static void main(String args[]){
        int[] arr = {2,3,5 ,9,14,16,18};
        int result = ceiling(arr, 15);
        System.out.println(result);
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
}