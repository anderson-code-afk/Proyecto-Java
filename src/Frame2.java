
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class Frame2 extends javax.swing.JFrame {
    
    
    
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Frame2.class.getName());
    private JLabel lbl1,lbl2,lbl3,lbl4,lblI,lblTG,lblB;
    private JTextArea txt1,txt2,txt3;
    private JTextField t1;
    private JComboBox cb;
    private JSpinner s1;
    private JButton btn1,btn2,btn3,btn4;
    private JTable tabla;
    private DefaultTableModel modelo;
    private JScrollPane scroll;
    private String nombreCliente;
    private double ingresosCliente;
    
    
    
    
    public Frame2() {
        initComponents();
        getContentPane().setLayout(null);
        setSize(1000,1000);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        
        
        
        lbl1 = new JLabel("Control financiero");
        lbl1.setBounds(300, 5, 450, 120);
        lbl1.setForeground(Color.BLACK);
        lbl1.setFont(new Font("Serif", Font.PLAIN, 45));
        add(lbl1);
        
        lbl2 = new JLabel("Fecha");
        lbl2.setBounds(35, 90, 450, 120);
        lbl2.setForeground(Color.BLACK);
        lbl2.setFont(new Font("Serif", Font.PLAIN, 20));
        add(lbl2);
        
        txt1 = new JTextArea();
        txt1.setBounds(15, 175, 95, 50);
        txt1.setLineWrap(true);
        txt1.setFont(new Font("Serif", Font.PLAIN, 15));
        add(txt1);
        
        lbl2 = new JLabel("Descripcion");
        lbl2.setBounds(140, 90, 450, 120);
        lbl2.setForeground(Color.BLACK);
        lbl2.setFont(new Font("Serif", Font.PLAIN, 20));
        add(lbl2);
        
        txt2 = new JTextArea();
        txt2.setBounds(120, 175, 150, 50);
        txt2.setLineWrap(true);
        txt2.setFont(new Font("Serif", Font.PLAIN, 15));
        add(txt2);
        
        lbl3 = new JLabel("Monto");
        lbl3.setBounds(320, 90, 450, 120);
        lbl3.setForeground(Color.BLACK);
        lbl3.setFont(new Font("Serif", Font.PLAIN, 20));
        add(lbl3);
        
        t1 = new JTextField();
        t1.setBounds(280, 175, 150, 50);
        t1.setFont(new Font("Serif", Font.PLAIN, 15));
        add(t1);
        
        modelo = new DefaultTableModel();
        modelo.addColumn("Nombre ");
        modelo.addColumn("Fecha ");
        modelo.addColumn("Descripcion ");
        modelo.addColumn("Costo ");
        modelo.addColumn("Categoria  ");
        tabla = new JTable(modelo);
        scroll = new JScrollPane(tabla);
        tabla.getTableHeader().setForeground(Color.BLACK);
        scroll.getViewport().setBackground(Color.WHITE);
        scroll.setBounds(445, 140, 550, 450);
        scroll.setFont(new Font("Serif", Font.PLAIN, 25));
        add(scroll);
        
        cb = new JComboBox();
        cb.setBounds(185,230, 220, 60);
        cb.setFont(new Font("Serif", Font.PLAIN, 20));
        cb.setBackground(Color.WHITE);
        cb.setForeground(Color.BLACK);
        cb.addItem("Vivienda");
        cb.addItem("Alimentacion");
        cb.addItem("Transporte");
        cb.addItem("Salud");
        cb.addItem("Entretenimiento");
        cb.addItem("Otro");
        add(cb);
        
        lbl4 = new JLabel("Categoria");
        lbl4.setBounds(35, 200, 450, 120);
        lbl4.setForeground(Color.BLACK);
        lbl4.setFont(new Font("Serif", Font.PLAIN, 25));
        add(lbl4);
        
        lblI = new JLabel("Ingresos: $0");
        lblI.setBounds(35, 490, 450, 120);
        lblI.setForeground(Color.BLACK);
        lblI.setFont(new Font("Serif", Font.PLAIN, 25));
        add(lblI);
        
        lblTG = new JLabel("Total Gastado: $0");
        lblTG.setBounds(35, 460 ,450, 120);
        lblTG.setForeground(Color.BLACK);
        lblTG.setFont(new Font("Serif", Font.PLAIN, 25));
        add(lblTG);
        
        lblB = new JLabel("Balance: $0");
        lblB.setBounds(35, 520, 450, 120);
        lblB.setForeground(Color.BLACK);
        lblB.setFont(new Font("Serif", Font.PLAIN, 25));
        add(lblB);
        
        btn1 = new JButton("Guardar");
        btn1.setBounds(45, 300, 300, 40);
        btn1.setFont(new Font("Serif", Font.PLAIN, 25));
        btn1.setForeground(Color.BLACK);
        btn1.setBackground(Color.WHITE);
        add(btn1);
        
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Guardar();
            }
        });
        
        btn2 = new JButton("Editar");
        btn2.setBounds(45, 350, 300, 40);
        btn2.setFont(new Font("Serif", Font.PLAIN, 25));
        btn2.setForeground(Color.BLACK);
        btn2.setBackground(Color.WHITE);
        add(btn2);
        
        btn3 = new JButton("Borrar");
        btn3.setBounds(45, 400, 300, 40);
        btn3.setFont(new Font("Serif", Font.PLAIN, 25));
        btn3.setForeground(Color.BLACK);
        btn3.setBackground(Color.WHITE);
        add(btn3);
        
        btn4 = new JButton("Limpiar");
        btn4.setBounds(45, 450, 300, 40);
        btn4.setFont(new Font("Serif", Font.PLAIN, 25));
        btn4.setForeground(Color.BLACK);
        btn4.setBackground(Color.WHITE);
        add(btn4);
        
        
    }
    
    public void Guardar(){
        if (txt1.getText().isEmpty() || txt2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
            return;
        }
        String fecha = txt1.getText();
        String descripcion = txt2.getText();
        double monto = Double.parseDouble(t1.getText());
        String categoria = cb.getSelectedItem().toString();
        modelo.addRow(new Object[]{nombreCliente,fecha,descripcion,monto,categoria});
        double total = 0;
        for (int i = 0; i < modelo.getRowCount(); i++) {
            total += Double.parseDouble(modelo.getValueAt(i, 3).toString());
        }
        lblTG.setText("Total gastado: $" + (int)total);
        lblB.setText("Balance: $" + (int)(ingresosCliente - total));
        lblI.setText("Ingresos: $" + (int)ingresosCliente);
        
    }
        
    public void RegistrarDatos(String nombre,double ingresos){
        nombreCliente = nombre;
        ingresosCliente = ingresos;
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
        java.awt.EventQueue.invokeLater(() -> new Frame2().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
