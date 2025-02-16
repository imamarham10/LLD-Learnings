package designpatterns.builder;

public class Tester {
    public static void main(String[] args) {
        User user = new User.Builder(2,"Arham").age(25).phoneNumber("945402145").build();
        System.out.println(user.getName());
    }
}
