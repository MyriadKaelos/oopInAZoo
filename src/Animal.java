class Animal {

    // Put your instance variables here
    String name;
    String favoriteFood;
    static int population;


    public Animal(String name,String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        population ++;
    }

    public void sleep(String name) {
        // complete your sleep function here!
        System.out.println(name + " sleeps for 8 hours.");
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

    public static int populationCount() {
        return population;
    }

}
