/* ************************************************************************
 *
 * App.java
 *
 * Don't mind the error in the naming of the package. It should be
 * vconv but I mistyped and entered vconf. Let us let it be.
 * It doesn't harm anything.
 * 
 * ***********************************************************************/
package ph.mmhsvictoria.vconf;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import java.net.URL;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        String cwd = System.getProperty("user.dir");   // This locates where the JVM was invoked.
        String path_to_resource = cwd + "/src/main/resources/vconv.fxml";
        loader.setLocation(new URL("file://" + path_to_resource));
        VBox root = loader.load();
        primaryStage.setTitle("Video Converter For DVD and Web");
        primaryStage.setScene(new Scene(root));
        primaryStage.sizeToScene();      /* What does this do? */
        primaryStage.show();
    }

    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        Application.launch(args);
    }
}
