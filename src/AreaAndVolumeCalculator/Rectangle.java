/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AreaAndVolumeCalculator;

/**
 *
 * @author Duncan
 */
public class Rectangle implements Shape{
    private double length;
    private double width;
    
    public double getLength(){
        return length; 
    }
    
    public void setLength(double length){
        this.length = length;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public double calculateArea(){
        return this.length * this.width;
    }
}
