  import javax.swing.JOptionPane;

  public class DialogViewer2
  {
    public static void main(String[] args)
    {
      String name = JOptionPane.showInputDialog("What is your name?");
      System.out.print("Hello, ");
      System.out.print(name);
      System.out.print("!");
    }
  }