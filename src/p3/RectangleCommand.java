package p3;
import java.util.*;
import java.io.*;
/**
 *
 * @author a1
 */
public class RectangleCommand implements Command{
    
    private Vector<Shape> shapes;
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);
    Stack<Action> history = new Stack<Action>();

    RectangleCommand(Vector<Shape> shapes,Stack<Action> history) {
        this.shapes = shapes;
        this.history = history;
    }

    public void execute() {
        try{
        System.out.print("Enter width: ");
        String w = br.readLine();
        int width = Integer.parseInt(w);
        System.out.print("Enter height: ");
        String h = br.readLine();
        int height = Integer.parseInt(h);
        Shape shape = new Rectangle(width, height);
        shapes.add(shape);
        history.push(new Action(5, shape, -1));
        }catch (Exception e){
            
        }
    }

    public RectangleCommand() {
        this.shapes = shapes;
    }

}
