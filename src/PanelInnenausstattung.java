
import javax.swing.JPanel;
import javax.swing.JLabel;


/**
 * TODO description
 */
public class PanelInnenausstattung extends JPanel {

	PanelInnenausstattung(){
		super();
		addUIElements();
	}
	
	void addUIElements() {
		JLabel header = new JLabel("Innenausstattung: Ein paar Sitze.");
		((PanelInnenausstattung) this).add(header);
	}
	
}