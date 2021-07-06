package cl.uchile.dcc.scrabble.gui.tarea1.ValueVault;

import cl.uchile.dcc.scrabble.gui.tarea1.Values.Value;

import java.util.ArrayList;

public class ValueVault {
    private ArrayList<Value> Vault;

    public ValueVault() {
        this.Vault= new ArrayList<Value>();
    }

    private Value get_(Value value) {
        /** Retorna el valor buscado si es que se encuentra dentro de Vault, o null si no */
        if (Vault.contains(value)) {
            int index= Vault.indexOf(value);
            return Vault.get(index);
        }
        else {
            return null;
        }
    }

    public Value intialize(Value value) {
        /** Si no encuentra value (por medio de get_) dentro de Vault, lo añade y lo retorna, en otro caso, solo
         lo retorna */
        Value ret= this.get_(value);

        if (ret== null){
            Vault.add(value);
            return value;
        }
        else {
            return ret;
        }
    }

    public void print() {
        /** Imprime Vault en pantalla */
        java.lang.String ret= "";
        Vault.forEach((NV)-> {
            System.out.print(NV.getPrint() + " ");
        });
        System.out.println();
    }

    public int getCode(Value value) {
        /** Retorna el indice de un valor dentro de Vault, -1 si no esta */
        if (Vault.contains(value)) {
            int index= Vault.indexOf(value);
            return index;
        }
        else {
            return -1;
        }
    }

    public Value getElementByCode(int code) {
        /** Retorna el elemento buscado si es que se ingresa un indice valido, o null si el indice es invalido */
        if (code>= 0 && code< Vault.size()) {
            return Vault.get(code);
        }
        else {
            return null;
        }
    }
}
