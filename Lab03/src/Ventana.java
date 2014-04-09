import javax.swing.JLabel;
import javax.swing.JFrame;

public class Ventana {
	public static void main(String[] args){
		JFrame frame = new JFrame();
		JLabel label= new JLabel();
		label.setText("Hola");
		frame.add(label);
		frame.setTitle("mi primera ventana");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
