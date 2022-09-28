//Author: Prajwal Pisal
//Date: 27/09/2022
//Description: Java program to convert roman to integer.
//Stats: Runtime: 23 ms, Memory Usage: 47.2 MB

class Solution {
    public int romanToInt(String s) {
        int current = 0, int previous = 0, int op = 0;
        String reverse = "";
        char ch;
      
        for (int i=0; i<s.length(); i++)
        {
            ch= s.charAt(i); //extracts each character
            reverse= ch+reverse; //adds each character in front of the existing string
        }

        for(int i = 0; i<reverse.length();i++){
            switch(reverse.charAt(i)){
                case 'I':
                    current = 1;
                    break;
                case 'V':
                    current = 5;
                    break;
                case 'X':
                    current = 10;
                    break;
                case 'L':
                    current = 50;
                    break;
                case 'C':
                    current = 100;
                    break;
                case 'D':
                    current = 500;
                    break;
                case 'M':
                    current = 1000;
                    break;
            }
            if (previous>current){
                op -= current;
            }else {
                op += current;
                previous = current;
            }
        }

        
    return op;
    }
}
