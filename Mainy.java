
/* 2. - Accept a String input
- Accept a search String to search in the above input
- Verify if the search String is present in the input string and the position and number of occurrences

Eg. If the String input is - I want to go to Finland because the landscape is beatiful.
and the search String is land
then the output should be as below
Occurrences - 2
Position - 20,37*/


import java.util.*;
class Mainy { 
      
    static int countFreq(String pat, String txt) {         
        int M = pat.length();         
        int N = txt.length();         
        int res = 0; 
  
        for (int i = 0; i <= N - M; i++) { 
            int j;             
            for (j = 0; j < M; j++) { 
                if (txt.charAt(i + j) != pat.charAt(j)) { 
                    break; 
                } 
                //System.out.println(j);
            } 
 
            if (j == M) {                 
                res++;                 
                j = 0;  
            }             
        }         
        return res;         
    } 
  
        static public void main(String[] args) { 
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter a string: ");  
     String txt= sc.nextLine();
	 System.out.print("Enter the  string to search : ");  
     String pat= sc.nextLine();      
       int k= countFreq(pat, txt);   
       System.out.print("occurences =");  //count occurrence
       System.out.print(k); 
       if(k==0)
       System.out.print("\nsubstring not present");
       else
       System.out.print("\nsubstring present");
    }
}
