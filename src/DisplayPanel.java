import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;


public class DisplayPanel extends Composite {

	public DisplayPanel(Composite parent, int style) {
		super(parent, style);
		
		GridData gd = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		gd.heightHint = 30;
		setLayoutData(gd);
		setLayout(new GridLayout(1, false));
		
		Label displayLabel = new Label(this, SWT.NONE);
		displayLabel.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, true, 1, 1));
		displayLabel.setText("\u6B22\u8FCE\u4F7F\u7528\u5FAE\u6CE2\u7089");
		
	}

}
