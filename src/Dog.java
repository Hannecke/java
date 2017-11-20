public class Dog extends Animal {

    private int tail;
    private int teeth;
    private int legs;


    public Dog(String name, int brain, int body, int size, int weight, int tail, int teeth, int legs) {
        super(name, brain, body, size, weight);

        this.tail = tail;
        this.teeth = teeth;
        this.legs = legs;
    }

    public String bark() {
        return "guau guau";
    }



    private void chew() {
        System.out.println("Dog chew");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        this.chew();
        super.eat();
    }

    private void walk() {

    }

}
