package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {
    @Test

    public void testDistance1(){
        Point p1 = new Point(1.0 , 3.0);
        Point p2 = new Point(5.0 , 10.0);
        Assert.assertEquals(p1.distance(p2), 5.385164807134504);
        Assert.assertEquals(p2.distance(p1), 5.385164807134504);//Проверяем , что расстояние вычисляется корректно
                                                                            //  в обе стороны

    }
    @Test
    public void testDistance2(){
        Point p1 = new Point(5.0 , 4.0);
        Point p2 = new Point(1.0 , 7.0);
        Assert.assertEquals(p1.distance(p2), 6.082762530298219);
        Assert.assertEquals(p2.distance(p1), 6.082762530298219);//Проверяем , что расстояние вычисляется корректно
                                                                            //  в обе стороны
    }
}
