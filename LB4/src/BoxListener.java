import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoxListener implements ActionListener {

    private JComboBox<String> box;
    private JTextArea area;

    public BoxListener(JComboBox<String> box, JTextArea area){
        this.box = box;
        this.area = area;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        int index = box.getSelectedIndex();
        area.setText(infburger.Info[index]);
    }

}