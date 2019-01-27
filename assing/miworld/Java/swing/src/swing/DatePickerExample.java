package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


class DatePickerExample {

    public static void main(String[] args) {

    	UtilDateMode model = new UtilDateModel();
    	JDatePanelImpl datePanel = new JDatePanelImpl(model);
    	JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);

    	frame.add(datePicker);

    }

}