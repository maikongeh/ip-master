import java.util.Scanner;

public class Duke {
    public static void main(String[] args) {
//        String logo = " ____        _        \n"
////                + "|  _ \\ _   _| | _____ \n"
////                + "| | | | | | | |/ / _ \\\n"
////                + "| |_| | |_| |   <  __/\n"
////                + "|____/ \\__,_|_|\\_\\___|\n";
////        System.out.println("Hello from\n" + logo);
        System.out.println("____________________________________");
        System.out.println("Hello! I'm Duke\nWhat can I do for you?");
        System.out.println("____________________________________");

        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            String s = input.next();
            System.out.println("____________________________________");
            if(s.equals("bye")){
                System.out.println("Bye. Hope to see you again soon!");
                System.out.println("____________________________________");

                break;
            } else {
                System.out.println(s);

            }
            System.out.println("____________________________________");


        }
    }
}
