/**
 * Problem Set 5.
 * 
 * It's time to put your skills to the test. This problem set focuses on using
 * built-in methods, most notable of the String class. It is also your first
 * introduction to methods that accept parameters and return values. The main
 * method is declared, but it is up to you to implement. Write your code for each
 * exercise in the corresponding method. Make sure you test your code thoroughly.
 * 
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section.
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet5 {
    
    public static void main(String[] args) {
        ProblemSet5 ps = new ProblemSet5();

        //System.out.println(ps.surroundMe("in","heree"));
        //System.out.println(ps.endsMeet("poop", 1));
        //System.out.println(ps.middleMan("poopy"));
        //System.out.println(ps.isCentered("hell", "elo"));
        //System.out.println(ps.countMe("hello myo namo iso lukaso", 'o'));
        //System.out.println(ps.triplets("aaabbbcccddd"));
        //System.out.println(ps.addMe("12aa3"));
        //System.out.println(ps.sequence("aabbbdddddcccc"));
        System.out.println(ps.intertwine("hello", "b"));


    }
    
    /*
     * Exercise 1.
     * 
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */
    
    public String surroundMe(String in, String out) {
        String outcome;
        
         if(in != null && out != null && out.length() == 4){
            String lastTwoOut = out.substring(out.length()-2);
            String firstTwoOut = out.substring(0,2);
            outcome = firstTwoOut + in + lastTwoOut;
            return outcome;
        } else {
            return in;
        }
       
        
    }
    
    /*
     * Exercise 2.
     * 
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text.
     */
    
     
    public String endsMeet(String text, int n) {
        String outcome;

        if(text != null && text.length() > 0 && text.length() < 11 && n > 0 && n < text.length()){
            String lastOfN = text.substring(text.length()-n);
            String firstOfN = text.substring(0,n);
            outcome = firstOfN + lastOfN;
            return outcome;
        } else {
            return text;
        }
    }

    
    
    /*
     * Exercise 3.
     * 
     * Given a string, return a new string using the middle three characters of text.
    */
    
    public String middleMan(String text) {
        String outcome;

        if(text != null && text.length()%2 == 1){
            
            outcome = text.substring((text.length()/2)-1, (text.length()/2) +2);
            return outcome;
        } else {
            return text;
        }
}


     
    
    /*
     * Exercise 4.
     * 
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */
    
    public boolean isCentered(String text, String target) {
        
        String outcome;
        if(text != null && text.length()%2 == 1){
            
            outcome = text.substring((text.length()/2)-1, (text.length()/2) +2);
            if(target.length() == 3 && outcome.equals(target)){
                return true;
            } else {
                return false;
            }
           
        } else {
            return false;
        }
    }
    
    

    /*
     * Exercise 5.
     * 
     * Given a string and a character, compute the number of words that end in suffix.
     
    */

    public int countMe(String text, char suffix) {
        int count = 0;

        if(text != null && Character.toString(suffix).matches("[a-zA-Z]")){
            for(int i = 0 ; i <= text.length()-1 ; i++){
                if(i != 0){
                    
                    if(i == text.length()-1){
                        
                        if(text.charAt(i) == suffix){
                            count++;
                        }
                    } else{
                        if(text.charAt(i) == suffix && text.charAt(i+1) == ' ' && text.charAt(i-1) != ' '){
                            count++;
                    }
                   
                    }
                }
                
            }
            return count;
        } else{
            return -1;
        }
    }

    
    
    /*
     * Exercise 6.
     * 
     * Given a string, compute the number of triplets in text.
     
    */

    public int triplets(String text) {
        int count = 0;
        if(text != null){
            for (int i = 2; i < text.length() ; i++){
                
                if(text.charAt(i - 2) == text.charAt(i) && text.charAt(i -1) == text.charAt(i)){
                    count++;
                    
                }
            }
            
            return count;
        } else {
            return -1;
        }


        
        
    }

    
    
    /*
     * Exercise 7.
     * 
     * Given a string, compute the sum of the digits in text.
      */
    
    public long addMe(String text) {
        long sum = 0;

        if(text != null){ 
            for(int i = 0; i < text.length(); i++){
                
                if(Character.toString(text.charAt(i)).matches("[0-9]")){
                    
                    sum += Character.getNumericValue(text.charAt(i));
                }
            }

            return sum;

        } else {
            return -1;
        }
        
    }

   
    
    /*
     * Exercise 8.
     * 
     * Given a string, compute the length of the longest sequence.
    */
    
    public long sequence(String text) {
        long count1 = 1;
        long count2 = 1;

        if(text != null){ 
            for(int i =0; i< text.length()-1; i++){
                if(text.charAt(i) == text.charAt(i+1)){
                    
                    count1++;
                    
                    
                } 
                    if(text.charAt(i) != text.charAt(i+1)){
                        

                        if(count1 > count2){
                            
                        
                            count2 = count1;
                            count1 = 1;
                        }
                        
                    }

                    if(i == text.length() - 2 && count1 > count2){
                        
                        return count1;
                    }
                
            }

            return count2;
        } else {
            return -1;
        }
    }

     
    
    /*
     * Exercise 9.
     * 
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */
    
    public String intertwine(String a, String b) {

        String c = "";

        if(a == null || b == null){
            return null;
        }

        if(a.length() >= b.length()){
            for(int i = 0; i <= a.length()-1; i++){
                c += a.charAt(i);
                if( i <= b.length()-1 ){
                    c += b.charAt(i);
                    
                }
                
                
            }

            return c;
        } else if(b.length() >= a.length()){
            for(int i = 0; i <= b.length()-1; i++){
                
                if( i <= a.length()-1 ){
                    c += a.charAt(i);
                    
                }
                c += b.charAt(i);
                
            }

            return c;
        }

        return null;

    }

    
    
    /*
     * Exercise 10.
     * 
     * Given a string, determine whether or not it is a palindrome.
     
    
    public boolean isPalindrome(String text) {

    }

    */
}
