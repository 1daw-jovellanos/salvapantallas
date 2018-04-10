/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salvapantallas;

/**
 *
 * @author victor.fernandez
 */
import figuras.*;
public class CirculoMovil extends Ovalo {
    private int incrX;
    private int incrY;

    public CirculoMovil(int x, int y, int radio, int incrX, int incrY) {
        super(x, y, radio * 2, radio * 2);
        this.incrX = incrX;
        this.incrY = incrY;
    }
    
    public void mover() {
        setX((getX() + incrX + 400) % 400);
        setY((getY() + incrY + 300) % 300);
    }
    

    
}
