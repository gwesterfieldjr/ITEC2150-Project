package itec2150project;

import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Raj Ramsaroop
 * @version 0.1
 */
public class MediaConsumptionTracker {
	//this is a chenge
	// The program window
	JFrame frame;
	
	// Main Menu Panel
	JPanel pnlMainMenu;
	
	// Main menu buttons
	JButton btnMainMusic, btnMainMovies, btnMainBooks;
	
	public MediaConsumptionTracker() {
		
		createLayoutComponents();	// also displays layout
		
	}

	/**
	 * Creates and displays all the layout components
	 */
	private void createLayoutComponents() {
		
		// Create main menu panel
		createMainMenu();
		
		// Create and initialize frame, make main menu the first panel displayed
		frame = new JFrame("Media Consumption Tracker");
		frame.setSize(450,470);
		frame.setLayout(new CardLayout());
		frame.add(pnlMainMenu,"Main Menu");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	/**
	 * Creates the main menu components
	 */
	private void createMainMenu() {
		// Create buttons
		btnMainMusic = new JButton("Music");
		btnMainMovies = new JButton("Movies");
		btnMainBooks = new JButton("Books");
		
		// Create panel
		pnlMainMenu = new JPanel();
		pnlMainMenu.setLayout(new GridLayout(3,1));
		
		// Add buttons
		pnlMainMenu.add(btnMainMusic);
		pnlMainMenu.add(btnMainMovies);
		pnlMainMenu.add(btnMainBooks);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MediaConsumptionTracker media = new MediaConsumptionTracker();
	}

}
