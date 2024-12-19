import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

// State Tasarım Deseni: Durum Arayüzü
interface State {
    void handle(NotDefteri context);
}
