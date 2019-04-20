package ANIMAL;

public class Cat extends Animal implements Pet {
    //@Override
    private String name;
    public Cat(String name) {
        super(4);
        this.name=name;
    }
    public Cat(){
        this("");
    }

    @Override
    public String getname(){
        return name;
    }
    @Override
    public void setname(String name){
        this.name=name;
    };
    @Override
    public void play(){
        System.out.println("Cat is playing");
    };
    @Override
    public void eat(){
        System.out.println("吃虫子");
    }
}

