package p3;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Vector<Shape> shapes = new Vector<Shape>();
        Stack<Action> history = new Stack<Action>();
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        Shape shape;

        while (true) {
            try {
                System.out.println("0 = exit, 1 = undo, 2 = draw all shapes, "
                        + "3 = delete a shape, 4 = create circle, 5 = create rectangle");
                System.out.print("Enter option: ");
                String line = br.readLine();
                int option = Integer.parseInt(line);
                switch (option) {
                    case 0:
                        System.out.println("-- End --");
                        System.exit(0);
                    case 1:
                        UndoCommand udcmd = new UndoCommand(shapes, history);
                        udcmd.execute();
                        break;
                    case 2:
                       /* 
                        for (int i = 0; i < shapes.size(); i++) {
                            ((Shape) shapes.elementAt(i)).draw();
                        }
                       */
                        DrawCommand cmd = new DrawCommand(shapes);
                        cmd.execute();
                        break;
                    case 3:
                        DelCommand dcmd = new DelCommand(shapes, history);
                        dcmd.execute();
                        break;
                    case 4:
                        CircleCommand ccmd = new CircleCommand(shapes, history);
                        ccmd.execute();
                        break;
                    case 5:
                        RectangleCommand rcmd = new RectangleCommand(shapes, history);
                        rcmd.execute();
                        break;
                    default:
                        throw new Exception("Invalid Option");
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("*** " + e.getMessage());
            }
            System.out.println();
        }

    }
}
