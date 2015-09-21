package licenta.gui.model.impl;

import javafx.scene.canvas.GraphicsContext;
import licenta.gui.model.Model;

public class PaintModel extends Model {

	private GraphicsContext graphicsContext;
	private Double width;
	private Double height;
	public GraphicsContext getGraphicsContext() {
		return graphicsContext;
	}
	public void setGraphicsContext(GraphicsContext graphicsContext) {
		this.graphicsContext = graphicsContext;
	}
	public Double getWidth() {
		return width;
	}
	public void setWidth(Double width) {
		this.width = width;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	
	
}
