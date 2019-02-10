import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FormaFrame extends JFrame{
	
	private final static String[] formas = {"Circulo", "Retangulo", "Linha", "Arco"};
	
	private JComboBox<String> boxCores;
	private JPanel panelBox;
	private FormaPanel panelForma;
	
	public FormaFrame() {
		
		boxCores = new JComboBox<String>(formas);
		boxCores.setMaximumRowCount(3);
		
		panelBox = new JPanel(new FlowLayout());
		
		panelForma = new FormaPanel(boxCores.getItemAt(0));
		
		panelBox.add(boxCores);
		
		add(panelBox, BorderLayout.NORTH);
		add(panelForma);
		
	}
}
