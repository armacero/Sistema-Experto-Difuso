package sistema;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 ** @author Antony-PC
 **/
public class interfaz extends Application implements EventHandler<ActionEvent>{
    
    public Stage _primaryStage;
    //Inicio
    public Button btnInicioCompetencia;
    public Button btnInicioEvaluar;
    public Button btnInicioSalir;
    //Competencias
    public Label lblCompetencia;
    public ComboBox<String> cbCompetencia;
    public Button btnPuntos;
    public Button btnCompetencia;
    public Button btnRegresar;
    //Agregar Competencias
    public Label lblAgregarCompetencia;
    public Label lblAgregarNombre;
    public TextField tfCompetencia;
    public Label lblAgregarEtiquetas;
    public TextField tfAgregarEtiquetas;
    public Button btnAgregarCompetencia;
    public Button btnAgregarRegresar;
    //Agregar Puntos
    public Label lblAgregarPuntos;
    public ComboBox<String> cbAgregarPuntos;
    public TextField tfAgregarPuntos;
    public Button btnAgregarPuntos;
    public Button btnAgregarPuntosRegresar;
    //Evaluar
    public Label lblCom1;
    public TextField tfCom1;
    public Label lblCom2;
    public TextField tfCom2;
    public Label lblCom3;
    public TextField tfCom3;
    public Label lblCom4;
    public TextField tfCom4;
    public Label lblCom5;
    public TextField tfCom5;
    public Label lblCom6;
    public TextField tfCom6;
    public Label lblCom7;
    public TextField tfCom7;
    public Label lblCom8;
    public TextField tfCom8;
    public Button btnCalcular;
    public Button btnEvaluarRegresar;
        
    @Override
    public void start(Stage primaryStage) {
        _primaryStage = primaryStage;
        Inicio();
    }
    
