package designpatterns.factory;

public class CoffeeFactory implements AbstractFactory {
    @Override
    public Coffee getCoffee(String coffeeType){
        Coffee coffee;
        if(coffeeType.equals("Espresso")){
            coffee = new Espresso();
        }
        else if(coffeeType.equals("Cappuccino")){
            coffee = new Cuppuccino();
        } else{
            coffee = new Robusta();
        }
        return coffee;
    }
}
