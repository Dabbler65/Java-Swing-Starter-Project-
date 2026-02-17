import javax.swing.*;

public class MainFrame extends JFrame
{
	private static final long serialVersionUID = 1L;

	public MainFrame(String title)
	{
		super(title);
		setSize(640, 480);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
