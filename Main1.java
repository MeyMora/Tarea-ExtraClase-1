package InterfazNotas;

        import javafx.application.Application;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Parent;
        import javafx.scene.Scene;
        import javafx.stage.Stage;

/**
 * Metodo principal que contiene todos los metodos necesarios para hacer funcionar el programa
 */
public class Main1 extends Application {

    @Override
    public void start(Stage tabla) throws Exception {
        Parent csv = FXMLLoader.load(getClass().getResource("Tabla.fxml"));
        tabla.setTitle("Tabla de Datos");
        tabla.setScene(new Scene(csv));
        tabla.show();
    }
    }
}