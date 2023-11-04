/*
 * @Erro1
 */
//import java.util.ArrayList;

//public class Solution {
//	
//    public int twoSum(int[] nums, int target) {
//    	ArrayList al = new ArrayList();
//        for (int oneNumber = 0; oneNumber < nums.length; oneNumber++) {
//            for (int twoNumber = 0; twoNumber < nums.length; twoNumber++) {
//                if (nums[oneNumber] + nums[twoNumber] == target) {                    
//                    if (!al.contains(oneNumber)) {
//                    	al.add(oneNumber);
//                    } else if (!al.contains(twoNumber)) {
//                    	al.add(twoNumber);
//                    } 
//                }
//            }
//        }
//        System.out.println(al.get(0) + ", " + al.get(1)); 
//        return 0;
//    }
//}
/*
 * @Erro2
 */
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//
//        int saveNum[] = new int[2];
//        for (int num1 = 0; num1 < nums.length; num1++) {
//            for (int num2 = 0; num2 < nums.length; num2++) {
//                if (nums[num1] + nums[num2] == target) {
//                	saveNum[0] = num1;
//                	if (saveNum[0] != num2) {
//                		 saveNum[1] = num2;
//                	}
//                }
//            }
//        }
//        System.out.println(saveNum[0] + ", " + saveNum[1]);
//        return saveNum;
//    }
//}
class Solution {
    public int[] twoSum(int[] nums, int target) {
    	int numberOne = 0;
    	int numberTwo = 0;
    	for (numberOne = 0; numberOne < nums.length; numberOne++) {
    		for (numberTwo = 0; numberTwo < nums.length; numberTwo++) {
    			if (nums[numberOne] + nums[numberTwo] == target) {
    				if (numberOne != numberTwo) {
//In order not to repeat the number, I implemented this condition 
//to compare numberOne with numberTwo.
//With this condition, I managed to solve LeetCode question 1! :)
    					System.out.println(numberOne + ", " + numberTwo);
    					return new int[] {numberOne,numberTwo};
    				}
    			}
    		}
    	}
    	 return new int[] {0};
    }
}
