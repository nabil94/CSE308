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
public class FactoryProducer {
    public static AbstractFactory getFactory(String c){
        if(c.equalsIgnoreCase("Shape")){
            return new ShapeFactory();
        }
        else if(c.equalsIgnoreCase("Color")){
            return new ColorFactory();
        }
      
        return null;
        
    }
    
}
