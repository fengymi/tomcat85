
public class ParentTest {

    public static void main(String[] args) {
        Parent p = new Son();
        System.out.println(p.getA());
    }

}


abstract class Parent{
    protected int a = 1;

    protected int getA(){
        System.out.println(this);
        return this.a;
    }
}

class Son extends Parent {
    protected int a = 2;
}
