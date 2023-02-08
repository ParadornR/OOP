import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class form01  {
	protected Shell shell;
	private Label label_1;
	private Label label_2;
	private Label label_3;
	private Label label_4;
	private Label label_5;
	
	private Text Wage;
	private Label Label02;
	private Text WorkDay;
	private Label Label03;
	private Text Leave;
	private Label Label04;
	private Text Absent;
	private Label Label05;
	private Text WorkHpD;
	private Text Overtime;
	private Label Label06;
	private Button btnResult;
	private Button btnRandom;
	private Label LabelWarning;

	
	static int Calculatesalary( int a ,  int b,  int c ,int x ,  int y,  int z ) {
		return (a * (b - ( c + x ))) + (((a / y)* 3/2) * z) ;
	}
	
	static String random(int min, int max) {
		int n = (int)(Math.random() * (max - min + 1)) + min;
		String str = Integer.toString(n);
		return str ;
	}
	
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			form01 window1 = new form01();
			window1.open();
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
		shell.setSize(450, 380);
		shell.setText("คำนวนค่าแรงต่อเดือน");
		
		Label label = new Label(shell, SWT.NONE);
		label.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		label.setBounds(375, 15, 34, 32);
		label.setText("บาท");
		
		label_1 = new Label(shell, SWT.NONE);
		label_1.setText("บาท");
		label_1.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		label_1.setBounds(375, 51, 34, 32);
		
		label_2 = new Label(shell, SWT.NONE);
		label_2.setText("บาท");
		label_2.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		label_2.setBounds(375, 89, 34, 32);
		
		label_3 = new Label(shell, SWT.NONE);
		label_3.setText("บาท");
		label_3.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		label_3.setBounds(375, 127, 34, 32);
		
		label_4 = new Label(shell, SWT.NONE);
		label_4.setText("บาท");
		label_4.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		label_4.setBounds(375, 165, 34, 32);
		
		label_5 = new Label(shell, SWT.NONE);
		label_5.setText("บาท");
		label_5.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		label_5.setBounds(375, 203, 34, 32);
		
		Label Label01 = new Label(shell, SWT.NONE);
		Label01.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		Label01.setBounds(36, 13, 197, 32);
		Label01.setText("จำนวนค่าแรงรายวัน");
		
		Label02 = new Label(shell, SWT.NONE);
		Label02.setText("จำนวนวันที่ทำงาน");
		Label02.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		Label02.setBounds(36, 51, 197, 32);
		
		Label03 = new Label(shell, SWT.NONE);
		Label03.setText("จำนวนวันที่ลา");
		Label03.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		Label03.setBounds(36, 127, 197, 32);
		
		Label04 = new Label(shell, SWT.NONE);
		Label04.setText("จำนวนวันที่ขาดงาน");
		Label04.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		Label04.setBounds(36, 89, 197, 32);
		
		Label05 = new Label(shell, SWT.NONE);
		Label05.setText("ชั่วโมงทำงานต่อวัน");
		Label05.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		Label05.setBounds(36, 165, 197, 32);
		
		Label06 = new Label(shell, SWT.NONE);
		Label06.setText("ชั่วโมงทำงานล่วงเวลา");
		Label06.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		Label06.setBounds(36, 203, 197, 32);
		
		LabelWarning = new Label(shell, SWT.NONE);
		LabelWarning.setForeground(SWTResourceManager.getColor(255, 0, 0));
		LabelWarning.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		LabelWarning.setBounds(36, 241, 373, 25);
		
		Wage = new Text(shell, SWT.BORDER | SWT.LEFT);
		Wage.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		Wage.addVerifyListener(new VerifyListener() {
			public void verifyText(VerifyEvent e) {
				// check if the text only contains numbers
			    if (!e.text.matches("[0-9]*")) {
			      e.doit = false;
			    }
			    // check if the number of digits exceeds the limit
			    String currentText = ((Text) e.widget).getText();
			    int limit = 4;
			    if (currentText.length() + e.text.length() > limit) {
			      e.doit = false;
			    }
			}
		});
		Wage.setBounds(239, 13, 130, 32);
		
		WorkDay = new Text(shell, SWT.BORDER | SWT.LEFT);
		WorkDay.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		WorkDay.addVerifyListener(new VerifyListener() {
			public void verifyText(VerifyEvent e) {
				// check if the text only contains numbers
			    if (!e.text.matches("[0-9]*")) {
			      e.doit = false;
			    }
			    // check if the number of digits exceeds the limit
			    String currentText = ((Text) e.widget).getText();
			    int limit = 2;
			    if (currentText.length() + e.text.length() > limit) {
			      e.doit = false;
			    }
			}
		});
		WorkDay.setBounds(239, 51, 130, 32);
		
		Absent = new Text(shell, SWT.BORDER | SWT.LEFT);
		Absent.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		Absent.addVerifyListener(new VerifyListener() {
			public void verifyText(VerifyEvent e) {
				// check if the text only contains numbers
			    if (!e.text.matches("[0-9]*")) {
			      e.doit = false;
			    }
			    // check if the number of digits exceeds the limit
			    String currentText = ((Text) e.widget).getText();
			    int limit = 2;
			    if (currentText.length() + e.text.length() > limit) {
			      e.doit = false;
			    }
			}
		});
		Absent.setBounds(239, 89, 130, 32);
		
		Leave = new Text(shell, SWT.BORDER | SWT.LEFT);
		Leave.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		Leave.addVerifyListener(new VerifyListener() {
			public void verifyText(VerifyEvent e) {
				// check if the text only contains numbers
			    if (!e.text.matches("[0-9]*")) {
			      e.doit = false;
			    }
			    // check if the number of digits exceeds the limit
			    String currentText = ((Text) e.widget).getText();
			    int limit = 2;
			    if (currentText.length() + e.text.length() > limit) {
			      e.doit = false;
			    }
			}
		});
		Leave.setBounds(239, 127, 130, 32);
		
		WorkHpD = new Text(shell, SWT.BORDER | SWT.LEFT);
		WorkHpD.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		WorkHpD.addVerifyListener(new VerifyListener() {
			public void verifyText(VerifyEvent e) {
				// check if the text only contains numbers
			    if (!e.text.matches("[0-9]*")) {
			      e.doit = false;
			    }
			    // check if the number of digits exceeds the limit
			    String currentText = ((Text) e.widget).getText();
			    int limit = 5;
			    if (currentText.length() + e.text.length() > limit) {
			      e.doit = false;
			    }
			}
		});
		WorkHpD.setBounds(239, 165, 130, 32);
		
		Overtime = new Text(shell, SWT.BORDER | SWT.LEFT);
		Overtime.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		Overtime.addVerifyListener(new VerifyListener() {
			public void verifyText(VerifyEvent e) {
				// check if the text only contains numbers
			    if (!e.text.matches("[0-9.]*")) {
			      e.doit = false;
			    }
			    // check if the number of digits exceeds the limit
			    String currentText = ((Text) e.widget).getText();
			    int limit = 5;
			    if (currentText.length() + e.text.length() > limit) {
			      e.doit = false;
			    }
			}
		});
		Overtime.setBounds(239, 203, 130, 32);
		
		btnResult = new Button(shell, SWT.NONE);
		btnResult.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		btnResult.addSelectionListener(new SelectionAdapter() {
			@Override
			
			public void widgetSelected(SelectionEvent e) {
				String value01 = Wage.getText();
				String value02 = WorkDay.getText();
				String value03 = Absent.getText();
				String value04 = Leave.getText();
				String value05 = WorkHpD.getText();
				String value06 = Overtime.getText();
				
				if ( value01.matches("[0-9]+") && 
						value02.matches("[0-9]+") && 
							value03.matches("[0-9]+") &&	
								value04.matches("[0-9]+") && 
									value05.matches("[0-9]+") && 
										value06.matches("[0-9.]+") 						
					) {
					int number01 = Integer.parseInt(value01);
					int number02 = Integer.parseInt(value02);
					int number03 = Integer.parseInt(value03);
					int number04 = Integer.parseInt(value04);
					int number05 = Integer.parseInt(value05);
					int number06 = Integer.parseInt(value06);
					
					if( number02 > number03 + number04) {
						System.out.print("result: " + Calculatesalary(number01,number02,number03,number04,number05,number06));
						System.out.print("\nClose Form1\n");
						shell.close();
						form02 nextForm = new form02();
						nextForm.wage = number01;
						nextForm.workday = number02;
						nextForm.absent = number03;
						nextForm.leave = number04;
						nextForm.workhpd = number05;
						nextForm.overtime = number06;
						nextForm.open();
					}
					
				
				} else if (value01.matches("")) {
					LabelWarning.setText("กรุณากรอกข้อมูล ค่าแรงรายวัน");
				} else if (value02.matches("")) {
					LabelWarning.setText("กรุณากรอกข้อมูล วันทำงาน");
				} else if (value03.matches("")) {
					LabelWarning.setText("กรุณากรอกข้อมูล ลา");
				} else if (value04.matches("")) {
					LabelWarning.setText("กรุณากรอกข้อมูล ขาดงาน");
				} else if (value05.matches("")) {
					LabelWarning.setText("กรุณากรอกข้อมูล ชั่วโมงทำงานต่อวัน");
				} else if (value06.matches("")) {
					LabelWarning.setText("กรุณากรอกข้อมูล ชั่วโมงทำงานล่วงเวลา");
				}
				
			}
		});
		btnResult.setBounds(212, 272, 197, 60);
		btnResult.setText("คำนวน");
		
		btnRandom = new Button(shell, SWT.NONE);
		btnRandom.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Wage.setText(random(350,1000));
				WorkDay.setText(random(1,31));
				Absent.setText(random(0,6));
				Leave.setText(random(0,6));
				WorkHpD.setText(random(1,12));
				Overtime.setText(random(0,20));
			}
		});
		btnRandom.setText("สุ่ม");
		btnRandom.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		btnRandom.setBounds(36, 272, 170, 60);

	}
}
