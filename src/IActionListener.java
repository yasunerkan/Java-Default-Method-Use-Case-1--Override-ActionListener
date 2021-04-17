import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;

public interface IActionListener extends ActionListener {

	@Override
	default void actionPerformed(final ActionEvent aEvent) {
		JComponent comp = (JComponent) aEvent.getSource();
		try {
			comp.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
			executeTask(aEvent);
		} finally {
			comp.setCursor(Cursor.getDefaultCursor());
		}
	}

	void executeTask(ActionEvent aEvent);

}
