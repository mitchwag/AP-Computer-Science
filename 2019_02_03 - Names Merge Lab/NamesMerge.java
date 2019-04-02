import java.util.*;

public class NamesMerge {
	String[] arrA, arrB;
	boolean arrASorted, arrBSorted;

    NamesMerge() {

    }

    NamesMerge(String[] arrA, String[] arrB) {
        this.arrA = formatArray(arrA);
        this.arrB = formatArray(arrB);
        
        if (Arrays.equals(formatArray(arrA), sortArray(this.arrA)))
        	arrASorted = true;
        else
        	this.arrA = formatArray(arrA);
        
        if (Arrays.equals(formatArray(arrB), sortArray(this.arrB)))
        	arrBSorted = true;
        else
        	this.arrB = formatArray(arrB);
    }

    private String[] formatArray(String[] arrInput) {
    	int countFilled = 0;
    	for (String input : arrInput) {
            if (input != null) {
            	countFilled++;
            }
        }
    	
    	String[] temp = new String[countFilled];
    	for (int i = 0; i < countFilled; i++) {
    		temp[i] = arrInput[i].substring(0,1).toUpperCase() + arrInput[i].substring(1, arrInput[i].length()).toLowerCase();
    	}
        return temp;
    }
    
    public String getArrA() {
        String temp = "";
        for (String a : arrA) {
            temp += a + " ";
        }
        return temp;
    }

    public String getArrB() {
        String temp = "";
        for (String b : arrB) {
            temp += b + " ";
        }
        return temp;
    }

    private String[] sortArray(String[] input) {
    	Arrays.sort(input);
        return input;
    }

    public String mergeArrays() {
    	if (arrASorted == true && arrBSorted == true) {
    		String[] arrM = new String[arrA.length + arrB.length];
            
            for (int a = 0; a < arrA.length; a++) {
        		arrM[a] = arrA[a];
        	}
            
            for (int b = 0; b < arrB.length; b++) {
        		arrM[arrA.length + b] = arrB[b];
        	}
            
            sortArray(arrM);
            
            String temp = "";
            for (String m : arrM) {
                temp += m + " ";
            }
            return temp;
    	} else {
    		return "Error: Arrays not in correct order";
    	}
    }
}
