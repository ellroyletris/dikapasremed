/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koneksi;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author PC LAB 2
 */
public class koneksi {
    private static Connection con;
    public static Connection getcon() {
        if (con == null) {
            try {
                String url = "jdbc:mysql://localhost/sekolah";
                String username = "root";
                String password = "";
                        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                        con = DriverManager.getConnection(url, username, password);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return con;
    }
}
