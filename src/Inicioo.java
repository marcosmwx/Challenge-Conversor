import javax.swing.JOptionPane;

public class Inicioo {

    public static void inicio() {
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
                    String input = JOptionPane.showInputDialog(null, "Digite o Valor", "Valor", 1);
                    if (input.matches("\\d+")) {
                        double valor = Double.parseDouble(input);
                        Moedas.converterValor(valor);
                    } else {
                        JOptionPane.showMessageDialog(null, "Entrada inválida. Digite apenas números.", "Erro",
                                JOptionPane.ERROR_MESSAGE);
                        Inicioo.inicio();
                    }
                    break;
                case "Conversor de Temperatura":
                    String inputTemp = JOptionPane.showInputDialog(null, "Digite a Temperatura", "Temperatura", 1);
                    if (inputTemp.matches("\\d+")) {
                        double valorTemp = Double.parseDouble(inputTemp);
                        Temperatura.converterTemperatura(valorTemp);

                    } else {
                        JOptionPane.showMessageDialog(null, "Entrada inválida. Digite apenas números.", "Erro",
                                JOptionPane.ERROR_MESSAGE);

                    }
                    break;

                default:
                    break;
            }
        }

    }

}
