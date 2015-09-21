package licenta.gui;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import licenta.gui.model.Model;
import licenta.gui.presenter.Presenter;
import licenta.gui.session.KeyChoise;
import licenta.gui.session.KeySession;
import licenta.gui.session.Session;
import licenta.gui.view.Panel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test extends Application{
	
	public static final ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		Panel panel = (Panel) context.getBean("paintPanel");
		
		panel.getPresenter();
		panel.getPresenter().getModel();
		panel.getPresenter().getView();
		
		
		StackPane group = new StackPane();
		
		group.getChildren().add(panel);
		
		Scene scene = new Scene(group,400,400);
		stage.setScene(scene);
		stage.show();
	}

}
