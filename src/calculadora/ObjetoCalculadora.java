
package calculadora;

import javax.swing.JOptionPane;

public class ObjetoCalculadora {
//Se declaran los atributos privados de la clase ObjetoCalculadora
private int numero1=0;
private int numero2=0;
//Se crean constructores, la palabra super se usa para acceder y llamar funciones del padre de un objeto
public ObjetoCalculadora() {
super();
}
//Se genera las funciones ya que asigna un retorno
// metodo leer numeros
public void leerNumeros(){
  numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite numero 1"));
  numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite numero 2"));

  
  }
 // Metodos 
 public int sumar (){
   int suma = this.numero1+this.numero2;
   return suma;
 }
public int restar(){
   int resta = this.numero1-this.numero2;
   return resta;
}
public int multiplicacion (){
   int multiplicacion = this.numero1*this.numero2;
   return multiplicacion;
}
public double division(){
   double division = (double)this.numero1/(double)this.numero2;
   return division;
  }

    public int getNumero1() {
        return numero1;
    }

    public int setNumero1(int numero1){
        this.numero1 = numero1;   
        return 0;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
        
  }


