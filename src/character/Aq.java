package character;

public class Aq {
    public static void main(String[] args) {
        int total = 0; // 质数总数
        boolean b = true;
        String a5="5";
        long startTime=System.nanoTime();   //获取开始时间
        total=4;
        int j;
        for (int i = 11; i <= 10000000; i++) {
            String str = String.valueOf(i);
            String sub = str.substring(str.length() - 1,str.length());
            if(!"0".equals(sub)&&!"2".equals(sub)&&!"4".equals(sub)&&!"6".equals(sub)&&!"8".equals(sub)&&!"5".equals(sub)){
                for (j = 3; j <= (int) Math.sqrt(i); j++) {
                    // 如果有除了1和本身以外的数能整除自己
                    if (i % j == 0) {
                        b = false;
                        break;
                    }
                }
            }
            if (b == false) {
                b = true;
                continue;
            }
            total += 1;
        }
        System.out.println("\n一千万以内的质数一共有：" + total + "个");
        long endTime=System.nanoTime(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)+"ns");
        total=0;
        startTime=System.nanoTime();   //获取开始时间
        for (int i = 2; i <= 10000000; i++) {
                for (j = 2; j <= (int) Math.sqrt(i); j++) {
                    // 如果有除了1和本身以外的数能整除自己
                    if (i % j == 0) {
                        b = false;
                        break;
                    }
                }
            if (b == false) {
                b = true;
                continue;
            }
            total += 1;
        }
        System.out.println("\n一千万以内的质数一共有：" + total + "个");
        endTime=System.nanoTime(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)+"ns");
    }
}