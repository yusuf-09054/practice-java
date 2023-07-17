package fundamentaljava.oops.inheritance.inheritancetypes;

public class Hotel extends meals implements breakfast, lunch, dinner {

    public static void main(String[] args) {
        Hotel hh=new Hotel();
        hh.breakfast();
        hh.lunch();
        hh.dinner();
        hh.meals();


    }

    @Override
    public void breakfast() {
        System.out.println("dosa and idly available for breakfast");

    }

    @Override
    public void dinner() {
        System.out.println("dinner combo offer available");

    }

    @Override
    public void lunch() {
        System.out.println("non veg meals available ");

    }
}
