package HERO;

import java.util.Arrays;

public class DoubleArray {
    public static void main(String[] args){
        int[][] a=new int[5][8];
        int i,j;
        for(i=0;i<5;i++){
            for(j=0;j<8;j++){
                a[i][j]=(int)(Math.random()*100);
            }
        }
        int[ ] b=new int[40];
        for(i=0;i<5;i++){
            System.arraycopy(a[i],0, b,i*8,8);
        }
        Arrays.sort(b);
        for (i=0;i<5;i++){
            System.arraycopy(b,i*8,a[i],0,8);
        }
        //String content1,content2,conten3,content4,content5;
        for(i=0;i<5;i++){
          String content =Arrays.toString(a[i]);
          System.out.println(content);
        }
    }
}
