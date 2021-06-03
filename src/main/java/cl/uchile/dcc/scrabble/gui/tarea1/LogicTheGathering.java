package cl.uchile.dcc.scrabble.gui.tarea1;

public interface LogicTheGathering {
    LogicTheGathering and(LogicTheGathering logic);
    LogicTheGathering or(LogicTheGathering logic);

    LogicTheGathering AndedByBinary(LogicTheGathering logic);
    LogicTheGathering AndedByBool(LogicTheGathering logic);
    LogicTheGathering OredByBinary(LogicTheGathering logic);
    LogicTheGathering OredByBool(LogicTheGathering logic);
}
