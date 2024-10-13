import java.util.Scanner;
public class IntroductionExercise {
//  Implementierung von ChatGPT nach Hinweis auf Fehlerfälle2
public static int binary2decimal(int[] binaryArray) {
    if (!isValidBinaryArray(binaryArray)) {
        throw new IllegalArgumentException("Das Array enthält ungültige Zeichen. Nur 0 und 1 sind erlaubt.");
    }

    int decimalValue = 0;
    int length = binaryArray.length;

    for (int i = 0; i < length; i++) {
        if (binaryArray[i] == 1) {
            decimalValue += Math.pow(2, length - 1 - i);
        }
    }

    return decimalValue;
  }

    private static boolean isValidBinaryArray(int[] binaryArray) {
        for (int element : binaryArray) {
            if (element != 0 && element != 1) {
                return false; // Falscher Wert im Array
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine Binärzahl ein (maximal 31 Bits, nur 0 und 1): ");
        String input = scanner.nextLine();

        // Überprüfung, ob die Eingabe nur aus 0 und 1 besteht und maximal 31 Bits lang ist
        if (!input.matches("[01]+") || input.length() > 31) {
            System.out.println("Ungültige Eingabe! Nur 0 und 1 sind erlaubt, und die Binärzahl darf maximal 31 Bits lang sein.");
            return;
        }

        // Umwandlung in ein Integer-Array
        int[] binaryArray = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            binaryArray[i] = Character.getNumericValue(input.charAt(i));
        }

        try {
            int decimal = binary2decimal(binaryArray);
            System.out.println("Der Dezimalwert ist: " + decimal);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}