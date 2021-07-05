package cl.uchile.dcc.scrabble.gui.tarea1.Values;

import cl.uchile.dcc.scrabble.gui.tarea1.Interfaces.*;

public class Variable extends Value implements OperationsInterface, LogicTheGathering {

    public Variable() {
        super(null);
    }

    public void setBinary(java.lang.String value){
        try {
            this.setValue(new Binary(value));
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de setear la variable, revise su codigo " +
                    "e intente de nuevo.");
        }
    }

    public void setBool(boolean value){
        try {
            this.setValue(new Bool(value));
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de setear la variable, revise su codigo " +
                    "e intente de nuevo.");
        }
    }

    public void setFloat(float value){
        try {
            this.setValue(new Float(value));
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de setear la variable, revise su codigo " +
                    "e intente de nuevo.");
        }
    }

    public void setInt(int value){
        try {
            this.setValue(new Int(value));
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de setear la variable, revise su codigo " +
                    "e intente de nuevo.");
        }
    }

    public void setString(java.lang.String value){
        try {
            this.setValue(new String(value));
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de setear la variable, revise su codigo " +
                    "e intente de nuevo.");
        }
    }


    @Override
    public java.lang.String getPrint() {
        try {
            Value VValue= (Value) this.parseValue();
            return "V[" + VValue.getPrint() +"]";
        }
        catch (Exception e) {}
        return "V[" + this.parseValue() + "]";
    }

    public void print() {
        System.out.println(this.getPrint());
    }

    @Override
    public OperationsInterface sum(OperationsInterface ops) {
        try {
            Value VValue= (Value) this.parseValue();
            return VValue.sum(ops);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de sumar, revise su codigo e intente de nuevo.");
        }
        return null;
    }

    @Override
    public OperationsInterface substract(OperationsInterface ops) {
        try {
            Value VValue= (Value) this.parseValue();
            return VValue.substract(ops);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de restar, revise su codigo e intente de nuevo.");
        }
        return null;
    }

    @Override
    public OperationsInterface mult(OperationsInterface ops) {
        try {
            Value VValue= (Value) this.parseValue();
            return VValue.mult(ops);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de multiplicar, revise su codigo e intente de nuevo.");
        }
        return null;
    }

    @Override
    public OperationsInterface dived_by(OperationsInterface ops) {
        try {
            Value VValue= (Value) this.parseValue();
            return VValue.dived_by(ops);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de dividir, revise su codigo e intente de nuevo.");
        }
        return null;
    }

    @Override
    public OperationsInterface SumedByBinary(OperationsInterface ops) {
        try {
            OperationsInterface VValue= (OperationsInterface) this.parseValue();
            return VValue.SumedByBinary(ops);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de sumar, revise su codigo e intente de nuevo.");
        }
        return null;
    }

    @Override
    public OperationsInterface SumedByFloat(OperationsInterface ops) {
        try {
            OperationsInterface VValue= (OperationsInterface) this.parseValue();
            return VValue.SumedByFloat(ops);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de sumar, revise su codigo e intente de nuevo.");
        }
        return null;
    }

    @Override
    public OperationsInterface SumedByInt(OperationsInterface ops) {
        try {
            OperationsInterface VValue= (OperationsInterface) this.parseValue();
            return VValue.SumedByInt(ops);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de sumar, revise su codigo e intente de nuevo.");
        }
        return null;
    }

    @Override
    public OperationsInterface SubstractedByBinary(OperationsInterface ops) {
        try {
            OperationsInterface VValue= (OperationsInterface) this.parseValue();
            return VValue.SubstractedByBinary(ops);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de restar, revise su codigo e intente de nuevo.");
        }
        return null;
    }

    @Override
    public OperationsInterface SubstractedByFloat(OperationsInterface ops) {
        try {
            OperationsInterface VValue= (OperationsInterface) this.parseValue();
            return VValue.SubstractedByFloat(ops);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de restar, revise su codigo e intente de nuevo.");
        }
        return null;
    }

    @Override
    public OperationsInterface SubstractedByInt(OperationsInterface ops) {
        try {
            OperationsInterface VValue= (OperationsInterface) this.parseValue();
            return VValue.SubstractedByInt(ops);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de restar, revise su codigo e intente de nuevo.");
        }
        return null;
    }

    @Override
    public OperationsInterface MultedByBinary(OperationsInterface ops) {
        try {
            OperationsInterface VValue= (OperationsInterface) this.parseValue();
            return VValue.MultedByBinary(ops);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de multiplicar, revise su codigo e intente de nuevo.");
        }
        return null;
    }

    @Override
    public OperationsInterface MultedByFloat(OperationsInterface ops) {
        try {
            OperationsInterface VValue= (OperationsInterface) this.parseValue();
            return VValue.MultedByFloat(ops);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de multiplicar, revise su codigo e intente de nuevo.");
        }
        return null;
    }

    @Override
    public OperationsInterface MultedByInt(OperationsInterface ops) {
        try {
            OperationsInterface VValue= (OperationsInterface) this.parseValue();
            return VValue.MultedByInt(ops);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de multiplicar, revise su codigo e intente de nuevo.");
        }
        return null;
    }

    @Override
    public OperationsInterface BinaryDiv(OperationsInterface ops) {
        try {
            OperationsInterface VValue= (OperationsInterface) this.parseValue();
            return VValue.BinaryDiv(ops);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de dividir, revise su codigo e intente de nuevo.");
        }
        return null;
    }

    @Override
    public OperationsInterface FloatDiv(OperationsInterface ops) {
        try {
            OperationsInterface VValue= (OperationsInterface) this.parseValue();
            return VValue.FloatDiv(ops);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de dividir, revise su codigo e intente de nuevo.");
        }
        return null;
    }

    @Override
    public OperationsInterface IntDiv(OperationsInterface ops) {
        try {
            OperationsInterface VValue= (OperationsInterface) this.parseValue();
            return VValue.IntDiv(ops);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de dividir, revise su codigo e intente de nuevo.");
        }
        return null;
    }

    @Override
    public OperationsInterface SumedByString(OperationsInterface ops) {
        try {
            OperationsInterface VValue= (OperationsInterface) this.parseValue();
            return VValue.SumedByString(ops);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de sumar, revise su codigo e intente de nuevo.");
        }
        return null;
    }

    @Override
    public LogicTheGathering and(LogicTheGathering logic) {
        try {
            LogicTheGathering VValue= (LogicTheGathering) this.parseValue();
            return VValue.and(logic);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de usar and(), revise su codigo e intente de nuevo.");
        }
        return null;
    }

    @Override
    public LogicTheGathering or(LogicTheGathering logic) {
        try {
            LogicTheGathering VValue= (LogicTheGathering) this.parseValue();
            return VValue.or(logic);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de usar or(), revise su codigo e intente de nuevo.");
        }
        return null;
    }

    @Override
    public LogicTheGathering AndedByBinary(LogicTheGathering logic) {
        try {
            LogicTheGathering VValue= (LogicTheGathering) this.parseValue();
            return VValue.AndedByBinary(logic);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de usar and(), revise su codigo e intente de nuevo.");
        }
        return null;
    }

    @Override
    public LogicTheGathering AndedByBool(LogicTheGathering logic) {
        try {
            LogicTheGathering VValue= (LogicTheGathering) this.parseValue();
            return VValue.AndedByBool(logic);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de usar and(), revise su codigo e intente de nuevo.");
        }
        return null;
    }

    @Override
    public LogicTheGathering OredByBinary(LogicTheGathering logic) {
        try {
            LogicTheGathering VValue= (LogicTheGathering) this.parseValue();
            return VValue.OredByBinary(logic);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de usar or(), revise su codigo e intente de nuevo.");
        }
        return null;
    }

    @Override
    public LogicTheGathering OredByBool(LogicTheGathering logic) {
        try {
            LogicTheGathering VValue= (LogicTheGathering) this.parseValue();
            return VValue.OredByBool(logic);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de usar or(), revise su codigo e intente de nuevo.");
        }
        return null;
    }

    @Override
    public LogicTheGathering flip() {
        try {
            LogicTheGathering VValue= (LogicTheGathering) this.parseValue();
            return VValue.flip();
        }
        catch (Exception e) {}
        return null;
    }

    public Value negate() {
        try {
            return (Value) this.flip();
        }
        catch (Exception e) {
            System.out.println("Hubo un error al trata de usar negate(), revise su codigo e intente de nuevo");
        }
        return null;
    }
}
