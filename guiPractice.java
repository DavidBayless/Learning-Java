import javax.swing.*;

class Window extends JFrame{
  JPanel pnl = new JPanel();

  public Window() {
    super( "Swing Window");
    setSize( 500, 200 );
    setDefaultCloseOperation( EXIT_ON_CLOSE );
    add( pnl );
    setVisible( true );
    JButton btn = new JButton( "Click Me");
    JButton tickBtn = new JButton( "GO");
    JButton crossBtn = new JButton( "STOP");
    pnl.add( btn );
    pnl.add( tickBtn );
    pnl.add( crossBtn );
  }

  public static void main( String[]args ) {
    Window gui = new Window();
  }
}
