import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;


public class ControlPanel extends Composite {

	private Button startBtn;
	private Button clearBtn;

	public ControlPanel(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(2, false));
		setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		startBtn = new Button(this, SWT.NONE);
		startBtn.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		startBtn.setText("\u5F00\u59CB");
		
		clearBtn = new Button(this, SWT.NONE);
		clearBtn.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		clearBtn.setText("\u6E05\u9664");
	}

}
