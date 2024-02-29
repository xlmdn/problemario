/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HiloUno extends JFrame {

    private final ExecutorService executorService = Executors.newFixedThreadPool(5);

    public HiloUno() {
        setTitle("Programa con Hilos");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        inicializarInterfaz();
    }

    private void inicializarInterfaz() {
        setLayout(new GridLayout(6, 3));

        for (int i = 0; i < 5; i++) {
            JLabel label = new JLabel("Hilo " + (i + 1));
            JLabel imageLabel = new JLabel();
            JButton startButton = new JButton("START Hilo " + (i + 1));
            JButton pauseButton = new JButton("PAUSE Hilo " + (i + 1));

            startButton.addActionListener(new StartButtonListener(i, label, imageLabel));
            pauseButton.addActionListener(new PauseButtonListener(i));

            add(label);
            add(imageLabel);
            add(startButton);
            add(pauseButton);
        }
    }

    private class StartButtonListener implements ActionListener {
        private final int hiloId;
        private final JLabel label;
        private final JLabel imageLabel;

        public StartButtonListener(int hiloId, JLabel label, JLabel imageLabel) {
            this.hiloId = hiloId;
            this.label = label;
            this.imageLabel = imageLabel;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            executorService.submit(() -> {
                while (true) {
                    if (!Thread.currentThread().isInterrupted()) {
                        SwingUtilities.invokeLater(() -> moverControl());
                        try {
                            Thread.sleep(1000); // Pausa de 1 segundo
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }
                    } else {
                        break;
                    }
                }
            });
        }

        private void moverControl() {
            label.setBackground(generarColorAleatorio());
            cambiarImagen();
        }

        private void cambiarImagen() {
            // Lógica para cargar y cambiar imágenes (sustituye este bloque con tu implementación)
            ImageIcon newIcon = obtenerImagenAleatoria();
            imageLabel.setIcon(newIcon);
        }

        private ImageIcon obtenerImagenAleatoria() {
              Random random = new Random();
              int i = random.nextInt(2) + 1;

            return new ImageIcon("src/imagenes/imagen"+(i)+".jpg");
        }

        private Color generarColorAleatorio() {
            Random random = new Random();
            return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        }
    }

    private class PauseButtonListener implements ActionListener {
        private final int hiloId;

        public PauseButtonListener(int hiloId) {
            this.hiloId = hiloId;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // Interrumpir el hilo correspondiente
            executorService.shutdownNow();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HiloUno programa = new HiloUno();
            programa.setVisible(true);
        });
    }
}
