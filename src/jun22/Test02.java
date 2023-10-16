package jun22;

class Super_Object {
    public void paint(){
        draw();
    }
 
    public void draw(){
        draw();
        System.out.println("Super Object");
    }
}
 
 
class Sub_Object extends Super_Object {
    public void paint(){
        super.draw();
    }
 
    public void draw(){
        System.out.println("Sub Object");
    }
}
 
 
public class Test02{
    public static void main(String[] args){
        Super_Object a = new Sub_Object();
        a.paint();
    } 
}
