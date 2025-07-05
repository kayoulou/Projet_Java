module org.example.demo1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.hibernate.orm.core;
    requires java.sql.rowset;
    requires jakarta.persistence;

    opens com to javafx.fxml;
    exports com.runtime;
    exports com.ums.entities;
    exports com.ums.dao;
    exports com.hibernate;

    // IMPORTANT : Ouverture des packages à Hibernate pour la réflexion
    opens com.ums.entities to org.hibernate.orm.core;

}