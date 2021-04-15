package vivw;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import dao.UserDao;
import moudle.user;
import util.DButil;
import util.Stringutil;

public class Loginform extends JFrame {

	private JComboBox<String> permissions;
	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;
	private DButil dbutil=new DButil();
	private UserDao userDao=new UserDao();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginform frame = new Loginform();
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
	public Loginform() {
		setTitle("\u767B\u5F55\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lb1 = new JLabel("\u672C\u5730\u7B14\u8BB0\u7CFB\u7EDF");
		lb1.setFont(new Font("宋体", Font.BOLD, 23));
		lb1.setIcon(new ImageIcon(Loginform.class.getResource("/images/\u7F16\u8F91 \u7B14 \u8BB0\u4E8B \u624B\u5199.png")));
		
		JLabel lblNewLabel_1 = new JLabel("\u7528\u6237\u540D");
		lblNewLabel_1.setIcon(new ImageIcon(Loginform.class.getResource("/images/\u7528\u6237.png")));
		
		JLabel lblNewLabel_2 = new JLabel("\u5BC6\u7801");
		lblNewLabel_2.setIcon(new ImageIcon(Loginform.class.getResource("/images/\u5BC6\u7801.png")));
		
		username = new JTextField();
		username.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\u6743\u9650");
		lblNewLabel_3.setIcon(new ImageIcon(Loginform.class.getResource("/images/\u6743\u9650.png")));
		
		JComboBox permissions = new JComboBox();
		permissions.setModel(new DefaultComboBoxModel(new String[] {"\u7528\u6237", "\u7BA1\u7406\u5458"}));
		
		JButton btnNewButton = new JButton("\u767B\u5F55\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					loginActionPerformed(e);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	
		
		JButton btnNewButton_1 = new JButton("\u6CE8\u518C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegActionperformed(e);
			}
		});
		
		password = new JPasswordField();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(50)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_1))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblNewLabel_3)
									.addComponent(lblNewLabel_2))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(102)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)))
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(167)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(password, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(permissions, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 183, Short.MAX_VALUE))
								.addComponent(username, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))))
					.addGap(82))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(132)
					.addComponent(lb1)
					.addContainerGap(178, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(21)
					.addComponent(lb1)
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addComponent(username, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(41)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(permissions, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(43)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(34, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		this.setLocationRelativeTo(null);
	}

	
//注册窗口显示	
	protected void RegActionperformed(ActionEvent e) {
		dispose();//销毁当前窗口
		new Regform().setVisible(true);
		
	}

	
//登录事件	
	private void loginActionPerformed(ActionEvent evt) throws Exception{
		String userName=this.username.getText();
		String password=new String(this.password.getPassword());
		String per=(String) this.permissions.getSelectedItem();
		if(Stringutil.isEmpt(userName)) {
			JOptionPane.showMessageDialog(null, "用户名不能为空");
			
		}
		
		if(Stringutil.isEmpt(password)) {
			JOptionPane.showMessageDialog(null,"密码不能为空");
		}
		
		String userid="";
		user use=new user(userName,password,userid);
		Connection con=null;
		if(per.equals("管理员")) {
			userid="1";
			con=dbutil.getCon();
			user currentuser=userDao.login(con, use, userid);
			if(currentuser!=null) {
				dispose();
				new adminform().setVisible(true);
			}else {
				JOptionPane.showMessageDialog(null, "密码或用户名或权限错误");
			}
		}else {
			userid="0";
			con=dbutil.getCon();
			user currentuser=userDao.login(con, use, userid);
			if(currentuser!=null) {
				dispose();
				new Mainform().setVisible(true);
			}else {
				JOptionPane.showMessageDialog(null, "密码或用户名或错误");
			}
			
		}
		
//	    user use=new user(userName,password);
//		Connection con=null;
//		try {
//			con=dbutil.getCon();
//			user currentuser=userDao.login(con, use);
//			if(currentuser!=null) {
//				JOptionPane.showMessageDialog(null, "登陆成功");
//			}else{
//				JOptionPane.showMessageDialog(null, "密码或用户名错误");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
	
	}
}


