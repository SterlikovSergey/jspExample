package by.sterlikov.jspexample.servlet;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import by.sterlikov.jspexample.model.Person;
import by.sterlikov.jspexample.service.DbPersonService;
import by.sterlikov.jspexample.service.DbPersonServiceImpl;
import by.sterlikov.jspexample.service.PersonService;
import by.sterlikov.jspexample.service.PersonServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "persons", value = "/persons")

public class PersonServlet extends HttpServlet {
    private PersonService personService;
    private DbPersonService dbPersonService;

    public void init() {
        personService = new PersonServiceImpl();
        dbPersonService = new DbPersonServiceImpl();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("people", personService.findAll());
        request.getRequestDispatcher("people.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var name = req.getParameter("name");
        var age = Integer.parseInt(req.getParameter("age"));
        var newPerson = new Person(name,age);
        var newDbPerson = new Person(name,age);
        String url = "jdbc:mysql://localhost:3306/db_jspExample";
        String user = "root";
        String password = "root";
        try (Connection connection = DriverManager.getConnection(url,user,password)){
            Class.forName("com.mysql.cj.jdbc.Driver");
            dbPersonService.saveDb(newDbPerson,connection);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        personService.save(newPerson);
        req.setAttribute("people", personService.findAll());
        req.getRequestDispatcher("people.jsp").forward(req, resp);
    }
}