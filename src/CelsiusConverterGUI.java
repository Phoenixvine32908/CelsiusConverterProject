import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusConverterGUI extends JFrame {
    private JPanel MainPanel;
    private JTextField celsiusTextField1;
    private JLabel celsiusJlabel1;
    private JButton convertbutton;
    private JLabel fahrenheit;

    public CelsiusConverterGUI(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(MainPanel);
        this.pack();

        convertbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //grab the text from the celsisustextfield
                //convert to a double
                //update the Fahrenheit label
                int tempFahr = (int)((Double.parseDouble(celsiusTextField1.getText()))
                        * 1.8 + 32);
                fahrenheit.setText(tempFahr + " Fahrenheit");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new CelsiusConverterGUI("My Celsisus Comverter");
        frame.setVisible(true);
    }
}
