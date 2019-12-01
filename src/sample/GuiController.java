package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class GuiController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        datePicker.setValue(LocalDate.now());
    }

    @FXML
    Button addButton;
    @FXML
    TextField descriptionTextFild;
    @FXML
    DatePicker datePicker;
    @FXML
    ListView<LocalEvent> eventList;

    ObservableList<LocalEvent> list = FXCollections.observableArrayList();


    @FXML
    private void addEvent(Event e) {
        list.add(new LocalEvent(datePicker.getValue(), descriptionTextFild.getText()));
        eventList.setItems(list);
        refresh();
    }

    private void refresh() {
        datePicker.setValue(LocalDate.now());
        descriptionTextFild.setText(null);
    }

}
