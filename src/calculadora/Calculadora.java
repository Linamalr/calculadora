
package calculadora;

import javax.swing.JOptionPane;
public class Calculadora {
public static void main(String[] args)
{
 //Creamos el objeto calculadora de la clase objetocalculadora
ObjetoCalculadora calculadora = new ObjetoCalculadora();
//Se asignan valores a los atributos de la clase
calculadora.leerNumeros();
//Se ejecutan las operaciones
//Suma
calculadora.sumar();
JOptionPane.showMessageDialog(null,"Suma: " + calculadora.sumar());
//Resta
calculadora.restar();
JOptionPane.showMessageDialog(null,"Resta: "+ calculadora.restar());
//Multiplicacion
calculadora.multiplicacion();
JOptionPane.showMessageDialog(null,"Multiplicación: " + calculadora.multiplicacion());
//División
calculadora.division();
JOptionPane.showMessageDialog(null,"División: " + calculadora.division());
   }
}


