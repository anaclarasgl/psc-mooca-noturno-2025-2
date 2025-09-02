import javax.swing.JOptionPane;

public class mediaNota {

    public static void main(String[]args){

 double notaUm = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
 double notaDois = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
 double notaTres = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));
 double notaQuatro = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota:"));

double calcularMedia = (notaUm + notaDois + notaTres + notaQuatro) / 4;

JOptionPane.showMessageDialog(null, "A média das notas é: " + calcularMedia);

if(calcularMedia >= 7){
    System.out.println("Aprovado com a nota: "+ calcularMedia);
}
else if( calcularMedia >= 5 && calcularMedia < 7){
     System.out.println("Recuperação com a nota: " + calcularMedia);
}
else{
    System.out.println("Reprovado com a nota:" + calcularMedia);
}
    }
    
}