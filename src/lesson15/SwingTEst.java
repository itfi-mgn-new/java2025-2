package lesson15;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class SwingTEst extends JFrame {
	public SwingTEst() {
		final JLabel	label = new JLabel("dsjjflksdjfl");	
		
//		getContentPane().setLayout();
		
		label.setLocation(0,0);
		label.setSize(100,100);
		label.setOpaque(true);
		label.setBackground(Color.red);
		label.setPreferredSize(new Dimension(100,100));

		final JLabel	label2 = new JLabel("4989034589034890438509834509");	
		final JLabel	label3 = new JLabel("********");	
		
		label2.setPreferredSize(new Dimension(100,100));
		
//		getContentPane().add(label);
//		getContentPane().add(label2, BorderLayout.NORTH);

		JTabbedPane	tp = new JTabbedPane();
		
		tp.addTab("first", label2);
		tp.addTab("second", label3);
		
		JTextArea	ta = new JTextArea();

		ta.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.err.println("Clicked!!!");
			}
		});
		
		JPanel	p = new JPanel(new BorderLayout());
		
		tp.addTab("third", new JScrollPane(ta));
		
		JButton b = new JButton("Press me");
		
		p.add(label);
		p.add(b, BorderLayout.SOUTH);
		
		b.addActionListener((e)->{
			System.err.println("Pressed");
		});
		
		
		
		JSplitPane	sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, p, tp);
		getContentPane().add(sp);
		
		sp.setBorder(new LineBorder(Color.GREEN, 5));
		
		setSize(640, 480);
		setLocation(100, 100);
		
		JMenuItem	exit = new JMenuItem("exit");
		JMenu		menu = new JMenu("File");
		JMenuBar	bar = new JMenuBar();
		
		exit.addActionListener((e)->{System.exit(0);});
		
		menu.add(exit);
		bar.add(menu);
		setJMenuBar(bar);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingTEst	st = new SwingTEst();
		st.setVisible(true);
		
	}

}
