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
import java.awt.Color;
import javax.swing.JList;
import javax.swing.ButtonGroup;
import java.awt.SystemColor;

public class bookApp extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8891393791341524143L;
	private JPanel masterPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

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
	 * Create the frame.
	 */
	public bookApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		masterPane = new JPanel();
		masterPane.setBackground(Color.GRAY);
		masterPane.setSize(new Dimension(800, 400));
		masterPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		masterPane.setLayout(new BorderLayout(0, 0));
		setContentPane(masterPane);
		
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
		gbl_pnl_search_items.rowHeights = new int[]{35, 35, 35, 0, 87, 35, 0};
		gbl_pnl_search_items.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_pnl_search_items.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnl_search_items.setLayout(gbl_pnl_search_items);
		
		JRadioButton rdbtn_item_ID_search_selector = new JRadioButton("Item ID            ");
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
		
		JEditorPane pn_search_params = new JEditorPane();
		pn_search_params.setMargin(new Insets(0, 8, 0, 8));
		pn_search_params.setFont(new Font("Tahoma", Font.PLAIN, 18));
		pn_search_params.setPreferredSize(new Dimension(240, 40));
		pn_search_params.setAlignmentY(Component.TOP_ALIGNMENT);
		pn_search_params.setText("Enter Search Terms Here");
		GridBagConstraints gbc_pn_search_params = new GridBagConstraints();
		gbc_pn_search_params.anchor = GridBagConstraints.NORTH;
		gbc_pn_search_params.insets = new Insets(0, 0, 5, 0);
		gbc_pn_search_params.gridx = 0;
		gbc_pn_search_params.gridy = 2;
		pnl_search_items.add(pn_search_params, gbc_pn_search_params);
		
		JButton btn_search_button = new JButton("Search");
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
		gbl_search_panel_for_patron_tab.rowHeights = new int[]{35, 35, 35, 0, 87, 35, 0};
		gbl_search_panel_for_patron_tab.columnWeights = new double[]{0.0};
		gbl_search_panel_for_patron_tab.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		search_panel_for_patron_tab.setLayout(gbl_search_panel_for_patron_tab);
		
		JRadioButton radioButton = new JRadioButton("Patron ID            ");
		buttonGroup_1.add(radioButton);
		radioButton.setMargin(new Insets(8, 8, 8, 8));
		radioButton.setAlignmentX(1.0f);
		GridBagConstraints gbc_radioButton = new GridBagConstraints();
		gbc_radioButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_radioButton.anchor = GridBagConstraints.NORTH;
		gbc_radioButton.insets = new Insets(0, 0, 5, 0);
		gbc_radioButton.gridx = 0;
		gbc_radioButton.gridy = 0;
		search_panel_for_patron_tab.add(radioButton, gbc_radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Patron Name");
		buttonGroup_1.add(radioButton_1);
		radioButton_1.setSize(new Dimension(20, 80));
		radioButton_1.setMargin(new Insets(8, 8, 8, 8));
		radioButton_1.setAlignmentX(1.0f);
		GridBagConstraints gbc_radioButton_1 = new GridBagConstraints();
		gbc_radioButton_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_radioButton_1.anchor = GridBagConstraints.NORTH;
		gbc_radioButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_radioButton_1.gridx = 0;
		gbc_radioButton_1.gridy = 1;
		search_panel_for_patron_tab.add(radioButton_1, gbc_radioButton_1);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setText("Enter Search Terms Here");
		editorPane.setPreferredSize(new Dimension(240, 40));
		editorPane.setMargin(new Insets(0, 8, 0, 8));
		editorPane.setFont(new Font("Tahoma", Font.PLAIN, 18));
		editorPane.setAlignmentY(0.0f);
		GridBagConstraints gbc_editorPane = new GridBagConstraints();
		gbc_editorPane.anchor = GridBagConstraints.NORTH;
		gbc_editorPane.insets = new Insets(0, 0, 5, 0);
		gbc_editorPane.gridx = 0;
		gbc_editorPane.gridy = 2;
		search_panel_for_patron_tab.add(editorPane, gbc_editorPane);
		
		JButton button = new JButton("Search");
		button.setPreferredSize(new Dimension(150, 30));
		button.setMinimumSize(new Dimension(0, 0));
		button.setMaximumSize(new Dimension(200, 200));
		button.setMargin(new Insets(2, 8, 8, 8));
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button.setBorder(new EmptyBorder(0, 5, 5, 0));
		button.setAlignmentX(0.7f);
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.anchor = GridBagConstraints.NORTH;
		gbc_button.insets = new Insets(0, 0, 5, 0);
		gbc_button.gridx = 0;
		gbc_button.gridy = 3;
		search_panel_for_patron_tab.add(button, gbc_button);
		
		JPanel pnl_results_patron = new JPanel();
		patron_search_panel.add(pnl_results_patron, BorderLayout.CENTER);
		GridBagLayout gbl_pnl_results_patron = new GridBagLayout();
		gbl_pnl_results_patron.columnWidths = new int[]{250, 400, 0};
		gbl_pnl_results_patron.rowHeights = new int[]{80, 80, 80, 80, 0};
		gbl_pnl_results_patron.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_pnl_results_patron.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
		
		JList list = new JList();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.insets = new Insets(0, 0, 5, 0);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 1;
		gbc_list.gridy = 2;
		pnl_results_patron.add(list, gbc_list);
		
		JLabel lblTitleLabel = new JLabel("Library Recorder App");
		lblTitleLabel.setOpaque(true);
		lblTitleLabel.setBackground(Color.LIGHT_GRAY);
		lblTitleLabel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitleLabel.setFont(new Font("SWScrps", Font.ITALIC, 24));
		masterPane.add(lblTitleLabel, BorderLayout.NORTH);
		
		JPanel master_bottom_panel = new JPanel();
		master_bottom_panel.setBackground(Color.LIGHT_GRAY);
		masterPane.add(master_bottom_panel, BorderLayout.SOUTH);
		master_bottom_panel.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel sys_message_panel = new JPanel();
		sys_message_panel.setOpaque(false);
		sys_message_panel.setBorder(new EmptyBorder(10, 10, 0, 10));
		master_bottom_panel.add(sys_message_panel);
		GridBagLayout gbl_sys_message_panel = new GridBagLayout();
		gbl_sys_message_panel.columnWidths = new int[] {200, 400, 30};
		gbl_sys_message_panel.rowHeights = new int[]{33, 0};
		gbl_sys_message_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_sys_message_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		sys_message_panel.setLayout(gbl_sys_message_panel);
		
		JLabel lblSystemMessages = new JLabel("System Messages:");
		lblSystemMessages.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblSystemMessages = new GridBagConstraints();
		gbc_lblSystemMessages.anchor = GridBagConstraints.EAST;
		gbc_lblSystemMessages.insets = new Insets(0, 0, 0, 5);
		gbc_lblSystemMessages.gridx = 0;
		gbc_lblSystemMessages.gridy = 0;
		sys_message_panel.add(lblSystemMessages, gbc_lblSystemMessages);
		
		JTextPane txtpnSystemMessagesWill = new JTextPane();
		txtpnSystemMessagesWill.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnSystemMessagesWill.setText("System Messages Will Appear Here");
		GridBagConstraints gbc_txtpnSystemMessagesWill = new GridBagConstraints();
		gbc_txtpnSystemMessagesWill.gridwidth = 5;
		gbc_txtpnSystemMessagesWill.insets = new Insets(0, 0, 0, 5);
		gbc_txtpnSystemMessagesWill.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtpnSystemMessagesWill.gridx = 1;
		gbc_txtpnSystemMessagesWill.gridy = 0;
		sys_message_panel.add(txtpnSystemMessagesWill, gbc_txtpnSystemMessagesWill);
		
		JButton btnClearAll = new JButton("Clear All ");
		btnClearAll.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_btnClearAll = new GridBagConstraints();
		gbc_btnClearAll.gridx = 7;
		gbc_btnClearAll.gridy = 0;
		sys_message_panel.add(btnClearAll, gbc_btnClearAll);
		
		JPanel checkoutin_panel = new JPanel();
		checkoutin_panel.setOpaque(false);
		checkoutin_panel.setBorder(new EmptyBorder(10, 10, 10, 0));
		master_bottom_panel.add(checkoutin_panel);
		checkoutin_panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_selected_item = new JPanel();
		panel_selected_item.setOpaque(false);
		checkoutin_panel.add(panel_selected_item);
		
		JLabel lbl_selected_item = new JLabel("Selected Item:");
		panel_selected_item.add(lbl_selected_item);
		lbl_selected_item.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JTextPane txtpnSelectedItemHere = new JTextPane();
		panel_selected_item.add(txtpnSelectedItemHere);
		txtpnSelectedItemHere.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnSelectedItemHere.setText("Selected Item Here");
		
		JPanel panel_selected_patron = new JPanel();
		panel_selected_patron.setOpaque(false);
		checkoutin_panel.add(panel_selected_patron);
		
		JLabel lblNewLabel = new JLabel("Selected Patron:");
		panel_selected_patron.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JTextPane txtpnSelectPatronHere = new JTextPane();
		panel_selected_patron.add(txtpnSelectPatronHere);
		txtpnSelectPatronHere.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnSelectPatronHere.setText("Selected Patron Here");
		
		JPanel panel_checkINOUT = new JPanel();
		panel_checkINOUT.setOpaque(false);
		checkoutin_panel.add(panel_checkINOUT);
		
		JButton btnCheckINOUT = new JButton("Check IN/OUT");
		panel_checkINOUT.add(btnCheckINOUT);
		btnCheckINOUT.setFont(new Font("Tahoma", Font.PLAIN, 16));
	}

}

