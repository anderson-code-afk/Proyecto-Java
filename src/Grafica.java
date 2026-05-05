import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Grafica extends JPanel {
    
    private double[] valores;
    private String[] categorias;
    private Color[] colores;
    private Grafica grafica;
    
    public Grafica(){
        valores = new double[6];
        categorias = new String[]{"Vivienda","Alimentacion","Transporte","Salud","Entretenimiento","Otro"};
        colores = new Color[]{Color.BLUE, Color.GREEN, Color.RED, Color.ORANGE, Color.MAGENTA, Color.CYAN};
    }
    
    public void actualizarDatos(double[] nuevosValores){
        this.valores = nuevosValores;
        repaint();
        
    }
    @Override
protected void paintComponent(Graphics g){
    super.paintComponent(g);
    
    int ancho = getWidth();
    int alto = getHeight();
    int anchoBarra = ancho / 8;
    int espaciado = ancho / 7;
    
    double maximo = 1;
    for (double v : valores){
        if (v > maximo) maximo = v;
    }
    
    for (int i = 0; i < valores.length; i++){
        int alturaBarra = (int)((valores[i] / maximo) * (alto - 60));
        int x = espaciado * (i + 1) - anchoBarra / 2;
        int y = alto - alturaBarra - 40;
        
        g.setColor(colores[i]);
        g.fillRect(x, y, anchoBarra, alturaBarra);
        
        g.setColor(Color.BLACK);
        g.setFont(new Font("Serif", Font.PLAIN, 10));
        g.drawString(categorias[i], x - 5, alto - 20);
        g.drawString("$" + (int)valores[i], x, y - 5);
    }
}
}