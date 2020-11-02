package dad.calculadora.main;

import dad.calculadora.fxml.CalculadoraController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application {
	
	private CalculadoraController controller;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		controller = new CalculadoraController();
		
		Scene scene = new Scene(controller.getView(), 320, 200);
		primaryStage.setTitle("Calculadora");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}