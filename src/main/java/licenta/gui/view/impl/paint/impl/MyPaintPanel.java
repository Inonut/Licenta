package licenta.gui.view.impl.paint.impl;

import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import licenta.gui.presenter.Presenter;
import licenta.gui.presenter.impl.paint.PaintPresenter;
import licenta.gui.view.Panel;
import licenta.gui.view.impl.paint.PaintPanel;

public class MyPaintPanel extends PaintPanel{
	
	private Canvas canvas;
	private Button clear;

	@Override
	public Presenter getPresenter() {
		return this.presenter;
	}

	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = (PaintPresenter) presenter;
	}

	@Override
	public void updateModelFromView() {
		
	}

	@Override
	public void updateViewFromModel() {
		
	}
	
	@Override
	public void initComponent() {
		canvas = new Canvas();
		clear = new Button("Clear");
		
	}
	
	@Override
	public void addComponent() {
		
		Pane canvasPane = new Pane(canvas);
		
		canvasPane.setStyle("-fx-border-style: solid;"
                + "-fx-border-width: 1;"
                + "-fx-border-color: black");
		
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(canvasPane);
		borderPane.setBottom(clear);
		this.getChildren().add(borderPane);
		
		canvas.widthProperty().bind(canvasPane.widthProperty());
        canvas.heightProperty().bind(canvasPane.heightProperty());
	}

}
