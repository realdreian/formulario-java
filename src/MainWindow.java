import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {
    static void main(String[] args) {

        // Criar Janela principal
        JFrame mainFrame = new JFrame("Janela Principal");

        // Definir Tamanho da Janela
        mainFrame.setSize(400, 200);

        // Definir o Comportamento de fechamento da janela
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criar um painel para organizar os componentes
        JPanel panel = new JPanel();

        // Adicionar Panel na Janela Principal
        mainFrame.add(panel);

        //Definir LAyout do Painel
        panel.setLayout(new FlowLayout());

        // Criar Campo de texto para entrada
        JTextField inputField = new JTextField(20);

        // Criar Botão
        JButton showButton = new JButton("Enviar");

        //  Criar o Label para exibir mensagem
        JLabel messageLabel = new JLabel("Digite Algo");

        // Adicionar componentes no panel
        panel.add(messageLabel);
        panel.add(inputField);
        panel.add(showButton);


        // Tornar O frame Visivel
        mainFrame.setVisible(true);

        // add ação ao button
        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // receber o texto do campo de entrada
                String textoDigitado = inputField.getText();

                // Criar Nova Janela p receber a msg
                JFrame messageFrame = new JFrame("Nova Janela");

                // Definir tamanho da nova janela
                messageFrame.setSize(500, 350);

                // Definir o Comportamento de fechamento da janela
                messageFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                // Criar Painel pra organizar
                JPanel novoPanel = new JPanel();

                // Definir layout do novo panel
                novoPanel.setLayout(new BorderLayout());

                //Criar LAbel pra exibir a menssagem
                JLabel labelMensage = new JLabel(textoDigitado);

                // Criar TEXT AREA
                JTextArea textArea = new JTextArea(10, 40);

                // Adicionar o Texto digitado ao TExt Area
                textArea.setText(textoDigitado);

                // Tornar o text Area não editavel
                textArea.setEditable(false);

                //Adicioanr O label na parte superior do novoPanel
                novoPanel.add(labelMensage, BorderLayout.NORTH);

                // Criar um Scroll Panel
                JScrollPane scroll = new JScrollPane(textArea);

                // Adicionar SCROLL PANE NO PANEL na parte central
                novoPanel.add(scroll, BorderLayout.CENTER);

                // Add Painel novo no Frame
                messageFrame.add(novoPanel);

                // Tornar o Frame Visivel
                messageFrame.setVisible(true);


            }
        });

    }

}
