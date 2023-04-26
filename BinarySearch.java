//Binary Search Program
import java.util.*;


public class BinarySearch {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9};
        int key=11;
       int result= binsearch(arr,key,0,arr.length-1);
       if(result>0)
       System.out.println("ELEMENT FOUND AT INDEX "+result);
       else if(result==-1)
       System.out.println("ELEMENT NOT FOUND");

    }

    public static int binsearch(int[] arr,int target,int low,int high)
    { while(low<=high)
        {
          int mid=(high+low)/2;

                if(arr[mid]==target)
              {
                 return mid;
                 
              }
                else if(arr[mid]<target)
              {
                 low=mid+1;
              }
                else
              {
                 high=mid-1;
              }
        }
        return -1;
    }   

}    
