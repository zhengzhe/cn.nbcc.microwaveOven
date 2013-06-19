import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;


public class KeyboardPanel extends Composite {

	public KeyboardPanel(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(3, true));
		setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1));
		for (int i = 0; i < 10; i++) {
			Button button = new Button(this, SWT.NONE);
			button.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
			button.setText(i+"");
		}
	}
}
