package dad.calculadora.fxml;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.util.converter.NumberStringConverter;

public class CalculadoraController implements Initializable {
	
	private CalculadoraModel calculadora = new CalculadoraModel();

	@FXML
	private BorderPane view;
	
	@FXML
	private TextField soluciontf;
	
	public CalculadoraController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/View.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		soluciontf.textProperty().bind(calculadora.pantallaProperty());
	}


	@FXML
	public void onActionInsertar(ActionEvent e) {
		char num = ((Button)e.getSource()).getText().charAt(0);
		calculadora.insertar(num);
	}
	
	@FXML
	public void onActionBorrarTodo(ActionEvent e) {
		calculadora.borrarTodo();
	}
	
	@FXML
	public void onActionBorrar(ActionEvent e) {
		calculadora.borrar();
	}
	
	@FXML
	public void onActionComa(ActionEvent e) {
		calculadora.insertarComa();
	}
	
	@FXML
	public void onActionOperar(ActionEvent e) {
		char operando = ((Button)e.getSource()).getText().charAt(0);
		calculadora.operar(operando);
	}

	public BorderPane getView() {
		return view;
	}

	public CalculadoraModel getModel() {
		return calculadora;
	}

}
