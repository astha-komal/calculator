import java.util.*;
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("WELCOME TO CALCULATOR WORLD");
    System.out.print("\n");
    System.out.print("Enter 1st Number");
    int a=sc.nextInt();
    System.out.print("Enter 2nd Number");
    int b=sc.nextInt();
    System.out.println("1.Addition");
    System.out.println("2.Subtraction");
    System.out.println("3.Multiplication");
    System.out.println("4.Division");
    System.out.println("5.exit");
    System.out.println("Choose operation by entering operation number");
    int c=sc.nextInt();
    while (true) {
        if (c == 1) {
            System.out.println(a + b);
            break;
        }
        if (c == 2) {
            System.out.println(a - b);
            break;
        }
        if (c == 3) {
            System.out.println(a * b);
            break;
        }
        if (c == 4) {
            if (b == 0) {
                System.out.println("0 is not allowed");
                  break;
            }
            System.out.println((a/(double)b));
            break;
        }
        if(c==5){
            break;
        }
    }
}
