import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame implements ActionListener {
    final private Font font = new Font("Lucida Console",Font.PLAIN,12);
    private Dimension guiDim = new Dimension();
    private SwingPane pane;
    private Container content;

    public void actionPerformed(ActionEvent e) {
    }

    private class MyKeyListener implements KeyListener {
	public void keyPressed(KeyEvent e) {
	    //e.getKeyChar()
	}
	public void keyTyped(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
	}
    }

    public Gui() {
	setTitle("yoloRL");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setResizable(false);
	content = getContentPane();
	content.setBackground(Color.BLUE);
        

	pane = new SwingPane(80,25,font);
	pack();
	guiDim.height = pane.getPaneDim().height + 
	    getInsets().top + getInsets().bottom;
	guiDim.width = pane.getPaneDim().width + 
	    getInsets().left + getInsets().right;

	setSize(guiDim);

	content.add(pane);
	setVisible(true);
    }

    public SwingPane getPane() {return pane;}
}
