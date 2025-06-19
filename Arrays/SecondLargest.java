import java.util.Arrays;

class Solution {

static int getSecondLargest(int[]arr){
    int n = arr.length;
    
    int largest = -1, secondLargest = -1;
    
    for(int i = 0; i < n; i++){
        if(arr[i] > largest)
        largest = arr[i];
    }
    
    for(int i = 0; i < n; i++){
        if(arr[i]>secondLargest && arr[i]!=largest){
            secondLargest = arr[i];
        }
    }
     return secondLargest;
}
   
    public static void main (String[] args){
        int[] arr ={12,34,1,10,34,1};
        System.out.println(getSecondLargest(arr));
    }
 }
