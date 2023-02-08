import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

public class form02 extends form01 {

	protected Shell shell;
	public double wage;
	public double workday;
	public double absent;
	public double leave;
	public double workhpd;
	public double overtime;
	
	static double Calculatesalary( double a ,  double b,  double c , double x ,  double y,  double z ) {
		return (a * (b - ( c + x ))) + (((a / y)* 1.5) * z) ;
		
	}
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			form02 window2 = new form02();
			window2.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		
		Display display = Display.getDefault();
		createContents();
		
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	

	/**
	 * Create contents of the window.
	 */
	
	protected void createContents() {
		shell = new Shell();
		shell.setSize(318, 321);
		shell.setText("SWT Application");
		
		Button btnNext = new Button(shell, SWT.NONE);
		btnNext.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.print("\nClose Form2\n");
				shell.close();
				form01 nextForm = new form01();
				nextForm.open();
			}
		});
		btnNext.setText("Enter");
		btnNext.setBounds(10, 238, 259, 40);
		
		Label LabelShow = new Label(shell, SWT.NONE);
		LabelShow.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		LabelShow.setBounds(10, 10, 259, 186);
		LabelShow.setText		
		(
		" คำนวนค่าแรงต่อเดือน "+
		"\n ค่าแรงรายวัน \t: " +  wage +
		"\n จำนวนวันทำงาน \t: " +  workday +
		"\n จำนวนวันลา \t: " +  absent +
		"\n จำนวนวันที่ขาดงาน \t: " +  leave +
		"\n ชั่วโมงทำงานต่อวัน \t: " +  workhpd +
		"\n ชั่วโมงทำงานล่วงเวลา\t: " +  overtime
		);
		double result = Calculatesalary(wage , workday, absent , leave , workhpd, overtime );
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblNewLabel.setBounds(10, 192, 269, 40);
		lblNewLabel.setText(" เงินเดือนที่ได้รับ : " + String.format("%.2f",result) );
		
		System.out.print("\nwage:" + wage);
		System.out.print("\nworkday:" + workday);
		System.out.print("\nabsent:" + absent);
		System.out.print("\nleave:" + leave);
		System.out.print("\nworkhpd:" + workhpd);
		System.out.print("\novertime:" + overtime);
		
		
		
		/*
		System.out.print("wage:"+ form02.wage);
		System.out.print("\nworkday:"+ form02.workday);
		System.out.print("\nabsent:"+ form02.absent);
		System.out.print("\nleave:"+ form02.leave);
		System.out.print("\nworkhpd:"+ form02.workhpd);
		System.out.print("\novertime:"+ form02.overtime);
		*/

	}
}
