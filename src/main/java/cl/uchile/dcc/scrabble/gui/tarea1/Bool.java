package cl.uchile.dcc.scrabble.gui.tarea1;

import java.util.Objects;

public class Bool implements TypesInterface, LogicTheGathering{
    boolean value;

    Bool(boolean value){
        this.value= value;
    }

    public java.lang.String getstringedvalue() {
        if (this.value== false) {
            return "0";
        }

        else {
            return "1";
        }
    }

    public static boolean ttbooleanvalue(java.lang.String string) {
        if (string.equals("0")){
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(Bool.class, value);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bool) {
            var o= (Bool) obj;
            return value== o.value;
        }
        else{
            return false;
        }
    }

    @Override
    public Bool ttBool(){
        return this;
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
        return new String(java.lang.String.valueOf(this.value));
    }

    @Override
    public java.lang.String toString() {
        return java.lang.String.valueOf(this.value);
    }

    public static java.lang.String BitAnd(java.lang.String bit1, java.lang.String bit2) {
        if (bit1.equals("1") && bit2.equals("1")){
            return "1";
        }
        else if (bit1.equals(".") || bit2.equals(".")){
            return ".";
        }
        else {
            return "0";
        }
    }

    public static java.lang.String BitOr(java.lang.String bit1, java.lang.String bit2) {
        if (bit1.equals("0") && bit2.equals("0")){
            return "0";
        }
        else if (bit1.equals(".") || bit2.equals(".")){
            return ".";
        }
        else {
            return "1";
        }
    }


    @Override
    public LogicTheGathering and(LogicTheGathering logic) {
        return logic.AndedByBool(this);
    }

    @Override
    public LogicTheGathering or(LogicTheGathering logic) {
        return logic.OredByBool(this);
    }

    @Override
    public LogicTheGathering AndedByBinary(LogicTheGathering logic) {
        Binary Blogic= (Binary) logic;
        java.lang.String Bvalue= Blogic.getvalue();
        java.lang.String in_i1;
        java.lang.String tocompare= this.getstringedvalue();
        java.lang.String fstr= "";
        for (int i= 0; i< Bvalue.length(); i++) {
            in_i1= java.lang.String.valueOf(Bvalue.charAt(i));
            fstr+= BitAnd(in_i1, tocompare);
        }
        return new Binary(fstr);
    }

    @Override
    public LogicTheGathering AndedByBool(LogicTheGathering logic) {
        Bool TFlogic= (Bool) logic;
        java.lang.String bit1= this.getstringedvalue();
        java.lang.String bit2= TFlogic.getstringedvalue();
        return new Bool(ttbooleanvalue(BitAnd(bit1, bit2)));
    }

    @Override
    public LogicTheGathering OredByBinary(LogicTheGathering logic) {
        Binary Blogic= (Binary) logic;
        java.lang.String Bvalue= Blogic.getvalue();
        java.lang.String in_i1;
        java.lang.String fstr= "";
        for (int i= 0; i< Bvalue.length(); i++) {
            in_i1= java.lang.String.valueOf(Bvalue.charAt(i));
            fstr+= BitOr(in_i1, this.getstringedvalue());
        }
        return new Binary(fstr);
    }

    @Override
    public LogicTheGathering OredByBool(LogicTheGathering logic) {
        Bool TFlogic= (Bool) logic;
        java.lang.String bit1= this.getstringedvalue();
        java.lang.String bit2= TFlogic.getstringedvalue();
        return new Bool(ttbooleanvalue(BitOr(bit1, bit2)));
    }
}
