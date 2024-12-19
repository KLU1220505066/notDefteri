import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Concrete Observer
class KaydetmeObserver implements Observer {
    @Override
    public void update(String state) {
        System.out.println("Dosya durumu: " + state);
    }
}
