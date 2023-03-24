import javax.swing.JOptionPane;

public class Inicioo {
    public static void main(String[] args) {
        String[] opcoes = { "Conversor de Moedas", "Conversor de Temperatura" };
        String opcao = (String) JOptionPane.showInputDialog(null,
                "Escolha uma opção:",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null, opcoes,
                opcoes[0]);

        if (opcao != null) {
            switch (opcao) {
                case "Conversor de Moedas":
                    double valor = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Digite o Valor", "Valor", 1));
                    Moedas.converterValor(valor);
                    break;
                default:
                    break;
            }
        }

    }
}

/*
 * double n1 = Double.parseDouble(JOptionPane.showInputDialog(null,
 * "Digite um numero"));
 * double n2 = Double.parseDouble(JOptionPane.showInputDialog(null,
 * "Digite outro numero"));
 * 
 * JOptionPane.showMessageDialog(null, "A soma entre " + n1 + " e " + n2 +
 * " é igual a: " + (n1 + n2), "Resultado", 2);
 */
// JOptionPane.showOptionDialog(null, "Escolha uma opcao", "Menu de Opcoes", 1,
// 0, null, args, args);

/*
 * int sair = JOptionPane.showConfirmDialog(null, "Voce deseja sair?",
 * "Atencao", 0);
 * if(sair == 0){
 * JOptionPane.showMessageDialog(null, "Usuario permanece!");
 * }else {
 * JOptionPane.showMessageDialog(null, "Usuario Saiu");
 * }
 */