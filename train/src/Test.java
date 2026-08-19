public class Test {
    public static void main(String[] args) {
        int a = 1 , b = 2;

        if (b>a){
            System.out.println("b > a");
        } else {
            System.out.println("b < a");
        }

        a = b;

        System.out.println("a最终值为: " + a);
    }
}
