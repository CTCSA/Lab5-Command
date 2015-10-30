/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;
import java.util.*;
/**
 *
 * @author a1
 */
public class DrawCommand implements Command {
    private Vector<Shape> shapes;
    
    
    
    @Override
    public void execute() {
        for (int i = 0; i < shapes.size(); i++) {
            ((Shape) shapes.elementAt(i)).draw();
        }
    }

    public DrawCommand(Vector<Shape> shapes) {
        this.shapes = shapes;
    }
    
    
}
