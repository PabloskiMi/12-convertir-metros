
package clases;


public class Medida {
    
    public double metros;
    public double centimetros;
    public double kilometros;

    public Medida(double metros) {
        
        this.metros = metros;
        
    }
    
    public double getCentimetros(){
        
        centimetros = metros * 100;
        
        return centimetros;
    }
    
    public double getKilometros(){
        
        kilometros = metros * 0.001;
        
        return kilometros;
    }
    
    
}
