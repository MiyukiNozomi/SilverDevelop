package com.silver.develop;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.JSplitPane;
import javax.swing.JMenuBar;

public class SilverDevelop extends JFrame {
	public static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	
	public SilverDevelop() {
		super("Silver Develop");
		setSize(389,300);
		setIconImage(Resource.getIcon("silvergarden.png").getImage());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		contentPane = new JPanel();
			
		
		
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JSplitPane splitPane = new JSplitPane();
		contentPane.add(splitPane, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) throws UnsupportedLookAndFeelException {
		SilverDevelop s = new SilverDevelop();
		
		UIManager.setLookAndFeel(new MetalLookAndFeel());
		
		s.setSize(800,600);
		s.setLocationRelativeTo(null);
		
		s.setVisible(true);
	}
}