package net.jhc.sgghspring.pojo;

public class Employee {
    private int user_id, user_gender, user_state;
    private String user_email, user_name;

    @Override
    public String toString() {
        return "Employee{" +
                "user_id=" + user_id +
                ", user_gender=" + user_gender +
                ", user_state=" + user_state +
                ", user_email='" + user_email + '\'' +
                ", user_name='" + user_name + '\'' +
                '}';
    }

    public Employee(int user_id, int user_gender, int user_state, String user_email, String user_name) {
        this.user_id = user_id;
        this.user_gender = user_gender;
        this.user_state = user_state;
        this.user_email = user_email;
        this.user_name = user_name;
    }

    public Employee() {
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(int user_gender) {
        this.user_gender = user_gender;
    }

    public int getUser_state() {
        return user_state;
    }

    public void setUser_state(int user_state) {
        this.user_state = user_state;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}
