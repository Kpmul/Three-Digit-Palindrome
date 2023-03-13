/*A palindromic number reads the same both ways. The largest
palindrome made from the product of two 2-digit numbers is 9009
= 91 × 99.
Write a Java program which prints out the largest palindrome
made from the product of two 3-digit numbers*/

public class threeDigitPalindrome {
    
    public static void main(String args[]){

        String check = "";
        int largest = 0;
        int temp = 0;

        for(int x=100;x<1000;x++){
            for(int y=100;y<1000;y++){
                check = Integer.toString(x*y);

                if(isPal(check)){
                    temp = Integer.parseInt(check);
                    if(temp > largest){
                        largest = temp;
                    }
                }
            }
        }
        System.out.println(largest);
        
    }

    public static boolean isPal(String check){

        for(int i=0,j=check.length()-1;i<check.length();i++,j--){
            if(check.charAt(i) != check.charAt(j)){
                return false;
            }
        }
        return true;
    }    
}