    public void Inicio(){
        StackPane root = new StackPane();
        root.setStyle("-fx-background-color: #FFFFFF;");
        Scene scene = new Scene(root, 300, 300);
        _primaryStage.setTitle("Inicio");
        _primaryStage.setScene(scene);
        _primaryStage.setResizable(true);
        _primaryStage.show();
        //////////////////////////////////////////////////////
        
        HBox Seccion1 = new HBox(10);
        btnInicioCompetencia = new Button("Competencia");
        btnInicioCompetencia.setPrefSize(100, 30);
        btnInicioCompetencia.setOnAction(this);
        btnInicioEvaluar = new Button("Evaluar");
        btnInicioEvaluar.setPrefSize(100, 30);
        btnInicioEvaluar.setOnAction(this);
        Seccion1.setAlignment(Pos.CENTER);
        Seccion1.setPrefSize(200, 100);
        Seccion1.getChildren().addAll(btnInicioCompetencia,btnInicioEvaluar);
        
        HBox Seccion2 = new HBox(10);
        btnInicioSalir = new Button("Salir");
        btnInicioSalir.setPrefSize(100, 30);
        btnInicioSalir.setOnAction(this);
        Seccion2.setAlignment(Pos.CENTER);
        Seccion2.setPrefSize(200, 100);
        Seccion2.getChildren().addAll(btnInicioSalir);
        
        VBox UnirSecciones = new VBox(10);
        UnirSecciones.setAlignment(Pos.CENTER);
        UnirSecciones.getChildren().addAll(Seccion1,Seccion2);
        
        //////////////////////////////////////////////////////
        VBox Todo = new VBox();
        Todo.setAlignment(Pos.TOP_CENTER);
        Todo.getChildren().addAll(UnirSecciones);
        root.getChildren().addAll(Todo);
    }
    public void Competencias(){
        StackPane root = new StackPane();
        root.setStyle("-fx-background-color: #FFFFFF;");
        Scene scene = new Scene(root, 500, 300);
        _primaryStage.setTitle("Competencias");
        _primaryStage.setScene(scene);
        _primaryStage.setResizable(false);
        _primaryStage.show();
        //////////////////////////////////////////////////////
        
        HBox Seccion1 = new HBox(10);
        lblCompetencia = new Label("Competencias");
        lblCompetencia.setPrefSize(100, 30);
        cbCompetencia = new ComboBox<String>();
        //Llenar las competencias
        Archivo arch = new Archivo();
        String[] competencias = arch.LeerCompetencias();
        for(int i=0; i < competencias.length; i++){
            String[] tem = competencias[i].split(" ");
            cbCompetencia.getItems().addAll(tem[1]);
        }
        cbCompetencia.setPrefWidth(200);
        cbCompetencia.setPrefHeight(30);
        cbCompetencia.setStyle("-fx-text-inner-color: black;"
                + "-fx-background-color: white;"
                + "-fx-font: 11pt Tahoma;");
        cbCompetencia.setPromptText("");
        btnPuntos = new Button("Agregar Puntos");
        btnPuntos.setPrefSize(100, 30);
        btnPuntos.setOnAction(this);
        Seccion1.setAlignment(Pos.CENTER);
        Seccion1.setPrefSize(200, 150);
        Seccion1.getChildren().addAll(lblCompetencia,cbCompetencia,btnPuntos);
        
        HBox Seccion2 = new HBox(10);
        btnCompetencia = new Button("Agregar Competencia");
        btnCompetencia.setPrefSize(200, 30);
        btnCompetencia.setOnAction(this);
        btnRegresar = new Button("Regresar");
        btnRegresar.setPrefSize(200, 30);
        btnRegresar.setOnAction(this);
        Seccion2.setAlignment(Pos.CENTER);
        Seccion2.setPrefSize(200, 150);
        Seccion2.getChildren().addAll(btnCompetencia,btnRegresar);
        
        VBox UnirSecciones = new VBox(10);
        UnirSecciones.setAlignment(Pos.CENTER);
        UnirSecciones.getChildren().addAll(Seccion1,Seccion2);
        
        //////////////////////////////////////////////////////
        VBox Todo = new VBox();
        Todo.setAlignment(Pos.TOP_CENTER);
        Todo.getChildren().addAll(UnirSecciones);
        root.getChildren().addAll(Todo);
    }
    
