package WednesdayParalel;

import org.testng.annotations.Test;

public class ParalelExecution {
    @Test
    public void testA(){
        long id=Thread.currentThread().getId();
        System.out.println("The testA id is :"+id);
    }
    @Test
    public void testB(){
        long id=Thread.currentThread().getId();
        System.out.println("The testB id is :"+id);
    }
    @Test
    public void testC(){
        long id=Thread.currentThread().getId();
        System.out.println("The testC id is :"+id);
    }
    @Test
    public void testD(){
        long id=Thread.currentThread().getId();
        System.out.println("The testD id is :"+id);
    }
    @Test
    public void testE(){
        long id=Thread.currentThread().getId();
        System.out.println("The testE id is :"+id);
    }
    @Test
    public void testG(){
        long id=Thread.currentThread().getId();
        System.out.println("The testG id is :"+id);
    }
}


