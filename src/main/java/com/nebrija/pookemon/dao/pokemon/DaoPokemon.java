package com.nebrija.pookemon.dao.pokemon;

import com.nebrija.pookemon.dao.DBConnection;
import com.nebrija.pookemon.model.Pokemon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoPokemon {

    private Connection connection;

    public static DaoPokemon instance = null;

    public DaoPokemon () throws SQLException {

        connection = DBConnection.getConnection();
    }

    public static DaoPokemon getInstance() throws SQLException {
        if (instance == null){
            instance = new DaoPokemon();
        }
        return instance;
    }

    //Cruds

    public ArrayList<Pokemon> listar() throws SQLException {

        PreparedStatement ps = connection.prepareStatement("SELECT * from pokemons"); //Anti SQL Injection
        ResultSet rs = ps.executeQuery(); //Cruds && Non-Select executeQuery() / para Selects: executeUpdate()
        ArrayList<Pokemon> result = null;

        while (rs.next()) {
            if (result == null)
                result = new ArrayList<>();
            //result.add(new

        }
        rs.close();
        ps.close();
        return result;
    }

}
