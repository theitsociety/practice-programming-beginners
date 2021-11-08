import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TwoSumSolution_One {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 26;

//        System.out.println(sumsToTarget_BruteForce(nums,target));
//        System.out.println(sumsToTarget_HashSet(nums, target));
//        System.out.println(sumsToTarget_SortAndFind(nums, target));

    }

    private static boolean sumsToTarget_BruteForce(int[] arr, int target) {
        // O(n2) n * n = n2
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] + arr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }
    // 11,2,15,7
    // target = 27

    // 2,7,11,15

    // 2 + 15 > 9
    private static boolean sumsToTarget_SortAndFind(int[] arr, int target){
        // sort - kucukten buyuge siralama
        // complexity - nlogn
        Arrays.sort(arr); // nlogn
        int left = 0;
        int right = arr.length -1;
        while (left < right){ // n
            int sum = arr[left] + arr[right];
            if(sum == target) return true;
            else if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        return false;
    }


    // 11,2,15,7
    // target = 26

    // 26 - 11 = 15
    private static boolean sumsToTarget_HashSet(int[] arr, int target) {
        // coding to interfaces, not implementation
        // Time Comp - O(n) - space comp -O(n)
        Set<Integer> values = new HashSet<>(); // 11,2,
        for (int i = 0; i < arr.length; i++) {
            int lookFor = target - arr[i]; // 1. step -> 15, 2.step - 24, 3.step -> 11
            if(values.contains(lookFor)){
                return true;
            }

            values.add(arr[i]);
        }

        return  false;

    }


}
