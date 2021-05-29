package cl.uchile.dcc.scrabble.gui.tarea1;

public class Int extends Num implements TypesInterface{
    int value;

    public Int(int value){
        this.value=value;
    }

    public int getval(){
        return this.value;
    }

    @Override
    public Bool ttBool() {
        return null;
    }

    /* Chequear si funciona*/
    @Override
    public Float ttFloat() {
        return new Float(this.value);
    }

    @Override
    public Int ttInt() {
        return this;
    }

    @Override
    public Binary ttBinary() {
        return PosIntToBinary(this.value);
    }

    @Override
    public String ttString() {
        return new String(java.lang.String.valueOf(this.value));
    }

    @Override
    public java.lang.String toString() {
        return java.lang.String.valueOf(this.value);
    }

}
