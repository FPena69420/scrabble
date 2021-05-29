package cl.uchile.dcc.scrabble.gui.tarea1;

import java.util.Objects;

public class acarreo {
    int bin;
    boolean bool;

    public acarreo(int bin, boolean bool){
        this.bin= bin;
        this.bool= bool;
    }

    public int getbin() {
        return bin;
    }

    public boolean getbool() {
        return bool;
    }

    @Override
    public java.lang.String toString() {
        return java.lang.String.valueOf(bin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acarreo.class, bin, bool);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof acarreo) {
            acarreo o= (acarreo) obj;
            return (o.bin==this.bin) && (o.bool==this.bool);
        }
        else {
            return false;
        }
    }
}
