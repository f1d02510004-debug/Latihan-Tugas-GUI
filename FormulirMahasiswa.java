
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormulirMahasiswa extends JFrame {

    private JTextField namaField;
    private JTextField nimField;
    private JComboBox<String> prodiBox;

    public FormulirMahasiswa() {

        // Top-level Container
        setTitle("Formulir Data Mahasiswa");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Intermediate Container
        JPanel panelUtama = new JPanel(new BorderLayout(10, 10));

        // Panel Judul menggunakan FlowLayout
        JPanel panelJudul = new JPanel(new FlowLayout());
        JLabel judul = new JLabel("FORMULIR DATA MAHASISWA");
        panelJudul.add(judul);

        // Panel Form menggunakan GridLayout
        JPanel panelForm = new JPanel(new GridLayout(3, 2, 10, 15));

        JLabel namaLabel = new JLabel("Nama Lengkap:");
        namaField = new JTextField();

        JLabel nimLabel = new JLabel("NIM:");
        nimField = new JTextField();

        JLabel prodiLabel = new JLabel("Program Studi:");
        String[] prodi = {
            "Informatika",
            "Sistem Informasi",
            "Teknik Elektro"
        };
        prodiBox = new JComboBox<>(prodi);

        panelForm.add(namaLabel);
        panelForm.add(namaField);
        panelForm.add(nimLabel);
        panelForm.add(nimField);
        panelForm.add(prodiLabel);
        panelForm.add(prodiBox);

        // Panel Tombol
        JPanel panelTombol = new JPanel(new FlowLayout());
        JButton simpanButton = new JButton("Simpan Data");
        panelTombol.add(simpanButton);

        // Event Listener
        simpanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nama = namaField.getText();
                String nim = nimField.getText();
                String prodiDipilih = (String) prodiBox.getSelectedItem();

                if (nama.isEmpty() || nim.isEmpty()) {
                    JOptionPane.showMessageDialog(
                        FormulirMahasiswa.this,
                        "Nama dan NIM harus diisi!"
                    );
                } else {
                    JOptionPane.showMessageDialog(
                        FormulirMahasiswa.this,
                        "Data Berhasil Disimpan!\n"
                        + "Nama: " + nama + "\n"
                        + "NIM: " + nim + "\n"
                        + "Program Studi: " + prodiDipilih
                    );
                }
            }
        });

        // Menggabungkan seluruh panel
        panelUtama.add(panelJudul, BorderLayout.NORTH);
        panelUtama.add(panelForm, BorderLayout.CENTER);
        panelUtama.add(panelTombol, BorderLayout.SOUTH);

        add(panelUtama);
    }

    public static void main(String[] args) {
        new FormulirMahasiswa().setVisible(true);
    }
}