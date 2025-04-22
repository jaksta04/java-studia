import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class zad2 extends JFrame {

    private JTextField[][] coefficients;
    private JTextField[] constants;

    public zad2() {
        setTitle("Rozwiązywanie układów równań");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(4, 4, 5, 5));

        coefficients = new JTextField[3][3];
        constants = new JTextField[3];

        // Dodanie pól tekstowych dla współczynników
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                coefficients[i][j] = new JTextField();
                inputPanel.add(coefficients[i][j]);
            }
            constants[i] = new JTextField();
            inputPanel.add(constants[i]);
        }

        add(inputPanel, BorderLayout.CENTER);

        JButton solveButton = new JButton("Rozwiąż");
        solveButton.addActionListener(new SolveButtonListener());
        add(solveButton, BorderLayout.SOUTH);
    }

    private class SolveButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double[][] a = new double[3][3];
                double[] b = new double[3];

                // Pobieranie współczynników z pól tekstowych
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        a[i][j] = Double.parseDouble(coefficients[i][j].getText());
                    }
                    b[i] = Double.parseDouble(constants[i].getText());
                }

                // Obliczanie wyznaczników metodą Cramera
                double det = determinant(a);

                if (det == 0) {
                    JOptionPane.showMessageDialog(null, "Układ równań jest sprzeczny lub nieoznaczony.", "Wynik", JOptionPane.WARNING_MESSAGE);
                } else {
                    double[] solutions = solveCramer(a, b, det);
                    JOptionPane.showMessageDialog(null, "Rozwiązania:\nX = " + solutions[0] + "\nY = " + solutions[1] + "\nZ = " + solutions[2], "Wynik", JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Wystąpił błąd: " + ex.getMessage(), "Błąd", JOptionPane.ERROR_MESSAGE);
            }
        }

        private double determinant(double[][] matrix) {
            return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                    - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                    + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        }

        private double[] solveCramer(double[][] a, double[] b, double det) {
            double[] solutions = new double[3];

            for (int i = 0; i < 3; i++) {
                double[][] tempMatrix = new double[3][3];
                for (int row = 0; row < 3; row++) {
                    for (int col = 0; col < 3; col++) {
                        tempMatrix[row][col] = (col == i) ? b[row] : a[row][col];
                    }
                }
                solutions[i] = determinant(tempMatrix) / det;
            }

            return solutions;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new zad2().setVisible(true);
        });
    }
}
