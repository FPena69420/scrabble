package cl.uchile.dcc.scrabble.gui.tarea1;

public abstract class Num {

    Binary PosIntToBinary(int num){
        /** Toma un int num, num>= 0, y retorna un Binary que representa a num en binario, con un 0 */

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
         donde {some Binary} es la representación en binario de x (sin el inicio "0."), o "" si x== 0.0 */

        java.lang.String onestring;
        if (decimal== 0.0){
            return "";
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

}
