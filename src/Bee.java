public class Bee extends Animal {

    public Bee(String name) {
        // put your constructor content here
        super(name,"pollen");
    }

    public void eat(String food) {
        if(food.equals(favoriteFood)) {
            System.out.println(name + " eats " + food);
            System.out.println("YUM!! " + name + " wants more " + favoriteFood);
            sleep(name);
        } else {
            System.out.println("YUCK!! " + name + " will not eat " + food + ".");
        }
    }

    public void sleep(String name) {
        System.out.println(name + " never sleeps.");
    }

}
