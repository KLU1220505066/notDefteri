import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Concrete State: Kaydedildi Durumu
class KaydedildiState implements State {
    @Override
    public void handle(NotDefteri context) {
        context.setState(this);
        context.notifyObservers("Kaydedildi");
    }

    @Override
    public String toString() {
        return "Kaydedildi";
    }
}

