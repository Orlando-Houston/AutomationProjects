package WednesdayParalel;

import org.testng.annotations.Test;

public class ParalelExecutionAbcd {
    @Test
    public void a(){
        long id=Thread.currentThread().getId();
        System.out.println("first thread id:"+id);
    }
    @Test
    public void b(){
       long id= Thread.currentThread().getId();
        System.out.println("second thread id:"+id);
}
    @Test
    public void c() {
        long id=Thread.currentThread().getId();
        System.out.println("thirty thread id:"+id);
    }
    @Test
    public void d(){
       long id= Thread.currentThread().getId();
        System.out.println("fourth thread id:"+id);
}}