package cl.uchile.dcc.scrabble.gui.tarea1;

public abstract class Num {

    Binary PosIntToBinary(int num){
        /** Toma un int num, num>= 0, y retorna un Binary que representa a num en binario, con un 0
         en frente */

        int numbertodivide= num;
        int resto= 0;
        java.lang.String onestring= "";
        java.lang.String retstring;
        while (numbertodivide> 0){
            resto= numbertodivide % 2;
            numbertodivide= numbertodivide/2;
            onestring+= resto;
        }
        onestring+= "0";
        retstring= reverse(onestring);
        return new Binary(retstring);
    }

    Binary NegIntToBinary(int num) {
        /** Toma un int num, 0>= num, y retorna la representación en binario del número de acuerdo a
         PosIntToBinary() y negative() en Binary.java */

        Binary positive= PosIntToBinary(-num);
        Binary negative= positive.negative();
        return negative;
    }

    java.lang.String DecimalToBinary (float decimal){
        /** Toma un float x, 0.0<= x< 1.0, y retorna un java.lang. String de la forma ".{some Binary}",
         donde {some Binary} es la representación en binario de x (sin el inicio "0."), o ".0" si x== 0.0 */

        java.lang.String onestring;
        if (decimal== 0.0){
            return ".0";
        }
        else {
            float numbertomultiply= decimal;
            int resto= 0;
            onestring= ".";
            while (!(numbertomultiply== 0)) {
                resto= (int) Math.floor(numbertomultiply * 2);
                numbertomultiply= (numbertomultiply * 2) % 1;
                onestring+= java.lang.String.valueOf(resto);
            }
        }
        return onestring;
    }

    java.lang.String reverse(java.lang.String string) {
        /** Toma un java.lang.String y retorna un java.lang.String tal que las posiciones de los
         elementos han sido invertidas */

        int i= string.length();
        java.lang.String retstring= "";
        for (int x= 1; x<=i; x++){
            retstring+= Character.toString(string.charAt(i-x));
        }
        return retstring;
    }

    /* Dados por enunciado */
    public int BinaryToInt(java.lang.String binary) {
        if (bitToInt(binary.charAt(0)) == 0) {
            return PositiveBinaryToInt(binary);
        } else {
            return NegativeBinaryToInt(binary);
        }
    }

    private int NegativeBinaryToInt(java.lang.String binary) {
        int n = binary.length() - 1;
        int w = -bitToInt(binary.charAt(0)) * (int) Math.pow(2, n);
        for (int i = n, j = 0; i > 0; i--, j++) {
            w += (int) Math.pow(2, j) * (binary.charAt(i) == '1' ? 1 : 0);
        }
        return w;
    }

    private int PositiveBinaryToInt(java.lang.String binary) {
        int w = 0;
        for (int i = binary.length() - 1, j = 0; i > 0; i--, j++) {
            w += (int) Math.pow(2, j) * bitToInt(binary.charAt(i));
        }
        return w;
    }

    private int bitToInt(char bit) {
        return bit == '0' ? 0 : 1;
    }

    /* fin de dados por enunciado */

    float BinaryToDecimal(java.lang.String decimal){
        /** Toma un String de la forma ".{some String}" tal que {some String} se compone solo de valores numéricos
         * del 0 al 1 y retorna un float que representa el valor decimal del binario 0.{some String} */

        java.lang.String absdecimal= decimal.substring(1);
        int length= absdecimal.length();
        float retfloat= 0;
        float p1;
        float p2;
        for (int i= 0; i< length; i++){
            p1= (float) Double.parseDouble(java.lang.String.valueOf(absdecimal.charAt(i)));
            /* Que horrible */
            p2= (float) Math.pow(2, -(i+1));
            retfloat+= p1 * p2;
        }
        return retfloat;
    }

}
