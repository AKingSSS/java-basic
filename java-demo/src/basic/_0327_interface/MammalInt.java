package basic._0327_interface;

/**
 * @ClassName MammalInt
 * @Description
 * @Author yangkang
 * @Date 2020/3/27 20:13
 * @Version 1.0
 **/
public class MammalInt implements Animal {
    @Override
    public void eat(){
        System.out.println("Mammal eats");
    }

    @Override
    public void travel(){
        System.out.println("Mammal travels");
    }

    public int noOfLegs(){
        return 0;
    }

    public static void main(String args[]){
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();
    }
}
