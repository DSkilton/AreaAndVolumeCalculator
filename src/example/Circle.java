/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

/**
 *
 * @author Duncan
 */
public class Circle implements Shape{
    public final double PI = 3.14;
    public double radius;

    public double calculateArea(){
        return PI * radius * radius;
    }
}
