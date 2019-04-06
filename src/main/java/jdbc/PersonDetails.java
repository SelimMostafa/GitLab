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
        
          GridPane.setRowIndex(anchorPane0, 6);
        anchorPane0.setPrefHeight(200.0);
        anchorPane0.setPrefWidth(200.0);

        newbutton.setLayoutX(49.0);
        newbutton.setLayoutY(15.0);
        newbutton.setMnemonicParsing(false);
        newbutton.setText("New");
          firstbutton.setLayoutX(148.0);
        firstbutton.setLayoutY(15.0);
        firstbutton.setMnemonicParsing(false);
        firstbutton.setText("First");

        firstbutton.setOnAction((e) -> {
            firsView();

        });

        prevbutton.setLayoutX(213.0);
        prevbutton.setLayoutY(15.0);
        prevbutton.setMnemonicParsing(false);
        prevbutton.setText("Previous");

        prevbutton.setOnAction((e) -> {
            try {
                if (resultset.previous() == true) {
                    textField.setText(resultset.getString(1));
                    textField0.setText(resultset.getString(2));
                    textField3.setText(resultset.getString(3));
                    textField2.setText(resultset.getString(4));
                    textField1.setText(resultset.getString(5));
                    textField4.setText(resultset.getString(6));
                    System.out.println("prev row");
                } else {
                    resultset.next();
                    System.out.println("No more rows");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
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

        GridPane.setColumnIndex(textField, 1);
        textField.setPrefHeight(68.0);
        textField.setPrefWidth(444.0);

        GridPane.setColumnIndex(textField0, 1);
        GridPane.setRowIndex(textField0, 1);
        textField0.setPrefHeight(68.0);
        textField0.setPrefWidth(444.0);

        GridPane.setColumnIndex(textField1, 1);
        GridPane.setRowIndex(textField1, 4);
        textField1.setPrefHeight(68.0);
        textField1.setPrefWidth(444.0);

        GridPane.setColumnIndex(textField2, 1);
        GridPane.setRowIndex(textField2, 3);
        textField2.setPrefHeight(68.0);
        textField2.setPrefWidth(444.0);

        GridPane.setColumnIndex(textField3, 1);
        GridPane.setRowIndex(textField3, 2);
        textField3.setPrefHeight(68.0);
        textField3.setPrefWidth(444.0);

        GridPane.setColumnIndex(textField4, 1);
        GridPane.setRowIndex(textField4, 5);
        textField4.setPrefHeight(68.0);
        textField4.setPrefWidth(444.0);

        getColumnConstraints().add(columnConstraints);
        getColumnConstraints().add(columnConstraints0);
        getRowConstraints().add(rowConstraints);
        getRowConstraints().add(rowConstraints0);
        getRowConstraints().add(rowConstraints1);
        getRowConstraints().add(rowConstraints2);
        getRowConstraints().add(rowConstraints3);
        getRowConstraints().add(rowConstraints4);
        getRowConstraints().add(rowConstraints5);
        getChildren().add(label);
        getChildren().add(label0);
        getChildren().add(label1);
        getChildren().add(label2);
        getChildren().add(label3);
        getChildren().add(label4);
        getChildren().add(label5);
        anchorPane.getChildren().add(updatebutton);
        anchorPane.getChildren().add(deletebutton);
        anchorPane.getChildren().add(firstbutton);
        anchorPane.getChildren().add(prevbutton);
        anchorPane.getChildren().add(nextbutton);
        anchorPane.getChildren().add(lastbutton);
        getChildren().add(anchorPane);
        anchorPane0.getChildren().add(newbutton);
        getChildren().add(anchorPane0);
        getChildren().add(textField);
        getChildren().add(textField0);
        getChildren().add(textField1);
        getChildren().add(textField2);
        getChildren().add(textField3);
        getChildren().add(textField4);
        firsView();

    }

    private void firsView() {
        try {
            resultset.first();
            textField.setText(resultset.getString(1));
            textField0.setText(resultset.getString(2));
            textField3.setText(resultset.getString(3));
            textField2.setText(resultset.getString(4));
            textField1.setText(resultset.getString(5));
            textField4.setText(resultset.getString(6));
            System.out.println("Show first");
        } catch (SQLException ex) {
            System.out.println("No more rows");
        }
        
        
        
        
    }
}