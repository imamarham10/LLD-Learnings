package designpatterns.factory;

public class CoffeeServer {
//    public Coffee server(String coffeeType){
//        Coffee coffee;
//        if(coffeeType == "Espresso"){
//            coffee = new Espresso();
//        }
//        else if(coffeeType == "Cappuccino"){
//            coffee = new Cuppuccino();
//        } else{
//            coffee = new Robusta();
//        }
//        coffee.brew();
//        coffee.boil();
//        return coffee;
//    }
/**
 *  It is not good to use the “new” keyword in our class.Because we can only use a new keyword with concrete class and then it will violate the dependency inversion principle.
 *  class should depend on abstraction, not on concretion.
 *  We loose flexibility with concretion.
 *  We cannot eliminate the use of “new” Keyword because it is necessary to create objects for our code to run. But we can defer the use of the “new” keyword.*/

/**
 *  Whenever we see that the types are being mapped with the object, then comes in the creational responsibility.
 *  This is known as creational since we're actually creating objects based on the certain conditions.*/

// this is an example of the factory pattern.
//    public Coffee serve(String coffeeType){
//        Coffee coffee = new CoffeeFactory().getCoffee(coffeeType);
//        coffee.brew();
//        coffee.boil();
//        return coffee;
//    }

    //Another way to implement the abstract factory pattern
    private final AbstractFactory factory;
    public CoffeeServer(AbstractFactory factory){
        this.factory = factory;
    }
    public Coffee serve(String coffeeType){
        Coffee coffee = this.factory.getCoffee(coffeeType);
        coffee.brew();
        coffee.boil();
        return coffee;
    }
}
