package designpatterns.behaviourtype.iterator.v2;

/**
 * @author: Samuel
 * @date: 2021-05-19 18:24
 * 添加容器的共同接口，实现容器的替换
 * 如何对容器进行遍历
 */
public class Main {
    public static void main(String[] args) {
        Collection_ list=new LinkedList_();
        for (int i = 0; i < 15; i++) {
            list.add(new String("s"+i));
        }
        System.out.println(list.size());

        Iterator_ it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

interface Iterator_{
    boolean hasNext();

    Object next();
}

interface Collection_{
    void add(Object o);
    int size();
    Iterator_ iterator();
}

class ArrayList_ implements Collection_{
    Object[] objects=new Object[10];

    private int index=0;

    @Override
    public void add(Object o){
        if(index==objects.length){
            Object[] newObjects=new Object[objects.length*2];
            System.arraycopy(objects,0,newObjects,0,objects.length);
            objects=newObjects;
        }

        objects[index]=o;
        index++;
    }

    @Override
    public int size(){return index;}



    private class ArrayListIterator implements Iterator_{

        private int currentIndex=0;

        @Override
        public boolean hasNext() {
            if(currentIndex>=index)return false;
            return true;
        }

        @Override
        public Object next() {
            Object o=objects[currentIndex];
            currentIndex++;
            return o;
        }
    }

    @Override
    public Iterator_ iterator() {
        return new ArrayListIterator();
    }


}

class LinkedList_ implements Collection_{
    private class Node{
        private Object o;
        Node next;

        public Node(Object o){
            this.o=o;
        }
    }

    Node head=null;
    Node tail=null;

    private int size=0;

    @Override
    public void add(Object o) {
        Node n=new Node(o);
        n.next=null;

        if(head==null){
            head=n;
            tail=n;
        }
        tail.next=n;
        tail=n;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    private class LinkedListIterator implements Iterator_{
        private int currentIndex=0;

        @Override
        public boolean hasNext() {
            if(currentIndex>=size)return false;
            return true;
        }

        @Override
        public Object next() {
            currentIndex++;
            return head.o;
        }
    }

    @Override
    public Iterator_ iterator() {
        return new LinkedListIterator();
    }
}