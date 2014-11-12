

package midterm2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.event.ComponentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class combodate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					combodate window = new combodate();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public combodate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lbl1 = new JLabel("Month");
		lbl1.setBounds(84, 64, 46, 14);
		panel.add(lbl1);
		
		JLabel lbl2 = new JLabel("Day");
		lbl2.setBounds(84, 100, 46, 14);
		panel.add(lbl2);
		
		JLabel lbl3 = new JLabel("Year");
		lbl3.setBounds(84, 138, 46, 14);
		panel.add(lbl3);
		
		JComboBox cb1 = new JComboBox();
		cb1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent cb2) {
				if (cb1.getSelectedIndex() == 1){
					cb2.removeItem("31");
					cb2.removeItem("30");
					cb2.removeItem("29");
				}
				if (cb1.getSelectedIndex() == 3 || cb1.getSelectedIndex() == 5 || cb1.getSelectedIndex() == 8 || cb1.getSelectedIndex() == 10){
					cb2.removeItem("31");
			}
		});
		cb1.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		cb1.setSelectedIndex(10);
		cb1.setToolTipText("");
		cb1.setBounds(229, 61, 122, 20);
		panel.add(cb1);
		
		
		
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		cb2.setSelectedIndex(10);
		cb2.setBounds(229, 97, 122, 20);
		panel.add(cb2);
		
			
			
		
		
		
		
		JComboBox cb3 = new JComboBox();
		cb3.setModel(new DefaultComboBoxModel(new String[] {"2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019"}));
		cb3.setSelectedIndex(5);
		cb3.setBounds(229, 135, 122, 20);
		panel.add(cb3);
	}
}
