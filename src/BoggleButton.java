import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class BoggleButton extends JButton implements ActionListener
{
	private static BoggleButton buttons[][];
	private final Border clickBorder= new LineBorder(Color.RED, 5);
	private final Border unclickborder= new LineBorder(Color.BLACK, 5);
	
	public static void init(BoggleButton[][] buttons)
	{
		BoggleButton.buttons = buttons;
	}
	
	private int row;
	private int col;
	
	
	public BoggleButton(int row, int col)
	{
		this.row = row;
		this.col = col;
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{

		for (int r = 0; r < buttons.length; ++r)
		{
			for (int c = 0; c < buttons[0].length; ++c)
			{
				

				 if (Math.abs(buttons[r][c].row - row) <= 1 && Math.abs(buttons[r][c].col - col) <= 1 && 
						 !(Math.abs(buttons[r][c].row - row) == 0 && Math.abs(buttons[r][c].col - col) == 0))
				{
					if(!buttons[r][c].isSelected())
						buttons[r][c].setEnabled(true);
				}

				 
				else
				{
					buttons[r][c].setEnabled(false);
				}
			}
		}
		
	}
}
