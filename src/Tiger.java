public class Tiger {
    // put your instance variables here!
    String name;
    String favoriteFood;

    public Tiger(String name) {
        // put your constructor content here
        this.name = name;
        this.favoriteFood = "meat";
    }

    public void sleep(String name) {
        // complete your sleep function here!
        System.out.print(name + " sleeps for 8 hours.");
    }

    public void eat(String food) {
        // complete your eat function here!
        System.out.println(this.name + " eats " + food + ".");
        if(food.equals(this.favoriteFood)) {
            System.out.println("YUM!! " + this.name + " want's more " + this.favoriteFood + ".");
        } else {
            sleep(this.name);
        }
    }

    public static void main(String[] args) {
        //either make a new instance of a zoo
        //to call the non-static sleep method....
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");

    }

}

