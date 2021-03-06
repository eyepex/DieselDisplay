

import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;



/**
 * TODO description
 */
abstract class PanelMotorControl$$Motorsteuerung  extends JPanel {
	
	Car car;
	String startText = "Start!";
	JButton buttonStart = new JButton(startText);
	
	PanelMotorControl$$Motorsteuerung(Car car){
		super();
		this.car = car;
		addUIElements();
	}
	
	void addUIElements() {
		buttonStart.setText(startText);
		buttonStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(car.isAn()) {
					car.setAn(false);
				} else {
					car.setAn(true);
				}
				toggleButtonText();
			}
		});
        ((PanelMotorControl) this).add(buttonStart);
	}
	
	void toggleButtonText() {
		if(car.isAn()) buttonStart.setText("Aus!");
		else buttonStart.setText(startText);
	}
	
	
}

/**
 * TODO description
 */
public class PanelMotorControl extends  PanelMotorControl$$Motorsteuerung  {

	void addUIElements() {
		((PanelMotorControl) this).startText = "Zünden!";
		super.addUIElements();
	}
      // inherited constructors


	
	PanelMotorControl ( Car car ) { super(car); }
}