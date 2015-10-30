/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package p2.b;

/**
 *
 * @author a1
 */
public class TaskEntry {
    private long repeatInterval;
    private long timeLastDone;

    public TaskEntry(long repeatInterval, long timeLastDone) {
        this.repeatInterval = repeatInterval;
        this.timeLastDone = timeLastDone;
    }
    
    
}
