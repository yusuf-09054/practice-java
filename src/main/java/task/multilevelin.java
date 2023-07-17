package task;

class subject{
    public void yusuf(){
        System.out.println("i am a gooood boy");
    }
}
class students extends subject{
    public void teja(){
        System.out.println("teja weds swetha ");
    }
}
class school extends students{
    public void  boys(){
        System.out.println("all are bad boys except yusuf");
    }
}
public class multilevelin {
    public static void main(String[] args) {
        school ss=new school();
        ss.yusuf();
        ss.teja();
        ss.boys();
    }

}
