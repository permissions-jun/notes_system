package vivw;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

public class Mainform extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainform frame = new Mainform();
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
	public Mainform() {
		setTitle("\u7528\u6237\u9996\u9875");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 489, 332);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("\u7528\u6237\u540D");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u6211\u7684\u6536\u85CF");
		mntmNewMenuItem.setIcon(new ImageIcon(Mainform.class.getResource("/images/\u6536 \u85CF.png")));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("\u4FE1\u606F\u4FEE\u6539");
		mntmNewMenuItem_2.setIcon(new ImageIcon(Mainform.class.getResource("/images/\u4FEE\u6539\u4FE1\u606F.png")));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("\u7B14\u8BB0\u7BA1\u7406");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\u6211\u7684\u7B14\u8BB0");
		mntmNewMenuItem_1.setIcon(new ImageIcon(Mainform.class.getResource("/images/\u6211\u7684\u7B14\u8BB0.png")));
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("\u53D1\u5E03\u7B14\u8BB0");
		mntmNewMenuItem_3.setIcon(new ImageIcon(Mainform.class.getResource("/images/\u53D1\u5E03.png")));
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("\u7B14\u8BB0\u67E5\u8BE2");
		mntmNewMenuItem_4.setIcon(new ImageIcon(Mainform.class.getResource("/images/\u67E5\u8BE2.png")));
		mnNewMenu_1.add(mntmNewMenuItem_4);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 428, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 255, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
	}

}
