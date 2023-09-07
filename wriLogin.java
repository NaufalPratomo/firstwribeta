import java.util.Scanner;;
public class wriLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String pass = "apa_coba";
        String userInput = "";

        while (!pass.equals(userInput)) {
            System.out.print("masukan sandi:");
            userInput = input.nextLine();
        }
    }
}