
import javax.swing.JPanel;
import javax.swing.JLabel;


/**
 * TODO description
 */
public class Tacho extends JPanel implements Listener {

	Car car;
	double speed = 0.0;
	JLabel speedInfo = new JLabel();
	
	Tacho(Car car){
		super();
		this.car = car;
		car.listen(this);
		inform();
		addUIElements();
	}
	
	public void inform() {
		speed = car.getSpeed();
		((Tacho) this).speedInfo.setText(String.valueOf(speed));
	}
	
	private void addUIElements() {
		JLabel header = new JLabel("Speed:");
		((Tacho) this).add(header);
		((Tacho) this).add(speedInfo);
	}
}