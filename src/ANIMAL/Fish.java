package ANIMAL;

public class Fish extends Animal implements Pet{
    private Fish() {
        super(0);
    }
    private String name;
    @Override
    public void walk(){
        System.out.println("Fish dosen't have leg");
    }
    public void eat(){
        System.out.println("吃虫子");
    }
    @Override
    public String getname(){
        return this.name;
    }
    @Override
    public void setname(String name){
        this.name=name;
    };
    @Override
    public void play(){
        System.out.println("Fish is playing");
    };
}
