package cl.uchile.dcc.scrabble.gui.tarea1;

import java.util.Objects;

public class Binary implements TypesInterface{
    java.lang.String value;

    public Binary(java.lang.String value){
        this.value=value;
    }

    public int length(){
        return this.value.length();
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

    public Binary sum(Binary bin){
        int binlength= bin.length();
        int thislength= this.length();
        int sumlength= Math.max(binlength, thislength) + 1;
        java.lang.String bincopy= "";
        for (int i= 0; i< sumlength; i++){

        }
        java.lang.String thiscopy= "";
        return null;
    }

    public acarreo suma(java.lang.String bit1, java.lang.String bit2) {
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
