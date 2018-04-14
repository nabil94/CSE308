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
public class ShapeFactory extends AbstractFactory{

    @Override
    public Color getColor(String c) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;//
    }

    @Override
    public Shape getShape(String s) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(s == null)
            return null;
        
        if(s.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        else if(s.equalsIgnoreCase("Square")){
            return new Square();
        }
        else if(s.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        
        
        
        return null;
        
    }
    
}
