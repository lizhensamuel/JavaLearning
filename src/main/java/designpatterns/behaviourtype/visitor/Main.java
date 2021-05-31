package designpatterns.behaviourtype.visitor;

/**
 * @author: Samuel
 * @date: 2021-05-19 20:02
 */
public class Main{
    public static void main(String[] args) {
        PersonVisitor personVisitor=new PersonVisitor();
        CorporationVisitor corporationVisitor =new CorporationVisitor();
        new Computer().accept(personVisitor);
        new Computer().accept(corporationVisitor);
        System.out.println(personVisitor.totalPrice);
        System.out.println(corporationVisitor.totalPrice);
    }
}

class Computer{
    ComputerPart cpu=new CPU();
    ComputerPart memory=new Memory();
    ComputerPart board=new Board();

    public void accept(Visitor v){
        this.cpu.accept(v);
        this.memory.accept(v);
        this.board.accept(v);
    }
}

interface Visitor{
    void visitCpu(CPU cpu);
    void visitMemory(Memory memory);
    void visitBoard(Board board);
}

class PersonVisitor implements Visitor{
    double totalPrice=0.0;

    @Override
    public void visitCpu(CPU cpu) {
        totalPrice+=cpu.getPrice()*0.9;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice+=memory.getPrice()*0.8;
    }

    @Override
    public void visitBoard(Board board) {
        totalPrice+=board.getPrice()*0.9;
    }
}

class CorporationVisitor implements Visitor{
    double totalPrice=0.0;

    @Override
    public void visitCpu(CPU cpu) {
        totalPrice+=cpu.getPrice()*0.5;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice+=memory.getPrice()*0.6;
    }

    @Override
    public void visitBoard(Board board) {
        totalPrice+=board.getPrice()*0.4;
    }
}


abstract class ComputerPart{
    abstract void accept(Visitor v);

    abstract double getPrice();
}

class CPU extends ComputerPart{

    @Override
    void accept(Visitor v) {
        v.visitCpu(this);
    }

    @Override
    double getPrice() {
        return 500;
    }
}

class Memory extends ComputerPart{

    @Override
    void accept(Visitor v) {
        v.visitMemory(this);
    }

    @Override
    double getPrice() {
        return 300;
    }
}

class Board extends ComputerPart{

    @Override
    void accept(Visitor v) {
        v.visitBoard(this);
    }

    @Override
    double getPrice() {
        return 100;
    }
}
