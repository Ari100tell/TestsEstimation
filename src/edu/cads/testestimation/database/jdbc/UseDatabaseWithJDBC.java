package edu.cads.testestimation.database.jdbc;

import java.sql.*;

public class UseDatabaseWithJDBC {
    public static void main(String[] args) {
        String user = "Morochenets_Olexiy";//Логин пользователя
        String password = "0972414752";//Пароль пользователя
        String url = "jdbc:oracle:thin:@localhost:1521/dbis";//URL адрес
        String driver = "oracle.jdbc.driver.OracleDriver";//Имя драйвера
        try {
            Class.forName(driver);//Регистрируем драйвер
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Connection c = null;//Соединение с БД
        try {
            c = DriverManager.getConnection(url, user, password);//Установка соединения с БД
            Statement st = c.createStatement();//Готовим запрос
            ResultSet rs = st.executeQuery("select * from Unit_Testing_Results");//Выполняем запрос к БД, результат в переменной rs
            while (rs.next()) {
                System.out.println(rs.getString(1));//Последовательно для каждой строки выводим значение из колонки ColumnName
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //Обязательно необходимо закрыть соединение
            try {
                if (c != null)
                    c.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
