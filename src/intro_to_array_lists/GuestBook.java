package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuestBook implements ActionListener{
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame;
	JPanel panel;
	JButton add;
	JButton view;
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		GuestBook gb = new GuestBook();
	}
	GuestBook(){
		frame = new JFrame();
		panel = new JPanel();
		add = new JButton();
		view = new JButton();
		frame.add(panel);
		panel.add(add);
		panel.add(view);
		add.setText("Add Name");
		view.setText("View Names");
		add.addActionListener(this);
		view.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
