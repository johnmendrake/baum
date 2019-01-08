package Baum;
public class Baum {
    Knoten wurzel;

    public Baum(){}

    public void add(int x){
        if(wurzel == null) wurzel = new Knoten(x);
        else wurzel.add(x);
    }

    public Knoten find(int x){
        return wurzel.find(x);
    }

    public boolean contains(int x) {
        Knoten gesucht = wurzel.find(x);
        return gesucht != null;
    }
}
