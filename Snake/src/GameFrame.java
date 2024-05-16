import javax.swing.JFrame;

public class GameFrame extends JFrame{

    GameFrame() {
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        // fit JFrame around components
        this.pack();
        this.setVisible(true);

        // appears in the middle of computer screen
        this.setLocationRelativeTo(null);
    }
}
