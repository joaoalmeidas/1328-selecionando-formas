import java.awt.Graphics;
import java.security.SecureRandom;

import javax.swing.JPanel;

public class FormaPanel extends JPanel {
	
	private String forma;
	
	private final SecureRandom aleatorio = new SecureRandom();
	
	public FormaPanel(String forma) {
		
		this.forma = forma;
		
	}
	
	public void paintComponent(Graphics g) {
		
		final int x = aleatorio.nextInt(getWidth());
		final int y = aleatorio.nextInt(getHeight());
		final int largura = x + aleatorio.nextInt(getWidth());
		final int altura = y + aleatorio.nextInt(getHeight());
		
		if(forma.equals("Circulo")) {
			
			g.drawOval(aleatorio.nextInt(getWidth()), aleatorio.nextInt(getHeight()), largura, altura);
			
		}else if(forma.equals("Retângulo")) {
			
		}else if(forma.equals("Linha")) {
			
		}else if(forma.equals("Arco")) {
			
		}
		
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}
	
	
	
}
