package licenta.gui.session;

import licenta.gui.view.Panel;



public class KeySession{

	private Panel panel;
	private KeyChoise choise;
	
	public KeySession(Panel panel, KeyChoise showDb) {
		super();
		this.panel = panel;
		this.choise = showDb;
	}
	
	public KeySession() {
		// TODO Auto-generated constructor stub
	}
	
	public Panel getPanel() {
		return panel;
	}
	public void setPanel(Panel panel) {
		this.panel = panel;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		KeySession o = (KeySession) obj;
		if(choise.compareTo(o.getChoise()) ==0 && panel.equals(o.getPanel())){
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return panel.toString()+choise;
	}


	public KeyChoise getChoise() {
		return choise;
	}


	public void setChoise(KeyChoise choise) {
		this.choise = choise;
	}
	
	
}
