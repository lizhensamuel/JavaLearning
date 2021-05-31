package designpatterns.structuretype.bridge.v1;

/**
 * @author: Samuel
 * @date: 2021-05-20 20:26
 */
public class Main {
    public static void main(String[] args) {

    }
}

abstract class Gift{

}

class Book extends Gift{

}

class Flower extends Gift{

}

class MM{
    String name;
}

class GG{
    public void chase(MM mm){
        Gift g=new Book();
        give(mm,g);
    }

    public void give(MM mm,Gift g){

    }
}
