import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo {
	public static void main(final String[] args) {
		JFrame f = new JFrame("Button Example");
		JButton b = new JButton("Click Here");
		b.addActionListener(new IActionListener() {

			@Override
			public void executeTask(final ActionEvent aEvent) {
				int total = 100;
				for (int i = 0; i < total; i++) {
					System.out.println("Main task is executing...%" + (i * 100 / total));
					try {
						Thread.sleep(20);
					} catch (InterruptedException exception) {
						exception.printStackTrace();
					}
				}

			}
		});
		b.setBounds(50, 100, 95, 30);
		f.add(b);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
}
