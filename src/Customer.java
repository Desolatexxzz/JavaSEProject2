public class Customer {
    private String name;
    private char gender;
    private int age;
    private String phone;
    private String mail;
    public Customer(){}
    public Customer(String name, char gender, int age, String phone, String mail) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.mail = mail;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
