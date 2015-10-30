/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;
import java.util.*;
/**
 *
 * @author a1
 */
public class Main {

    public static void main(String args[]) {
        
        Command cmd[] = {new Command1(22),new Command1(2),new Command2(3),new Command2(4)};

        Stack st = new Stack();
        
        st.push(cmd[0]);

        cmd[0].execute();
        

}
}