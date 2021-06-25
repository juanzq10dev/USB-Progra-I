package excel.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {

            TableView<String> table = new TableView<>();

            TableColumn<String, String> voidColumn = new TableColumn<>("");
            voidColumn.setReorderable(false);
            table.getColumns().add(voidColumn);

            for (char alphabet = 'A'; alphabet <= 'Z'; alphabet++) {
                TableColumn<String, String> column = new TableColumn<>(alphabet + "");
                column.setCellValueFactory(new PropertyValueFactory<>(""));
                column.setReorderable(false);
                table.getColumns().add(column);
            }

            for (int i = 0; i <= 50; i++) {
                table.getItems().add("");
            }

            table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

            TextField box = new TextField();
            BorderPane root = new BorderPane();
            root.setCenter(table);
            root.setTop(box);

            Scene scene = new Scene(root, Double.MAX_VALUE, 1000);
            primaryStage.setScene(scene);
            primaryStage.setTitle("X-cel Team project");
            primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}