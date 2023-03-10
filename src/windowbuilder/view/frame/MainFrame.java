package windowbuilder.view.frame;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import windowbuilder.view.panel.MainPanel;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);

		MainPanel mainPanel = MainPanel.getInstance();
		mainPanel.init();
		setContentPane(mainPanel);

	}
}
