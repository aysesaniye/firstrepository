package Gun38.nonAccessModifier.finalModifier;

public class JavaFinalModifier {
    // final : oyle bir degiskeniniz var ki, bir deger ataniyor.
    // ve onun yazilim icinde degistirilmesi istenmiyor.
    // mesela pi sayisi, degeri degismeyecek
    // Sadece ilk deger atanabilir.

    final double pi=3.14;

    public static void main(String[] args) {
        final int number = 5;

        // number=7;  // tekrar yeni bir deger atanmaz
    }
}


