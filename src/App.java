import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // String[] leksaker = {"lego","duplo","plus pluss","bilar","klossar"};
        //// for (String i : leksaker){
        // System.out.println(i);
        // }
        Scanner tangentbord = new Scanner(System.in);
        ArrayList<String> cities = new ArrayList<String>();
        int avbryt = 1;

        while (1 == avbryt) {
            System.out.println("Lägg till en stad i listan");
            String svar = tangentbord.nextLine();
            System.out.println();

            if (!svar.equals("exit")) {
                cities.add(svar);
            }

            else {
                break;
            }
            for (String i : cities) {
                System.out.println(i);
            }

        }

    }
}
