package project1410;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JRadioButton;
import javax.swing.JEditorPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Component;
import javax.swing.border.LineBorder;

import java.util.List;

import java.awt.Color;
import javax.swing.JList;
import javax.swing.ButtonGroup;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JScrollPane;

/**
 * Class to create and initialize the GUI for the team project 
 * @author gleng
 *
 */
public class bookApp extends JFrame {

	// Fields for GUI Initialization 
	private static final long serialVersionUID = 8891393791341524143L;
	private JPanel masterPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	
	// Fields for GUI Operation
	//private List<InventoryItem> inventory_list = new ArrayList<InventoryItem>(); //--------TODO
	//private InventroyItem selectedItem;
	private Integer selectedItem; 
	//private Patron selectedPatron;
	private boolean item_name_search = false; 
	private boolean item_ID_search = false; 
	private boolean patron_name_search = false; 
	private boolean patron_ID_search = false; 
	private String searchTerms = "";
	 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bookApp frame = new bookApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Method to find and return the item based on the item name 
	 */
	private void itemNameFind(String name) {
		
	}
	
	/**
	 * Method to find and return the item based on the item ID  
	 */
	private void itemIDFind(String ID) {
		
	}
	
	/**
	 * Method to find and return the patron based on patron name 
	 */
	private void patronNameFind(String name) {
		
	}
	
