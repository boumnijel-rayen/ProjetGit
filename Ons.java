public class Hello {
    private String name;
    private int age;
    private String adresse;

    public Hello () {

    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public void display () {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Adress: " + adresse);
        System.out.println("My name is " + name + "and my age is" + age);
        System.out.println("Hello");
    }
}