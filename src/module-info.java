module AmigosFX {
    requires transitive javafx.fxml;
    requires transitive javafx.controls;

    opens sample to javafx.fxml, javafx.controls;
    exports sample;
}