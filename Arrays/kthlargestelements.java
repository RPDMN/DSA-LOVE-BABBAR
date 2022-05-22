public class kthlargest{

   //215. Kth Largest Element in an Array
    //we will make a priorityqueue and start adding elements and after the size exceeds the k the we will
    //remove the smallest element and at the end we will see the top will be our answer
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0;i<nums.length;i++){
            
            pq.add(nums[i]);
            
            if(pq.size()>k){
                pq.poll();
            }
        }
        
        return pq.peek();
        
    }

}