	/** 
	 * Method to find and return the patron based on patron ID  
	 */
	private void patronIDFind(String ID) {
		
	}
	
	
	/**
	 * Create the frame.
	 */
	public bookApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1031, 706);
		masterPane = new JPanel();
		masterPane.setBackground(Color.GRAY);
		masterPane.setSize(new Dimension(800, 400));
		masterPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		masterPane.setLayout(new BorderLayout(0, 0));
		setContentPane(masterPane);
		
		JPanel master_bottom_panel = new JPanel();
		master_bottom_panel.setBackground(Color.LIGHT_GRAY);
		masterPane.add(master_bottom_panel, BorderLayout.SOUTH);
		master_bottom_panel.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel sys_message_panel = new JPanel();
		sys_message_panel.setOpaque(false);
		sys_message_panel.setBorder(new EmptyBorder(10, 10, 0, 10));
		master_bottom_panel.add(sys_message_panel);
		GridBagLayout gbl_sys_message_panel = new GridBagLayout();
		gbl_sys_message_panel.columnWidths = new int[] {200, 400, 30, 0, 0, 0, 0, 0, 0};
		gbl_sys_message_panel.rowHeights = new int[]{33, 0, 0};
		gbl_sys_message_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_sys_message_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		sys_message_panel.setLayout(gbl_sys_message_panel);
		
		JLabel lblSystemMessages = new JLabel("System Messages:");
		lblSystemMessages.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblSystemMessages = new GridBagConstraints();
		gbc_lblSystemMessages.anchor = GridBagConstraints.EAST;
		gbc_lblSystemMessages.insets = new Insets(0, 0, 5, 5);
		gbc_lblSystemMessages.gridx = 0;
		gbc_lblSystemMessages.gridy = 0;
		sys_message_panel.add(lblSystemMessages, gbc_lblSystemMessages);
		
		JTextPane txtpnSystemMessages = new JTextPane();
		txtpnSystemMessages.setFocusable(false);
		txtpnSystemMessages.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnSystemMessages.setText("System Messages Will Appear Here");
		GridBagConstraints gbc_txtpnSystemMessages = new GridBagConstraints();
		gbc_txtpnSystemMessages.gridwidth = 4;
		gbc_txtpnSystemMessages.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnSystemMessages.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtpnSystemMessages.gridx = 1;
		gbc_txtpnSystemMessages.gridy = 0;
		sys_message_panel.add(txtpnSystemMessages, gbc_txtpnSystemMessages);
		
		JButton btnClearAll = new JButton("Clear All ");
		btnClearAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Clear all fields here 
			}
		});
		btnClearAll.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_btnClearAll = new GridBagConstraints();
		gbc_btnClearAll.insets = new Insets(0, 0, 5, 5);
		gbc_btnClearAll.gridx = 6;
		gbc_btnClearAll.gridy = 0;
		sys_message_panel.add(btnClearAll, gbc_btnClearAll);
		
		JButton btn_save_changes = new JButton("Save Changes");
		btn_save_changes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Write all changes to file ----------------------TODO implement file write here. 
			}
		});
		btn_save_changes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_btn_save_changes = new GridBagConstraints();
		gbc_btn_save_changes.insets = new Insets(0, 0, 5, 5);
		gbc_btn_save_changes.gridx = 7;
		gbc_btn_save_changes.gridy = 0;
		sys_message_panel.add(btn_save_changes, gbc_btn_save_changes);
		
		JPanel checkoutin_panel = new JPanel();
		checkoutin_panel.setOpaque(false);
		checkoutin_panel.setBorder(new EmptyBorder(10, 10, 10, 0));
		master_bottom_panel.add(checkoutin_panel);
		GridBagLayout gbl_checkoutin_panel = new GridBagLayout();
		gbl_checkoutin_panel.columnWidths = new int[] {360, 360, 80};
		gbl_checkoutin_panel.rowHeights = new int[]{54, 0};
		gbl_checkoutin_panel.columnWeights = new double[]{0.0, 0.0, 0.0};
		gbl_checkoutin_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		checkoutin_panel.setLayout(gbl_checkoutin_panel);
		
		JPanel panel_selected_item = new JPanel();
		panel_selected_item.setOpaque(false);
		GridBagConstraints gbc_panel_selected_item = new GridBagConstraints();
		gbc_panel_selected_item.fill = GridBagConstraints.BOTH;
		gbc_panel_selected_item.insets = new Insets(0, 0, 0, 5);
		gbc_panel_selected_item.gridx = 0;
		gbc_panel_selected_item.gridy = 0;
		checkoutin_panel.add(panel_selected_item, gbc_panel_selected_item);
		GridBagLayout gbl_panel_selected_item = new GridBagLayout();
		gbl_panel_selected_item.columnWidths = new int[]{105, 145, 0};
		gbl_panel_selected_item.rowHeights = new int[]{26, 0};
		gbl_panel_selected_item.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_selected_item.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_selected_item.setLayout(gbl_panel_selected_item);
		
		JLabel lbl_selected_item = new JLabel("Selected Item:");
		GridBagConstraints gbc_lbl_selected_item = new GridBagConstraints();
		gbc_lbl_selected_item.anchor = GridBagConstraints.WEST;
		gbc_lbl_selected_item.insets = new Insets(0, 0, 0, 5);
		gbc_lbl_selected_item.gridx = 0;
		gbc_lbl_selected_item.gridy = 0;
		panel_selected_item.add(lbl_selected_item, gbc_lbl_selected_item);
		lbl_selected_item.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JTextPane txtpnSelectedItemHere = new JTextPane();
		txtpnSelectedItemHere.setFocusable(false);
		GridBagConstraints gbc_txtpnSelectedItemHere = new GridBagConstraints();
		gbc_txtpnSelectedItemHere.fill = GridBagConstraints.BOTH;
		gbc_txtpnSelectedItemHere.gridx = 1;
		gbc_txtpnSelectedItemHere.gridy = 0;
		panel_selected_item.add(txtpnSelectedItemHere, gbc_txtpnSelectedItemHere);
		txtpnSelectedItemHere.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnSelectedItemHere.setText("Selected Item Here");
		
		JPanel panel_selected_patron = new JPanel();
		panel_selected_patron.setOpaque(false);
		GridBagConstraints gbc_panel_selected_patron = new GridBagConstraints();
		gbc_panel_selected_patron.fill = GridBagConstraints.BOTH;
		gbc_panel_selected_patron.insets = new Insets(0, 0, 0, 5);
		gbc_panel_selected_patron.gridx = 1;
		gbc_panel_selected_patron.gridy = 0;
		checkoutin_panel.add(panel_selected_patron, gbc_panel_selected_patron);
		GridBagLayout gbl_panel_selected_patron = new GridBagLayout();
		gbl_panel_selected_patron.columnWidths = new int[]{118, 158, 0};
		gbl_panel_selected_patron.rowHeights = new int[]{26, 0};
		gbl_panel_selected_patron.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_selected_patron.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_selected_patron.setLayout(gbl_panel_selected_patron);
		
		JLabel lblNewLabel = new JLabel("Selected Patron:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel_selected_patron.add(lblNewLabel, gbc_lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JTextPane txtpnSelectPatronHere = new JTextPane();
		txtpnSelectPatronHere.setFocusable(false);
		GridBagConstraints gbc_txtpnSelectPatronHere = new GridBagConstraints();
		gbc_txtpnSelectPatronHere.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtpnSelectPatronHere.anchor = GridBagConstraints.NORTH;
		gbc_txtpnSelectPatronHere.gridx = 1;
		gbc_txtpnSelectPatronHere.gridy = 0;
		panel_selected_patron.add(txtpnSelectPatronHere, gbc_txtpnSelectPatronHere);
		txtpnSelectPatronHere.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnSelectPatronHere.setText("Selected Patron Here");
		
		JPanel panel_checkINOUT = new JPanel();
		panel_checkINOUT.setOpaque(false);
		GridBagConstraints gbc_panel_checkINOUT = new GridBagConstraints();
		gbc_panel_checkINOUT.fill = GridBagConstraints.BOTH;
		gbc_panel_checkINOUT.gridx = 2;
		gbc_panel_checkINOUT.gridy = 0;
		checkoutin_panel.add(panel_checkINOUT, gbc_panel_checkINOUT);
		
		JButton btnCheckINOUT = new JButton("Check IN/OUT");
		btnCheckINOUT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Check in or out the book here 
			}
		});
		panel_checkINOUT.add(btnCheckINOUT);
		btnCheckINOUT.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.WHITE);
		masterPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel item_search_panel = new JPanel();
		item_search_panel.setBackground(SystemColor.inactiveCaption);
		item_search_panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		tabbedPane.addTab("Item Search", null, item_search_panel, null);
		item_search_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel pnl_search_items = new JPanel();
		pnl_search_items.setBorder(new EmptyBorder(10, 10, 10, 10));
		item_search_panel.add(pnl_search_items, BorderLayout.WEST);
		GridBagLayout gbl_pnl_search_items = new GridBagLayout();
		gbl_pnl_search_items.columnWidths = new int[]{135, 0};
		gbl_pnl_search_items.rowHeights = new int[]{35, 35, 35, 0, 0, 87, 35, 0};
		gbl_pnl_search_items.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_pnl_search_items.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnl_search_items.setLayout(gbl_pnl_search_items);
		
		JRadioButton rdbtn_item_ID_search_selector = new JRadioButton("Item ID            ");
		rdbtn_item_ID_search_selector.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item_ID_search = true; 
				item_name_search= false; 
			}
		});
		buttonGroup.add(rdbtn_item_ID_search_selector);
		rdbtn_item_ID_search_selector.setMargin(new Insets(8, 8, 8, 8));
		rdbtn_item_ID_search_selector.setAlignmentX(Component.RIGHT_ALIGNMENT);
		GridBagConstraints gbc_rdbtn_item_ID_search_selector = new GridBagConstraints();
		gbc_rdbtn_item_ID_search_selector.anchor = GridBagConstraints.NORTH;
		gbc_rdbtn_item_ID_search_selector.fill = GridBagConstraints.HORIZONTAL;
		gbc_rdbtn_item_ID_search_selector.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtn_item_ID_search_selector.gridx = 0;
		gbc_rdbtn_item_ID_search_selector.gridy = 0;
		pnl_search_items.add(rdbtn_item_ID_search_selector, gbc_rdbtn_item_ID_search_selector);
		
		JRadioButton rdbtn_item_name_search_select = new JRadioButton("Item Description");
		rdbtn_item_name_search_select.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item_ID_search = false; 
				item_name_search= true; 
			}
		});
		buttonGroup.add(rdbtn_item_name_search_select);
		rdbtn_item_name_search_select.setMargin(new Insets(8, 8, 8, 8));
		rdbtn_item_name_search_select.setAlignmentX(Component.RIGHT_ALIGNMENT);
		rdbtn_item_name_search_select.setSize(new Dimension(20, 80));
		GridBagConstraints gbc_rdbtn_item_name_search_select = new GridBagConstraints();
		gbc_rdbtn_item_name_search_select.anchor = GridBagConstraints.NORTH;
		gbc_rdbtn_item_name_search_select.fill = GridBagConstraints.HORIZONTAL;
		gbc_rdbtn_item_name_search_select.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtn_item_name_search_select.gridx = 0;
		gbc_rdbtn_item_name_search_select.gridy = 1;
		pnl_search_items.add(rdbtn_item_name_search_select, gbc_rdbtn_item_name_search_select);
		
		JEditorPane pn_search_params_item = new JEditorPane();
		pn_search_params_item.setMargin(new Insets(0, 8, 0, 8));
		pn_search_params_item.setFont(new Font("Tahoma", Font.PLAIN, 18));
		pn_search_params_item.setPreferredSize(new Dimension(240, 40));
		pn_search_params_item.setAlignmentY(Component.TOP_ALIGNMENT);
		pn_search_params_item.setText("Enter Search Terms Here");
		GridBagConstraints gbc_pn_search_params_item = new GridBagConstraints();
		gbc_pn_search_params_item.anchor = GridBagConstraints.NORTH;
		gbc_pn_search_params_item.insets = new Insets(0, 0, 5, 0);
		gbc_pn_search_params_item.gridx = 0;
		gbc_pn_search_params_item.gridy = 2;
		pn_search_params_item.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				pn_search_params_item.setText("");
				txtpnSystemMessages.setText("Please enter your search terms");
				
			}
		});
		pnl_search_items.add(pn_search_params_item, gbc_pn_search_params_item);
		
		JButton btn_search_button = new JButton("Search");
		btn_search_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		//---------------TODO implement search functionality for items 
				// Determine if search is for ID or name 
				
				// Get the data from search box here 
				searchTerms = pn_search_params_item.getText(); 
				
				// Call the search function here, should return an object of class Inventory Item
				
				// Display the inventory items on the gui or present a message that says item not found
				
			}
		});
		btn_search_button.setPreferredSize(new Dimension(150, 30));
		btn_search_button.setMinimumSize(new Dimension(0, 0));
		btn_search_button.setMaximumSize(new Dimension(200, 200));
		btn_search_button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_search_button.setMargin(new Insets(2, 8, 8, 8));
		btn_search_button.setBorder(new EmptyBorder(0, 5, 5, 0));
		btn_search_button.setAlignmentX(0.7f);
		GridBagConstraints gbc_btn_search_button = new GridBagConstraints();
		gbc_btn_search_button.insets = new Insets(0, 0, 5, 0);
		gbc_btn_search_button.anchor = GridBagConstraints.NORTH;
		gbc_btn_search_button.gridx = 0;
		gbc_btn_search_button.gridy = 3;
		pnl_search_items.add(btn_search_button, gbc_btn_search_button);
		
		JLabel lblNewLabel_1 = new JLabel("Results");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 4;
		pnl_search_items.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.anchor = GridBagConstraints.NORTH;
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 5;
		pnl_search_items.add(scrollPane_1, gbc_scrollPane_1);
		
		JList list_1 = new JList();
		scrollPane_1.setViewportView(list_1);
		
		JPanel pnl_results_item = new JPanel();
		item_search_panel.add(pnl_results_item, BorderLayout.CENTER);
		GridBagLayout gbl_pnl_results_item = new GridBagLayout();
		gbl_pnl_results_item.columnWidths = new int[]{250, 400, 0};
		gbl_pnl_results_item.rowHeights = new int[]{80, 80, 80, 80, 0};
		gbl_pnl_results_item.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_pnl_results_item.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnl_results_item.setLayout(gbl_pnl_results_item);
		
		JLabel lbltemName = new JLabel("Item Name:");
		GridBagConstraints gbc_lbltemName = new GridBagConstraints();
		gbc_lbltemName.anchor = GridBagConstraints.EAST;
		gbc_lbltemName.fill = GridBagConstraints.VERTICAL;
		gbc_lbltemName.insets = new Insets(0, 0, 5, 5);
		gbc_lbltemName.gridx = 0;
		gbc_lbltemName.gridy = 0;
		pnl_results_item.add(lbltemName, gbc_lbltemName);
		
		JTextPane txtpnItemNameShown = new JTextPane();
		txtpnItemNameShown.setFocusable(false);
		txtpnItemNameShown.setText("Item Name Shown Here");
		GridBagConstraints gbc_txtpnItemNameShown = new GridBagConstraints();
		gbc_txtpnItemNameShown.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtpnItemNameShown.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnItemNameShown.gridx = 1;
		gbc_txtpnItemNameShown.gridy = 0;
		pnl_results_item.add(txtpnItemNameShown, gbc_txtpnItemNameShown);
		
		JLabel lblTypeOfMedia = new JLabel("Type of Media:");
		GridBagConstraints gbc_lblTypeOfMedia = new GridBagConstraints();
		gbc_lblTypeOfMedia.anchor = GridBagConstraints.EAST;
		gbc_lblTypeOfMedia.fill = GridBagConstraints.VERTICAL;
		gbc_lblTypeOfMedia.insets = new Insets(0, 0, 5, 5);
		gbc_lblTypeOfMedia.gridx = 0;
		gbc_lblTypeOfMedia.gridy = 1;
		pnl_results_item.add(lblTypeOfMedia, gbc_lblTypeOfMedia);
		
		JTextPane txtpnTypeOfMedia = new JTextPane();
		txtpnTypeOfMedia.setFocusable(false);
		txtpnTypeOfMedia.setText("Type of Media Shown Here");
		GridBagConstraints gbc_txtpnTypeOfMedia = new GridBagConstraints();
		gbc_txtpnTypeOfMedia.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtpnTypeOfMedia.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnTypeOfMedia.gridx = 1;
		gbc_txtpnTypeOfMedia.gridy = 1;
		pnl_results_item.add(txtpnTypeOfMedia, gbc_txtpnTypeOfMedia);
		
		JLabel lblSource = new JLabel("Source:");
		GridBagConstraints gbc_lblSource = new GridBagConstraints();
		gbc_lblSource.anchor = GridBagConstraints.EAST;
		gbc_lblSource.fill = GridBagConstraints.VERTICAL;
		gbc_lblSource.insets = new Insets(0, 0, 5, 5);
		gbc_lblSource.gridx = 0;
		gbc_lblSource.gridy = 2;
		pnl_results_item.add(lblSource, gbc_lblSource);
		
		JTextPane txtpnSourceOfMedia = new JTextPane();
		txtpnSourceOfMedia.setFocusable(false);
		txtpnSourceOfMedia.setText("Source of Media Shown Here");
		GridBagConstraints gbc_txtpnSourceOfMedia = new GridBagConstraints();
		gbc_txtpnSourceOfMedia.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtpnSourceOfMedia.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnSourceOfMedia.gridx = 1;
		gbc_txtpnSourceOfMedia.gridy = 2;
		pnl_results_item.add(txtpnSourceOfMedia, gbc_txtpnSourceOfMedia);
		
		JLabel lblItemId = new JLabel("Item ID:");
		GridBagConstraints gbc_lblItemId = new GridBagConstraints();
		gbc_lblItemId.anchor = GridBagConstraints.EAST;
		gbc_lblItemId.fill = GridBagConstraints.VERTICAL;
		gbc_lblItemId.insets = new Insets(0, 0, 0, 5);
		gbc_lblItemId.gridx = 0;
		gbc_lblItemId.gridy = 3;
		pnl_results_item.add(lblItemId, gbc_lblItemId);
		
		JTextPane txtpnIDofMedia = new JTextPane();
		txtpnIDofMedia.setFocusable(false);
		txtpnIDofMedia.setText("ID of Media Shown Here");
		txtpnIDofMedia.setToolTipText("");
		GridBagConstraints gbc_txtpnIDofMedia = new GridBagConstraints();
		gbc_txtpnIDofMedia.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtpnIDofMedia.gridx = 1;
		gbc_txtpnIDofMedia.gridy = 3;
		pnl_results_item.add(txtpnIDofMedia, gbc_txtpnIDofMedia);
		
		JPanel patron_search_panel = new JPanel();
		patron_search_panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		tabbedPane.addTab("Patron Search", null, patron_search_panel, null);
		patron_search_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel search_panel_for_patron_tab = new JPanel();
		search_panel_for_patron_tab.setBorder(new EmptyBorder(10, 10, 10, 10));
		patron_search_panel.add(search_panel_for_patron_tab, BorderLayout.WEST);
		GridBagLayout gbl_search_panel_for_patron_tab = new GridBagLayout();
		gbl_search_panel_for_patron_tab.columnWidths = new int[] {135, 0};
		gbl_search_panel_for_patron_tab.rowHeights = new int[]{35, 35, 35, 0, 0, 87, 35, 0};
		gbl_search_panel_for_patron_tab.columnWeights = new double[]{0.0};
		gbl_search_panel_for_patron_tab.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		search_panel_for_patron_tab.setLayout(gbl_search_panel_for_patron_tab);
		
		JRadioButton radioButton = new JRadioButton("Patron ID            ");
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				patron_ID_search = true; 
				patron_name_search = false; 
			}
		});
		buttonGroup_1.add(radioButton);
		radioButton.setMargin(new Insets(8, 8, 8, 8));
		radioButton.setAlignmentX(1.0f);
		GridBagConstraints gbc_radioButton = new GridBagConstraints();
		gbc_radioButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_radioButton.anchor = GridBagConstraints.NORTH;
		gbc_radioButton.insets = new Insets(0, 0, 5, 5);
		gbc_radioButton.gridx = 0;
		gbc_radioButton.gridy = 0;
		search_panel_for_patron_tab.add(radioButton, gbc_radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Patron Name");
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				patron_ID_search = false; 
				patron_name_search = true; 
			}
		});
		buttonGroup_1.add(radioButton_1);
		radioButton_1.setSize(new Dimension(20, 80));
		radioButton_1.setMargin(new Insets(8, 8, 8, 8));
		radioButton_1.setAlignmentX(1.0f);
		GridBagConstraints gbc_radioButton_1 = new GridBagConstraints();
		gbc_radioButton_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_radioButton_1.anchor = GridBagConstraints.NORTH;
		gbc_radioButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_radioButton_1.gridx = 0;
		gbc_radioButton_1.gridy = 1;
		search_panel_for_patron_tab.add(radioButton_1, gbc_radioButton_1);
		
		JEditorPane pn_search_params_patron = new JEditorPane();
		
		pn_search_params_patron.setText("Enter Search Terms Here");
		pn_search_params_patron.setPreferredSize(new Dimension(240, 40));
		pn_search_params_patron.setMargin(new Insets(0, 8, 0, 8));
		pn_search_params_patron.setFont(new Font("Tahoma", Font.PLAIN, 18));
		pn_search_params_patron.setAlignmentY(0.0f);
		GridBagConstraints gbc_pn_search_params_patron = new GridBagConstraints();
		gbc_pn_search_params_patron.anchor = GridBagConstraints.NORTH;
		gbc_pn_search_params_patron.insets = new Insets(0, 0, 5, 5);
		gbc_pn_search_params_patron.gridx = 0;
		gbc_pn_search_params_patron.gridy = 2;
		pn_search_params_patron.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				pn_search_params_patron.setText(""); 
			}
		});
		search_panel_for_patron_tab.add(pn_search_params_patron, gbc_pn_search_params_patron);
		
		JButton button = new JButton("Search");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	//-------- TODO implement patron search functionality here
				// Determine if search is for ID or patron name
				
				// Get search params from box here 
				
				// Call search function here 
				
				// Display search results on the GUI here 
			}
		});
		button.setPreferredSize(new Dimension(150, 30));
		button.setMinimumSize(new Dimension(0, 0));
		button.setMaximumSize(new Dimension(200, 200));
		button.setMargin(new Insets(2, 8, 8, 8));
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button.setBorder(new EmptyBorder(0, 5, 5, 0));
		button.setAlignmentX(0.7f);
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.anchor = GridBagConstraints.NORTH;
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 0;
		gbc_button.gridy = 3;
		search_panel_for_patron_tab.add(button, gbc_button);
		
		JLabel lblResults = new JLabel("Results");
		GridBagConstraints gbc_lblResults = new GridBagConstraints();
		gbc_lblResults.insets = new Insets(0, 0, 5, 5);
		gbc_lblResults.gridx = 0;
		gbc_lblResults.gridy = 4;
		search_panel_for_patron_tab.add(lblResults, gbc_lblResults);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 5;
		search_panel_for_patron_tab.add(scrollPane, gbc_scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JPanel pnl_results_patron = new JPanel();
		patron_search_panel.add(pnl_results_patron, BorderLayout.CENTER);
		GridBagLayout gbl_pnl_results_patron = new GridBagLayout();
		gbl_pnl_results_patron.columnWidths = new int[]{250, 400, 0};
		gbl_pnl_results_patron.rowHeights = new int[]{80, 80, 80, 80, 0};
		gbl_pnl_results_patron.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_pnl_results_patron.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		pnl_results_patron.setLayout(gbl_pnl_results_patron);
		
		JLabel label = new JLabel("Patron Name:");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.fill = GridBagConstraints.VERTICAL;
		gbc_label.anchor = GridBagConstraints.EAST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		pnl_results_patron.add(label, gbc_label);
		
		JTextPane txtpnPatronNameShown = new JTextPane();
		txtpnPatronNameShown.setFocusable(false);
		txtpnPatronNameShown.setText("Patron Name Shown Here");
		GridBagConstraints gbc_txtpnPatronNameShown = new GridBagConstraints();
		gbc_txtpnPatronNameShown.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtpnPatronNameShown.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnPatronNameShown.gridx = 1;
		gbc_txtpnPatronNameShown.gridy = 0;
		pnl_results_patron.add(txtpnPatronNameShown, gbc_txtpnPatronNameShown);
		
		JLabel label_1 = new JLabel("Patron ID: ");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.fill = GridBagConstraints.VERTICAL;
		gbc_label_1.anchor = GridBagConstraints.EAST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 1;
		pnl_results_patron.add(label_1, gbc_label_1);
		
		JTextPane txtpnPatronIdShown = new JTextPane();
		txtpnPatronIdShown.setFocusable(false);
		txtpnPatronIdShown.setText("Patron ID Shown Here");
		GridBagConstraints gbc_txtpnPatronIdShown = new GridBagConstraints();
		gbc_txtpnPatronIdShown.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtpnPatronIdShown.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnPatronIdShown.gridx = 1;
		gbc_txtpnPatronIdShown.gridy = 1;
		pnl_results_patron.add(txtpnPatronIdShown, gbc_txtpnPatronIdShown);
		
		JLabel label_2 = new JLabel("Items On Loan: ");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.fill = GridBagConstraints.VERTICAL;
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 0;
		gbc_label_2.gridy = 2;
		pnl_results_patron.add(label_2, gbc_label_2);
		
		// Test list
				List<Integer> testList = new ArrayList<Integer>();
				for (int i=1; i<=15; i++)
					testList.add(i); 
		
		JScrollPane items_on_loan_scrollPane = new JScrollPane();
		GridBagConstraints gbc_items_on_loan_scrollPane = new GridBagConstraints();
		gbc_items_on_loan_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_items_on_loan_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_items_on_loan_scrollPane.gridx = 1;
		gbc_items_on_loan_scrollPane.gridy = 2;
		pnl_results_patron.add(items_on_loan_scrollPane, gbc_items_on_loan_scrollPane);
		
		
		JList list_items_on_loan = new JList(testList.toArray());
		items_on_loan_scrollPane.setViewportView(list_items_on_loan);
		list_items_on_loan.setVisibleRowCount(4);
		list_items_on_loan.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				// Get the selected item
				selectedItem = (Integer) list_items_on_loan.getSelectedValue();
				
				// Get the current size of the text pane 
				//Dimension dim = txtpnSelectedItemHere.getSize();
				//System.out.print(dim.toString());
				// Display the selected item in the selected bar
				txtpnSelectedItemHere.setText(selectedItem.toString());
				//set the dimension back to what it should be 
				//txtpnSelectedItemHere.setSize(dim);
				//txtpnSystemMessages.setText();// test of object selection capabilities
				
				
			}
		});
		list_items_on_loan.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JLabel lblTitleLabel = new JLabel("Library Recorder App");
		lblTitleLabel.setOpaque(true);
		lblTitleLabel.setBackground(Color.LIGHT_GRAY);
		lblTitleLabel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitleLabel.setFont(new Font("SWScrps", Font.ITALIC, 24));
		masterPane.add(lblTitleLabel, BorderLayout.NORTH);
	}

}

