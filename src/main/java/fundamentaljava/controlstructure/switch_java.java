package fundamentaljava.controlstructure;

public class switch_java {
    public static void main(String[] args) {
        char d='a';
        //char a='s';
        switch (d)
        {
            case 'a':
                System.out.println("A");
                break;

            case 'e':
                System.out.println("E");
                break;

            case 'i':
                System.out.println("I");
                break;

            case 'o':
                System.out.println("O");
                break;

            case 'u':
                System.out.println("U");
                break;

            default:
                System.out.println("invalid");
        }
    }
}
