import java.util.Arrays;

public class insertonSort {
      public static void sorting(Integer arr[]){
            for(int i=0;i<arr.length-1;i++){
                  int curr=arr[i];
                  int prev=i-1;
                  //finding the current positin to insert 
                  while(prev>=0 && arr[prev]>curr){
                        arr[prev+1]=arr[prev];
                        prev--;
                  }
                  //insertion
                  arr[prev+1]=curr;
            }
      }
      public static int compare (int a,int b){
            
      }
      public static void printArr(int arr[]) {
            for(int i=0;i<arr.length;i++){
                  System.out.println(arr[i]+" " );
            }
            System.out.println();
      }
      public static void main(String[] args) {
            Integer arr[]={7,6,5,4,8,9};
            sorting(arr,Collections.reverseOrder());
          //    Arrays.sort(arr); using in inbult sot to sort array this sortin technique use import util.Arrays package 
          
          printArr(arr);
            
      }
      
}
