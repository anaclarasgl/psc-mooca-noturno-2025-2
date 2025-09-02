import javax.swing.JOptionPane;

public class ifSimples{

public static void main (String[]args){

int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

if(numero > 0){
    JOptionPane.showMessageDialog(null, "O número " + numero + " é positivo");
}
else if(numero < 0){
    JOptionPane.showMessageDialog(null, "O número " + numero + " é negativo");
} else {
            JOptionPane.showMessageDialog(null, "O número é zero");
        }
}
}
