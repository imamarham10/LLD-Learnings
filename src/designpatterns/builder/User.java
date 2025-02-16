package designpatterns.builder;

public class User {
    private final int id;
    private final String name;
    private final String phoneNumber; //optional
    private final int age; //optional
    /*
    * If we create a constructor with these parameters then we'll have to pass everything in it. Since phoneNumber and age are optional, we'll have to pass them as null.
    * But we don't want it to be that way.
    * Then second option for this is we do constructor overloading, but it'll have it's own limitations. Let's say we've 10 variables that are optional, we'll have to create n numbers of constructor to meet the need.
    *  Third option is, we make setters for the variables that are optional. But then we'll have to keep those variables mutable.
    * We never want to compromise with the immutability of the class variables. Keeping everything as final  *  */

    /*
    * To overcome this problem we'll have an intermediate class, a builder class, that'll have the exactly same variables as the parent class, and every mutable actions will be done on it
    * and finally that builder class will be passed as parameter to the constructor of the parent class.*/

    /*
    * To make the job easier for the client, we'll do the chaining. Every setter returns the Builder object and the build method inside Builder class will be responsible for instantiating User object.
    * User user = new User.Builder(2,"Arham").setAge(25).setPhoneNumber("945402145").build(); So the process of creating a User object which would have taken 4 lines gets narrowed down to 1 line.
     */

    private User(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.phoneNumber = builder.phoneNumber;
        this.age = builder.age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public static class Builder{
        private final int id;
        private final String name;
        private String phoneNumber;
        private int age;

        public Builder(int id, String name){
            this.id = id;
            this.name = name;
            this.phoneNumber = "";
            this.age = 0;
        }

        public Builder phoneNumber(String phoneNumber){
            if(phoneNumber.length() < 10){
                throw new IllegalArgumentException("Phone number should be 10 digits long.");
            }
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder age(int age){
            if(age < 0){
                throw new IllegalArgumentException("Age should be a positive number.");
            }
            this.age = age;
            return this;
        }

        public User build(){
            return new User(this);
        }


    }


}
