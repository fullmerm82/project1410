package project1410;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class bookApp extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel control_Pane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField textfield_user_search;
	private JTextField sys_messages_textfield;

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
		setSize(new Dimension(1280, 1024));
		setPreferredSize(new Dimension(1000, 800));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		control_Pane = new JPanel();
		control_Pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(control_Pane);
		control_Pane.setLayout(null);
		
		JPanel control_panel = new JPanel();
		control_panel.setBounds(5, 76, 314, 605);
		control_Pane.add(control_panel);
		GridBagLayout gbl_control_panel = new GridBagLayout();
		gbl_control_panel.columnWidths = new int[]{177, 0};
		gbl_control_panel.rowHeights = new int[]{225, 225, 225, 0};
		gbl_control_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_control_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		control_panel.setLayout(gbl_control_panel);
		
		JPanel button_Panel = new JPanel();
		GridBagConstraints gbc_button_Panel = new GridBagConstraints();
		gbc_button_Panel.fill = GridBagConstraints.BOTH;
		gbc_button_Panel.insets = new Insets(0, 0, 5, 0);
		gbc_button_Panel.gridx = 0;
		gbc_button_Panel.gridy = 0;
		control_panel.add(button_Panel, gbc_button_Panel);
		button_Panel.setLayout(null);
		
		JRadioButton btn_ID_Select = new JRadioButton("ID");
		btn_ID_Select.setBounds(43, 0, 85, 35);
		buttonGroup.add(btn_ID_Select);
		button_Panel.add(btn_ID_Select);
		
		JRadioButton btn_Item_Select = new JRadioButton("Item");
		btn_Item_Select.setBounds(163, 0, 98, 35);
		buttonGroup.add(btn_Item_Select);
		button_Panel.add(btn_Item_Select);
		
		JRadioButton btn_Name_Select = new JRadioButton("Name");
		btn_Name_Select.setBounds(43, 37, 85, 29);
		buttonGroup_1.add(btn_Name_Select);
		button_Panel.add(btn_Name_Select);
		
		JRadioButton btn_Patron_Select = new JRadioButton("Patron");
		btn_Patron_Select.setBounds(163, 34, 98, 35);
		buttonGroup_1.add(btn_Patron_Select);
		button_Panel.add(btn_Patron_Select);
		
		textfield_user_search = new JTextField();
		textfield_user_search.setBounds(21, 84, 272, 35);
		button_Panel.add(textfield_user_search);
		textfield_user_search.setColumns(10);
		
		JButton btn_search = new JButton("Click to search");
		btn_search.setBounds(44, 138, 196, 35);
		button_Panel.add(btn_search);
		
		JPanel search_panel = new JPanel();
		GridBagConstraints gbc_search_panel = new GridBagConstraints();
		gbc_search_panel.gridheight = 2;
		gbc_search_panel.fill = GridBagConstraints.BOTH;
		gbc_search_panel.insets = new Insets(0, 0, 5, 0);
		gbc_search_panel.gridx = 0;
		gbc_search_panel.gridy = 1;
		control_panel.add(search_panel, gbc_search_panel);
		search_panel.setLayout(null);
		
		sys_messages_textfield = new JTextField();
		sys_messages_textfield.setBounds(21, 0, 272, 40);
		search_panel.add(sys_messages_textfield);
		sys_messages_textfield.setColumns(10);
		
		JButton btn_clear_all = new JButton("Clear All Fields");
		btn_clear_all.setBounds(51, 51, 189, 40);
		search_panel.add(btn_clear_all);
		
		JLabel lbl_project_title = new JLabel("Library Recorder Application");
		lbl_project_title.setBounds(5, 5, 976, 33);
		lbl_project_title.setOpaque(true);
		lbl_project_title.setFont(new Font("TI-Nspire", Font.PLAIN, 26));
		lbl_project_title.setHorizontalAlignment(SwingConstants.CENTER);
		control_Pane.add(lbl_project_title);
		
		JPanel data_display_panel = new JPanel();
		data_display_panel.setBounds(340, 74, 641, 559);
		control_Pane.add(data_display_panel);
		data_display_panel.setLayout(null);
		
		JLabel lblItemName = new JLabel("Item Name");
		lblItemName.setBounds(21, 22, 140, 37);
		data_display_panel.add(lblItemName);
		
		JTextPane txtpnItemNameShown = new JTextPane();
		txtpnItemNameShown.setBounds(182, 22, 248, 37);
		txtpnItemNameShown.setText("Item Name Shown Here");
		data_display_panel.add(txtpnItemNameShown);
		
		JLabel lblTypeOfMedia = new JLabel("Type of Media");
		lblTypeOfMedia.setBounds(21, 81, 140, 37);
		data_display_panel.add(lblTypeOfMedia);
		
		JTextPane txtpnItemTypeShown = new JTextPane();
		txtpnItemTypeShown.setBounds(182, 81, 248, 37);
		txtpnItemTypeShown.setText("Item Type Shown Here");
		data_display_panel.add(txtpnItemTypeShown);
		
		JLabel lbl_source = new JLabel("Source");
		lbl_source.setBounds(21, 150, 117, 27);
		data_display_panel.add(lbl_source);
		
		JTextPane txtpnSourceShownHere = new JTextPane();
		txtpnSourceShownHere.setBounds(182, 140, 248, 37);
		txtpnSourceShownHere.setText("Source shown here");
		data_display_panel.add(txtpnSourceShownHere);
		
		JLabel lblItemId = new JLabel("Item ID");
		lblItemId.setBounds(21, 199, 167, 37);
		data_display_panel.add(lblItemId);
		
		JTextPane txtpnItemIdShown = new JTextPane();
		txtpnItemIdShown.setBounds(182, 199, 248, 37);
		txtpnItemIdShown.setText("Item ID Shown Here");
		data_display_panel.add(txtpnItemIdShown);
		
		JPanel check_out_panel = new JPanel();
		check_out_panel.setBounds(5, 689, 976, 69);
		control_Pane.add(check_out_panel);
		check_out_panel.setLayout(null);
		
		JEditorPane patron_name_text = new JEditorPane();
		patron_name_text.setBounds(355, 6, 183, 33);
		check_out_panel.add(patron_name_text);
		
		JEditorPane item_ID_text = new JEditorPane();
		item_ID_text.setBounds(585, 6, 148, 33);
		check_out_panel.add(item_ID_text);
		
		JButton btn_check_out = new JButton("Check Out/In");
		btn_check_out.setBounds(790, 6, 165, 35);
		check_out_panel.add(btn_check_out);
	}

}
