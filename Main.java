	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/HomeView.fxml"));
			loader.setClassLoader(Main.class.getClassLoader());
			Parent root = loader.load();
			Scene scene = new Scene(root,600,600);
			scene.getStylesheets().add(getClass().getResource("/view/application.css").toExternalForm());
			primaryStage.setScene(scene);
			
			primaryStage.setMinWidth(600); // limite minimo largura
			primaryStage.setMinHeight(600); // limite minimo altura
			primaryStage.setResizable(true); // permitir maximizar e redimensionar
			primaryStage.setTitle("GestOS - Sistema de Gestão de Ordens de Serviço");
			
			Image icone = new Image(getClass().getResourceAsStream("/resources/images/logotipoSemTexto.png"));

			primaryStage.getIcons().add(icone); // adicionar icone
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

