public class Main {
    public static void main(String[] args) {
        /*in programmer constructor : programmer extends Employee so before execute the child constructor ,the default
        parent constructor is executed first

        the job recruiting is available because it’s a static value which means it’s a common value in its objects
        ,so it’s not restricted to a specific object .
          */
        checkRecruiting();
        Programmer c = new Programmer("Dina",20);
        checkRecruiting();


    }
    public static void checkRecruiting(){
        if (Job.recruiting)
            System.out.println("Lucky");
        else System.out.println("Unlucky");
    }
}