package metodo_biseccion;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


/*
* La funcion de esta clase sirve para graficar la funcion segun los
* intervalos que se piden y la metrica a usar la cual también se
* pide al usuario.
 */

/**
 *
 * @author dennis
 */


public class Graficador {

    JFreeChart graficador; 									// Se crea una instancia de la clase de la libreria usada (JFreeChart)
    XYSeriesCollection datos = new XYSeriesCollection(); 	// esta instancia tambien es de una clase propia de la libreria JFreeChart
    
    String titulo;
    String etiqueta_X;										// Estas tres variables son para crear
    String etiqueta_Y;

    public Graficador(String t, String x, String y) {
        titulo = t;
        etiqueta_X = x;
        etiqueta_Y = y;
        graficador = ChartFactory.createXYLineChart(titulo, x, y, datos, PlotOrientation.VERTICAL, true, true, true);
    }

    public Graficador() {
        this("Grafica de Biseccion", "x", "y");
    }

    public void agregarGrafica(String id, double[] x, double[] y) {
        XYSeries agregar = new XYSeries(id);
        int n = x.length;
        for (int i = 0; i < n; i++) {
            agregar.add(x[i], y[i]);
        }
        datos.addSeries(agregar);
    }

    /**
     *
     * @param id
     * @param x
     * @param y
     */
    public void crearGrafica(String id, double[] x, double[] y) {
        datos.removeAllSeries();
        agregarGrafica(id, x, y);
    }

    public JPanel obtenerGrafica() {
        return new ChartPanel(graficador);
    }
}
