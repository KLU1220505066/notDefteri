import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            NotDefteri app = NotDefteri.getInstance();
            app.addObserver(new KaydetmeObserver());
        });
    }
}
