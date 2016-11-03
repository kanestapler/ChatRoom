import java.awt.Button;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatWindow extends JFrame {
	
	private JPanel panel = new JPanel(new GridBagLayout());
	private GridBagConstraints gbc = new GridBagConstraints ();
	private JTextArea chatArea = new JTextArea();
	private final JLabel NAME_LABEL = new JLabel("Chat Handle Name:");
	private final JLabel CHAT_INPUT_LABEL = new JLabel("Message");
	private JTextField chatInputArea = new JTextField();
	private JTextField nameInputArea = new JTextField();
	private final JLabel CHAT_IP_LABEL = new JLabel("Chat Group IP");
	private JTextField chatIPInputArea = new JTextField();
	private final JLabel PORT_LABEL = new JLabel("Port");
	private JTextField portInputArea = new JTextField();
	private Button joinChat = new Button("Join Chat");
	private Button sendMessage = new Button("Send Message");
	private Button leaveChat = new Button("Leave Chat");
	private Button exit = new Button("Exit");
	
	
	public ChatWindow () {
		super("Chat Room");
		CreateWindowLayout();
		
		setSize(500,800);
		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void CreateWindowLayout() {
		//Adding ChatName label and input
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 3;
		//panel.add(button, gbc);
		
		
	}
	
	public void AddTextToWindow(String name, String message) {
		
	}
	
}
