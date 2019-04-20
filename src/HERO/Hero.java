package HERO;
import java.awt.*;
import java.util.ArrayList;
public class Hero {
    String name; //姓名
    float hp; //血量
    float armor; //护甲
    int moveSpeed; //移动速度
    public Hero(){
       System.out.println("Hero的无参的构造方法 ");
    }

    public Hero(String name){
        //System.out.println("Hero的有一个参数的构造方法 ");
        this.name = name;
    }
    public String toString(){
        return name;
    }


    public void kill(Mortal m){
        m.die();
    }
    public static void main(String[] args) {
        ArrayList herosa = new ArrayList();

        // 初始化5个对象
        for (int i = 0; i < 9; i++) {
            herosa.add(new Hero("hero " + i));
        }
        Hero specialHero = new Hero("special hero");
        herosa.add(specialHero);
        System.out.println(herosa);
        Hero hs[] = (Hero[])herosa.toArray(new Hero[]{});
        System.out.println("数组:" +hs);


        //创建一个对象
        //new Hero();
        //容器类ArrayList，用于存放对象
        ArrayList heros = new ArrayList();
        heros.add( new Hero("盖伦"));
        System.out.println(heros.size());

        //容器的容量"capacity"会随着对象的增加，自动增长
        //只需要不断往容器里增加英雄即可，不用担心会出现数组的边界问题。
        heros.add( new Hero("提莫"));
        System.out.println(heros.size());

        ArrayList<Hero> heroes=new ArrayList<Hero>();
        for(int i = 0 ; i < 5; i++){
            heros.add(new Hero("hero"+i));
            System.out.println(heros);
        }
        //heros.add("1");
        System.out.println(heros.size());
        System.out.println(heros);
        //Hero specialHero = new Hero("special hero");
        heros.add(specialHero);

        System.out.println(heros);
        // 判断一个对象是否在容器中
        // 判断标准： 是否是同一个对象，而不是name是否相同
        System.out.print("虽然一个新的对象名字也叫 hero 1，但是contains的返回是:");
        Hero hero0 =new Hero();
        System.out.println(heros.contains(hero0));
        System.out.print("而对specialHero的判断，contains的返回是:");
        System.out.println(heros.contains(specialHero));
        System.out.println(heros.get(6));
        System.out.println(heros.indexOf(specialHero));
        System.out.println(heros.indexOf(new Hero("hero1")));
        heros.remove(2);
        heros.remove(specialHero);
        heros.set(2,new Hero("鲁班"));
        System.out.println(heros);
        Hero has[] = (Hero[])heros.toArray(new Hero[]{});
        System.out.println("数组:" +has);


        /*int i = 5;
        //方法1
        String str = String.valueOf(i);
        //方法2
        Integer it = i;
        String str2 = it.toString();
        //使用一个引用来指向这个对象
        Hero gareen= new Hero();
        gareen.name="盖伦";
        ADHero ad =new ADHero();
        ad.name="鲁班七号";
        APHero ap=new APHero();
        ADAPHero adap =new ADAPHero();
        gareen.kill(ad);
        gareen.kill(ap);
        gareen.kill(adap);
        System.out.println(gareen.toString());
        //直接打印对象就是打印该对象的toString()返回值
        System.out.println(gareen);
        float f= 0.14f;
        Float fa=new Float(f);
        String fs=fa.toString();
        System.out.println(fs);
        float f1=Float.parseFloat(fs);
        System.out.println(f1);
        String f2="3.1a4";
        System.out.println(f2);
        //float f3=Float.parseFloat(f2);
        //System.out.println(f3);
*/
    }
}
