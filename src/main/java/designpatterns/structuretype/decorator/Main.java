package   designpatterns.structuretype.decorator;

/**
 * @author: Samuel
 * @date: 2021-05-17 8:16
 * 设计一个渲染HTML文本的程序
 * 文本还能附加一些效果，如，加粗、斜体、加下划线等
 * 为了动态地实现这些附加效果就可以用装饰器模式
 */
public class Main {
    public static void main(String[] args) {
        //客户端可以自由地组合这些Decorator
        //创建一个核心节点
        TextNode n1=new SpanNode();
        TextNode n2=new BoldDecorator(new SpanNode());
        TextNode n3=new BoldDecorator(new ItalicDecorator(new UnderlineDecorator(new SpanNode())));

        n1.setText("核心节点");
        n2.setText("使用一个装饰器");
        n3.setText("使用多个装饰器组合");

        System.out.println(n1.getText());
        System.out.println(n2.getText());
        System.out.println(n3.getText());

    }
}
//定义顶层接口
interface TextNode{
    //设置text
    void setText(String text);
    //获取text
    String getText();
}

//对于核心节点，如<span>，需要从TextNode直接继承
class SpanNode implements TextNode{
    private String text;

    @Override
    public void setText(String text) {
        this.text=text;
    }

    @Override
    public String getText() {
        return "<span>"+"text"+"</span>";
    }
}

//为了实现Decorator模式，需要抽象一个Decorator类
//这个Decorator类的核心是持有一个待装饰的TextNode实例
abstract class NodeDecorator implements TextNode{
    protected final TextNode target;

    protected NodeDecorator(TextNode target){
        this.target=target;
    }

    public void setText(String text){
        this.target.setText(text);
    }

}

//实现加粗功能
class BoldDecorator extends NodeDecorator{

    protected BoldDecorator(TextNode target) {
        super(target);
    }

    @Override
    public String getText() {
        return "<b>"+target.getText()+"</b>";
    }
}

//实现斜体功能
class ItalicDecorator extends NodeDecorator{
    protected ItalicDecorator(TextNode target) {
        super(target);
    }

    @Override
    public String getText() {
        return "<i>"+target.getText()+"</i>";
    }
}

//实现下划线功能
class UnderlineDecorator extends NodeDecorator{
    protected UnderlineDecorator(TextNode target) {
        super(target);
    }

    @Override
    public String getText() {
        return "<u>"+target.getText()+"</u>";
    }
}
