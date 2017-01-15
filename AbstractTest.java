abstract class AbstractTestParent{
    private double price;
    public abstract void goFast(); // 抽象方法
    public abstract void goSlow(); // 抽象方法
}


public class AbstractTest extends AbstractTestParent{
    public void goFast(){
        System.out.println("i am goFast");
    }
    public void goSlow(){
        System.out.println("i am goSlow");
    }
    public static void main(String [] main){
        AbstractTest ab = new AbstractTest();
        ab.goFast();
    }
}
