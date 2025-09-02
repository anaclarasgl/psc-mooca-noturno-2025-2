
import javax.swing.JOptionPane;

public class IfEncadeado {
    public static void main(String[] args) {
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno "));
       if(nota > 7){
        System.err.println("Aprovado");
       }else if(nota >= 5 && nota < 7 ){
        System.err.println("Recuperaçao");
       }else{
        System.err.println("Reprovado");

       }

    }
    
}
