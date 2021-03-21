package core;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jsanchez
 */
public interface NotifyOps {
    int breakpoint(int address, int opcode);
    void execDone();
}