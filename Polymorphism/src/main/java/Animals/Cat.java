package Animals;

public class Cat extends Animal implements NoiseCapable{
    private String name;
    public Cat(String name) {
        super(name);
        this.name = super.getName();
    }
    public Cat(){
        super("Cat");
        this.name = super.getName();
    }
    public void purr(){
        System.out.println(this.name + " purrs");
    }

    @Override
    public void makeNoise() {
        purr();
    }
}
