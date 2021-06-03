package cl.uchile.dcc.scrabble.gui.tarea1;

import java.util.Objects;

public class Binary extends Num implements TypesInterface, LogicTheGathering, OperationsInterface{
    java.lang.String value;

    public Binary(java.lang.String value){
        this.value=value;
    }

    public int length(){
        return this.value.length();
    }

    public java.lang.String getvalue() {
        return this.value;
    }

    public java.lang.String sign() {
        /** Retorna el primer char de this.value en forma de java.lang.String */

        return java.lang.String.valueOf(this.value.charAt(0));
    }

    public Binary flip(){
        /** Retorna un nuevo Binary tal que cada valor individual de this.value ha sido negado por
         negación lógica */

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

    public Binary suma1(){
        /** Retorna un nuevo Binary tal que el valor java.lang.String que contiene representa
         la suma binaria entre el valor binario que representa this.value y 1 */

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

    public Binary negative(){
        /** Retorna un nuevo Binary que contiene el negativo del binario que representa this.value */

        Binary ret1= this.flip();
        Binary ret2= ret1.suma1();
        return ret2;
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
        int pointpos= -1;
        int length= this.value.length();
        java.lang.String binaryfloat= this.value;
        java.lang.String decimalpart;
        java.lang.String intpart;
        float complete;
        for (int i= 0; i<length; i++) {
            if (java.lang.String.valueOf(this.value.charAt(i)).equals(".")){
                pointpos= i;
            }
        }
        if (pointpos== -1){
            return new Float((float) BinaryToInt(this.value));
        }
        else{
            intpart= binaryfloat.substring(0,pointpos);
            decimalpart= binaryfloat.substring(pointpos);
        }
        float floatintpart= (float) BinaryToInt(intpart);
        float absdecpart= BinaryToDecimal(decimalpart);
        if (floatintpart< 0){
            complete= -(Math.abs(floatintpart) + absdecpart);
        }
        else{
            complete= floatintpart + absdecpart;
        }
        return new Float(complete);

    }

    @Override
    public Int ttInt() {
        return new Int(BinaryToInt(this.value));
    }

    @Override
    public Binary ttBinary() {
        return this;
    }

    @Override
    public String ttString() {
        return new String(this.value);
    }

    @Override
    public java.lang.String toString() {
        return java.lang.String.valueOf(this.value);
    }

    @Override
    public LogicTheGathering and(LogicTheGathering logic) {
        return logic.AndedByBinary(this);
    }

    @Override
    public LogicTheGathering or(LogicTheGathering logic) {
        return logic.OredByBinary(this);
    }

    @Override
    public LogicTheGathering AndedByBinary(LogicTheGathering logic) {
        return null;
    }

    @Override
    public LogicTheGathering AndedByBool(LogicTheGathering logic) {
        Bool TFlogic= (Bool) logic;
        java.lang.String TFvalue= TFlogic.getstringedvalue();
        java.lang.String in_i1;
        java.lang.String fstr= "";
        for (int i= 0; i< this.length(); i++) {
            in_i1= java.lang.String.valueOf(this.value.charAt(i));
            fstr+= Bool.BitAnd(in_i1, TFvalue);
        }
        return new Binary(fstr);
    }

    @Override
    public LogicTheGathering OredByBinary(LogicTheGathering logic) {
        return null;
    }

    @Override
    public LogicTheGathering OredByBool(LogicTheGathering logic) {
        Bool TFlogic= (Bool) logic;
        java.lang.String TFvalue= TFlogic.getstringedvalue();
        java.lang.String in_i1;
        java.lang.String fstr= "";
        for (int i= 0; i< this.length(); i++) {
            in_i1= java.lang.String.valueOf(this.value.charAt(i));
            fstr+= Bool.BitOr(in_i1, TFvalue);
        }
        return new Binary(fstr);
    }

    @Override
    public OperationsInterface sum(OperationsInterface ops) {
        return ops.SumedByBinary(this);
    }

    @Override
    public OperationsInterface minus(OperationsInterface ops) {
        return ops.MinusedByBinary(this);
    }

    @Override
    public OperationsInterface mult(OperationsInterface ops) {
        return ops.MultedByBinary(this);
    }

    @Override
    public OperationsInterface dived_by(OperationsInterface ops) {
        return ops.BinaryDiv(this);
    }

    @Override
    public OperationsInterface SumedByBinary(OperationsInterface ops) {
        Binary Bops= (Binary) ops;
        return new Float(Bops.ttFloat().getValue() + this.ttFloat().getValue()).ttBinary();
    }

    @Override
    public OperationsInterface SumedByFloat(OperationsInterface ops) {
        Float Fops= (Float) ops;
        return new Float(Fops.getValue() + this.ttFloat().getValue());
    }

    @Override
    public OperationsInterface SumedByInt(OperationsInterface ops) {
        Int Iops= (Int) ops;
        return new Float((float) Iops.getval() + this.ttFloat().getValue()).ttBinary();
    }

    @Override
    public OperationsInterface MinusedByBinary(OperationsInterface ops) {
        Binary Bops= (Binary) ops;
        return new Float(Bops.ttFloat().getValue() - this.ttFloat().getValue()).ttBinary();
    }

    @Override
    public OperationsInterface MinusedByFloat(OperationsInterface ops) {
        Float Fops= (Float) ops;
        return new Float(Fops.getValue() - this.ttFloat().getValue());
    }

    @Override
    public OperationsInterface MinusedByInt(OperationsInterface ops) {
        Int Iops= (Int) ops;
        return new Float((float) Iops.getval() - this.ttFloat().getValue()).ttBinary();
    }

    @Override
    public OperationsInterface MultedByBinary(OperationsInterface ops) {
        Binary Bops= (Binary) ops;
        return new Float(Bops.ttFloat().getValue() * this.ttFloat().getValue()).ttBinary();
    }

    @Override
    public OperationsInterface MultedByFloat(OperationsInterface ops) {
        Float Fops= (Float) ops;
        return new Float(Fops.getValue() * this.ttFloat().getValue());
    }

    @Override
    public OperationsInterface MultedByInt(OperationsInterface ops) {
        Int Iops= (Int) ops;
        return new Float((float) Iops.getval() * this.ttFloat().getValue()).ttBinary();
    }

    @Override
    public OperationsInterface BinaryDiv(OperationsInterface ops) {
        Binary Bops= (Binary) ops;
        return new Float(Bops.ttFloat().getValue() / this.ttFloat().getValue()).ttBinary();
    }

    @Override
    public OperationsInterface FloatDiv(OperationsInterface ops) {
        Float Fops= (Float) ops;
        return new Float(Fops.getValue() / this.ttFloat().getValue());
    }

    @Override
    public OperationsInterface IntDiv(OperationsInterface ops) {
        Int Iops= (Int) ops;
        return new Float((float) Iops.getval() / this.ttFloat().getValue()).ttBinary();
    }

    @Override
    public OperationsInterface SumedByString(OperationsInterface ops) {
        String Sops= (String) ops;
        return new String(Sops.toString() + this.getvalue());
    }
}
