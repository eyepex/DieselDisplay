
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * TODO description
 */
public class PanelSpeedControl extends JPanel {
	
	Car car;

	JButton buttonGas = new JButton("Gas");
    JButton buttonBreak = new JButton("Bremse");
    
	PanelSpeedControl(Car car){
		super();
		this.car = car;
		addUIElements();
	}
	
	private void addUIElements() {
		buttonGas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(car.isAn()) {
					car.setSpeed(car.getSpeed()+1);
				}
			}
		});
		buttonBreak.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				car.setSpeed(Math.max(car.getSpeed()-2,0));
			}
		});
        ((PanelSpeedControl) this).add(buttonGas);
        ((PanelSpeedControl) this).add(buttonBreak);
	}
}