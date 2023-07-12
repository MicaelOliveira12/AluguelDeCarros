package br.com.cars.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import br.com.cars.model.Car;

public class CarDao {
    
    public void createCar(Car car) {

        String SQL = "INSERT INTO CARRO (MARCA, MODELO, ANO, OPCIONAIS, TRANSMISSAO) VALUES (?,?,?,?,?)";
        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("Conexão Realizada com sucesso");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, car.getMarca());
            preparedStatement.setString(2, car.getModelo());
            preparedStatement.setString(3, car.getAno());
            preparedStatement.setString(4, car.getOpcionais());
            preparedStatement.setString(5, car.getTransmissao());
            preparedStatement.execute();

            System.out.println("Carro inserido com sucesso!");

            connection.close();

        } catch (Exception e) {
            System.out.println("Falha ao conectar com o banco de dados");
        }
    }
}