    public void AgregarCompetencia(){
        StackPane root = new StackPane();
        root.setStyle("-fx-background-color: #FFFFFF;");
        Scene scene = new Scene(root, 500, 300);
        _primaryStage.setTitle("Competencias");
        _primaryStage.setScene(scene);
        _primaryStage.setResizable(false);
        _primaryStage.show();
        //////////////////////////////////////////////////////
        
        HBox Seccion1 = new HBox(10);
        lblAgregarCompetencia = new Label("");
        lblAgregarCompetencia.setPrefSize(200, 30);
        Seccion1.setAlignment(Pos.CENTER);
        Seccion1.setPrefSize(200, 50);
        Seccion1.getChildren().addAll(lblAgregarCompetencia);
        
        HBox Seccion2 = new HBox(10);
        lblAgregarNombre = new Label("Nombre");
        lblAgregarNombre.setPrefSize(200, 30);
        tfCompetencia = new TextField();
        tfCompetencia.setPrefSize(200, 30);
        lblAgregarEtiquetas = new Label("Etiquetas");
        lblAgregarEtiquetas.setPrefSize(100, 30);
        tfAgregarEtiquetas = new TextField();
        tfAgregarEtiquetas.setPrefSize(100, 30);
        Seccion2.setAlignment(Pos.CENTER);
        Seccion2.setPrefSize(200, 150);
        Seccion2.getChildren().addAll(lblAgregarNombre,tfCompetencia);
        
        HBox Seccion3 = new HBox(10);
        lblAgregarEtiquetas = new Label("Etiquetas");
        lblAgregarEtiquetas.setPrefSize(200, 30);
        tfAgregarEtiquetas = new TextField();
        tfAgregarEtiquetas.setPrefSize(200, 30);
        Seccion3.setAlignment(Pos.CENTER);
        Seccion3.setPrefSize(200, 150);
        Seccion3.getChildren().addAll(lblAgregarEtiquetas,tfAgregarEtiquetas);
        
        HBox Seccion4 = new HBox(10);
        btnAgregarCompetencia = new Button("Agregar");
        btnAgregarCompetencia.setPrefSize(200, 30);
        btnAgregarCompetencia.setOnAction(this);
        btnAgregarRegresar = new Button("Regresar");
        btnAgregarRegresar.setPrefSize(200, 30);
        btnAgregarRegresar.setOnAction(this);
        Seccion4.setAlignment(Pos.CENTER);
        Seccion4.setPrefSize(200, 150);
        Seccion4.getChildren().addAll(btnAgregarCompetencia,btnAgregarRegresar);
        
        VBox UnirSecciones = new VBox(10);
        UnirSecciones.setAlignment(Pos.CENTER);
        UnirSecciones.getChildren().addAll(Seccion1,Seccion2,Seccion3,Seccion4);
        
        //////////////////////////////////////////////////////
        VBox Todo = new VBox();
        Todo.setAlignment(Pos.TOP_CENTER);
        Todo.getChildren().addAll(UnirSecciones);
        root.getChildren().addAll(Todo);
    }
    public void AgregarPuntos(String competencia){
        StackPane root = new StackPane();
        root.setStyle("-fx-background-color: #FFFFFF;");
        Scene scene = new Scene(root, 500, 300);
        _primaryStage.setTitle("Puntos");
        _primaryStage.setScene(scene);
        _primaryStage.setResizable(false);
        _primaryStage.show();
        //////////////////////////////////////////////////////
        
        HBox Seccion1 = new HBox(10);
        Label lblC1 = new Label("Competencia");
        lblC1.setPrefSize(200, 30);
        lblAgregarPuntos = new Label(competencia);
        lblAgregarPuntos.setPrefSize(200, 30);
        Seccion1.setAlignment(Pos.CENTER);
        Seccion1.setPrefSize(200, 50);
        Seccion1.getChildren().addAll(lblC1,lblAgregarPuntos);
        
        HBox Seccion2 = new HBox(10);
        Label lblC2 = new Label("Puntos");
        lblC2.setPrefSize(100, 30);
        cbAgregarPuntos = new ComboBox<String>();
        cbAgregarPuntos.setPrefSize(100,30);
        Archivo arch = new Archivo();
        String[] competencias = arch.LeerEtiquetas(competencia);
        for(int i=2; i < competencias.length; i++){
            cbAgregarPuntos.getItems().addAll(competencias[i]);
        }
        tfAgregarPuntos = new TextField();
        tfAgregarPuntos.setPrefSize(200, 30);
        Seccion2.setAlignment(Pos.CENTER);
        Seccion2.setPrefSize(200, 50);
        Seccion2.getChildren().addAll(lblC2,cbAgregarPuntos,tfAgregarPuntos);
        
        HBox Seccion3 = new HBox(10);
        btnAgregarPuntos = new Button("Agregar");
        btnAgregarPuntos.setPrefSize(200, 30);
        btnAgregarPuntos.setOnAction(this);
        btnAgregarPuntosRegresar = new Button("Regresar");
        btnAgregarPuntosRegresar.setPrefSize(200, 30);
        btnAgregarPuntosRegresar.setOnAction(this);
        Seccion3.setAlignment(Pos.CENTER);
        Seccion3.setPrefSize(200, 50);
        Seccion3.getChildren().addAll(btnAgregarPuntos,btnAgregarPuntosRegresar);
        
        VBox UnirSecciones = new VBox(10);
        UnirSecciones.setAlignment(Pos.CENTER);
        UnirSecciones.getChildren().addAll(Seccion1,Seccion2,Seccion3);
        
        //////////////////////////////////////////////////////
        VBox Todo = new VBox();
        Todo.setAlignment(Pos.TOP_CENTER);
        Todo.getChildren().addAll(UnirSecciones);
        root.getChildren().addAll(Todo);
    }
    
