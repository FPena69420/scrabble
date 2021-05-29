package cl.uchile.dcc.scrabble.gui.tarea1;

public abstract class Num {

    Binary PosIntToBinary(int num){
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

    java.lang.String reverse(java.lang.String string) {
        int i= string.length();
        java.lang.String retstring= "";
        for (int x= 1; x<=i; x++){
            retstring+= Character.toString(string.charAt(i-x));
        }
        return retstring;
    }

}
