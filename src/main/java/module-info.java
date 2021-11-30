module com.mycompany.tela {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.tela to javafx.fxml;
    exports com.mycompany.tela;
}
