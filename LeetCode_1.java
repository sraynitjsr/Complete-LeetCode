import java.util.HashMap;
import java.util.Scanner;
public class LeetCode_1 {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (mp.containsKey(diff)) {
                return new int[] {i,mp.get(diff)};
            }
            mp.put(nums[i], i);
        }
        return null;
    }
    public static void main(String args[]) throws Exception {
        
        System.out.println("Enter Size of the Array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter a Number");
            int elemenet = sc.nextInt();
            arr[i] = elemenet;
        }
        System.out.println("Enter Target Sum");
        int target = sc.nextInt();
        int myAnswer[] = twoSum(arr, target);
        System.out.println(myAnswer[0] + " " + myAnswer[1]);
    }
}
