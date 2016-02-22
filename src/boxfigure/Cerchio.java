/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxfigure;

import javafx.geometry.Point2D;

/**
 *
 * @author SlayerCandy0369
 */
public class Cerchio extends BoundingBox{
    private final Point2D centro;
    private final double raggio;
    
    public Cerchio(double x, double y, double raggio){
        this.centro = new Point2D(x,y);
        this.raggio = raggio;
        this.max = this.calcMax();
        this.min = this.calcMin();
    }

    @Override
    public final Point2D calcMin() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Point2D point;
        point = new Point2D((this.centro.getX()-this.raggio),(this.centro.getY()+this.raggio));
        return point;
    }

    @Override
    public final Point2D calcMax() {
        Point2D point;
        point = new Point2D((this.centro.getX()+this.raggio),(this.centro.getY()-this.raggio));
        return point;
    }

    
}
