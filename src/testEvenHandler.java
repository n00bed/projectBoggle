import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class testEvenHandler implements ActionListener
{
	private JButton buttons[][];

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		buttons = new JButton[4][4];
		
		
		
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				
				if (e.getSource() == buttons[0][0])
				{
					System.out.println(i+j);
					buttons[0][0].setEnabled(false);
					buttons[0][1].setEnabled(true);
					buttons[0][2].setEnabled(false);
					buttons[0][3].setEnabled(false);
					buttons[1][0].setEnabled(true);
					buttons[1][1].setEnabled(true);
					buttons[1][2].setEnabled(false);
					buttons[1][3].setEnabled(false);
					buttons[2][0].setEnabled(false);
					buttons[2][1].setEnabled(false);
					buttons[2][2].setEnabled(false);
					buttons[2][3].setEnabled(false);
					buttons[3][0].setEnabled(false);
					buttons[3][1].setEnabled(false);
					buttons[3][2].setEnabled(false);
					buttons[3][3].setEnabled(false);
				} else if (e.getSource() == buttons[0][1])
				{
					buttons[0][0].setEnabled(true);
					buttons[0][1].setEnabled(false);
					buttons[0][2].setEnabled(true);
					buttons[0][3].setEnabled(false);
					buttons[1][0].setEnabled(true);
					buttons[1][1].setEnabled(true);
					buttons[1][2].setEnabled(true);
					buttons[1][3].setEnabled(false);
					buttons[2][0].setEnabled(false);
					buttons[2][1].setEnabled(false);
					buttons[2][2].setEnabled(false);
					buttons[2][3].setEnabled(false);
					buttons[3][0].setEnabled(false);
					buttons[3][1].setEnabled(false);
					buttons[3][2].setEnabled(false);
					buttons[3][3].setEnabled(false);
				}

				else if (e.getSource() == buttons[0][2])
				{
					buttons[0][0].setEnabled(false);
					buttons[0][1].setEnabled(true);
					buttons[0][2].setEnabled(false);
					buttons[0][3].setEnabled(true);
					buttons[1][0].setEnabled(false);
					buttons[1][1].setEnabled(true);
					buttons[1][2].setEnabled(true);
					buttons[1][3].setEnabled(true);
					buttons[2][0].setEnabled(false);
					buttons[2][1].setEnabled(false);
					buttons[2][2].setEnabled(false);
					buttons[2][3].setEnabled(false);
					buttons[3][0].setEnabled(false);
					buttons[3][1].setEnabled(false);
					buttons[3][2].setEnabled(false);
					buttons[3][3].setEnabled(false);
				}

				else if (e.getSource() == buttons[0][3])
				{
					buttons[0][0].setEnabled(false);
					buttons[0][1].setEnabled(false);
					buttons[0][2].setEnabled(true);
					buttons[0][3].setEnabled(false);
					buttons[1][0].setEnabled(false);
					buttons[1][1].setEnabled(false);
					buttons[1][2].setEnabled(true);
					buttons[1][3].setEnabled(true);
					buttons[2][0].setEnabled(false);
					buttons[2][1].setEnabled(false);
					buttons[2][2].setEnabled(false);
					buttons[2][3].setEnabled(false);
					buttons[3][0].setEnabled(false);
					buttons[3][1].setEnabled(false);
					buttons[3][2].setEnabled(false);
					buttons[3][3].setEnabled(false);
				}

				else if (e.getSource() == buttons[1][0])
				{
					buttons[0][0].setEnabled(true);
					buttons[0][1].setEnabled(true);
					buttons[0][2].setEnabled(false);
					buttons[0][3].setEnabled(false);
					buttons[1][0].setEnabled(false);
					buttons[1][1].setEnabled(true);
					buttons[1][2].setEnabled(false);
					buttons[1][3].setEnabled(false);
					buttons[2][0].setEnabled(true);
					buttons[2][1].setEnabled(true);
					buttons[2][2].setEnabled(false);
					buttons[2][3].setEnabled(false);
					buttons[3][0].setEnabled(false);
					buttons[3][1].setEnabled(false);
					buttons[3][2].setEnabled(false);
					buttons[3][3].setEnabled(false);
				}

				else if (e.getSource() == buttons[1][1])
				{
					buttons[0][0].setEnabled(true);
					buttons[0][1].setEnabled(true);
					buttons[0][2].setEnabled(true);
					buttons[0][3].setEnabled(false);
					buttons[1][0].setEnabled(true);
					buttons[1][1].setEnabled(false);
					buttons[1][2].setEnabled(true);
					buttons[1][3].setEnabled(false);
					buttons[2][0].setEnabled(true);
					buttons[2][1].setEnabled(true);
					buttons[2][2].setEnabled(true);
					buttons[2][3].setEnabled(false);
					buttons[3][0].setEnabled(false);
					buttons[3][1].setEnabled(false);
					buttons[3][2].setEnabled(false);
					buttons[3][3].setEnabled(false);
				}

				else if (e.getSource() == buttons[1][2])
				{
					buttons[0][0].setEnabled(false);
					buttons[0][1].setEnabled(true);
					buttons[0][2].setEnabled(true);
					buttons[0][3].setEnabled(true);
					buttons[1][0].setEnabled(false);
					buttons[1][1].setEnabled(true);
					buttons[1][2].setEnabled(true);
					buttons[1][3].setEnabled(true);
					buttons[2][0].setEnabled(false);
					buttons[2][1].setEnabled(true);
					buttons[2][2].setEnabled(true);
					buttons[2][3].setEnabled(true);
					buttons[3][0].setEnabled(false);
					buttons[3][1].setEnabled(false);
					buttons[3][2].setEnabled(false);
					buttons[3][3].setEnabled(false);
				}

				else if (e.getSource() == buttons[1][3])
				{
					buttons[0][0].setEnabled(false);
					buttons[0][1].setEnabled(false);
					buttons[0][2].setEnabled(true);
					buttons[0][3].setEnabled(true);
					buttons[1][0].setEnabled(false);
					buttons[1][1].setEnabled(false);
					buttons[1][2].setEnabled(true);
					buttons[1][3].setEnabled(false);
					buttons[2][0].setEnabled(false);
					buttons[2][1].setEnabled(false);
					buttons[2][2].setEnabled(true);
					buttons[2][3].setEnabled(true);
					buttons[3][0].setEnabled(false);
					buttons[3][1].setEnabled(false);
					buttons[3][2].setEnabled(false);
					buttons[3][3].setEnabled(false);
				} else if (e.getSource() == buttons[2][0])
				{
					buttons[0][0].setEnabled(false);
					buttons[0][1].setEnabled(false);
					buttons[0][2].setEnabled(false);
					buttons[0][3].setEnabled(false);
					buttons[1][0].setEnabled(true);
					buttons[1][1].setEnabled(true);
					buttons[1][2].setEnabled(false);
					buttons[1][3].setEnabled(false);
					buttons[2][0].setEnabled(false);
					buttons[2][1].setEnabled(true);
					buttons[2][2].setEnabled(false);
					buttons[2][3].setEnabled(false);
					buttons[3][0].setEnabled(true);
					buttons[3][1].setEnabled(true);
					buttons[3][2].setEnabled(false);
					buttons[3][3].setEnabled(false);
				}

				else if (e.getSource() == buttons[2][1])
				{
					buttons[0][0].setEnabled(false);
					buttons[0][1].setEnabled(false);
					buttons[0][2].setEnabled(false);
					buttons[0][3].setEnabled(false);
					buttons[1][0].setEnabled(true);
					buttons[1][1].setEnabled(true);
					buttons[1][2].setEnabled(true);
					buttons[1][3].setEnabled(false);
					buttons[2][0].setEnabled(true);
					buttons[2][1].setEnabled(false);
					buttons[2][2].setEnabled(true);
					buttons[2][3].setEnabled(false);
					buttons[3][0].setEnabled(true);
					buttons[3][1].setEnabled(true);
					buttons[3][2].setEnabled(true);
					buttons[3][3].setEnabled(false);
				} else if (e.getSource() == buttons[2][2])
				{
					buttons[0][0].setEnabled(false);
					buttons[0][1].setEnabled(false);
					buttons[0][2].setEnabled(false);
					buttons[0][3].setEnabled(false);
					buttons[1][0].setEnabled(false);
					buttons[1][1].setEnabled(true);
					buttons[1][2].setEnabled(true);
					buttons[1][3].setEnabled(true);
					buttons[2][0].setEnabled(false);
					buttons[2][1].setEnabled(true);
					buttons[2][2].setEnabled(false);
					buttons[2][3].setEnabled(true);
					buttons[3][0].setEnabled(false);
					buttons[3][1].setEnabled(true);
					buttons[3][2].setEnabled(true);
					buttons[3][3].setEnabled(true);
				} else if (e.getSource() == buttons[2][3])
				{
					buttons[0][0].setEnabled(false);
					buttons[0][1].setEnabled(false);
					buttons[0][2].setEnabled(false);
					buttons[0][3].setEnabled(false);
					buttons[1][0].setEnabled(false);
					buttons[1][1].setEnabled(false);
					buttons[1][2].setEnabled(true);
					buttons[1][3].setEnabled(true);
					buttons[2][0].setEnabled(false);
					buttons[2][1].setEnabled(false);
					buttons[2][2].setEnabled(true);
					buttons[2][3].setEnabled(false);
					buttons[3][0].setEnabled(false);
					buttons[3][1].setEnabled(false);
					buttons[3][2].setEnabled(true);
					buttons[3][3].setEnabled(true);
				}

				else if (e.getSource() == buttons[3][0])
				{
					buttons[0][0].setEnabled(false);
					buttons[0][1].setEnabled(false);
					buttons[0][2].setEnabled(false);
					buttons[0][3].setEnabled(false);
					buttons[1][0].setEnabled(false);
					buttons[1][1].setEnabled(false);
					buttons[1][2].setEnabled(false);
					buttons[1][3].setEnabled(false);
					buttons[2][0].setEnabled(true);
					buttons[2][1].setEnabled(true);
					buttons[2][2].setEnabled(false);
					buttons[2][3].setEnabled(false);
					buttons[3][0].setEnabled(false);
					buttons[3][1].setEnabled(true);
					buttons[3][2].setEnabled(false);
					buttons[3][3].setEnabled(false);
				}

				else if (e.getSource() == buttons[3][1])
				{
					buttons[0][0].setEnabled(false);
					buttons[0][1].setEnabled(false);
					buttons[0][2].setEnabled(false);
					buttons[0][3].setEnabled(false);
					buttons[1][0].setEnabled(false);
					buttons[1][1].setEnabled(false);
					buttons[1][2].setEnabled(false);
					buttons[1][3].setEnabled(false);
					buttons[2][0].setEnabled(true);
					buttons[2][1].setEnabled(true);
					buttons[2][2].setEnabled(true);
					buttons[2][3].setEnabled(false);
					buttons[3][0].setEnabled(true);
					buttons[3][1].setEnabled(false);
					buttons[3][2].setEnabled(true);
					buttons[3][3].setEnabled(false);
				}

				else if (e.getSource() == buttons[3][2])
				{
					buttons[0][0].setEnabled(false);
					buttons[0][1].setEnabled(false);
					buttons[0][2].setEnabled(false);
					buttons[0][3].setEnabled(false);
					buttons[1][0].setEnabled(false);
					buttons[1][1].setEnabled(false);
					buttons[1][2].setEnabled(false);
					buttons[1][3].setEnabled(false);
					buttons[2][0].setEnabled(false);
					buttons[2][1].setEnabled(true);
					buttons[2][2].setEnabled(true);
					buttons[2][3].setEnabled(true);
					buttons[3][0].setEnabled(false);
					buttons[3][1].setEnabled(true);
					buttons[3][2].setEnabled(false);
					buttons[3][3].setEnabled(true);
				} else if (e.getSource() == buttons[3][3])
				{
					buttons[0][0].setEnabled(false);
					buttons[0][1].setEnabled(false);
					buttons[0][2].setEnabled(false);
					buttons[0][3].setEnabled(false);
					buttons[1][0].setEnabled(false);
					buttons[1][1].setEnabled(false);
					buttons[1][2].setEnabled(false);
					buttons[1][3].setEnabled(false);
					buttons[2][0].setEnabled(false);
					buttons[2][1].setEnabled(false);
					buttons[2][2].setEnabled(true);
					buttons[2][3].setEnabled(true);
					buttons[3][0].setEnabled(false);
					buttons[3][1].setEnabled(false);
					buttons[3][2].setEnabled(true);
					buttons[3][3].setEnabled(false);
				}

			}
		}
	}
}
