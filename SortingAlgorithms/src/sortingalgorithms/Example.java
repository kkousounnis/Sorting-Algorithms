package sortingalgorithms;

public class Example {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,8,7,3,4,2,1};
        System.out.println(max_value(arr));
        arr = sort(arr,max_value(arr));
        for(int k: arr){
            System.out.print(k);
        }
    }
    
    public static int[] sort(int[] nums, int max_value) 
    {
        // Bucket Sort
        int[] Bucket = new int[max_value + 1];
        int[] sorted_nums = new int[nums.length];
         for (int i = 0; i < nums.length; i++)
          Bucket[nums[i]]++;
          int outPos = 0;
         for (int i = 0; i < Bucket.length; i++)
              for (int j = 0; j < Bucket[i]; j++)
                  sorted_nums[outPos++] = i;
          return sorted_nums;
      }
 
    public static int max_value(int[] nums) 
    {
        int max_value = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] > max_value)
                max_value = nums[i];
        return max_value;
    } 
}
