import javax.swing.JOptionPane;

public class SwitchCase {
    public static void main(String[] args) {
        char operador = '+';
        int num1 = 10, num = 5;
        int resultado;

        switch(operador){
            case '+':
            resultado = num1 + num;
            JOptionPane.showMessageDialog(null, "Soma " + resultado);
            break;
            
            case '-':
            resultado = num1 - num;
            JOptionPane.showMessageDialog(null, "Subtração " + resultado);
            break;

            case '*':
            resultado = num1 * num;
            JOptionPane.showMessageDialog(null, "Multiplicação " + resultado);
            break;

            
            case '/':
            if(num != 0) {
            resultado = num1 / num;
            JOptionPane.showMessageDialog(null, "Divisão " + resultado);
            }else{
                System.err.println("Erro: Divião por zero");
            }
            break;
        default:
        System.out.println("Operador inválido");    
        }
        
    }
    
}
