public class Employee {

    public String name;
    public String secondname;
    public String surname;
    public String post;
    public String phonenumber;
    public int money;
    public int age;

    Employee(String surname, String name, String secondname, String post, String phonenumber, int money, int age) {
        this.name = name;
        this.secondname = secondname;
        this.surname = surname;
        this.post = post;
        this.phonenumber = phonenumber;
        this.money = money;
        this.age = age;
    }

    String getSurname() {
        return surname;
    }

    String getName() {
        return name;
    }

    String getSecondname() {
        return secondname;
    }

    String getPost() {
        return post;
    }

    String getPhonenumber() {
        return phonenumber;
    }

    int getMoney() {
        return money;
    }

    int getAge() {
        return age;
    }

    String getInfo() {
        return this.surname + " " + this.name + " " + this.secondname + ", возраст: " + this.age + ", "
                + this.post + " с з/п " + this.money + ", рабочий номер телефона: " + this.phonenumber;
    }


}
