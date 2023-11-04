
class Solution {
    public boolean isPalindrome(int x) {
    	StringBuilder reverse = new StringBuilder().insert(0, x);
// I created one reference for StringBuilder because I need to used the method reverse(). 
//With the method, I achieved solved the question 9. 
    	if (reverse.toString().equals(reverse.reverse().toString())) {
    		return true;
    	} else {
    	return false;
    	}
    }
}