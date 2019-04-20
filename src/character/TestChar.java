package character;

import java.util.Scanner;

public class TestChar {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        char[] b=a.toCharArray();
        //char[] c=new char[];
        for(int i=0;i<b.length;i++){
            if(b[i]>='0'&&b[i]<='9'){
                System.out.print(b[i]);
            }else if(b[i]>='A'&&b[i]<='Z'){
                System.out.print(b[i]);
            }
        }
        for(int j=0;j<b.length;j++){
            if(Character.isDigit(b[j])||Character.isUpperCase(b[j])){
                System.out.print(b[j]);
            }
        }
    }
}
