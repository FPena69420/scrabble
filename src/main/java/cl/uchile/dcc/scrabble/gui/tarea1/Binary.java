package cl.uchile.dcc.scrabble.gui.tarea1;

import java.util.Objects;

public class Binary extends Num implements TypesInterface{
    java.lang.String value;

    public Binary(java.lang.String value){
        this.value=value;
    }

    public int length(){
        return this.value.length();
    }

    public java.lang.String sign() {
        return java.lang.String.valueOf(this.value.charAt(0));
    }

    public Binary flip(){
        java.lang.String toflip = this.value;
        int length= toflip.length();
        java.lang.String retstring= "";
        for (int i= 0; i< length; i++){
            java.lang.String character= Character.toString(toflip.charAt(i));
            if (character.equals("1")){
                retstring+= "0";
            }
            else {
                retstring+= "1";
            }
        }
        return new Binary(retstring);
    }

    public Binary nExtend(int n) {
        int thislength= this.length();
        if (n<= thislength){
            return this;
        }
        java.lang.String retstring= "";
        if (this.sign().equals("1")) {
            for (int i= 0; i< n-thislength; i++) {
                retstring+= "1";
            }
        }
        else {
            for (int i= 0; i< n-thislength; i++) {
                retstring+= "0";
            }

        }
        retstring+= this.toString();
        return new Binary(retstring);
    }

    public Binary sum(Binary bin){
        int binlength= bin.length();
        int thislength= this.length();
        int sumlength= Math.max(binlength, thislength) + 1;
        java.lang.String tosum1= this.nExtend(sumlength).toString();
        java.lang.String tosum2= bin.nExtend(sumlength).toString();
        acarreo res1;
        acarreo res2;
        acarreo acarreoanterior= new acarreo(0, false);
        java.lang.String retstring= "";
        /**continuar*/
        for (int i= 1; i<= sumlength; i++) {
            res1= suma(java.lang.String.valueOf(tosum1.charAt(sumlength - i)), java.lang.String.valueOf(tosum2.charAt(sumlength - i)));
            res2= suma(res1.toString(), acarreoanterior.toString());
            acarreoanterior= new acarreo(1, res1.getbool() || res2.getbool());
            java.lang.String ret= res2.toString();
            retstring+= ret;
        }
        java.lang.String retstring2= reverse(retstring);
        return new Binary(retstring2);
    }

    public static acarreo suma(java.lang.String bit1, java.lang.String bit2) {
        if (bit1.equals("0")){
            if (bit2.equals("0")){
                return new acarreo(0, false);
            }
            else{
                return new acarreo(1,false);
            }
        }
        else{
            if (bit2.equals("0")){
                return new acarreo(1, false);
            }
            else{
                return new acarreo(0,true);
            }
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(Binary.class, value);
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Binary) {
            var o= (Binary) obj;
            return value.equals(o.value);
        }
        else{
            return false;
        }
    }

    @Override
    public Bool ttBool() {
        return null;
    }

    @Override
    public Float ttFloat() {
        return null;
    }

    @Override
    public Int ttInt() {
        return null;
    }

    @Override
    public Binary ttBinary() {
        return null;
    }

    @Override
    public String ttString() {
        return null;
    }

    @Override
    public java.lang.String toString() {
        return java.lang.String.valueOf(this.value);
    }
}
