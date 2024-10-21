
package com.mycompany.figurasgeometricas;

public class Circulo extends FiguraGeometrica {
 private int radio;
 public Circulo(String nombre, String color){
     super(nombre, color);
    
 }
 public double obtenerArea(){
     return Math.PI*radio*radio;
     
 }
 public double obtenerPerimetro(){
     return 2*Math.PI*radio;
 }
}
 

