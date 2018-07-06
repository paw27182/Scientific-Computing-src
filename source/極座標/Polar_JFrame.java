package 極座標;

/*
 *　極座標 
 */
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import org.jfree.chart.ChartPanel;

@SuppressWarnings("serial")
public class Polar_JFrame extends JFrame {
	public static void main(String[] args) {
		
		Polar_JFrame frame = new Polar_JFrame();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(10, 10, 500, 500);
		frame.setTitle("グラフサンプル");
		frame.setVisible(true);
	}

	Polar_JFrame() {
		XYSeriesCollection data = new XYSeriesCollection();
		JFreeChart chart = ChartFactory.createPolarChart("極座標", data, true, false, false);

		ChartPanel cpanel = new ChartPanel(chart);
		getContentPane().add(cpanel, BorderLayout.CENTER);
	}
}