package licenta.gui.presenter;

import licenta.gui.model.Model;
import licenta.gui.view.Panel;

public abstract class Presenter{
	public abstract Model getModel();

	public abstract void setModel(Model model);

	public abstract Panel getView();

	public abstract void setView(Panel panel);
}
