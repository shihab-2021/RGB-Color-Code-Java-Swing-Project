import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

class RGBColorCode extends JFrame implements ChangeListener {
    private Container c;
    private JLabel headingLabel, redLabel, greenLabel, blueLabel, previewLabel;
    private JSlider redSlide, greenSlide, blueSlide;
    private JTextField redTf, greenTf, blueTf;
    private JPanel panel;
    private Font f1, f2;

    RGBColorCode(){
        initComponents();
    }
    public void initComponents(){
        Color hsb = new Color(204, 204, 255);
        f1 = new Font("Tahoma", Font.BOLD, 25);
        f2 = new Font("Tahoma", Font.BOLD, 20);
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(hsb);

        headingLabel = new JLabel("RGB Color Code");
        headingLabel.setBounds(260, 20, 200, 30);
        headingLabel.setFont(f1);
        c.add(headingLabel);

        redLabel = new JLabel("Red");
        redLabel.setBounds(20, 97, 80, 50);
        redLabel.setForeground(Color.RED);
        redLabel.setFont(f2);
        c.add(redLabel);

        redSlide = new JSlider(0, 255, 0);
        redSlide.setBounds(90, 100, 300, 50);
        redSlide.setMinorTickSpacing(5);
        redSlide.setMajorTickSpacing(50);
        redSlide.setPaintTicks(true);
        redSlide.setPaintLabels(true);
        redSlide.setBackground(hsb);
        c.add(redSlide);

        redTf = new JTextField("0");
        redTf.setHorizontalAlignment(JTextField.CENTER);
        redTf.setBounds(400, 100, 80, 50);
        c.add(redTf);

        greenLabel = new JLabel("Green");
        greenLabel.setBounds(20, 165, 80, 50);
        greenLabel.setForeground(Color.GREEN);
        greenLabel.setFont(f2);
        c.add(greenLabel);

        greenSlide = new JSlider(0, 255, 0);
        greenSlide.setBounds(90, 170, 300, 50);
        greenSlide.setMinorTickSpacing(5);
        greenSlide.setMajorTickSpacing(50);
        greenSlide.setPaintTicks(true);
        greenSlide.setPaintLabels(true);
        greenSlide.setBackground(hsb);
        c.add(greenSlide);

        greenTf = new JTextField("0");
        greenTf.setHorizontalAlignment(JTextField.CENTER);
        greenTf.setBounds(400, 170, 80, 50);
        c.add(greenTf);

        blueLabel = new JLabel("Blue");
        blueLabel.setBounds(20, 235, 80, 50);
        blueLabel.setForeground(Color.BLUE);
        blueLabel.setFont(f2);
        c.add(blueLabel);

        blueSlide = new JSlider(0, 255, 0);
        blueSlide.setBounds(90, 240, 300, 50);
        blueSlide.setMinorTickSpacing(5);
        blueSlide.setMajorTickSpacing(50);
        blueSlide.setPaintTicks(true);
        blueSlide.setPaintLabels(true);
        blueSlide.setBackground(hsb);
        c.add(blueSlide);

        blueTf = new JTextField("0");
        blueTf.setHorizontalAlignment(JTextField.CENTER);
        blueTf.setBounds(400, 240, 80, 50);
        c.add(blueTf);

        panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setBounds(500, 125, 165, 140);
        c.add(panel);

        previewLabel = new JLabel("Preview");
        previewLabel.setFont(f2);
        previewLabel.setBounds(540, 255, 135, 50);
        c.add(previewLabel);

        redSlide.addChangeListener(this);
        greenSlide.addChangeListener(this);
        blueSlide.addChangeListener(this);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        int redValue = redSlide.getValue();
        int greenValue = greenSlide.getValue();
        int blueValue = blueSlide.getValue();

        redTf.setText(""+redValue);
        greenTf.setText(""+greenValue);
        blueTf.setText(""+blueValue);

        Color color = new Color(redValue, greenValue, blueValue);
        panel.setBackground(color);
        
    }

    public static void main(String[] args){
        RGBColorCode frame = new RGBColorCode();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 400);
        frame.setLocationRelativeTo(null);
        frame.setTitle("RGB Color Code");
    }
}