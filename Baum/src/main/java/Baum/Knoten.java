package Baum;

public class Knoten {
    int inhalt;
    Knoten groesser;
    Knoten kleiner;


    public Knoten(int inhalt){
        this.inhalt = inhalt;
        groesser = null;
        kleiner = null;
    }

    public Knoten find(int x){
        if(inhalt == x) return this;
        if(x < inhalt && kleiner != null) return  kleiner.find(x);
        if(x > inhalt && groesser != null) return groesser.find(x);
        return null;
    }

    public void add(int x) {
        if(x < inhalt){
            if(kleiner == null) kleiner = new Knoten(x);
            else kleiner.add(x);
        }
        if( x > inhalt){
            if(groesser == null) groesser = new Knoten(x);
            else groesser.add(x);
        }
    }
}
