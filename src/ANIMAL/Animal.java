package ANIMAL;
public abstract class Animal {
    protected int legs;
    public Animal(int legs){
        this.legs=legs;
    }

    public Animal() {
    }

    public abstract void eat();
    public void walk(){
        System.out.println("用" + legs +  "条腿走路");
    }
}
