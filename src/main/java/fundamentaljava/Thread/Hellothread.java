package fundamentaljava.Thread;

public class Hellothread  extends Thread{

    public void run()
    {
        System.out.println("THREAD CREATED");
    }

    public static void main(String[] args) {
        Hellothread h=new Hellothread();
        h.start();
        h.run();
    }

}
