
import java.util.ArrayList;



/**
 * TODO description
 */
public class Car {

	private boolean an = false;
	private int speed = 0;
	
	public void setAn(boolean status) {
		((Car) this).an = status;
		informListeners();
	}
	
	public boolean isAn() {
		return ((Car) this).an;
	}
	
	public void setSpeed(int p1) {
		if(p1 == ((Car) this).speed) return;
		((Car) this).speed = p1;
		informListeners();
	}
	
	public int getSpeed() {
		return ((Car) this).speed;
	}
	
	//ArrayList<Listener> = new ArrayList(); //ERROR bei <>
	Listener listener;
	Listener listener2;
	private void informListeners() {
		//for (Listener listener : listeners) {
			if (listener!= null) {
				listener.inform(); 
			}
			if (listener2!= null) {
				listener2.inform(); 
			}
		//}
	}
	
	public void listen(Listener l) {
		//listeners.add(l);
		listener = l;
	}
	public void listen2(Listener l) {
		//listeners.add(l);
		listener2 = l;
	}
	
}