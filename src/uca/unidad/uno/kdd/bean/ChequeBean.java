/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uca.unidad.uno.kdd.bean;

/**
 *
 * @author OR501695
 */
public class ChequeBean {
    private Integer id;
    private String filename;
    private byte[] cheque;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public byte[] getCheque() {
        return cheque;
    }

    public void setCheque(byte[] cheque) {
        this.cheque = cheque;
    }

    
    
}
