/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes_Objetos_Atributos_Metodos;

/**
 *
 * @author pc
 */
public class Circulo {
    
    public float raio;
    public int x;
    public  int y;
   
    
    // método para calcular área que não recebe parâmetro
    public double area(){
        double area = 3.1415 * (this.raio * 2);
        return area;
    }
    // método para trocar os valores dos meus objetos
    public void troca(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    
}
