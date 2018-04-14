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
public class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String c) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(c == null){
            return null;
        }
        
        if(c.equalsIgnoreCase("Red")){
            return new Red();
        }
        else if(c.equalsIgnoreCase("Green")){
            return new Green();
        }
        else if(c.equalsIgnoreCase("Blue")){
            return new Blue();
        }
        
        
        return null;
    }

    @Override
    Shape getShape(String s) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
    }
    
}
