package LAB7;

public class Q2 {
	public static void main (String[] args) {  
		String str = "AbCdefGHijklMNOpqRstUVwxyZ@%*234"; 
        int upperCase = 0;  
        int lowerCase = 0;  
        int digits = 0;  
        int others = 0;  
        for (int i = 0; i < str.length(); i++) {  
            char ch = str.charAt(i);  
            if (Character.isUpperCase(ch)) {  
                upperCase++;  
            }  
            else if (Character.isLowerCase(ch)) {  
                lowerCase++;  
            }  
            else if (Character.isDigit(ch)) {  
                digits++;  
            }  
            else {  
                others++;  
            }  
        }  
        System.out.println("Lower case letters : " + lowerCase);
        System.out.println("Upper case letters : " + upperCase);
        System.out.println("Number : " + digits);
        System.out.println("Special characters : " + others);
   
       
       
   
    }  
    
}
