package com.example.Healthcare;
import java.sql.SQLException;
//abstraction
public interface DoctorDAO {
    void addDoctor(String name, String email, String specialization) throws SQLException;
    void viewDoctorsDetails() throws SQLException;
}
