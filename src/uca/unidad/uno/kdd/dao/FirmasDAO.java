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
import uca.unidad.uno.kdd.bean.FirmaBean;
import uca.unidad.uno.kdd.connect2db.Connector;

/**
 *
 * @author OR501695
 */
public class FirmasDAO {
    private Connector conn = new Connector();
    
    public String crearRepositorio(){
        String qry = "CREATE TABLE FIRMAS(ID INTEGER, FIRMA BLOB)";
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
        String qry = "DROP TABLE FIRMAS";
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
    
    public String insertarFirma(byte[] firma){
        String qry = "INSERT INTO FIRMAS VALUES(?, ?)";
        Integer maxid = getMaxID();
        try{
            Connection cn = conn.getConnection();
            PreparedStatement ps = cn.prepareStatement(qry);
            ps.setInt(1, maxid);
            ps.setBytes(2, firma);
            ps.executeUpdate();
            ps.close();
            cn.close();
            qry = "";
        }catch (SQLException err){
            qry = err.getMessage();
        }
        return qry;
    }
    
    public List<FirmaBean> getFirmas(){
        String qry = "SELECT ID, FIRMA FROM FIRMAS";
        List<FirmaBean> list = new ArrayList<FirmaBean>();
        try{
            Connection cn = conn.getConnection();
            PreparedStatement ps = cn.prepareStatement(qry);            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                FirmaBean bean = new FirmaBean();
                bean.setId(rs.getInt("ID"));
                bean.setFirma(rs.getBytes("FIRMA"));                
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
    
    private synchronized Integer getMaxID(){
        String qry = "SELECT MAX(ID) as MAXID FROM FIRMAS";
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
