import java.sql.Array;

public class Q2 {
    public static void main(String[] args) {

    }
    private int minIndex(int[] arr, int target){
        int n = arr.length;
        int sum =0;
        for(int i = 0; i < n; i++){
            if(arr[i] >= target){
                return -1;
            }
            sum += arr[i];
            if(sum >=target){
                return i;
            }
        }
        return -2;
    }
    private int minArr(int[] arr, int target){
      int sum =0;
      int n = arr.length;
      int i=0;
      if(arr[i] >= target){
          return 1;
      }
      sum = arr[i];
      for(int j =1 ; j<n; j++){
          sum += arr[j];
          if(sum >= target){
              
          }
      }
    }
}
