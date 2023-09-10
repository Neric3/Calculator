module com.calculator.materialcalculator {
    requires java.naming;
    requires javafx.controls;
    requires javafx.fxml;
    requires org.hibernate.orm.core;
    requires jakarta.persistence;
    requires static lombok;

    opens com.calculator.materialcalculator to javafx.fxml, org.hibernate.orm.core;
    exports com.calculator.materialcalculator;
    exports com.calculator.materialcalculator.controllers;
    opens com.calculator.materialcalculator.controllers to javafx.fxml, org.hibernate.orm.core;
    exports com.calculator.materialcalculator.data;
    opens com.calculator.materialcalculator.data to javafx.fxml, org.hibernate.orm.core;
}