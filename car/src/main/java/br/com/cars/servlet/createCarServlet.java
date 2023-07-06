package br.com.cars.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.cars.dao.CarDao;
import br.com.cars.model.Car;

import java.io.IOException;

@WebServlet("/create-car")
public class createCarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String marca = request.getParameter("marca");
        String modelo = request.getParameter("modelo");
        String ano = request.getParameter("ano");
        String opcionais = request.getParameter("opcionais");

        Car car = new Car(marca, modelo, ano, opcionais);
        new CarDao().createCar(car);
        
        request.getRequestDispatcher("cadastrarVeiculo.jsp").forward(request, response);

    }

    


}
