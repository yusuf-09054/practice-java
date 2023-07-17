package fundamentaljava.oops.inheritance.polymorphism;

public class Methodoverriding2 extends Methodoverriding{

    public void Statename(String state1,String state2){
        if (state1 == "Tamilnadu"){
            System.out.println("This is my statename");
        } else if (state2 == "kerala") {
            System.out.println("my statename is kerala");

        }else {
            System.out.println("my statename is anyone");
        }
    }
}
