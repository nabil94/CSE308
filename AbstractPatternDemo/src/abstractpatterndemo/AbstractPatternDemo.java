/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractpatterndemo;

/**
 *
 * @author User
 */
public class AbstractPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AbstractFactory SF = FactoryProducer.getFactory("Shape");
        Shape s1 = SF.getShape("Rectangle");
        s1.draw();
        
        Shape s2 = SF.getShape("Square");
        s2.draw();
        
        Shape s3 = SF.getShape("Circle");
        s3.draw();
        
        AbstractFactory CF = FactoryProducer.getFactory("Color");
        Color c1 = CF.getColor("Red");
        c1.fill();//.draw();
        
        Color c2 = CF.getColor("Green");
        c2.fill();
        
        Color c3 = CF.getColor("Blue");
        c3.fill();
        
        
    }
    
}
