import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


// Concrete State: Yeni Dosya Durumu
class YeniState implements State {
    @Override
    public void handle(NotDefteri context) {
        context.setState(this);
        context.notifyObservers("Yeni Dosya");
    }

    @Override
    public String toString() {
        return "Yeni Dosya";
    }
}
