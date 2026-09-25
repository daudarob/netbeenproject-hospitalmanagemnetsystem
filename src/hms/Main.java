package hms;

import hms.ui.LoginForm;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 * Application entry point. Sets a clean look and feel and shows
 * the login screen.
 */
public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            // fall back to the default look and feel
        }
        SwingUtilities.invokeLater(() -> new LoginForm().setVisible(true));
    }
}
