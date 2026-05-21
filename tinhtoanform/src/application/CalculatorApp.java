package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CalculatorApp extends Application {
    private TextField display;

    @Override
    public void start(Stage primaryStage) {
        display = new TextField();
        display.setEditable(false);

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(5);
        grid.setVgap(5);

        String[] buttons = {
            "7","8","9","/",
            "4","5","6","*",
            "1","2","3","-",
            "0",".","=","+"
        };

        int row = 1, col = 0;
        for (String text : buttons) {
            Button btn = new Button(text);
            btn.setMinSize(50, 50);
            btn.setOnAction(e -> handleButton(text));
            grid.add(btn, col, row);
            col++;
            if (col > 3) {
                col = 0;
                row++;
            }
        }

        grid.add(display, 0, 0, 4, 1);

        Scene scene = new Scene(grid, 250, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator App");
        primaryStage.show();
    }

    private void handleButton(String value) {
        if (value.equals("=")) {
            try {
                double result = eval(display.getText());
                display.setText(String.valueOf(result));
            } catch (Exception e) {
                display.setText("Error");
            }
        } else {
            display.appendText(value);
        }
    }

    // Hàm tính toán chỉ cộng, trừ, nhân, chia
    private double eval(String expr) {
        expr = expr.replaceAll("\\s+", ""); // bỏ khoảng trắng

        if (expr.contains("+")) {
            String[] parts = expr.split("\\+");
            return Double.parseDouble(parts[0]) + Double.parseDouble(parts[1]);
        } else if (expr.contains("-")) {
            String[] parts = expr.split("\\-");
            return Double.parseDouble(parts[0]) - Double.parseDouble(parts[1]);
        } else if (expr.contains("*")) {
            String[] parts = expr.split("\\*");
            return Double.parseDouble(parts[0]) * Double.parseDouble(parts[1]);
        } else if (expr.contains("/")) {
            String[] parts = expr.split("\\/");
            return Double.parseDouble(parts[0]) / Double.parseDouble(parts[1]);
        }

        return 0; // nếu không có toán tử hợp lệ
    }

    public static void main(String[] args) {
        launch(args);
    }
}
