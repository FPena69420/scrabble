package cl.uchile.dcc.scrabble.gui.tarea1.Interfaces;

public interface OperationsInterface {
    OperationsInterface sum(OperationsInterface ops);
    OperationsInterface substract(OperationsInterface ops);
    OperationsInterface mult(OperationsInterface ops);
    OperationsInterface dived_by(OperationsInterface ops);

    OperationsInterface SumedByBinary(OperationsInterface ops);
    OperationsInterface SumedByFloat(OperationsInterface ops);
    OperationsInterface SumedByInt(OperationsInterface ops);
    OperationsInterface SubstractedByBinary(OperationsInterface ops);
    OperationsInterface SubstractedByFloat(OperationsInterface ops);
    OperationsInterface SubstractedByInt(OperationsInterface ops);
    OperationsInterface MultedByBinary(OperationsInterface ops);
    OperationsInterface MultedByFloat(OperationsInterface ops);
    OperationsInterface MultedByInt(OperationsInterface ops);
    OperationsInterface BinaryDiv(OperationsInterface ops);
    OperationsInterface FloatDiv(OperationsInterface ops);
    OperationsInterface IntDiv(OperationsInterface ops);
    OperationsInterface SumedByString(OperationsInterface ops);
}
