/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package desafio1;

/**
 *
 * @author Francisco de Paula Dias Neto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  Declara  c1 como  variável  habilitada  a  armazenar  uma  referencia  para  objeto  da  classe Circle.
        Circle c1;
        // atribui a c1 .a referencia retornada pelo construtor padrão Circle ()
        c1 = new Circle();
        // Para invocar os metodos classe Circle para operar sobre a instância c1,
        // usa-se o operador ponto (“.”).
        //Em outras palavras: usa-se o ponto para enviar uma mensagem ao objeto c1 para que
        // ele execute um de seus métodos.
        System.out.println("O circulo tem o raio de " + c1.getRadius() + " e area de " + c1.getArea());
        // Declara e aloca uma segunda instancia da classe Circle chamada c2
        // com o valor do radius igual a 2.0 e color com valor padrão.
        Circle c2 = new Circle(2.0);
        // Para invocar os metodos a operar sobre a instância c2, usa-se o operador ponto (“.”)
        System.out.println("O circulo tem raio de "+ c2.getRadius() + " e area de "+ c2.getArea());
    }

}
