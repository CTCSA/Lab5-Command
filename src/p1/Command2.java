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
public class Command2 implements Command {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void execute() {
        System.out.println(id + "Command2:excute()");
    }

    public void undo() {
        System.out.println(id + "Command2: undo()");
    }

    public Command2(int id) {
        this.id = id;
    }

}
