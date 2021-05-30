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

    public Binary suma1(){
        java.lang.String tosum1to;
        if (!this.toString().equals("0")){
            if (java.lang.String.valueOf(this.value.charAt(0)).equals("1") && java.lang.String.valueOf(this.value.charAt(1)).equals("1")){
                tosum1to= this.toString().substring(1);
            }
            else {
                tosum1to= this.toString();
            }
        }
        else {
            tosum1to= this.toString();
        }
        int sumlength= tosum1to.length();
        java.lang.String sign= this.sign();
        java.lang.String retstring= "";
        int i=1;
        for (; i<= sumlength; i++){
            if (java.lang.String.valueOf(tosum1to.charAt(sumlength - i)).equals("1")) {
                retstring+= "0";
            }
            else {
                retstring+= "1";
                i++;
                break;
            }
        }
        for (; i<= sumlength; i++){
            retstring+= java.lang.String.valueOf(tosum1to.charAt(sumlength-i));
        }
        if (this.sign().equals("0") && java.lang.String.valueOf(retstring.charAt(sumlength-1)).equals("1")) {
            retstring+= "0";
        }
        return new Binary(reverse(retstring));
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
