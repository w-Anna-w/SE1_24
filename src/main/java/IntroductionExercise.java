public class IntroductionExercise {
//  Implementierung von ChatGPT
public static int binary2decimal(int[] binaryArray) {
    int decimalValue = 0;
    int length = binaryArray.length;

    for (int i = 0; i < length; i++) {
        if (binaryArray[i] == 1) {
            decimalValue += Math.pow(2, length - 1 - i);
        }
    }

    return decimalValue;
}

    public static void main(String[] args) {
        int[] binaryArray = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}; // Beispiel: Binärzahl 1011
        int decimal = binary2decimal(binaryArray);
        System.out.println("Der Dezimalwert ist: " + decimal); // Ausgabe: 11
    }
}
