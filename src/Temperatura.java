import javax.swing.JOptionPane;

public class Temperatura {
    private static double tempAtual = 0.0d;

    public static void setTempAtual(double tempAtual) {
        Temperatura.tempAtual = tempAtual;
    }

    public static void continuar() {
        Object[] options = { "Sim", "Não", "Inicio" };
        int continuar = JOptionPane.showOptionDialog(null, "Converter Novamente?", "Menu Continuar",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, options, options[0]);
        if (continuar == 0) {
            converterTemperatura(tempAtual);
        } else if (continuar == 2) {
            Inicioo.inicio();
        }
    }

    public static void converterTemperatura(double valorRecebido) {
        setTempAtual(valorRecebido);
        String[] opcoesConversao = { "Converter para Celsius", "Converter para Fahrenheit", "Converter para Kelvin" };
        String opcaoEscolhida = (String) JOptionPane.showInputDialog(null, "Escolha uma opção:", "Menu",
                JOptionPane.QUESTION_MESSAGE, null, opcoesConversao, opcoesConversao[0]);

        if (opcaoEscolhida != null) {

            String sinalCelsius = "°C";
            String sinalFahrenheit = "°F";
            String sinalKelvin = "K";
            double celsius, fahrenheit, kelvin;

            switch (opcaoEscolhida) {
                case "Converter para Celsius":
                    celsius = valorRecebido;
                    fahrenheit = (valorRecebido * 9 / 5) + 32;
                    kelvin = valorRecebido + 273.15;

                    break;
                case "Converter para Fahrenheit":
                    celsius = (valorRecebido - 32) * 5 / 9;
                    fahrenheit = valorRecebido;
                    kelvin = (valorRecebido + 459.67) * 5 / 9;

                    break;
                case "Converter para Kelvin":
                    celsius = valorRecebido - 273.15;
                    fahrenheit = (valorRecebido * 9 / 5) - 459.67;
                    kelvin = valorRecebido;

                    break;
                default:
                    throw new IllegalArgumentException("Opção inválida: " + opcaoEscolhida);
            }
            String mensagem = "Temperatura em Celsius: " + celsius + sinalCelsius + "\n" +
                    "Temperatura em Fahrenheit: " + fahrenheit + sinalFahrenheit + "\n" +
                    "Temperatura em Kelvin: " + kelvin + sinalKelvin;
            JOptionPane.showMessageDialog(null, mensagem, "Conversão de temperatura", JOptionPane.INFORMATION_MESSAGE);
            continuar();
        }
    }
}