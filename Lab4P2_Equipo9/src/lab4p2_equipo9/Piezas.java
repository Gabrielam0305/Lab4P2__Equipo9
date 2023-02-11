/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_equipo9;

import java.util.ArrayList;

/**
 *
 * @author luism
 */
public abstract class Piezas {
    
    protected int x, y;
    protected String color;
    protected String Representacion;

    public Piezas(int x, int y, String color, String Representacion) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.Representacion = Representacion;
    }

    public Piezas() {
    }

    

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRepresentacion() {
        return Representacion;
    }

    public void setRepresentacion(String Representacion) {
        this.Representacion = Representacion;
    }
    
    
    
    public abstract boolean movimiento(Object [][]o,int f, int c, int f1,int c1);
        
  
}
