package net.jhc.sgghspring.pojo;

public class Depenment {
    private int demp_id;
    private String demp_department;

    public Depenment() {
    }

    @Override
    public String toString() {
        return "Depenment{" +
                "demp_id=" + demp_id +
                ", demp_department='" + demp_department + '\'' +
                '}';
    }

    public int getDemp_id() {
        return demp_id;
    }

    public void setDemp_id(int demp_id) {
        this.demp_id = demp_id;
    }

    public String getDemp_department() {
        return demp_department;
    }

    public void setDemp_department(String demp_department) {
        this.demp_department = demp_department;
    }

    public Depenment(int demp_id, String demp_department) {
        this.demp_id = demp_id;
        this.demp_department = demp_department;
    }
}
