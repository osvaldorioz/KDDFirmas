/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uca.unidad.uno.kdd.frame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.MemoryImageSource;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import uca.unidad.uno.kdd.bean.ChequeBean;
import uca.unidad.uno.kdd.bean.FirmaBean;
import uca.unidad.uno.kdd.constantes.Constantes;
import uca.unidad.uno.kdd.dao.ChequesDAO;
import uca.unidad.uno.kdd.dao.FirmasDAO;
import uca.unidad.uno.kdd.dialog.ChequesDlg;
import uca.unidad.uno.kdd.dialog.FirmasDlg;

/**
 *
 * @author OR501695
 */
public class FirmCheckFrm extends javax.swing.JFrame {
    private File file;
    private BufferedImage imagen;
    private Image imagenNueva;
    
    
    /**
     * Creates new form FirmCheckFrm
     */
    public FirmCheckFrm() {
        initComponents();
        this.jLabel2.setText("");       
        this.jLabel3.setText("");       
        this.setTitle("MMED17027 KDD Algoritmo de segmentación");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu6 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu1.setText("jMenu1");

        jMenu5.setText("jMenu5");

        jMenu7.setText("jMenu7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(953, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(6, 6, 6))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu2.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Captura de cheque");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);
        jMenu2.add(jSeparator2);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Edición");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Extraer firma");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Guardar firma");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);
        jMenu4.add(jSeparator1);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("Base de datos");
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });

        jMenu9.setText("Repositorios");

        jMenu10.setText("Cheques");

        jMenuItem9.setText("Crear repositorio de Cheques");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem9);

        jMenuItem10.setText("Eliminar repositorio");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem10);

        jMenu9.add(jMenu10);

        jMenu11.setText("Firmas");

        jMenuItem5.setText("Crear repositorio de firmas");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem5);

        jMenuItem6.setText("Eliminar repositorio");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem6);

        jMenu9.add(jMenu11);

        jMenu6.add(jMenu9);
        jMenu6.add(jSeparator3);

        jMenu8.setText("Revisión de imágenes");

        jMenuItem8.setText("Revisar Cheques");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem8);

        jMenuItem7.setText("Revisar Firmas");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem7);

        jMenu6.add(jMenu8);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Apertura del archivo, también se guarda el cheque en base de datos
     * @param evt 
     */
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showDialog(this, "Abrir archivo");
        String filename = "";
        
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();            
            filename = file.getAbsolutePath();
            try{
                imagen = ImageIO.read(file);
            }catch(IOException err){
            
            }
            this.jLabel1.setText(file.getName());
            fc.setVisible(false);
            
            this.jLabel2.setIcon(new ImageIcon(imagen.getScaledInstance(this.jLabel2.getWidth(), this.jLabel2.getHeight(), Image.SCALE_DEFAULT)));
        } else if (returnVal == JFileChooser.CANCEL_OPTION ){            
            fc.setVisible(false);
        }
        
        ChequeBean bean = new ChequesDAO().getCheque(filename);
        if(bean == null){
            new ChequesDAO().insertarCheque(filename, toArrayByte(this.jLabel2.getIcon()));
        } else {
            JOptionPane.showMessageDialog(this, Constantes.CHEQUE_EXISTE,"Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * Extraer Firma del cheque, por lo tanto la imagen se pasa a tonos de grises
     * mediante el llamado al método verPixel.
     * @param evt 
     */
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        int a = 1000;
        int b = 420;
        int iniAncho = imagen.getWidth()-a-120;
        int iniAlto  = imagen.getHeight()-b;
        int[] pix = new int[iniAncho*iniAlto];
        
        try {
            PixelGrabber pgObj = new PixelGrabber( imagen,
	        a,b,iniAncho,iniAlto,pix,0,iniAncho );

            if( pgObj.grabPixels() && 
	      ( (pgObj.getStatus() & ImageObserver.ALLBITS ) != 0 ) ) {
                for( int i=0; i < (iniAncho*iniAlto); i++ ) {
                    if(verPixel(pix[i])){
                        pix[i] = 0xFFFFFFFF;
                    }	
		}
            } else {
	        System.out.println( "Problemas al descomponer la imagen" );
            }
	} catch( InterruptedException e ) {
	    System.out.println( e );
        }
        System.out.println( iniAncho + " - " + iniAlto );
        imagenNueva = this.createImage( new MemoryImageSource(
		      iniAncho,iniAlto,pix,0,iniAncho) );
        
        this.jLabel3.setIcon(new ImageIcon(
                             imagenNueva.getScaledInstance(this.jLabel3.getWidth(), this.jLabel3.getHeight(), 
                             Image.SCALE_REPLICATE)));
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * Guardar firma extraida en base de datos como RGB
     * @param evt 
     */
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        byte[] bytes = toArrayByte(this.jLabel3.getIcon());
        
        new FirmasDAO().insertarFirma(bytes);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private byte[] toArrayByte(Icon icon){
        byte[] bytes = null;
        ByteArrayOutputStream baos=new ByteArrayOutputStream(1000);
        try{
            
            BufferedImage bi = new BufferedImage(
                icon.getIconWidth(),
                icon.getIconHeight(),
                BufferedImage.TYPE_INT_RGB);
            Graphics g = bi.createGraphics();
            // paint the Icon to the BufferedImage.
            icon.paintIcon(null, g, 0,0);
            g.dispose();

            ImageIO.write(bi, "png", baos);
            baos.flush();
            bytes = baos.toByteArray();
        }catch(IOException err){}
        return bytes;
    }
    
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        String error = new FirmasDAO().crearRepositorio();
        if(error.length() > 0){
            JOptionPane.showMessageDialog(this, error,error, JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, Constantes.REPO_CREADO,"Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        int input = JOptionPane.showConfirmDialog(this, "Desea eliminar el repositorio de Firmas?", "Advertencia", JOptionPane.OK_CANCEL_OPTION );
        
        if (input == 0){
            String error = new FirmasDAO().eliminarRepositorio();
            if(error.length() > 0){
                JOptionPane.showMessageDialog(this, error,error, JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, Constantes.REPO_ELIMINADO,"Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
        
    }//GEN-LAST:event_jMenu6ActionPerformed

    /**
     * Mostrar la lista de firmas almacenadas
     * @param evt 
     */
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        List<FirmaBean> list = new FirmasDAO().getFirmas();      
        FirmasDlg dlg = new FirmasDlg(this,true,list);
        dlg.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        String error = new ChequesDAO().crearRepositorio();
        if(error.length() > 0){
            JOptionPane.showMessageDialog(this, error,error, JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, Constantes.REPO_CREADO,"Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        int input = JOptionPane.showConfirmDialog(this, "Desea eliminar el repositorio de Cheques?", "Advertencia", JOptionPane.OK_CANCEL_OPTION );
        
        if (input == 0){
            String error = new ChequesDAO().eliminarRepositorio();
            if(error.length() > 0){
                JOptionPane.showMessageDialog(this, error,error, JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, Constantes.REPO_ELIMINADO,"Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    /**
     * Mostrar la lista de cheques almacenados
     * @param evt 
     */
    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        List<ChequeBean> list = new ChequesDAO().getCheques();      
        ChequesDlg dlg = new ChequesDlg(this,true,list);
        dlg.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private boolean verPixel(int pixel) { 
	//int alpha = (pixel >> 24) & 0xff; 
	int red = (pixel >> 1) & 0x00; 
	int green = (pixel >> 1) & 0x00; 
	int blue = (pixel >> 1) & 0x00; 

	if((red > -1 && red < 100) && 
	   (green > -1 && green < 100) && 
	   (blue > -1 && blue < 100))
            return false;
	else
	    return true;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FirmCheckFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirmCheckFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirmCheckFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirmCheckFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirmCheckFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
