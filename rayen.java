public class rayen{
    
    public String name;
    public int age;
    public String adress;
    public String phone;

    public String GetName ()
    {
        return this.name;
    }

    public void SetName (String name)
    {
        this.name = name;
    }
    public rayen(String name, int age, String adress, String phone){
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.phone = phone;
    }

    
    public rayen(){
        System.out.println("Hello World!");
    }


}