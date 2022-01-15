
package com.og.cruses_m.Main;

//import com.og.cruses_MinFrame1.Views.Cruses_dihibridos;
import com.og.cruses_MinFrame1.Views.MainFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.WindowConstants;

/**
 *
 * @author osmar
 */
public class main {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         //</editor-fold>
         
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            MainFrame jf = new MainFrame();
            jf.setVisible(true);
            jf.setLocationRelativeTo(null);
            //jf.setDefaultCloseOperation( MainFrame  .HIDE_ON_CLOSE);
              jf.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
     jf.addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent evt) {
           jf.dispose();
          
      }
    });    
      
        });
    }

}