    public void Evaluar(){
        StackPane root = new StackPane();
        root.setStyle("-fx-background-color: #FFFFFF;");
        Scene scene = new Scene(root, 500, 400);
        _primaryStage.setTitle("Evaluar");
        _primaryStage.setScene(scene);
        _primaryStage.setResizable(false);
        _primaryStage.show();
        //////////////////////////////////////////////////////
        
        HBox Seccion1 = new HBox(10);
        lblCom1 = new Label("Solucion");
        lblCom1.setPrefSize(100, 10);
        tfCom1 = new TextField();
        tfCom1.setPrefSize(100, 10);
        tfCom1.setOnAction(this);
        Seccion1.setAlignment(Pos.CENTER);
        Seccion1.setPrefSize(200, 50);
        Seccion1.getChildren().addAll(lblCom1,tfCom1);
        
        HBox Seccion2 = new HBox(10);
        lblCom2 = new Label("Trabajo");
        lblCom2.setPrefSize(100, 10);
        tfCom2 = new TextField();
        tfCom2.setPrefSize(100, 10);
        tfCom2.setOnAction(this);
        Seccion2.setAlignment(Pos.CENTER);
        Seccion2.setPrefSize(200, 50);
        Seccion2.getChildren().addAll(lblCom2,tfCom2);
        
        HBox Seccion3 = new HBox(10);
        lblCom3 = new Label("Conocimientos");
        lblCom3.setPrefSize(100, 10);
        tfCom3 = new TextField();
        tfCom3.setPrefSize(100, 10);
        tfCom3.setOnAction(this);
        Seccion3.setAlignment(Pos.CENTER);
        Seccion3.setPrefSize(200, 50);
        Seccion3.getChildren().addAll(lblCom3,tfCom3);
        
        HBox Seccion4 = new HBox(10);
        lblCom4 = new Label("Investigacion");
        lblCom4.setPrefSize(100, 10);
        tfCom4 = new TextField();
        tfCom4.setPrefSize(100, 10);
        tfCom4.setOnAction(this);
        Seccion4.setAlignment(Pos.CENTER);
        Seccion4.setPrefSize(200, 50);
        Seccion4.getChildren().addAll(lblCom4,tfCom4);
        
        HBox Seccion5 = new HBox(10);
        lblCom5 = new Label("Autonoma");
        lblCom5.setPrefSize(100, 10);
        tfCom5 = new TextField();
        tfCom5.setPrefSize(100, 10);
        tfCom5.setOnAction(this);
        Seccion5.setAlignment(Pos.CENTER);
        Seccion5.setPrefSize(200, 50);
        Seccion5.getChildren().addAll(lblCom5,tfCom5);
        
        HBox Seccion6 = new HBox(10);
        lblCom6 = new Label("Diseñar");
        lblCom6.setPrefSize(100, 10);
        tfCom6 = new TextField();
        tfCom6.setPrefSize(100, 10);
        tfCom6.setOnAction(this);
        Seccion6.setAlignment(Pos.CENTER);
        Seccion6.setPrefSize(200, 50);
        Seccion6.getChildren().addAll(lblCom6,tfCom6);
        
        HBox Seccion7 = new HBox(10);
        lblCom7 = new Label("Analisis");
        lblCom7.setPrefSize(100, 10);
        tfCom7 = new TextField();
        tfCom7.setPrefSize(100, 10);
        tfCom7.setOnAction(this);
        Seccion7.setAlignment(Pos.CENTER);
        Seccion7.setPrefSize(200, 50);
        Seccion7.getChildren().addAll(lblCom7,tfCom7);
        
        HBox Seccion8 = new HBox(10);
        lblCom8 = new Label("Logro");
        lblCom8.setPrefSize(100, 10);
        tfCom8 = new TextField();
        tfCom8.setPrefSize(100, 10);
        tfCom8.setOnAction(this);
        Seccion8.setAlignment(Pos.CENTER);
        Seccion8.setPrefSize(200, 50);
        Seccion8.getChildren().addAll(lblCom8,tfCom8);
        
        HBox Seccion9 = new HBox(10);
        btnCalcular = new Button("Calcular");
        btnCalcular.setPrefSize(100, 10);
        btnCalcular.setOnAction(this);
        btnEvaluarRegresar = new Button("Regresar");
        btnEvaluarRegresar.setPrefSize(100, 10);
        btnEvaluarRegresar.setOnAction(this);
        Seccion9.setAlignment(Pos.CENTER);
        Seccion9.setPrefSize(200, 50);
        Seccion9.getChildren().addAll(btnCalcular,btnEvaluarRegresar);
        
        VBox UnirSecciones = new VBox(10);
        UnirSecciones.setAlignment(Pos.CENTER);
        UnirSecciones.getChildren().addAll(Seccion1,Seccion2,Seccion3,Seccion4,Seccion5,Seccion6,Seccion7,Seccion8,Seccion9);
        
        //////////////////////////////////////////////////////
        VBox Todo = new VBox();
        Todo.setAlignment(Pos.TOP_CENTER);
        Todo.getChildren().addAll(UnirSecciones);
        root.getChildren().addAll(Todo);
    }
    
