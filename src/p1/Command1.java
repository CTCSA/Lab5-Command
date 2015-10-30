/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author a1
 */
public class Command1 implements Command {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private int id;
    public void execute() {
           System.out.println(id + "Command1:excute()");
    }

    public void undo() {
        System.out.println(id + "Command1: undo()");
    }

    public Command1(int id) {
        this.id = id;
    }
    
    
}