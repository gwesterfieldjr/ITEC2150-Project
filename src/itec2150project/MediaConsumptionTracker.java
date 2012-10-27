package itec2150project;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * @author Raj Ramsaroop
 * @version 0.1
 */
public class MediaConsumptionTracker {
	
	// The program window
	JFrame frame;
	
	// Main Menu Panel
	JPanel pnlMainMenu;
	
	// Main menu buttons
	JButton btnMainMusic, btnMainMovies, btnMainBooks;
	
	// Panel to contain Manage Music screen
	JPanel pnlManageMusic;
	
	// Label for Manage Music screen title
	JLabel lblManageMusic;
	
	// Button to add music on Manage Music screen
	JButton btnAddMusic;
	
	// Manage music table
	JTable tblManageMusic;
	
	public MediaConsumptionTracker() {
		
		createLayoutComponents();	// also displays layout
		
	}

	/**
	 * Creates and displays all the layout components
	 */
	private void createLayoutComponents() {
		
		// Create main menu panel
		createMainMenu();
		
		// Create Manage Music screen
		createManageMusicScreen();
		
		// Create and initialize frame, make main menu the first panel displayed
		frame = new JFrame("Media Consumption Tracker");
		frame.setSize(450,470);
		frame.setLayout(new CardLayout());
		//frame.add(pnlMainMenu,"Main Menu");
		frame.add(pnlManageMusic,"Manage Music");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private void createManageMusicScreen() {
		lblManageMusic = new JLabel("Manage Music");
		lblManageMusic.setFont(new Font("Comic Sans MS", Font.BOLD , 22));
		lblManageMusic.setForeground(Color.MAGENTA);
		
		// Add Music button
		btnAddMusic = new JButton("Add Music");
		
		// Create headings
		String[] columnNames = {"Song Title",
								"Artist",
								"Album"};
		
		// Create sample data for testing, this will be pulled from the database in the real
		// program
		Object[][] sampleData = {
			    {"Ssdfome Title", "Crappy Artist", "Stupid eeeAlbum"},
			    {"Some Title", "Czxczxcvrappy Artist", "Stupvvixcvzxcvd Album"},
			    {"Somebn Title", "Crapzxcvzxcpy Artist", "Stupidxcvzxcv Album"},
			    {"Somevzxcvx Title", "Crappy 334Artist", "Stupid Album"},
			    {"Somebvn Title", "Cdffrappy Artist", "Stupid vbnbAlbum"}
		};
		
		JTable tblManageMusic = new JTable(sampleData, columnNames);
		tblManageMusic.setEnabled(false);	// Disable editing for now
		tblManageMusic.setAutoCreateRowSorter(true);
		
		// Create scroll pane to contain table
		JScrollPane scrollPane = new JScrollPane(tblManageMusic);
		tblManageMusic.setFillsViewportHeight(true);
		
		// Create panel to contain everything
		pnlManageMusic = new JPanel();
		pnlManageMusic.setLayout(new GridLayout(3,1));
		pnlManageMusic.add(lblManageMusic);
		pnlManageMusic.add(btnAddMusic);
		pnlManageMusic.add(scrollPane);
		
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
