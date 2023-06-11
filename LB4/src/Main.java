import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class Main {
    public static void main(String[] args){

        JFrame frame = new JFrame("Магазин бургеров");
        frame.setLocation(400, 400);
        frame.setSize(900, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0,1));

        frame.add(panel, BorderLayout.NORTH);

        JComboBox<String> box = new JComboBox<String>(infburger.Coffe);
        final JTextField greeting = new JTextField();
        JTextArea area = new JTextArea();
        JCheckBox check = new JCheckBox("Не использовать данные по умолчанию");
        JTextField name = new JTextField("Ваше имя: ");
        JTextField sname = new JTextField("Ваша фамилия: ");
        area.setText("Выберите бургер");
        area.setEditable(false);
        greeting.setEditable(false);

        name.addCaretListener(arg0 -> greeting.setText(name.getText() + " - ваш выбор ->"));

        ButtonGroup group = new ButtonGroup();
        JRadioButton mrb = new JRadioButton("Мужской");
        JRadioButton frb = new JRadioButton("Женский");
        BoxListener myListener = new BoxListener(box, area);
        box.addActionListener(myListener);


        frame.add(box, BorderLayout.SOUTH);
        frame.add(area, BorderLayout.CENTER);

        group.add(mrb); group.add(frb);
        panel.add(check); panel.add(name); panel.add(sname); panel.add(mrb); panel.add(frb);

        CheckListener listener = new CheckListener();
        listener.components.add(name); listener.components.add(sname);
        listener.components.add(mrb); listener.components.add(frb);
        check.addActionListener(listener);
        frame.add(greeting, BorderLayout.WEST);

        frame.setVisible(true);

    }
}