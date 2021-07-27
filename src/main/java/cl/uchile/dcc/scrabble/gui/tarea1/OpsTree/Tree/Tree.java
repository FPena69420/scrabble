package cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.Tree;


import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes.*;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Value;

public class Tree {
    private Nodo Root;

    public Tree(Nodo Root) {
        this.Root= Root;
    }

    public Nodo getRoot() {
        return this.Root;
    }

    public void print() {
        System.out.println("tree : " + this.Root.toString());
    }

    public Nodo eval() {
        return this.Root.eval();
    }

    /**
    public Tree usefulCompareTo(Tree other) {
        return new Tree(this.getRoot().usefulCompareTo(other.getRoot()));
    }
     */
}
