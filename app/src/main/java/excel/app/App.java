package excel.app;

import excel.list.Position;
import excel.list.Table;
import javafx.application.Application;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Table tabular = new Table();
        TableView<Position> table = new TableView<>();
        table.setEditable(true);

        TableColumn<Position, Integer> voidColumn = new TableColumn<>("");
        voidColumn.setCellValueFactory(
                data -> new SimpleIntegerProperty(data.getValue().obtainRowValue() + 1).asObject());
        table.getColumns().add(voidColumn);

        for (char alphabet = 'A'; alphabet <= 'Z'; alphabet++) {
            TableColumn<Position, String> column = new TableColumn<>(alphabet + "");
            column.setCellFactory(TextFieldTableCell.forTableColumn());

            column.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Position, String>>() {
                @Override
                public void handle(CellEditEvent<Position, String> event) {
                    TablePosition positionTable = event.getTablePosition();
                    int row = positionTable.getRow() + 1;
                    int columnValue = positionTable.getColumn() + 64;
                    char column = (char) columnValue;

                    Position position = new Position(column, row);
                    tabular.write(event.getNewValue(), position);
                }
            });
            
            column.setMinWidth(90);
            table.getColumns().add(column);
            column.setReorderable(false);
        }

        for (int i = 1; i <= 50; i++) {
            Position position = new Position('B', i);
            table.getItems().add(position);
        }

        Scene scene = new Scene(new BorderPane(table), Double.MAX_VALUE, 1000);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}