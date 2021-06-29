package excel.app;

import javax.print.event.PrintJobAdapter;

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
        Table table = new Table();
        TableView<Position> tableView = new TableView<>();
        tableView.setEditable(true);

        createVoidColumn(tableView);

        createColumns(tableView, table);

        Scene scene = new Scene(new BorderPane(tableView), Double.MAX_VALUE, 1000);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void createVoidColumn(TableView<Position> tableView) {
        TableColumn<Position, Integer> voidColumn = new TableColumn<>("");
        voidColumn.setCellValueFactory(
                data -> new SimpleIntegerProperty(data.getValue().obtainRowValue() + 1).asObject());
        tableView.getColumns().add(voidColumn);
        fillColumn(tableView);

    }
    
    private void fillColumn(TableView<Position> tableView) {
        for (int i = 1; i <= 50; i++) {
            Position position = new Position('B', i);
            tableView.getItems().add(position);
        }

    }
    public void createColumns(TableView<Position> tableView, Table table) {
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
                    table.write(event.getNewValue(), position);
                    
                }
            });
            column.setMinWidth(90);
            tableView.getColumns().add(column);
            column.setReorderable(false);
        }
    }
                  
}
