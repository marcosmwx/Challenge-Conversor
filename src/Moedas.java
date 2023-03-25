import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Moedas {
    private static double valor = 0.0d;
    private static double resultado = 0.0d;

    public static String getResultado() {
        DecimalFormat df = new DecimalFormat("###,##0.00");
        return df.format(resultado);
    }

    public static void setResultado(double resultado) {
        Moedas.resultado = resultado;
    }

    public static double getValor() {
        return valor;
    }

    public static void setValor(double valor) {
        Moedas.valor = valor;
    }

    public static void continuar() {
        Object[] options = { "Sim", "Não", "Inicio" };
        int continuar = JOptionPane.showOptionDialog(null, "Converter Novamente?", "Menu Continuar",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, options, options[0]);
        if (continuar == 0) {
            converterValor(valor);
        } else if (continuar == 2) {
            Inicioo.inicio();
        }
    }

    public static void converterValor(double valorRecebido) {

        setValor(valorRecebido);
        String[] opcoesConversao = { "Converter de Reais a Dólar",
                "Converter de Reais a Euro",
                "Converter de Reais a Libras Esterlinas",
                "Converter de Reais a Peso argentino",
                "Converter de Reais a Peso Chileno",
                "Converter de Dólar a Reais",
                "Converter de Euro a Reais",
                "Converter de Libras Esterlinas a Reais",
                "Converter de Peso argentino a  Reais",
                "Converter de Peso Chileno a Reais" };
        String opcaoEscolhida = (String) JOptionPane.showInputDialog(null,
                "Escolha uma opção:",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null, opcoesConversao,
                opcoesConversao[0]);
        if (opcaoEscolhida != null) {
            switch (opcaoEscolhida) {
                case "Converter de Reais a Dólar":
                    setResultado(getValor() / 5.27);
                    JOptionPane.showMessageDialog(null,
                            "(R$) Reais para ($) Dolar, seu valor em Dolar é: $ " + getResultado(),
                            "Conversão Reais para Dolar", 1);
                    continuar();
                    break;
                case "Converter de Reais a Euro":
                    setResultado(getValor() / 5.74);
                    JOptionPane.showMessageDialog(null,
                            "(R$) Reais para (€) Euro, seu valor em Euro é: € " + getResultado(),
                            "Conversão Reais para Euro", 1);
                    continuar();
                    break;
                case "Converter de Reais a Libras Esterlinas":
                    setResultado(getValor() / 6.49);
                    JOptionPane.showMessageDialog(null,
                            "(R$) Reais para (£) Libras Esterlinas, seu valor em Libras Esterlinas é: £ "
                                    + getResultado(),
                            "Conversão Reais para Libras Esterlinas", 1);
                    continuar();
                    break;
                case "Converter de Reais a Peso argentino":
                    setResultado(getValor() / 0.0256);
                    JOptionPane.showMessageDialog(null,
                            "(R$) Reais para (ARS) Peso Argentino, seu valor em Peso Argentino é: ARS "
                                    + getResultado(),
                            "Conversão Reais para Peso Argentino", 1);
                    continuar();
                    break;
                case "Converter de Reais a Peso Chileno":
                    setResultado(getValor() / 0.0066);
                    JOptionPane.showMessageDialog(null,
                            "(R$) Reais para (CLP) Peso Chileno, seu valor em Peso Chileno é: CLP " + getResultado(),
                            "Conversão Reais para Peso Chileno", 1);
                    continuar();
                    break;
                case "Converter de Dólar a Reais":
                    setResultado(getValor() * 5.27);
                    JOptionPane.showMessageDialog(null,
                            "($) Dolar para (R$) Reais, seu valor em Reais é: R$ " + getResultado(),
                            "Conversão Dólar para Reais", 1);
                    continuar();
                    break;
                case "Converter de Euro a Reais":
                    setResultado(getValor() * 5.74);
                    JOptionPane.showMessageDialog(null,
                            "(€) Euro para (R$) Reais, seu valor em Reais é: R$ " + getResultado(),
                            "Conversão Reais para Euro", 1);
                    continuar();
                    break;
                case "Converter de Libras Esterlinas a Reais":
                    setResultado(getValor() * 6.49);
                    JOptionPane.showMessageDialog(null,
                            "(£) Libras Esterlinas para (R$) Reais, seu valor em Reais é: R$ "
                                    + getResultado(),
                            "Conversão Reais para Libras Esterlinas", 1);
                    continuar();
                    break;
                case "Converter de Peso argentino a  Reais":
                    JOptionPane.showMessageDialog(null,
                            "(ARS) Peso Argentino para (R$) Reais, seu valor em Reais é: R$ " + getResultado(),
                            "Conversão Reais para Peso Argentino", 1);
                    continuar();
                    break;
                case "Converter de Peso Chileno a Reais":
                    setResultado(getValor() * 0.0066);
                    JOptionPane.showMessageDialog(null,
                            "(CLP) Peso Chileno para (R$) Reais, seu valor em Reais é: R$ " + getResultado(),
                            "Conversão Reais para Peso Chileno", 1);
                    continuar();
                    break;
                default:
                    break;
            }
        }

    }

}
