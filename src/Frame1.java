
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Frame1 extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Frame1.class.getName());
    private JLabel lbl1, lbl2, lbl3;
    private JTextField txt1,txt2; 
    private JButton btn1;
    private Frame2 frame2;

    public Frame1() {
        initComponents();
        setSize(700,600);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
       
        
        lbl1 = new JLabel("Control Financiero");
        lbl1.setBounds(150, 20, 450, 120);
        lbl1.setForeground(Color.BLACK);
        lbl1.setFont(new Font("Serif", Font.PLAIN, 45));
        add(lbl1);
        
        lbl2 = new JLabel("Bienvenido, a continuaciòn ingrese sus datos personales...");
        lbl2.setBounds(40, 95, 650, 120);
        lbl2.setForeground(Color.BLACK);
        lbl2.setFont(new Font("Serif", Font.PLAIN, 22));
        add(lbl2);
        
        lbl3 = new JLabel("  Nombre");
        lbl3.setBounds(40, 155, 450, 120);
        lbl3.setForeground(Color.BLACK);
        lbl3.setFont(new Font("Serif", Font.PLAIN, 30));
        add(lbl3);
        
        txt1 = new JTextField(  );
        txt1.setBounds(40, 250, 300, 50);
        txt1.setFont(new Font("Serif", Font.PLAIN, 20));
        add(txt1);
        
        
        lbl3 = new JLabel("  Ingresos Mensuales");
        lbl3.setBounds(40, 300, 450, 120);
        lbl3.setForeground(Color.BLACK);
        lbl3.setFont(new Font("Serif", Font.PLAIN, 30));
        add(lbl3);
        
        txt2 = new JTextField();
        txt2.setBounds(40, 420, 300, 50);
        txt2.setFont(new Font("Serif", Font.PLAIN, 20));
        add(txt2);
        
        
        btn1 = new JButton("Continuar");
        btn1.setBounds(200, 495, 300, 40);
        btn1.setFont(new Font("Serif", Font.PLAIN, 25));
        btn1.setForeground(Color.BLACK);
        btn1.setBackground(Color.WHITE);
        add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Registrar();
            }
        });
    }
    
    public void Registrar(){
        if (txt1.getText().isEmpty() || txt2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
            return;
        }
        String nombre = txt1.getText();
        double ingresos = Double.parseDouble(txt2.getText());
        frame2 = new Frame2();
        frame2.RegistrarDatos(nombre,ingresos);
        frame2.setVisible(true);
    }
    
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Frame1().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