    @Override
    public void handle(ActionEvent Ant) {
        if(Ant.getSource() == btnInicioCompetencia){
            Competencias();
        }
        if(Ant.getSource() == btnCompetencia){
            AgregarCompetencia();
        }
        if(Ant.getSource() == btnRegresar){
            Inicio();
        }
        if(Ant.getSource() == btnAgregarCompetencia){
            Archivo arch = new Archivo();
            arch.EscribirCompetencia(tfCompetencia.getText(), tfAgregarEtiquetas.getText());
            tfCompetencia.setText("");
            tfAgregarEtiquetas.setText("");
        }
        if(Ant.getSource() == btnPuntos){
            AgregarPuntos(cbCompetencia.getSelectionModel().getSelectedItem());
        }
        if(Ant.getSource() == btnAgregarPuntos){
            Archivo arch = new Archivo();
            arch.EscribirPuntos(lblAgregarPuntos.getText(),cbAgregarPuntos.getSelectionModel().getSelectedItem(), tfAgregarPuntos.getText());
            cbAgregarPuntos.setPromptText("");
            tfAgregarPuntos.setText("");
        }
        if(Ant.getSource() == btnInicioEvaluar){
            Evaluar();
        }
        if(Ant.getSource() == btnCalcular){
            Difusificar dif = new Difusificar();
            String com1 = dif.Difusificar("Solucion", Integer.parseInt(tfCom1.getText()));
            String com2 = dif.Difusificar("Trabajo", Integer.parseInt(tfCom2.getText()));
            String com3 = dif.Difusificar("Conocimientos", Integer.parseInt(tfCom3.getText()));
            String com4 = dif.Difusificar("Investigacion", Integer.parseInt(tfCom4.getText()));
            String com5 = dif.Difusificar("Autonoma", Integer.parseInt(tfCom5.getText()));
            String com6 = dif.Difusificar("Diseñar", Integer.parseInt(tfCom6.getText()));
            String com7 = dif.Difusificar("Analisis", Integer.parseInt(tfCom7.getText()));
            String com8 = dif.Difusificar("Logro", Integer.parseInt(tfCom8.getText()));
            System.out.println(com1 + " " + com2 + " " + com3 + " " + com4 + " " + com5 + " " + com6 + " " + com7 + " " + com8);
            Centroide cen = new Centroide();
            //System.out.println("Salide Real " + cen.Centroide(100, 70, null));
        }
        if(Ant.getSource() == btnAgregarRegresar){
            Competencias();
        }
        if(Ant.getSource()== btnAgregarPuntosRegresar){
            Competencias();
        }
        if(Ant.getSource() == btnEvaluarRegresar){
            Inicio();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}