package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {
    public static int sumaCifara(int n) {
        int broj = n;
        if(broj<0) broj=-broj;
        int suma = 0;
        while(broj != 0) {
            int cifre = broj % 10;
            suma = suma + cifre;
            broj = broj / 10;
        }
        return suma;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
       /* System.out.println("Unesite n: ");
        int n = 0;
        Scanner unos = new Scanner(System.in);
        n = unos.nextInt();
        sumaCifara(n);
        for(int i = 0; i<n; i++) {
            if(i%sumaCifara(n)==0)
                System.out.println(i);
        }*/

        launch(args);
    }
}
