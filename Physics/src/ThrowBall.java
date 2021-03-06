import javax.swing.JFrame;

public class ThrowBall extends JFrame {
	public static BallHandler handle = new BallHandler();
	
	public ThrowBall() {
		super("Throw a ball around!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(handle);
		setSize(1280, 720);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ThrowBall();
		handle.addBall(200, 100, 0, 0);
		handle.addBall(600, 100, -200, 0);
	}
}
