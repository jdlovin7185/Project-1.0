package org.bank.User;

import org.bank.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO{

//    private static final Statement statement = null;
    Connection connection = null;

    public UserDAOImpl() {
        try{
            this.connection = ConnectionFactory.getConnection();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                }
        }

    @Override
    public void addUser(User user) throws SQLException {
        String sql = "insert into users (firstName, lastName, birthYear) values (?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, user.getFirstName());
        preparedStatement.setString(2, user.getLastName());
        preparedStatement.setInt(3, user.getBirthYear());
        int count = preparedStatement.executeUpdate();
        if (count > 0){
            System.out.println("User added");
        } else
            System.out.println("Something happened");
    }


    @Override
    public void updateUser(User user) throws SQLException {
        String sql = "update users set firstName = ?, lastName = ?, birthYear = ? where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, user.getFirstName());
        preparedStatement.setString(2, user.getLastName());
        preparedStatement.setInt(3, user.getBirthYear());
        preparedStatement.setInt(4,user.getId());
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("User updated");
        else
            System.out.println("Something went wrong");


    }

    @Override
    public void deleteUser(int id) throws SQLException {
    String sql = "delete from users where id=?";
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.setInt(1,id);
    int count = preparedStatement.executeUpdate();
    if(count > 0)
        System.out.println("User has been deleted");
    else
        System.out.println("Something happened");
    }

    @Override
    public void addCheckingAccount(User user) {
//this can be added later
//        this function will be added when the bank service is created
    }

    @Override
    public User loginAccount(int id) throws SQLException {
//        change this to be ResultSet

        return null;
    }

    @Override
    public List<User> getUsers() throws SQLException {
        List<User> users = new ArrayList<>();
        User user;
        String sql = "select * from users";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next()){
            int userId = resultSet.getInt(1);
            String firstName = resultSet.getString(2);
            String lastName = resultSet.getString(3);
            int birthYear = resultSet.getInt(4);
            user = new User(userId, firstName, lastName, birthYear);
            users.add(user);
        }
        return users;
    }

    @Override
    public User userById(int id) throws SQLException {
//        this will return a user by their ID provided in the database
        User user = new User();
        String sql = "select * from users where id= " + id;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        if (resultSet.next()){
            int userId = resultSet.getInt(1);
            String firstName = resultSet.getString(2);
            String lastName = resultSet.getString(3);
            int birthYear = resultSet.getInt(4);
            user = new User(userId, firstName, lastName, birthYear);
        } else {
            System.out.println("Something happened");
        }
        return user;



    }
}
