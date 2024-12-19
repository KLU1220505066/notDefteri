import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

abstract class DosyaIslemleri {
    abstract void dosyaAc(JTextArea textArea, JFrame frame, JFileChooser fileChooser);
    abstract void dosyaKaydet(JTextArea textArea, JFrame frame, JFileChooser fileChooser);
}
