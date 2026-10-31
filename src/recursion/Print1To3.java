package recursion;

public class Print1To3 {
    public static void main(String[]  args){
        method1();
    }
    public static void method1(){
        int x=1;
        method2();
        System.out.println(x);
    }

    public static void method2(){
        int x=2;
        method3();
        System.out.println(x);
    }

    public static void method3(){
        int x=3;
        System.out.println(x);
    }
}
