package jdbc;

import javafx.scene.layout.GridPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javax.sql.DataSource;


public class PersonDetails extends GridPane {
      protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final RowConstraints rowConstraints5;
    protected final Label label;
    protected final Label label0;
    protected final Label label1;
    protected final Label label2;
    protected final Label label3;
    protected final Label label4;
    protected final Label label5;
    protected final AnchorPane anchorPane;
    protected final Button updatebutton;
    protected final Button deletebutton;
    protected final Button firstbutton;
    protected final Button prevbutton;
    protected final Button nextbutton;
    protected final Button lastbutton;
    protected final AnchorPane anchorPane0;
    protected final Button newbutton;
    protected final TextField textField;
    protected final TextField textField0;
    protected final TextField textField1;
    protected final TextField textField2;
    protected final TextField textField3;
    protected final TextField textField4;

    DataSource datasource = null;

    Connection connection = null;
    Statement statement = null;
    ResultSet resultset = null;
    Alert alert = null;
    boolean new_flag;

    public PersonDetails() {
        datasource = MyDataSourceFactory.getMySQLDataSource();
        new_flag = false;

        try {
            connection = datasource.getConnection();
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            resultset = statement.executeQuery("select * from Persons ");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        rowConstraints5 = new RowConstraints();
        label = new Label();
        label0 = new Label();
        label1 = new Label();
        label2 = new Label();
        label3 = new Label();
        label4 = new Label();
        label5 = new Label();
        anchorPane = new AnchorPane();
        updatebutton = new Button();
        deletebutton = new Button();
        firstbutton = new Button();
        prevbutton = new Button();
        nextbutton = new Button();
        lastbutton = new Button();
        anchorPane0 = new AnchorPane();
        newbutton = new Button();
        textField = new TextField();
        textField0 = new TextField();
        textField1 = new TextField();
        textField2 = new TextField();
        textField3 = new TextField();
        textField4 = new TextField();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(304.0);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(156.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(480.0);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(444.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(30.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints5.setMinHeight(10.0);
        rowConstraints5.setPrefHeight(30.0);
        rowConstraints5.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        label.setPrefHeight(53.0);
        label.setPrefWidth(120.0);
        label.setText("ID");
        label.setFont(new Font(24.0));

        GridPane.setRowIndex(label0, 1);
        label0.setPrefHeight(53.0);
        label0.setPrefWidth(120.0);
        label0.setText("First name");
        label0.setFont(new Font(24.0));

        GridPane.setRowIndex(label1, 2);
        label1.setPrefHeight(50.0);
        label1.setPrefWidth(156.0);
        label1.setText("Middle name");
        label1.setFont(new Font(24.0));

        GridPane.setRowIndex(label2, 3);
        label2.setPrefHeight(50.0);
        label2.setPrefWidth(161.0);
        label2.setText("Last name");
        label2.setFont(new Font(24.0));

        GridPane.setRowIndex(label3, 5);
        label3.setPrefHeight(53.0);
        label3.setPrefWidth(120.0);
        label3.setText("Phone");
        label3.setFont(new Font(24.0));

        GridPane.setRowIndex(label4, 6);
        label4.setPrefHeight(53.0);
        label4.setPrefWidth(120.0);
        label4.setFont(new Font(24.0));

        GridPane.setRowIndex(label5, 4);
        label5.setPrefHeight(53.0);
        label5.setPrefWidth(156.0);
        label5.setText("E-mail");
        label5.setFont(new Font(24.0));

        GridPane.setColumnIndex(anchorPane, 1);
        GridPane.setRowIndex(anchorPane, 6);
        anchorPane.setPrefHeight(200.0);
        anchorPane.setPrefWidth(200.0);

        updatebutton.setLayoutY(15.0);
        updatebutton.setMnemonicParsing(false);
        updatebutton.setText("Update");
 

        updatebutton.setOnAction((e) -> {

            String id = textField.getText();
            String firstName = textField0.getText();
            String middleName = textField3.getText();
            String lastName = textField2.getText();
            String email = textField1.getText();
            String phone = textField4.getText();
            if (textField.getText().equals(null) || textField0.getText().equals("")
                    || textField1.getText().equals("") || textField2.getText().equals("")
                    || textField3.getText().equals("") || textField3.getText().equals("")) {
                alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Something wrong");
                alert.setHeaderText("Emty Field");
                alert.setContentText("You have to fill all fields ");
                alert.showAndWait().ifPresent(rs -> {
                    if (rs == ButtonType.OK) {
                        System.out.println("Pressed OK.");
                    }
                });
            } else {
                if (new_flag != true) {
                    try {
                        System.out.println("trying to Update Old record");
                        resultset.updateString(1, id);
                        resultset.updateString(2, firstName);
                        resultset.updateString(3, middleName);
                        resultset.updateString(4, lastName);
                        resultset.updateString(5, email);
                        resultset.updateString(6, phone);
                        resultset.updateRow();
                    } catch (SQLException ex) {
                        System.out.println("No Person tp update");
                    }
                } else {
                    try {
                        System.out.println("Add new record");
                        resultset.updateString(1, id);
                        resultset.updateString(2, firstName);
                        resultset.updateString(3, middleName);
                        resultset.updateString(4, lastName);
                        resultset.updateString(5, email);
                        resultset.updateString(6, phone);
                        resultset.insertRow();
                        new_flag = false;
                        updatebutton.setText("Update");
                    } catch (SQLException ex) {
                        alert = new Alert(AlertType.INFORMATION);
                        alert.setTitle("Something wrong");
                        alert.setHeaderText("Duplicate");
                        alert.setContentText("There is already an employee with that id");
                        alert.showAndWait().ifPresent(rs -> {
                            if (rs == ButtonType.OK) {
                                System.out.println("Pressed OK.");
                            }
                        });
                        System.out.println("There is already an employee with that id");

                    }
                }

            }

        });




        newbutton.setOnAction((e) -> {

            try {
                textField.clear();
                textField0.clear();
                textField1.clear();
                textField2.clear();
                textField3.clear();
                textField4.clear();
                resultset.moveToInsertRow();
                new_flag = true;
                updatebutton.setText("Add");

            } catch (SQLException ex) {
                System.out.println("This ID Already Exist, Check that you are entering a new employee");
            }
        });
        
          deletebutton.setLayoutX(76.0);

        deletebutton.setLayoutX(76.0);

        deletebutton.setMnemonicParsing(false);
        deletebutton.setText("Delete");

        deletebutton.setOnAction((e) -> {
            try {
                resultset.deleteRow();
                textField.setText("Deleted");
                textField0.setText("Deleted");
                textField1.setText("Deleted");
                textField2.setText("Deleted");
                textField3.setText("Deleted");
                textField4.setText("Deleted");

            } catch (SQLException ex) {
                System.out.println("No Person to delete");
            }
        });


    }
}