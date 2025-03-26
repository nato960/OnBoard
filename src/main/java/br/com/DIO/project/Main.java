package br.com.DIO.project;


import br.com.DIO.project.persistence.migration.MigrationStrategy;
import br.com.DIO.project.ui.MainMenu;

import java.sql.SQLException;

import static br.com.DIO.project.persistence.config.ConnectionConfig.getConnection;


public class Main {
    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }

        new MainMenu().execute();

    }
}