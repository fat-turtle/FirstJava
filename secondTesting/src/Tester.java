public class Tester {
    String name;
    int age;
    Tester(){
        System.out.println("construct");
    }

    public Tester(int age, String name){
        this.name = name;
        this.age = age;
    }

    public static String talk(){

        return "hello";
    }

}
