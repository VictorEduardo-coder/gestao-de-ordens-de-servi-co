package controller;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class NavbarController {

    @FXML
    private ImageView hamburger;

    private Runnable onHamburgerClick;

    /**
     * Define o callback que será executado quando o menu hambúrguer for clicado.
     * @param onHamburgerClick Ação a ser executada.
     */
    public void setOnHamburgerClick(Runnable onHamburgerClick) {
        this.onHamburgerClick = onHamburgerClick;
    }

    @FXML
    private void handleHamburgerClick(MouseEvent event) {
        if (onHamburgerClick != null) {
            onHamburgerClick.run();
        }
    }
}
