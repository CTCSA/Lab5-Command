package p3;

import java.util.*;
import java.io.*;

/**
 *
 * @author a1
 */
public class CircleCommand implements Command {

    private Vector<Shape> shapes;
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);
    Stack<Action> history = new Stack<Action>();

    public CircleCommand(Vector<Shape> shapes, Stack<Action> history) {
        this.shapes = shapes;
        this.history = history;
    }

    public void execute() {
        try{
        System.out.print("Enter radius: ");
        String line = br.readLine();
        int radius = Integer.parseInt(line);
        Shape shape = new Circle(radius);
        shapes.add(shape);
        history.push(new Action(4, shape, -1)); 
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
