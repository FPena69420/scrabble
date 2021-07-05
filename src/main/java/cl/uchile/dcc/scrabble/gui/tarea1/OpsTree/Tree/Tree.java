package cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.Tree;


import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes.*;

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
}
