package 三角関数;

/*
 * 三角関数 sin, cos, tan 
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
public class Triangular extends ApplicationFrame {
	public Triangular(final String title) {

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
		double rad;

		final XYSeries series1 = new XYSeries("First");
		for (int i = 0; i <= 360; i++) {
			rad = Math.toRadians((double) i);
			y = Math.sin(rad);
			series1.add((float) i, (float) y);
		}

		final XYSeries series2 = new XYSeries("Second");
		for (int i = 0; i <= 360; i++) {
			rad = Math.toRadians((double) i);
			y = Math.cos(rad);
			series2.add((float) i, (float) y);
		}

		final XYSeries series3 = new XYSeries("Third");
		for (int i = 0; i < 90; i++) {
			rad = Math.toRadians((double) i);
			y = Math.tan(rad);
			series3.add((float) i, (float) y);
		}

		final XYSeriesCollection dataset = new XYSeriesCollection();
		// dataset.addSeries(series1);
		// dataset.addSeries(series2);
		dataset.addSeries(series3);

		return dataset;

	}

	/* JFreeChart */
	private JFreeChart createChart(final XYDataset dataset) {
		final JFreeChart chart = ChartFactory.createXYLineChart(
				"Triangular Function", // chart title
				"X", // x axis label
				"Y", // y axis label
				dataset, // data
				PlotOrientation.VERTICAL, true, // include legend
				true, // tool tips
				false // urls
		);

		return chart;
	}

	/* main */
	public static void main(final String[] args) {
		final Triangular demo = new Triangular("Triangular Function");
		demo.pack();
		RefineryUtilities.centerFrameOnScreen(demo);
		demo.setVisible(true);
	}
}
