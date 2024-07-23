import java.util.Scanner;

public class VocalesNoVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letra;

        while (true) {
            System.out.print("Ingresar una letra : ");
            String input = scanner.nextLine();

            if (input.equals(" ")) {
                break;
            }

            if (input.length() > 1) {
                System.out.println("Ingresar solo una letra.");
                continue;
            }

            letra = input.charAt(0);

            letra = Character.toLowerCase(letra);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println(letra + " es vocal.");
            } else if (letra >= 'a' && letra <= 'z') {
                System.out.println(letra + " es consonante.");
            } else {
                System.out.println(letra + " no es una letra válida.");
            }
        }
    }
}
