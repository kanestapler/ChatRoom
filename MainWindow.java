import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;

public class MainWindow {

	private JFrame frmMulticastChatRoom;
	private JTextField nameTextField;
	private JTextField messageTextField;
	private JTextField chatGroupIDTextField;
	private JTextField portTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmMulticastChatRoom.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMulticastChatRoom = new JFrame();
		frmMulticastChatRoom.setTitle("Multicast Chat Room");
		frmMulticastChatRoom.setResizable(false);
		frmMulticastChatRoom.setBounds(100, 100, 550, 550);
		frmMulticastChatRoom.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMulticastChatRoom.getContentPane().setLayout(null);
		
		JPanel namePanel = new JPanel();
		namePanel.setBounds(146, 0, 398, 30);
		frmMulticastChatRoom.getContentPane().add(namePanel);
		namePanel.setLayout(null);
		
		JLabel lblChatHandleName = new JLabel("Chat Handle Name:");
		lblChatHandleName.setBounds(190, 8, 99, 14);
		namePanel.add(lblChatHandleName);
		
		nameTextField = new JTextField();
		nameTextField.setText("Name");
		nameTextField.setBounds(299, 5, 86, 20);
		namePanel.add(nameTextField);
		nameTextField.setColumns(10);
		
		JPanel chatboxPanel = new JPanel();
		chatboxPanel.setBounds(0, 41, 544, 287);
		frmMulticastChatRoom.getContentPane().add(chatboxPanel);
		chatboxPanel.setLayout(new BorderLayout(0, 0));
		
		JTextArea chatTextArea = new JTextArea();
		chatboxPanel.add(chatTextArea, BorderLayout.CENTER);
		chatTextArea.setRows(10);
		chatTextArea.setColumns(10);
		
		JPanel messagePanel = new JPanel();
		messagePanel.setBounds(0, 339, 544, 49);
		frmMulticastChatRoom.getContentPane().add(messagePanel);
		messagePanel.setLayout(null);
		
		JLabel lblMessage = new JLabel("Message");
		lblMessage.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMessage.setBounds(10, 8, 54, 14);
		messagePanel.add(lblMessage);
		
		messageTextField = new JTextField();
		messageTextField.setBounds(61, 11, 473, 20);
		messagePanel.add(messageTextField);
		messageTextField.setColumns(10);
		
		JPanel addressInfoPanel = new JPanel();
		addressInfoPanel.setBounds(10, 387, 217, 90);
		frmMulticastChatRoom.getContentPane().add(addressInfoPanel);
		addressInfoPanel.setLayout(null);
		
		chatGroupIDTextField = new JTextField();
		chatGroupIDTextField.setBounds(0, 40, 86, 20);
		addressInfoPanel.add(chatGroupIDTextField);
		chatGroupIDTextField.setColumns(10);
		
		portTextField = new JTextField();
		portTextField.setBounds(121, 40, 86, 20);
		addressInfoPanel.add(portTextField);
		portTextField.setColumns(10);
		
		JLabel lblChatGroupId = new JLabel("Chat Group ID");
		lblChatGroupId.setBounds(0, 15, 69, 14);
		addressInfoPanel.add(lblChatGroupId);
		
		JLabel lblPort = new JLabel("Port");
		lblPort.setBounds(121, 15, 46, 14);
		addressInfoPanel.add(lblPort);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBounds(238, 388, 306, 107);
		frmMulticastChatRoom.getContentPane().add(buttonPanel);
		buttonPanel.setLayout(null);
		
		JButton btnJoinChat = new JButton("JOIN CHAT");
		btnJoinChat.setBounds(10, 11, 125, 39);
		buttonPanel.add(btnJoinChat);
		
		JButton btnSendMessage = new JButton("SEND MESSAGE");
		btnSendMessage.setBounds(178, 11, 118, 39);
		buttonPanel.add(btnSendMessage);
		
		JButton btnLeaveChat = new JButton("LEAVE CHAT");
		btnLeaveChat.setBounds(10, 61, 125, 35);
		buttonPanel.add(btnLeaveChat);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBounds(178, 61, 118, 35);
		buttonPanel.add(btnExit);
	}
}
