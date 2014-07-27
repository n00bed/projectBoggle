import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class BoggleEventHandler implements ActionListener
{
	private JButton buttons[][];
	

	public BoggleEventHandler(JButton[][] buttons)
	{
		this.buttons = buttons;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{

		if (e.getSource() == buttons[0][0])
		{
			// true
			buttons[0][1].setEnabled(true);
			buttons[1][0].setEnabled(true);
			buttons[1][1].setEnabled(true);

			// false
			buttons[0][0].setEnabled(false);
			buttons[0][2].setEnabled(false);
			buttons[0][3].setEnabled(false);
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
			// true
			buttons[0][0].setEnabled(true);
			buttons[0][2].setEnabled(true);
			buttons[1][0].setEnabled(true);
			buttons[1][1].setEnabled(true);
			buttons[1][2].setEnabled(true);

			// false
			buttons[0][1].setEnabled(false);
			buttons[0][3].setEnabled(false);
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
			// true
			buttons[0][1].setEnabled(true);
			buttons[0][3].setEnabled(true);
			buttons[1][1].setEnabled(true);
			buttons[1][2].setEnabled(true);
			buttons[1][3].setEnabled(true);

			// false
			buttons[0][0].setEnabled(false);
			buttons[0][2].setEnabled(false);
			buttons[1][0].setEnabled(false);
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
			// true
			buttons[0][2].setEnabled(true);
			buttons[1][2].setEnabled(true);
			buttons[1][3].setEnabled(true);

			// false
			buttons[0][0].setEnabled(false);
			buttons[0][1].setEnabled(false);
			buttons[0][3].setEnabled(false);
			buttons[1][0].setEnabled(false);
			buttons[1][1].setEnabled(false);
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
			// true
			buttons[0][0].setEnabled(true);
			buttons[0][1].setEnabled(true);
			buttons[1][1].setEnabled(true);
			buttons[2][0].setEnabled(true);
			buttons[2][1].setEnabled(true);

			// false
			buttons[0][2].setEnabled(false);
			buttons[0][3].setEnabled(false);
			buttons[1][0].setEnabled(false);
			buttons[1][2].setEnabled(false);
			buttons[1][3].setEnabled(false);
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
			buttons[1][0].setEnabled(true);
			buttons[2][0].setEnabled(true);
			buttons[2][1].setEnabled(true);
			buttons[2][2].setEnabled(true);
			buttons[1][2].setEnabled(true);

			buttons[0][3].setEnabled(false);
			buttons[1][1].setEnabled(false);
			buttons[1][3].setEnabled(false);
			buttons[2][3].setEnabled(false);
			buttons[3][0].setEnabled(false);
			buttons[3][1].setEnabled(false);
			buttons[3][2].setEnabled(false);
			buttons[3][3].setEnabled(false);

		}

		else if (e.getSource() == buttons[1][2])
		{
			// true
			buttons[0][1].setEnabled(true);
			buttons[0][2].setEnabled(true);
			buttons[0][3].setEnabled(true);
			buttons[1][1].setEnabled(true);
			buttons[1][2].setEnabled(true);
			buttons[1][3].setEnabled(true);
			buttons[2][1].setEnabled(true);
			buttons[2][2].setEnabled(true);
			buttons[2][3].setEnabled(true);

			// false
			buttons[0][0].setEnabled(false);
			buttons[1][0].setEnabled(false);
			buttons[2][0].setEnabled(false);
			buttons[3][0].setEnabled(false);
			buttons[3][1].setEnabled(false);
			buttons[3][2].setEnabled(false);
			buttons[3][3].setEnabled(false);
		}

		else if (e.getSource() == buttons[1][3])
		{
			// true
			buttons[0][2].setEnabled(true);
			buttons[0][3].setEnabled(true);
			buttons[1][2].setEnabled(true);
			buttons[2][2].setEnabled(true);
			buttons[2][3].setEnabled(true);

			// false
			buttons[0][0].setEnabled(false);
			buttons[0][1].setEnabled(false);
			buttons[1][0].setEnabled(false);
			buttons[1][1].setEnabled(false);
			buttons[1][3].setEnabled(false);
			buttons[2][0].setEnabled(false);
			buttons[2][1].setEnabled(false);
			buttons[3][0].setEnabled(false);
			buttons[3][1].setEnabled(false);
			buttons[3][2].setEnabled(false);
			buttons[3][3].setEnabled(false);
		} else if (e.getSource() == buttons[2][0])
		{
			// true
			buttons[1][0].setEnabled(true);
			buttons[1][1].setEnabled(true);
			buttons[3][0].setEnabled(true);
			buttons[3][1].setEnabled(true);

			// false
			buttons[0][0].setEnabled(false);
			buttons[0][1].setEnabled(false);
			buttons[0][2].setEnabled(false);
			buttons[0][3].setEnabled(false);
			buttons[1][2].setEnabled(false);
			buttons[1][3].setEnabled(false);
			buttons[2][0].setEnabled(false);
			buttons[2][1].setEnabled(true);
			buttons[2][2].setEnabled(false);
			buttons[2][3].setEnabled(false);
			buttons[3][2].setEnabled(false);
			buttons[3][3].setEnabled(false);
		}

		else if (e.getSource() == buttons[2][1])
		{
			buttons[1][0].setEnabled(true);
			buttons[1][1].setEnabled(true);
			buttons[1][2].setEnabled(true);
			buttons[2][0].setEnabled(true);
			buttons[2][2].setEnabled(true);
			buttons[3][0].setEnabled(true);
			buttons[3][1].setEnabled(true);
			buttons[3][2].setEnabled(true);

			buttons[0][0].setEnabled(false);
			buttons[0][1].setEnabled(false);
			buttons[0][2].setEnabled(false);
			buttons[0][3].setEnabled(false);
			buttons[1][3].setEnabled(false);
			buttons[2][1].setEnabled(false);
			buttons[2][3].setEnabled(false);
			buttons[3][3].setEnabled(false);
		} else if (e.getSource() == buttons[2][2])
		{
			buttons[1][1].setEnabled(true);
			buttons[1][2].setEnabled(true);
			buttons[1][3].setEnabled(true);
			buttons[2][1].setEnabled(true);
			buttons[2][3].setEnabled(true);
			buttons[3][1].setEnabled(true);
			buttons[3][2].setEnabled(true);
			buttons[3][3].setEnabled(true);

			buttons[0][0].setEnabled(false);
			buttons[0][1].setEnabled(false);
			buttons[0][2].setEnabled(false);
			buttons[0][3].setEnabled(false);
			buttons[1][0].setEnabled(false);
			buttons[2][0].setEnabled(false);
			buttons[2][2].setEnabled(false);
			buttons[3][0].setEnabled(false);

		} else if (e.getSource() == buttons[2][3])
		{
			// true
			buttons[1][2].setEnabled(true);
			buttons[1][3].setEnabled(true);
			buttons[2][2].setEnabled(true);
			buttons[3][2].setEnabled(true);
			buttons[3][3].setEnabled(true);

			// false
			buttons[0][0].setEnabled(false);
			buttons[0][1].setEnabled(false);
			buttons[0][2].setEnabled(false);
			buttons[0][3].setEnabled(false);
			buttons[1][0].setEnabled(false);
			buttons[1][1].setEnabled(false);
			buttons[2][0].setEnabled(false);
			buttons[2][1].setEnabled(false);
			buttons[2][3].setEnabled(false);
			buttons[3][0].setEnabled(false);
			buttons[3][1].setEnabled(false);
		}

		else if (e.getSource() == buttons[3][0])
		{

			buttons[2][0].setEnabled(true);
			buttons[2][1].setEnabled(true);
			buttons[3][1].setEnabled(true);

			buttons[0][0].setEnabled(false);
			buttons[0][1].setEnabled(false);
			buttons[0][2].setEnabled(false);
			buttons[0][3].setEnabled(false);
			buttons[1][0].setEnabled(false);
			buttons[1][1].setEnabled(false);
			buttons[1][2].setEnabled(false);
			buttons[1][3].setEnabled(false);
			buttons[2][2].setEnabled(false);
			buttons[2][3].setEnabled(false);
			buttons[3][0].setEnabled(false);
			buttons[3][2].setEnabled(false);
			buttons[3][3].setEnabled(false);
		}

		else if (e.getSource() == buttons[3][1])
		{
			// true
			buttons[2][0].setEnabled(true);
			buttons[2][1].setEnabled(true);
			buttons[2][2].setEnabled(true);
			buttons[3][0].setEnabled(true);
			buttons[3][2].setEnabled(true);

			// false
			buttons[0][0].setEnabled(false);
			buttons[0][1].setEnabled(false);
			buttons[0][2].setEnabled(false);
			buttons[0][3].setEnabled(false);
			buttons[1][0].setEnabled(false);
			buttons[1][1].setEnabled(false);
			buttons[1][2].setEnabled(false);
			buttons[1][3].setEnabled(false);
			buttons[2][3].setEnabled(false);
			buttons[3][1].setEnabled(false);
			buttons[3][3].setEnabled(false);
		}

		else if (e.getSource() == buttons[3][2])
		{

			buttons[2][1].setEnabled(true);
			buttons[2][2].setEnabled(true);
			buttons[2][3].setEnabled(true);
			buttons[3][1].setEnabled(true);
			buttons[3][3].setEnabled(true);

			buttons[0][0].setEnabled(false);
			buttons[0][1].setEnabled(false);
			buttons[0][2].setEnabled(false);
			buttons[0][3].setEnabled(false);
			buttons[1][0].setEnabled(false);
			buttons[1][1].setEnabled(false);
			buttons[1][2].setEnabled(false);
			buttons[1][3].setEnabled(false);
			buttons[2][0].setEnabled(false);
			buttons[3][0].setEnabled(false);
			buttons[3][2].setEnabled(false);
		} else if (e.getSource() == buttons[3][3])
		{

			buttons[2][2].setEnabled(true);
			buttons[2][3].setEnabled(true);
			buttons[3][2].setEnabled(true);

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
			buttons[3][0].setEnabled(false);
			buttons[3][1].setEnabled(false);
			buttons[3][3].setEnabled(false);

		}

	}

}
