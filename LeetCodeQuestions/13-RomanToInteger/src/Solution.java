//My solution to this problem is to implement a switch and lots of if's hahah.
//My if checks if before the char i contains the specified char. If true, my condition executes the function.
//One problem is the lines. My solution contains too many lines, it's bad.
class Solution {
    public int romanToInt(String s) {
    	int sum = 0;
    	char[] roman = new char[s.length()];
    	for (int i = 0; i < s.length(); i++) {
    		roman[i] = s.charAt(i);
	    	switch (roman[i]) {
		    	case 'I': {
		    		sum+=1;
		    		break;
		    	}
		    	case 'V': {
		    		if (i > 0 && roman[i -1] == 'I') {
		    			sum+=3;
		    			break;
		    		} else {
			    		sum+=5;
			    		break;
		    		}
		    	}
		    	case 'X': {
		    		if (i > 0 && roman[i -1] == 'I') {
		    			sum+=8;
		    			break;
		    		} else {
			    		sum+=10;
			    		break;
		    		}
		    	}
		    	case 'L': {
		    		if (i > 0 && roman[i -1] == 'X') {
		    			sum+=30;
		    			break;
		    		} else {
			    		sum+=50;
			    		break;
		    		}
		    	}
		    	case 'C': {
		    		if (i > 0 && roman[i -1] == 'X') {
		    			sum+=80;
		    			break;
		    		} else {
			    		sum+=100;
			    		break;
		    		}
		    	}
		    	case 'D': {
		    		if (i > 0 && roman[i -1] == 'C') {
		    			sum+=300;
		    			break;
		    		} else {
			    		sum+=500;
			    		break;
		    		}
		    	}
		    	case 'M': {
		    		if (i > 0 && roman[i -1] == 'C') {
		    			sum+=800;
		    			break;
		    		} else {
			    		sum+=1000;
			    		break;
		    		}
		    	}
	    	}
    	}
        return sum;
    }
}