package midterm2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class pass {

	private JFrame frame;
	private JPasswordField passwordField;
	private JLabel lbl1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pass window = new pass();
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
	public pass() {
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
		//couldnt download the bugaboo example so i dont know what help does so i didnt include it
		passwordField = new JPasswordField(10);
		passwordField.setBounds(151, 121, 86, 20);
		panel.add(passwordField);
		
		JButton but1 = new JButton("OK");
		but1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				if (passwordField.getText() == "bugaboo"){
					lbl1.setText("winner");
				}
			}
		});
		but1.setBounds(253, 120, 89, 23);
		panel.add(but1);
		
		lbl1 = new JLabel("");
		lbl1.setBounds(218, 173, 46, 14);
		panel.add(lbl1);
		
		
	}
}
