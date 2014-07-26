/*
 * This class is just test ideas. This is not used for actual files
 */
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class test
{

	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;
	private JButton[][] buttons;

	public test()
	{
		prepareGUI();
	}

	public static void main(String[] args)
	{
		test swingControlDemo = new test();
		swingControlDemo.showProgressBarDemo();
	}

	private void prepareGUI()
	{
		mainFrame = new JFrame("Java Swing Examples");
		mainFrame.setSize(400, 400);
		mainFrame.setLayout(new GridLayout(5, 1));
		mainFrame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent windowEvent)
			{
				System.exit(0);
			}
		});
		headerLabel = new JLabel("", JLabel.CENTER);
		statusLabel = new JLabel("", JLabel.CENTER);

		statusLabel.setSize(350, 100);

		controlPanel = new JPanel();
		controlPanel.setLayout(new GridLayout(5, 1));

		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);

	}

	private JProgressBar progressBar;
	private Task task;
	private JButton startButton;

	private void showProgressBarDemo()
	{
		progressBar = new JProgressBar(0, 100);
		progressBar.setValue(0);
		progressBar.setStringPainted(true);
		startButton = new JButton("Start");
		buildGrid();

		startButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				task = new Task();
				task.start();
			}
		});
		controlPanel.add(startButton);
		controlPanel.add(progressBar);
		mainFrame.setVisible(true);

	}

	private class Task extends Thread
	{
		public Task()
		{
		}

		public void run()
		{
			for (int i = 0; i <= 100; i += 1)
			{
				final int progress = i;
				SwingUtilities.invokeLater(new Runnable()
				{
					public void run()
					{
						progressBar.setValue(progress);

					}
				});
				try
				{
					Thread.sleep(100);
				} catch (InterruptedException e)
				{
				}
			}
		}
	}

	private void buildGrid()
	{
		buttons = new JButton[4][4];
		
		final JButton submit = new JButton("Submit"); 
		controlPanel.add(submit);
		
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				buttons[i][j] = new JButton("" + i + j);
				final int buttonRow = i;
				final int buttonColumn = j;
				buttons[i][j].setEnabled(true);
				buttons[i][j].addActionListener(new ActionListener()
				{		
					@Override
					public void actionPerformed(ActionEvent e)
					{
						
						System.out.println(buttons[buttonRow][buttonColumn]
								.getText());
						buttons[buttonRow][buttonColumn].setEnabled(false);
						submit.addActionListener(new ActionListener(){

							@Override
							public void actionPerformed(ActionEvent e)
							{
								buttons[buttonRow][buttonColumn].setEnabled(true);
								
							}
							
						});
											
					}
					
					
				});
			
				controlPanel.add(buttons[i][j]);
			}
		}
	}
}