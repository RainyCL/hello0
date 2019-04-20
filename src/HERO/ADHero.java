package HERO;

public class ADHero extends Hero  implements Mortal{

    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
    public void die(){
        System.out.println("物理英雄死了");
    }
    public ADHero(String name){
        super(name);
        System.out.println("AD Hero的构造方法");
    }

    public static void main(String[] args) {
        new ADHero("德莱文");
    }
}
