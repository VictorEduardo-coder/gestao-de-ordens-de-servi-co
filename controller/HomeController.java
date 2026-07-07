package controller;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class HomeController {

    @FXML
    private VBox sidebar;

    // A inclusão do NavbarView.fxml com fx:id="navbar" nos permite injetar o seu controller correspondente.
    // O nome do atributo deve ser o fx:id concatenado com "Controller".
    @FXML
    private NavbarController navbarController;

    private boolean isSidebarVisible = false;

    @FXML
    public void initialize() {
        // Inicializa a barra lateral como oculta
        if (sidebar != null) {
            sidebar.setVisible(false);
            sidebar.setManaged(false);
        }
        if (navbarController != null) {
            // Registra a ação de clique do hambúrguer para alternar a exibição da barra lateral
            navbarController.setOnHamburgerClick(this::toggleSidebar);
        }
    }

    private void toggleSidebar() {
        isSidebarVisible = !isSidebarVisible;
        sidebar.setVisible(isSidebarVisible);
        sidebar.setManaged(isSidebarVisible);
    }
}
