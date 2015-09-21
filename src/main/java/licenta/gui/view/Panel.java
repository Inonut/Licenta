package licenta.gui.view;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import licenta.gui.presenter.Presenter;

public abstract class Panel extends StackPane{

	public abstract Presenter getPresenter();

	public abstract void setPresenter(Presenter presenter);

	public abstract void updateModelFromView();

	public abstract void updateViewFromModel();
	
	public abstract void initComponent();
	
	public abstract void addComponent();
	
	public void init(){
		this.getPresenter().setView(this);
		this.initComponent();
		this.addComponent();
	}
}
