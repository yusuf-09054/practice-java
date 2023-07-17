package fundamentaljava.oops.inheritance.Encapsulation;

public class Encap extends Details {
    public static void main(String[] args) {
        Encap ee = new Encap();
        ee.setRollno(5);
        ee.setName("yusuf");
        ee.setCollegename("sona");
        ee.setDept("Bsc.CS");
        ee.setPhnno(12234566666667l);
        System.out.println(ee.getRollno() + "\n" + ee.getName() + "\n" + ee.getCollegename() + "\n" + ee.getDept() + "\n"+ ee.getPhnno());
    }
}
