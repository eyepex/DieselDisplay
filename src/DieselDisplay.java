
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



/**
 * TODO description
 */
abstract class DieselDisplay$$Base extends JFrame {

	Car car;
	public static void main(String[] args) {
		Car car = new Car();
		DieselDisplay meinJFrame = new DieselDisplay(car);
        meinJFrame.setVisible(true);
	}
	
	DieselDisplay$$Base(Car car){
		super();
		this.car = car;
		setTitle("Display Steuerung fuer Auto");
        setLayout(new GridLayout(0,1));
        addPanels();
        pack();
		
	}
	
	public void addPanels() {
	}
	
	
	
}

/**
 * TODO description
 */
abstract class DieselDisplay$$Tacho extends  DieselDisplay$$Base  {

	
	public void addPanels() {
		super.addPanels();
		JPanel tacho = new Tacho(car);
	    ((DieselDisplay) this).add(tacho);
	}
      // inherited constructors


	
	DieselDisplay$$Tacho ( Car car ) { super(car); }
}

/**
 * TODO description
 */
abstract class DieselDisplay$$Motorsteuerung extends  DieselDisplay$$Tacho  {
	
	public void addPanels() {
		super.addPanels();
		JPanel panelsc = new PanelSpeedControl(car);
	    ((DieselDisplay) this).add(panelsc); 
		JPanel panelmc = new PanelMotorControl(car);
	    ((DieselDisplay) this).add(panelmc); 
	}
      // inherited constructors


	
	DieselDisplay$$Motorsteuerung ( Car car ) { super(car); }
}

/**
 * TODO description
 */
public class DieselDisplay extends  DieselDisplay$$Motorsteuerung  {

	public void addPanels() {
		super.addPanels();
		JPanel panel = new PanelInnenausstattung();
	    ((DieselDisplay) this).add(panel);
	}
      // inherited constructors


	
	DieselDisplay ( Car car ) { super(car); }
	
}