/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uca.unidad.uno.kdd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import uca.unidad.uno.kdd.bean.ChequeBean;
import uca.unidad.uno.kdd.connect2db.Connector;

/**
 *
 * @author OR501695
 */
public class ChequesDAO {
    private Connector conn = new Connector();
    
    public String crearRepositorio(){
        String qry = "CREATE TABLE CHEQUES("
                   + "ID INTEGER, "
                   + "FILENAME VARCHAR(100) UNIQUE, "
                   + "CHEQUE BLOB)";
        try{
            Connection cn = conn.getConnection();
            PreparedStatement ps = cn.prepareStatement(qry);
            ps.executeUpdate();
            ps.close();
            cn.close();
            qry = "";
        }catch (SQLException err){
            qry = err.getMessage();
        }
        return qry;
    }
    
    public String eliminarRepositorio(){
        String qry = "DROP TABLE CHEQUES";
        try{
            Connection cn = conn.getConnection();
            PreparedStatement ps = cn.prepareStatement(qry);
            ps.executeUpdate();
            ps.close();
            cn.close();
            qry = "";
        }catch (SQLException err){
            qry = err.getMessage();
        }
        return qry;
    }
    
    public String insertarCheque(String filename, byte[] cheque){
        String qry = "INSERT INTO CHEQUES VALUES(?, ?, ?)";
        Integer maxid = getMaxID();
        try{
            Connection cn = conn.getConnection();
            PreparedStatement ps = cn.prepareStatement(qry);
            ps.setInt(1, maxid);
            ps.setString(2, filename);
            ps.setBytes(3, cheque);
            ps.executeUpdate();
            ps.close();
            cn.close();
            qry = "";
        }catch (SQLException err){
            qry = err.getMessage();
        }
        return qry;
    }
    
    public List<ChequeBean> getCheques(){
        String qry = "SELECT ID, FILENAME, CHEQUE FROM CHEQUES";
        List<ChequeBean> list = new ArrayList<>();
        try{
            Connection cn = conn.getConnection();
            PreparedStatement ps = cn.prepareStatement(qry);            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ChequeBean bean = new ChequeBean();
                bean.setId(rs.getInt("ID"));
                bean.setFilename(rs.getString("FILENAME"));
                bean.setCheque(rs.getBytes("CHEQUE"));                
                list.add(bean);
            }
            rs.close();
            ps.close();
            cn.close();
            qry = "";
        }catch (SQLException err){
            err.printStackTrace();
        }
        return list;
    }
    
    public ChequeBean getCheque(String filename){
        String qry = "SELECT ID, FILENAME, CHEQUE FROM CHEQUES WHERE FILENAME=?";
        ChequeBean bean = null;
        try{
            Connection cn = conn.getConnection();
            PreparedStatement ps = cn.prepareStatement(qry);            
            ps.setString(1, filename);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                bean = new ChequeBean();
                bean.setId(rs.getInt("ID"));
                bean.setFilename(rs.getString("FILENAME"));
                bean.setCheque(rs.getBytes("CHEQUE"));      
            }
            rs.close();
            ps.close();
            cn.close();
        }catch (SQLException err){
            err.printStackTrace();
        }
        return bean;
    }
    
    private synchronized Integer getMaxID(){
        String qry = "SELECT MAX(ID) as MAXID FROM CHEQUES";
        Integer res = 1;
        try{
            Connection cn = conn.getConnection();
            PreparedStatement ps = cn.prepareStatement(qry);            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                res = rs.getInt("MAXID") + 1;
            }
            rs.close();
            ps.close();
            cn.close();            
        }catch (SQLException err){
            err.printStackTrace();
        }
        return res;
    }
}
