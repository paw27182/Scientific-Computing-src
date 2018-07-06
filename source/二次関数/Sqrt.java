package 二次関数;

/*
 * 平方根
 */

import java.lang.Math;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

@SuppressWarnings("serial")
public class Sqrt extends ApplicationFrame {
    public Sqrt(final String title) {

        super(title);

        final XYDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);
    }
    
    /* Create Dataset */
    private XYDataset createDataset() {
		double y;
		
        final XYSeries series1 = new XYSeries("First");
        for (double x = 0; x <= 1; x+=0.01) {
			y = Math.sqrt(x);
        	series1.add(x, y);
        }
   
        final XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series1);
                
        return dataset;
        
    }
    
    /* JFreeChart */
    private JFreeChart createChart(final XYDataset dataset) {
        final JFreeChart chart = ChartFactory.createXYLineChart(
            "Squre Root Function",    // chart title
            "X",                      // x axis label
            "Y",                      // y axis label
            dataset,                  // data
            PlotOrientation.VERTICAL,
            true,                     // include legend
            true,                     // tooltips
            false                     // urls
        );
          
        return chart;
    }

    /* main */
    public static void main(final String[] args) {
        final Sqrt demo = new Sqrt("Squre Root Function");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);
    }
}
