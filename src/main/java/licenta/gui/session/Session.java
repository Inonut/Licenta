package licenta.gui.session;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import licenta.exception.TranzitionNotFound;
import licenta.gui.view.Panel;


public class Session {

	private StackPane container;
	private List<Panel> panels;
	private Map<KeySession, Panel> transitions;
	private KeySession keySession;
	private Panel currentPanel;
	
	/*public Session(StackPane group) {
		panels = new ArrayList<Panel>();
		transitions = new HashMap<String, Panel>();
		this.container = group;
		keySession = new KeySession(null, null);
	}
	*/
	
	public Session() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void addTransition(KeySession keySession, Panel panel){
		transitions.put(keySession, panel);
		
	}
	
	public void addPanel(Panel panel){
		panels.add(panel);
	}
	
	public Panel changeState(Panel panel, KeyChoise keyChoise) throws TranzitionNotFound{
		keySession.setPanel(panel);
		keySession.setChoise(keyChoise);
		
		container.getChildren().remove(currentPanel);
		if(keyChoise != null){
			try{
				//currentPanel = transitions.get(keySession);
				for(KeySession key : transitions.keySet()){
					if(key.equals(keySession)){
						currentPanel = transitions.get(key);
						break;
					}
				}
			}catch(Exception e){
				throw new TranzitionNotFound();
			}
		}
		container.getChildren().add((Node)currentPanel);
		
		return currentPanel;
		
	}
	
	public void run(){
		try {
			changeState(null, null);
		} catch (TranzitionNotFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Panel panel : panels){
			panel.init();
		}
	}
	
	public List<Panel> getPanels() {
		return panels;
	}
	public void setPanels(List<Panel> panels) {
		this.panels = panels;
	}
	public Map<KeySession, Panel> getTransitions() {
		return transitions;
	}

	public void setTransitions(Map<KeySession, Panel> transitions) {
		this.transitions = transitions;
	}

	public StackPane getContainer() {
		return container;
	}

	public void setContainer(StackPane container) {
		this.container = container;
	}

	public Panel getCurrentPanel() {
		return currentPanel;
	}

	public void setCurrentPanel(Panel currentPanel) {
		this.currentPanel = currentPanel;
	}

	public KeySession getKeySession() {
		return keySession;
	}

	public void setKeySession(KeySession keySession) {
		this.keySession = keySession;
	}
	
	
}
