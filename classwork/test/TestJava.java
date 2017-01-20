import java.util.Scanner;


public class TestJava {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENter any number: ");
        
        int no = sc.nextInt();
        System.out.println("Number is:" + no );

        sc.close();
        
    }
}
