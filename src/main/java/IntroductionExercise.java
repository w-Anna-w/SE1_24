public class IntroductionExercise {
//  Implementierung von ChatGPT nach Hinweis auf Fehlerfälle
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
        try {
            int[] binaryArray = {1, 0, 1, 1}; // Gültige Binärzahl
            int decimal = binary2decimal(binaryArray);
            System.out.println("Der Dezimalwert ist: " + decimal);

            int[] invalidArray = {1, a, 1, 1}; // Ungültige Binärzahl
            decimal = binary2decimal(invalidArray); // Wirft eine Ausnahme
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}