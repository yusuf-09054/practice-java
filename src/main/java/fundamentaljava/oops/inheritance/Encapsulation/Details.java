package fundamentaljava.oops.inheritance.Encapsulation;

public class Details {
    public int Rollno;
    public String name;
    public String collegename;
    public String dept;
    public long phnno;

    public int getRollno() {
        return Rollno;
    }

    public void setRollno(int rollno) {
        Rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public long getPhnno() {
        return phnno;
    }

    public void setPhnno(long phnno) {
        this.phnno = phnno;
    }
}
