import java.awt.BorderLayout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//import javax.swing.JLabel;
//import com.jgoodies.forms.factories.DefaultComponentFactory;
//import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;


public class StartScreen extends JDialog {



	private JTextField txtPressStartTo;
	
	//Method to create start screen for user that can be disposed of when user presses start or cancel
	public StartScreen() {
		//Set Color and set bounds of start screen
		setAlwaysOnTop(true);
		getContentPane().setBackground(Color.RED);
		getContentPane().setForeground(Color.RED);
		setBackground(Color.RED);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.RED);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Start");
				//Close Start Screen when user presses start.
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose(); 
				        setVisible(false);
				        
					}
				});
				okButton.setActionCommand("Ok");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				//End Game when user presses Cancel
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						System.exit(0);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		{
			//Construct Start Screen
			txtPressStartTo = new JTextField();
			txtPressStartTo.setForeground(Color.BLACK);
			txtPressStartTo.setFont(new Font("Purisa", Font.PLAIN, 37));
			txtPressStartTo.setBackground(new Color(255, 0, 0));
			txtPressStartTo.setText("Press Start To Begin");
			getContentPane().add(txtPressStartTo, BorderLayout.CENTER);
			txtPressStartTo.setColumns(10);
		}
		{

		}
	}
}
