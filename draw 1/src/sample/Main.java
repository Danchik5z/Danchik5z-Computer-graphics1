package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        //вращение
        Rotate rotate = new Rotate(20,1000, 200);
        //точка1
        Line point1 = new Line(500,500,500,500);
        point1.setStroke(Color.GREEN);
        //точка2
        Circle point2 = new Circle(400, 400,1, Color.BLUE);
        //линия
        Line line = new Line(100, 250, 500, 50);
        line.setStroke(Color.PURPLE);
        //прямоугольник
        Rectangle rec = new Rectangle(100,400,200,100);
        rec.setFill(Color.LIGHTBLUE);
        //круг
        Circle circle = new Circle(700, 300, 100, Color.YELLOW);
        circle.setStroke(Color.BLUE);
        //Эллипс
        Ellipse ellipse = new Ellipse(1000,200, 180,100);
        ellipse.setFill(Color.LIGHTGREEN);
        ellipse.getTransforms().addAll(rotate);
        Group root = new Group(point1, point2, line, rec, circle, ellipse);
        stage.setScene(new Scene(root, 1200, 600));
        stage.setTitle("Фигуры");
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}
