/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author MSI_PC
 */
public class SimpleCalCulator extends JFrame {

    private JLabel lbNum1, lbNum2, lbResult;
    private JTextField txtNum1, txtNum2, txtResult;
    private JButton btAdd, btSub, btMul, btDiv;

    public SimpleCalCulator(String title) {
        super(title);
        //tạo giao diện

        CreateGUI();
        setSize(400, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void CreateGUI() {
        JPanel p = new JPanel();
        p.setLayout(null);
        //add các component vào thùng chứa p1

        p.add(lbNum1 = new JLabel("Num 1"));
        p.add(txtNum1 = new JTextField(10));

        p.add(lbNum2 = new JLabel("Num 2"));
        p.add(txtNum2 = new JTextField(10));

        p.add(lbResult = new JLabel("Result"));
        p.add(txtResult = new JTextField(10));

        p.add(btAdd = new JButton("Add"));
        p.add(btSub = new JButton("Sub"));
        p.add(btMul = new JButton("Mul"));
        p.add(btDiv = new JButton("Div"));

        lbNum1.setBounds(10, 10, 100, 30);
        txtNum1.setBounds(120, 10, 200, 30);

        lbNum2.setBounds(10, 50, 100, 30);
        txtNum2.setBounds(120, 50, 200, 30);

        lbResult.setBounds(10, 100, 100, 30);
        txtResult.setBounds(120, 100, 200, 30);
        txtResult.setEditable(false);

        btAdd.setBounds(10, 140, 80, 40);
        btSub.setBounds(100, 140, 80, 40);
        btMul.setBounds(190, 140, 80, 40);
        btDiv.setBounds(280, 140, 80, 40);

        add(p);

        //Xử lý phép toán
        btAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.parseDouble(txtNum1.getText());
                double y = Double.parseDouble(txtNum2.getText());
                double kq = x + y;

                //gán giá trị cho JTextFiled
                txtResult.setText(String.valueOf(kq));
            }
        });
         btSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.parseDouble(txtNum1.getText());
                double y = Double.parseDouble(txtNum2.getText());
                double kq = x - y;

                //gán giá trị cho JTextFiled
                txtResult.setText(String.valueOf(kq));
            }
        });
          btMul.addActionListener((e)-> {
                double x = Double.parseDouble(txtNum1.getText());
                double y = Double.parseDouble(txtNum2.getText());
                double kq = x * y;

                //gán giá trị cho JTextFiled
                txtResult.setText(String.valueOf(kq));
            }
        );
            btDiv.addActionListener((e)-> {
                double x = Double.parseDouble(txtNum1.getText());
                double y = Double.parseDouble(txtNum2.getText());
                double kq = x / y;
                double du=x%y;

                //gán giá trị cho JTextFiled
                txtResult.setText(String.valueOf(kq));
            }
        );
    }

    public static void main(String[] args) {
        SimpleCalCulator frm = new SimpleCalCulator("Simple Calculator");
        frm.setVisible(true);
    }
}
