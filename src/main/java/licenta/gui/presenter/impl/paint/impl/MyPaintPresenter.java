package licenta.gui.presenter.impl.paint.impl;

import licenta.gui.model.Model;
import licenta.gui.model.impl.PaintModel;
import licenta.gui.presenter.impl.paint.PaintPresenter;
import licenta.gui.view.Panel;
import licenta.gui.view.impl.paint.PaintPanel;

public class MyPaintPresenter extends PaintPresenter {

	@Override
	public Model getModel() {
		return this.model;
	}

	@Override
	public void setModel(Model model) {
		this.model = (PaintModel) model;
	}

	@Override
	public Panel getView() {
		return this.panel;
	}

	@Override
	public void setView(Panel panel) {
		this.panel = (PaintPanel) panel;
	}

}
