import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalculator {
    private double total1 = 0.0;
    private double total2 = 0.0;
    private double ans = 0.0;
    String select;
    private JPanel Calculator;
    private JTextField textField1;
    private JButton btnanswer;
    private JButton btndivide;
    private JButton btntwo;
    private JButton btnthree;
    private JButton btnfive;
    private JButton btneight;
    private JButton btndot;
    private JButton btnadd;
    private JButton btnsix;
    private JButton btnnine;
    private JButton btnclear;
    private JButton btnsub;
    private JButton btnmulti;
    private JButton btnone;
    private JButton btnfour;
    private JButton btnseven;
    private JButton btnzero;

    public MyCalculator() {
        btnone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnoneText = textField1.getText() + btnone.getText();
                textField1.setText(btnoneText);
            }
        });
        btntwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btntwoText = textField1.getText() + btntwo.getText();
                textField1.setText(btntwoText);
            }
        });
        btnthree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnthreeText = textField1.getText() + btnthree.getText();
                textField1.setText(btnthreeText);
            }
        });
        btnfour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnfourText = textField1.getText() + btnfour.getText();
                textField1.setText(btnfourText);
            }
        });
        btnfive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnfiveText = textField1.getText() + btnfive.getText();
                textField1.setText(btnfiveText);
            }
        });
        btnsix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnsixText = textField1.getText() + btnsix.getText();
                textField1.setText(btnsixText);
            }
        });
        btnseven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnsevenText = textField1.getText() + btnseven.getText();
                textField1.setText(btnsevenText);
            }
        });
        btneight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btneightText = textField1.getText() + btneight.getText();
                textField1.setText(btneightText);
            }
        });
        btnnine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnnineText = textField1.getText() + btnnine.getText();
                textField1.setText(btnnineText);
            }
        });
        btnzero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnzeroText = textField1.getText() + btnzero.getText();
                textField1.setText(btnzeroText);
            }
        });
        btndot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().equals("")){
                    textField1.setText("0.");
                }
                else if (textField1.getText().contains(".")){
                    btndot.setEnabled(false);
                }
                else {
                    String btndotText = textField1.getText() + btndot.getText();
                    textField1.setText(btndotText);
                }
                btndot.setEnabled(true);
            }
        });

        btnanswer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = Double.parseDouble(textField1.getText());
                switch (select){
                    case "+": ans = total1 + total2;
                    textField1.setText(String.valueOf(ans));break;
                    case "-": ans = total1 - total2;
                        textField1.setText(String.valueOf(ans));break;
                    case "*": ans = total1 * total2;
                        textField1.setText(String.valueOf(ans));break;
                    case "/":
                        ans = 0d;
                        try {
                        ans = total1 / total2;
                    }catch (Exception e1){textField1.setText("ERROR");}
                        textField1.setText(String.valueOf(ans));break;
                }

            }
        });
        btnclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                textField1.setText("");
            }
        });
        btnadd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = Double.parseDouble(textField1.getText( ));
                select = "+";
                textField1.setText("");
            }
        });
        btnsub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 =  Double.parseDouble(textField1.getText( )) ;
                select = "-";
                textField1.setText("");
            }
        });
        btnmulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = Double.parseDouble(textField1.getText( ));
                select = "*";
                textField1.setText("");

            }
        });
        btndivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = Double.parseDouble(textField1.getText( ));
                select = "/";
                textField1.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MyCalculator");
        frame.setContentPane(new MyCalculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
