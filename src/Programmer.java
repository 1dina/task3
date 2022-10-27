public class Programmer extends Employee{
    private String name;
    private int age ;
    public Programmer(String name,int age){
        System.out.println("dfdf");
        this.name = name;
        this.age = age;
        System.out.println("Employee " + name + " "+age+ " years.");
        Job.recruiting = false;

    }
}
