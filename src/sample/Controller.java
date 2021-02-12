package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {


    private double x; //сумма кредита
    private double y; //процентная ставка
    private double z; //срок
    double f; // расчет помесячного процента
    double s; //срок в месяцах

    @FXML
    public Button clickSend0;
    @FXML
    public TextArea textArea;
    @FXML
    public TextField textStavka;
    @FXML
    public TextField textSumma;
    @FXML
    public TextField textYear;



    public void clickSend0(ActionEvent actionEvent) {
        CalculationOfInterest xv = new CalculationOfInterest();

        double x = Double.parseDouble(textSumma.getText());
        double y = Double.parseDouble(textStavka.getText());
        double z = (Double.parseDouble(textYear.getText()));
        double i = Math.floor (xv.calculationOfInterest(x, y, z));
        double k = i*12;
        double w = (x-k)*(-1);
        double s = (w/z);
        double d =Math.floor ( s/12);
        double f = w/x*100;


        textArea.appendText("Ежемесячный платеж " + i + "\n" + "Общая сумма выплат за период " + k + "\n" + "Сумма переплат общее/в год/в мес "+ w +"/" + s + "/"+ d +"\n" + "Общий процент кредита за период "+ f +"%"+"\n");
        textSumma.requestFocus();

    }


    public void textSumma(ActionEvent actionEvent) {

        textArea.appendText("Сумма кредита " + textSumma.getText() + "\n");
        textStavka.requestFocus();

    }

    public void textStavka(ActionEvent actionEvent) {
        textArea.appendText("Процентная ставка " + textStavka.getText() + "\n");
        textYear.requestFocus();

    }

    public void textYear(ActionEvent actionEvent) {
        textArea.appendText("Срок кредитования " + textYear.getText() + "\n");
        clickSend0.requestFocus();

    }

    public void clicCleen(ActionEvent actionEvent) {
        textArea.clear();

    }


}
