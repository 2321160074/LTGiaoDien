/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author MSI_PC
 */
public class ComBoButton extends JFrame {

    private JLabel lb1, lb2, lb3, lb4;
    private JTextField txtSo1, txtSo2, txtKq;
    private JButton btnTinh, btnNhapLai;
    private JComboBox<String> cbPhepTinh;

    public static void main(String[] args) {
        ComBoButton cbb = new ComBoButton();
       cbb.setVisible(true);
    }

    public ComBoButton() {
        setTitle("Tinh toan don gian");
        taoGiaoDien();
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void taoGiaoDien() {
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(5, 2, 10, 10));
        p1.add(lb1 = new JLabel("So 1"));
        p1.add(txtSo1 = new JTextField());
        txtSo1.setPreferredSize(new Dimension(100, 30));
        
        p1.add(lb2 = new JLabel("So 2"));
        p1.add(txtSo2 = new JTextField());
        
        p1.add(lb3 = new JLabel("Phep tinh"));
        p1.add(cbPhepTinh= new JComboBox<>());
        
        p1.add(lb4 = new JLabel("Ket qua"));
        p1.add(txtKq = new JTextField());
        p1.add(btnTinh = new JButton("Tinh"));
        p1.add(btnNhapLai = new JButton ("Nhap Lai"));
        add(p1);

        cbPhepTinh.addItem("Cộng");
        cbPhepTinh.addItem("Trừ");
        cbPhepTinh.addItem("Nhân");
        cbPhepTinh.addItem("Chia");

        btnTinh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double x = Double.parseDouble(txtSo1.getText());
                    double y = Double.parseDouble(txtSo2.getText());
                    double kq;
                    int selectedIndex = cbPhepTinh.getSelectedIndex();
                    if (selectedIndex==0) {
                        kq = x + y;
                    } else if (selectedIndex == 1) {
                        kq = x - y;
                    } else if (selectedIndex == 2) {
                        kq = x * y;
                    } else {
                        kq = x / y;
                    }
                    txtKq.setText(String.valueOf(kq));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Loi nhap lieu", "Thong bao loi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}

