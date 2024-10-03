
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        String name;
        System.out.println("ENTER YOUR NAME TO PLAY");
        //name = obj.next();

        name = obj.nextLine();

        while (name.isBlank()) {
            System.out.println("Please enter your name to proceed!");
            name = obj.nextLine();
        }

        int marks = 0;
        int counts = 0;

        System.out.println("Welcome To Quiz Game");

        System.out.println("Which year did Kenya became a Republic?");
        String a1, b1, c1, d1, ans1;
        a1 = "1967";
        b1 = "1962";
        c1 = "1964";
        d1 = "1965";

        ans1 = "C";

        counts += Qs(marks, a1, b1, c1, d1, ans1);

        System.out.println("Who was the first prime minister in Kenya?");
        String a2, b2, c2, d2, ans2;

        a2 = "Mzee Jomo Kenyatta";
        b2 = "Danie Arap Moi";
        c2 = "Raila Amollo Odinga";
        d2 = "Jaramogi Oginga Odinga";

        ans2 = "A";

        counts += Qs(marks, a2, b2, c2, d2, ans2);

        System.out.println("Census in Kenya are done after how many years?");
        String a3, b3, c3, d3, ans3;

        a3 = "12 years";
        b3 = "10 years";
        c3 = "8 years";
        d3 = "11 years";

        ans3 = "B";

        counts += Qs(marks, a3, b3, c3, d3, ans3);

        System.out.println("Which political figure us nick-named 'Zakayo'");
        String a4, b4, c4, d4, ans4;

        a4 = "William Ruto";
        b4 = "Raila Odinga";
        c4 = "Wajakoya";
        d4 = "Rigathi Gachagwa";

        ans4 = "A";
        counts += Qs(marks, a4, b4, c4, d4, ans4);

        System.out.println("How long does it take the moon to revolve around the Earth?");
        String a5, b5, c5, d5, ans5;

        a5 = "12 days";
        b5 = "30 days";
        c5 = "28 days";
        d5 = "26 days";

        ans5 = "C";

        counts += Qs(marks, a5, b5, c5, d5, ans5);

        result(counts, name);

    }

    public static int Qs(int x, String a, String b, String c, String d, String answer) {
        Scanner obj = new Scanner(System.in);
        System.out.println(String.format("A. %s\nB. %s\nC. %s\nD. %s", a, b, c, d));

        String ans = obj.nextLine();

        ans = ans.toUpperCase();

        while (ans.isBlank()) {
            System.out.println("You cannot submit a black answer!\nRe-enter answer again");
            ans = obj.nextLine();

            ans = ans.toUpperCase();

        }

        while (!("A".equals(ans) || "B".equals(ans) || "C".equals(ans) || "D".equals(ans))) {
            System.err.println("Invalid input, you can only choose A, B, C or D!\nRe-enter another choice, " + ans + " is not a valid choice!");
            ans = obj.nextLine();

            ans = ans.toUpperCase();
        }

        if (ans.equals(answer)) {
            x += 1;

            //System.out.println("Correcto muchacho");
        }

        return x;

    }

    static void result(int marks, String name) {

        int result = marks * 20;

        System.out.println("You have Scored " + result + "%\nGame Over!");

        //Getting result remarks
        switch (result) {
            case 60 ->
                System.out.println("Fair, lakini " + name + " jua Kenya Vizuri joh!");
            case 80 ->
                System.out.println(name + " you have passed!");
            case 100 ->
                System.out.println("Hurray! " + name + " This is Above Average Score");

            default ->
                System.out.println(name + " Hama Tu Kenya, wewe si citizen");
        }

    }

}
