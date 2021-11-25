package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ViewController {
	@FXML
	private Button btCalcula;

	@FXML
	private TextField txtNumero1;

	@FXML
	private TextField txtNumero2;

	@FXML
	private TextField txtResultado;

	@FXML
	public void btCalculaAction() {
		Double numero1, numero2, resultado;
		try {
			numero1 = Double.parseDouble(txtNumero1.getText().replace(',', '.'));//muda de virgula para decimal
			numero2 = Double.parseDouble(txtNumero2.getText().replace(',', '.'));
			resultado = numero1 + numero2;
			txtResultado.setText(resultado.toString());
		} catch (NumberFormatException e) {
			System.out.println("Formato numérico inválido");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
