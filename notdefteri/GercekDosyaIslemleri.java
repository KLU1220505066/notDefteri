import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


// Concrete sınıf: Gerçek Dosya İşlemleri
class GercekDosyaIslemleri extends DosyaIslemleri {
    @Override
    void dosyaAc(JTextArea textArea, JFrame frame, JFileChooser fileChooser) {
        int result = fileChooser.showOpenDialog(frame);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                textArea.read(reader, null);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Dosya açılamadı!", "Hata", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @Override
    void dosyaKaydet(JTextArea textArea, JFrame frame, JFileChooser fileChooser) {
        int result = fileChooser.showSaveDialog(frame);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                textArea.write(writer);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Dosya kaydedilemedi!", "Hata", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
