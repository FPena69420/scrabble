package cl.uchile.dcc.scrabble.gui.tarea1;

public interface OperationsInterface {
    OperationsInterface sum(OperationsInterface ops);
    OperationsInterface minus(OperationsInterface ops);
    OperationsInterface mult(OperationsInterface ops);
    OperationsInterface dived_by(OperationsInterface ops);

    OperationsInterface SumedByBinary(OperationsInterface ops);
    OperationsInterface SumedByFloat(OperationsInterface ops);
    OperationsInterface SumedByInt(OperationsInterface ops);
    OperationsInterface MinusedByBinary(OperationsInterface ops);
    OperationsInterface MinusedByFloat(OperationsInterface ops);
    OperationsInterface MinusedByInt(OperationsInterface ops);
    OperationsInterface MultedByBinary(OperationsInterface ops);
    OperationsInterface MultedByFloat(OperationsInterface ops);
    OperationsInterface MultedByInt(OperationsInterface ops);
    OperationsInterface BinaryDiv(OperationsInterface ops);
    OperationsInterface FloatDiv(OperationsInterface ops);
    OperationsInterface IntDiv(OperationsInterface ops);
    OperationsInterface SumedByString(OperationsInterface ops);
}
