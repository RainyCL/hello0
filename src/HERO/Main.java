package HERO;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int i=1;
        int j=1;
        System.out.println(i==2 && i++==1);
        System.out.println(i);
        System.out.println(j==2 & j++==2);
        System.out.println(j);
        double r=1.2;
        int p=12000;
        double F=0;
        int n;
        for(n=1;F<=1000000;n++){
            F=(F+p)*r;
        }
        r=0;
        boolean flag;
        int answer1=0,answer2=0;
        System.out.println(n);
        for(i=1;i<21;i++){
            if(i%2==0) {
                for(j=1;j<i;j=j+2){
                    F=j/(double)i;
                    if (Math.abs(r-0.618)>Math.abs(F-0.618)){
                        answer1=j;
                        answer2=i;
                        r=F;
                    }
                }
            }
            else{
                for(j=1;j<i;j++) {
                    F=j/(double)i;
                    if (Math.abs(r-0.618)>Math.abs(F-0.618)){
                        answer1=j;
                        answer2=i;
                        r=F;
                    }
                }
            }
        }
        System.out.println(answer1);
        System.out.println(answer2);
        //水仙花数
        long startTime=System.nanoTime();   //获取开始时间
        int[] answer=new int[100];
        int m,k;
        int count=0;//计数
        int[] cube=new int[10];
        for(i=0;i<10;i++){
            cube[i]=i*i*i;
        }
        for(i=1;i<10;i++){
            if(i*100==cube[i]){
                answer[count]=cube[i];
                count++;
            }
        }
        //两个数字相同,三个数字相同，没有计算100，200，300...
        for(i=1;i<10;i++){
            for(j=0;j<10;j++){
                m=cube[i]+cube[i]+cube[j];
                if(m==i*100+i*10+j){
                    answer[count]=m;
                    count++;
                }else if(m==i*100+j*10+i){
                    answer[count]=m;
                    count ++;
                }else if(m==j*100+i*10+i){
                    answer[count]=m;
                    count ++;
                }
            }
        }
        //三个数字都不同
        for(i=2;i<10;i++){
            for(j=0;j<i;j++){
                for(k=0;k<j;k++){
                    m=cube[i]+cube[j]+cube[k];
                    if(m==i*100+j*10+k){
                        answer[count]=m;
                        count++;
                    }else if(m==i*100+k*10+j){
                        answer[count]=m;
                        count ++;
                    }else if(m==j*100+i*10+k){
                        answer[count]=m;
                        count ++;
                    }else if(m==j*100+k*10+i){
                        answer[count]=m;
                        count ++;
                    }else if(m==k*100+j*10+i){
                        answer[count]=m;
                        count ++;
                    }else if(m==k*100+i*10+j){
                        answer[count]=m;
                        count ++;
                    }
                }
            }
        }
        System.out.println(count);
        for(i=0;i<count;i++){
            System.out.println(answer[i]);
        }
        long endTime=System.nanoTime(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)+"ns");
        //直接计算所有组合
        startTime=System.nanoTime();   //获取开始时间
        int m1,m2,m3;
        count=0;
        for(i=0;i<10;i++){
            //m1=i*i*i;
            for(j=0;j<=i;j++){
                //m2=j*j*j;
                for(k=0;k<=j;k++){
                    //=k*k*k;
                    m=cube[i]+cube[j]+cube[k];
                    if(m<1001&&m>99){
                        if(m==i*100+j*10+k){
                            answer[count]=m;
                            count++;
                        }else if(m==i*100+k*10+j){
                            answer[count]=m;
                            count ++;
                        }else if(m==j*100+i*10+k){
                            answer[count]=m;
                            count ++;
                        }else if(m==j*100+k*10+i){
                            answer[count]=m;
                            count ++;
                        }else if(m==k*100+j*10+i){
                            answer[count]=m;
                            count ++;
                        }else if(m==k*100+i*10+j){
                            answer[count]=m;
                            count ++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
        for(i=0;i<count;i++){
            System.out.println(answer[i]);
        }
        endTime=System.nanoTime(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)+"ns");
        startTime=System.nanoTime();   //获取开始时间
        for(i=100;i<1000;i++)
        {
            if((Math.pow((i/100),3)+Math.pow(((i/10)%10),3)+Math.pow((i%10), 3))==i)
            {
                System.out.println(i);
            }
        }
        endTime=System.nanoTime(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)+"ns");
    }

}
