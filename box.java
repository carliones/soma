import javax.swing.JOptionPane;
public class box
{
    public static void main(String[] args)
    {
      int x = Integer.parseInt(JOptionPane.showInputDialog("olá informe o primeiro número"));
      int y = Integer.parseInt(JOptionPane.showInputDialog("olá informe o segundo número"));
      int soma = x + y;
      String caixa = String.format("a soma dos dois números é %s", soma);
      JOptionPane.showMessageDialog(null, caixa);

    }
}