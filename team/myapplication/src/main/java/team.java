import android.provider.ContactsContract;

public class team {


    private int id;
    private String  name;
    private String  lastname ;
    private String  sex ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getOffic() {
        return offic;
    }

    public void setOffic(int offic) {
        this.offic = offic;
    }

    public team(int id, String name, String lastname, String sex, int age, int grade, String major, String email, int phonenumber, int offic) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.sex = sex;
        this.age = age;
        this.grade = grade;
        this.major = major;
        this.email = email;
        this.phonenumber = phonenumber;
        this.offic = offic;
    }

    private int  age ;
    private int grade ;
    private String major ;
    private String email ;
    private int phonenumber ;
    private int offic ;


    public void Student(int id, String name, String lastname , int age , String sex, int grade ,String major , String email , int phonenumber) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.grade = grade;
        this.major = major;
        this.email = email;
        this.phonenumber = phonenumber;
        this.sex = sex;
        this.age = age;

    }
    public void Teacher(int id, String name, String lastname , int age , String sex, int grade ,String major , String email , int phonenumber) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.grade = grade;
        this.major = major;
        this.email = email;
        this.phonenumber = phonenumber;
        this.offic = offic;
        this.sex = sex;
        this.age = age;
    }


    public team(int id) {
        this.id = id;
    }

    public void Employee(int id, String name, String lastname , int age , String sex , int grade , String major , String email , int phonenumber) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.grade = grade;
        this.major = major;
        this.email = email;
        this.phonenumber = phonenumber;
        this.offic = offic;
        this.sex = sex;
        this.age = age;
    }



}
