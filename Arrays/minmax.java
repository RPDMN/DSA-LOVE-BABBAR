public class minmax{

class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} */

     //https://practice.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1/#
    //Brute force => first sort the array and the first is min and last is max;
     //O(nlogn)  sc O(1)
     //Optimized approch => 
    static pair getMinMax(long a[], long n)  
    {
        long max = a[0];
        long min = a[0];
        
        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                min = a[i];
            }
            if(a[i]>max){
                max = a[i];
            }
        }
        
        pair p = new pair(min,max);
        
        return p;
    }




}