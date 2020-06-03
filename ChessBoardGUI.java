import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class ChessBoardGUI{
    private JFrame outerFrame;

    private JPanel outerPanel;

    private GridLayout panelLayout;

    private JPanel[][] squares;

    public ChessBoardGUI(){
        outerFrame = new JFrame("Java Chess");
        outerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        outerFrame.setVisible(true);
        outerFrame.setSize(800, 800);

        outerPanel = new JPanel();
        outerFrame.getContentPane().add(outerPanel);

        panelLayout = new GridLayout(8, 8, 0, 0);
        outerPanel.setLayout(panelLayout);

        squares = new JPanel[8][8];
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                squares[i][j] = new JPanel();

                if((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1)){
                    squares[i][j].setBackground(Color.white);
                }
                else{
                    squares[i][j].setBackground(Color.black);
                }

                outerPanel.add(squares[i][j]);
            }
        }

        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("BlackKing.png"));
        } catch (IOException e) {
        }
        
        JLabel imgLabel = new JLabel(new ImageIcon(img));
        squares[2][2].add(imgLabel);
    }
}