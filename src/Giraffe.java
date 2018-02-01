public class Giraffe  extends Animal {

    public Giraffe(String name) {
        // put your constructor content here
        super(name,"leaves");
    }

    public void eat(String food) {
        if(food.equals(favoriteFood)) {
            System.out.println(name + " eats " + food);
            System.out.println("YUM!! " + name + " wants more leaves");
            super.sleep(name);
        } else {
            System.out.println("YUCK!! " + name + " will not eat " + food + ".");
        }
    }

}
