/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul12_1302223118_gui;

import modul12_1302223118_gui.Mahasiswa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rakha
 */
public class JDBC {
    private static final String DB_URL = "jdbc:mysql://localhost:3308/mahasiswa";
    private static final String USER = "root"; // Default username di XAMPP
    private static final String PASSWORD = ""; // Default password di XAMPP
    private static Connection conn;
    private static Statement stmt;
    private static ResultSet rs;
    
    public JDBC() throws SQLException {
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            stmt = conn.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage(),"Connection Error",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public ResultSet getData(String SQLString){
        try {
            rs = stmt.executeQuery(SQLString);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error :" + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
        return rs;
    }
    
    public void query (String SQLString){
        try {
            stmt.executeUpdate(SQLString);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error :" + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public static ArrayList<Mahasiswa> fetchDataMahasiswa() {

        ArrayList<Mahasiswa> listMhs = new ArrayList<>();

        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            String selectQuery = "SELECT * FROM mahasiswa";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(selectQuery);

            while (rs.next()) {
                String nim = rs.getString("nim");
                String nama = rs.getString("nama");
                String prodi = rs.getString("prodi");
                
                listMhs.add(new Mahasiswa(nim, nama, prodi));
            }

            System.out.println("Data diambil dari database dan diisi ke dalam tabel dengan sukses.");
            stmt.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            return listMhs;
        }

        
    }
    
    // Method untuk memasukkan data mahasiswa ke database
    public static void insertMahasiswa(Mahasiswa mhs) {
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            String query = "INSERT INTO mahasiswa (nim, nama, prodi) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, mhs.getNim());
            ps.setString(2, mhs.getNama());
            ps.setString(3, mhs.getProdi());
            ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void updateMahasiswa(Mahasiswa mhs, String nim) {
        try {
            String query = "UPDATE mahasiswa SET nama = ?, prodi = ?, nim = ? WHERE nim = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, mhs.getNama());
            ps.setString(2, mhs.getProdi());
            ps.setString(3, mhs.getNim());
            ps.setString(4, nim);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteMahasiswa(String nim) {
        try {
            String query = "DELETE FROM mahasiswa WHERE nim = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, nim);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
