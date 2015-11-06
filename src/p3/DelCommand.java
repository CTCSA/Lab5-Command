/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import java.util.*;
import java.io.*;
/**
 *
 * @author a1
 */
public class DelCommand implements Command {
        Vector<Shape> shapes = new Vector<Shape>();
        Stack<Action> history = new Stack<Action>();
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        Shape shape;

    public DelCommand(Vector<Shape> shapes,Stack<Action> history) {
        this.shapes = shapes;
        this.history = history;
    }

    public void execute() {
        try{
        System.out.print("Enter index of the shape: ");
        //line = br.readLine();
        String line = br.readLine();        
        int index = Integer.parseInt(line);
        if (index < 0 || index >= shapes.size()) {
            throw new Exception("Out of Range");
        }
        //shape = shapes.get(index);
        Shape shape = shapes.get(index);
        shapes.remove(shape);
        history.push(new Action(3, shape, index));
        }catch(Exception e){
            e.printStackTrace();
        }
        }
}
