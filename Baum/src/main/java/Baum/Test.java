package Baum;

public class Test {
    public static void main(String[] args) {
        testAdd1();
        testAdd2();
        testAdd3();
        testFind1();
        testFind2();
        testFind3();
        testContins();
    }

    public static void testAdd1(){
        Baum baum = new Baum();
        baum.add(22);
        if(baum.wurzel.inhalt == 22)  System.out.println("TestAdd1 success");
    }
    public static void testAdd2(){
        Baum baum = new Baum();
        baum.add(22);
        baum.add(1);
        if(baum.wurzel.kleiner.inhalt == 1) System.out.println("TestAdd2 success");
    }
    public static void testAdd3(){
        Baum baum = new Baum();
        baum.add(22);
        baum.add(1);
        baum.add(100);
        if(baum.wurzel.groesser.inhalt == 100) System.out.println("TestAdd3 success");
    }
    public static void testFind1(){
        Baum baum = new Baum();
        baum.add(22);
        baum.add(1);
        baum.add(100);
        if(baum.find(100) == baum.wurzel.groesser) System.out.println("TestFind1 success");
    }
    public static void testFind2(){
        Baum baum = new Baum();
        baum.add(22);
        baum.add(1);
        baum.add(100);
        if(baum.find(22) == baum.wurzel) System.out.println("TestFind2 success");
    }
    public static void testFind3(){
        Baum baum = new Baum();
        baum.add(22);
        baum.add(1);
        baum.add(100);
        if(baum.find(80) == null) System.out.println("TestFind3 success");
    }
    public static void testContins(){
        Baum baum = new Baum();
        baum.add(22);
        baum.add(1);
        baum.add(100);
        if(!baum.contains(80) && baum.contains(1)) System.out.println("TestContains success");
    }
}
