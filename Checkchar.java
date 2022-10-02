import java.util.Scanner;



public class Checkchar {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        char c = sca.next().charAt(0);
        char ch;
        // int count = 0;
        for(ch = 'a'; ch<='z';  ){
            // System.out.println(ch);
            // if(c == ch){
            //     count++;
                
            ch++;
        }
     

    // }
    System.out.println(ch);
    if(ch==c){
        System.out.println("char");
      }
      else
      System.out.println("no char");
    
}
}