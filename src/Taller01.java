import java.util.Scanner;

public class Taller01 {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            ShowMenu();
            System.out.print("Elige una Opcion: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> verificarPalindromo(sc);
                case 2 -> contarVocalesFrase(sc);
                case 3 -> encriptarFrase(sc);
                case 4 -> DesencriptarFrase(sc);
                case 5 -> System.out.println("Saliendo del programa...");
            }
        } while (choice != 5);

        sc.close();
    }

    public static void ShowMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. Verificar palíndromo");
        System.out.println("2. Contar Vocales");
        System.out.println("3. Encriptar");
        System.out.println("4. Desencriptar");
        System.out.println("5. Salir");
    }

    public static void verificarPalindromo(Scanner sc) {
        System.out.print("Ingresa una frase: ");
        String frase = sc.nextLine();
        String invertida = new StringBuilder(frase).reverse().toString();
        System.out.println(frase.equalsIgnoreCase(invertida) ? "Es un palíndromo" : "No es un palíndromo");
    }

    public static void contarVocalesFrase(Scanner sc) {
        System.out.print("Ingresa una frase: ");
        String texto = sc.nextLine();
        System.out.println("Cantidad de vocales: " + contarVocales(texto));
    }

    public static long contarVocales(String texto) {
        return texto.toLowerCase()
                .chars()
                .filter(c -> "aeiouáéíóú".indexOf(c) != -1)
                .count();
    }

    public static void encriptarFrase(Scanner sc) {
        System.out.print("Ingresa una frase: ");
        String texto = sc.nextLine();
        System.out.println("Frase encriptada: " + encriptar(texto));
    }

    public static String encriptar(String texto) {
        return texto.replace("a", "@").replace("e", "&").replace("i", "!")
                .replace("o", "*").replace("u", "#")
                .replace("A", "@").replace("E", "&").replace("I", "!")
                .replace("O", "*").replace("U", "#");
    }
    public static void DesencriptarFrase(Scanner sc){
        System.out.print("Ingresa una frase: ");
        String texto = sc.nextLine();
        System.out.println("Frase Desencriptada: " + desencriptar(texto));
    }
    public static String desencriptar(String texto){
        return texto.replace("@","a").replace("&","e").replace("!","i")
                .replace("*","o").replace("#","u")
                .replace("@","A").replace("&","E").replace("!","I")
                .replace("*", "O").replace("#", "U");
    }
}