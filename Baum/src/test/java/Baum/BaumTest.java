package Baum;

import org.junit.Test;

import static org.junit.Assert.*;

public class BaumTest {

    @Test
    public void testAdd1(){
        Baum baum = new Baum();
        baum.add(22);
        assertEquals(baum.wurzel.inhalt, 22);
    }
    @Test
    public void testAdd2(){
        Baum baum = new Baum();
        baum.add(22);
        baum.add(1);
        assertEquals(baum.wurzel.inhalt, 22);
        assertEquals(baum.wurzel.kleiner.inhalt, 1);
    }
    @Test
    public void testAdd3(){
        Baum baum = new Baum();
        baum.add(22);
        baum.add(1);
        baum.add(100);
        assertEquals(baum.wurzel.inhalt, 22);
        assertEquals(baum.wurzel.kleiner.inhalt, 1);
        assertEquals(baum.wurzel.groesser.inhalt, 100);
    }
    @Test
    public void testFind1(){
        Baum baum = new Baum();
        baum.add(22);
        baum.add(1);
        baum.add(100);
        assertEquals(baum.find(100), baum.wurzel.groesser);
    }
    @Test
    public void testFind2(){
        Baum baum = new Baum();
        baum.add(22);
        baum.add(1);
        baum.add(100);
        assertEquals(baum.find(22), baum.wurzel);
    }
    @Test
    public void testFind3(){
        Baum baum = new Baum();
        baum.add(22);
        baum.add(1);
        baum.add(100);
        assertEquals(baum.find(80) , null);
    }
    @Test
    public void testContins(){
        Baum baum = new Baum();
        baum.add(22);
        baum.add(1);
        baum.add(100);
        assert !baum.contains(80);
        assert baum.contains(1);
    }

    @Test
    public void finalTest(){
        Baum b = new Baum();
        b.add(6);
        b.add(5);
        b.add(20);
        b.add(9);
        b.add(3);
        b.add(1);

        assert ! b.contains(40);
        assertEquals(b.wurzel.groesser.kleiner, b.find(9));
    }
}