package com.JVBai3;
import javax.swing.JOptionPane;
public class jv_6JOptionPaneTest {
    public static void main(String[] args) {
        String radiusStr;
        double radius, area;
        radiusStr = JOptionPane.showInputDialog("Enter the radius of the circe");
        radius = Double.parseDouble(radiusStr);
        area = radius * radius * Math.PI;
        System.out.println("The area is " + area);
    }
}
