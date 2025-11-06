import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        //belajar java dari dasar

        /*
        Multi
        Line
        Comment
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = scanner .nextInt();
        scanner .nextLine();

        System.out.print("Enter password : ");
        String password = scanner .nextLine();

        System.out.print("Are you a teacher? (true/false) : ");
        boolean isTeacher = scanner .nextBoolean();

        System.out.println("Your password is " + password);
        System.out.println("Your age is " + age);
        if(isTeacher){
            System.out.println("You are a teacher");
        }
        else{
            System.out.println("You are not a teacher");
        }

        scanner .close();

//declaration
        int jumlah = 0;
        double ipk = 3.8;
        char golongan = 'A';
        boolean isAvailable = false;

        String name = "Aditya Eka";
        String car = "Ferrari";
        String type = "SF-24";

        System.out.println("Hello " + name);
        System.out.println("Your favorite car is " + car + " " + type);

        if(isAvailable) {
            System.out.println("The " + type + " is available");
        }
        else{
            System.out.println("The " + type + " is not avaiable");
        }
    }
}
