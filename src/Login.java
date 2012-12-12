import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.*;

public class Login extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				Socket server;
//				try{
//				server=new Socket(InetAddress.getLocalHost(),5679);
//				  BufferedReader in=new BufferedReader(new InputStreamReader(server.getInputStream()));
//				  PrintWriter out=new PrintWriter(server.getOutputStream());
//				  BufferedReader wt=new BufferedReader(new InputStreamReader(System.in));
//				  
//				  while(true){
//				   String str=wt.readLine();
//				   out.println(str);
//				   out.flush();
//				   if(str.equals("end")){
//				    break;
//				   }
//				   System.out.println(in.readLine());
//				  }
//				  server.close();
//				}
//				catch(Exception e)
//				{
//					;
//				}
				Main m = new Main();
				m.setVisible(true);
			}
		});
		contentPane.add(btnNewButton, BorderLayout.NORTH);
	}

}
