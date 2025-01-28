public class Main {
    public static void main(String[] args) {

        hellowWorld();
        helloName("Alex McNeil");
        helloName("Ren", "7DWY");
        addingNumbers(5, 6);
        int total = addingNumbers(4, 5 ,6);
    }

    static void hellowWorld(){
        System.out.println("Hello World!");
    }
    static void helloName(String a){
        System.out.println("Hello " + a);
    }
    static void helloName(String a, String b){
        System.out.println("Hello " + a + " and " + b);
    }
    static void addingNumbers(int a, int b){
        System.out.println(a+b);
    }
    static int addingNumbers(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }
    static void squares(int a){
        System.out.println(a*a);
    }
}
