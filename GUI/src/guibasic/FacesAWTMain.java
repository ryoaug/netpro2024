package guibasic;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FacesAWTMain {

    public static void main(String[] args) {
        new FacesAWTMain();
    }

    FacesAWTMain() {
        FaceFrame f = new FaceFrame();
        f.setSize(800, 800);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setVisible(true);
    }

    // インナークラスを定義
    class FaceFrame extends Frame {

        FaceFrame() {
        }

        public void paint(Graphics g) {
            super.paint(g);

            FaceObj[][] faces = new FaceObj[3][3];

            // 3x3の顔を描画、行ごとに表情と色を変える
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int expressionType = i;  // 行ごとに表情タイプを変更
                    int browType = i;  // 行ごとに眉のタイプを変更
                    Color faceColor = getColorByRow(i); // 行ごとに色を変更
                    FaceObj fobj = new FaceObj(50 + j * 250, 50 + i * 250, expressionType, browType, faceColor);
                    fobj.drawFace(g);
                }
            }
        }

        private Color getColorByRow(int row) {
            switch (row) {
                case 0:
                    return Color.YELLOW; // 最初の行は黄色
                case 1:
                    return Color.PINK; // 2番目の行はピンク
                case 2:
                    return Color.CYAN; // 3番目の行はシアン
                default:
                    return Color.WHITE; // デフォルトは白
            }
        }
    }

    // FaceObjクラスを定義
    private class FaceObj {
        private int xStart;
        private int yStart;
        private int w = 150; // 顔の幅
        private int h = 150; // 顔の高さ
        private int expressionType; // 表情のタイプ
        private int browType; // 眉のタイプ
        private Color faceColor; // 顔の色

        public FaceObj(int x, int y, int expressionType, int browType, Color faceColor) {
            xStart = x;
            yStart = y;
            this.expressionType = expressionType;
            this.browType = browType;
            this.faceColor = faceColor;
        }

        public void drawFace(Graphics g) {
            // 顔の形状を描画
            drawRim(g);
            drawBrow(g);
            drawEye(g);
            drawNose(g);
            drawMouth(g);
        }

        private void drawRim(Graphics g) {  // wが横幅、hが縦幅
            g.setColor(faceColor); // 顔の色をセット
            g.fillOval(xStart, yStart, w, h); // 円形の顔を描画
            g.setColor(Color.BLACK); // 境界線の色を黒にセット
            g.drawOval(xStart, yStart, w, h); // 境界線を描画
        }

        private void drawBrow(Graphics g) { // xは目の幅 呼ばれる方(=定義する方)
            int xMiddle = xStart + w / 2;
            int yMiddle = yStart + h / 4;
            int browWidth = w / 4;
            switch (browType) {
                case 0: // 普通の眉
                    g.fillRect(xMiddle - browWidth / 2 - 40, yMiddle, browWidth, 10); // 左眉
                    g.fillRect(xMiddle - browWidth / 2 + 40, yMiddle, browWidth, 10); // 右眉
                    break;
                case 1: // 怒っている眉
                    g.drawLine(xMiddle - browWidth / 2 - 40, yMiddle, xMiddle - browWidth / 2, yMiddle - 20); // 左眉
                    g.drawLine(xMiddle - browWidth / 2 + 80, yMiddle, xMiddle + browWidth / 2, yMiddle - 20); // 右眉
                    break;
                case 2: // 驚いた眉
                    g.drawLine(xMiddle - browWidth / 2 - 40, yMiddle - 10, xMiddle - browWidth / 2, yMiddle); // 左眉
                    g.drawLine(xMiddle - browWidth / 2 + 80, yMiddle - 10, xMiddle + browWidth / 2, yMiddle); // 右眉
                    break;
                default:
                    g.fillRect(xMiddle - browWidth / 2 - 40, yMiddle, browWidth, 10); // 左眉
                    g.fillRect(xMiddle - browWidth / 2 + 40, yMiddle, browWidth, 10); // 右眉
                    break;
            }
        }

        private void drawNose(Graphics g) { // xは鼻の長さ
            int xMiddle = xStart + w / 2;
            int yMiddle = yStart + h / 2;
            int noseWidth = w / 10;
            int noseHeight = h / 6;
            g.fillRect(xMiddle - noseWidth / 2, yMiddle - noseHeight / 2, noseWidth, noseHeight); // 鼻を描画
        }

        private void drawEye(Graphics g) { // rは目の半径
            int r = 35;
            g.drawOval(xStart + w / 4 - r / 2, yStart + h / 3, r, r);
            g.drawOval(xStart + 3 * w / 4 - r / 2, yStart + h / 3, r, r);
        }

        private void drawMouth(Graphics g) { // xは口の幅
            int xMiddle = xStart + w / 2;
            int yMiddle = yStart + h - 30;
            switch (expressionType) {
                case 0: // 普通の表情
                    g.drawLine(xMiddle - 50, yMiddle, xMiddle + 50, yMiddle);
                    break;
                case 1: // 笑顔
                    g.drawArc(xMiddle - 50, yMiddle - 20, 100, 40, 0, -180);
                    break;
                case 2: // 悲しい表情
                    g.drawArc(xMiddle - 50, yMiddle - 20, 100, 40, 0, 180);
                    break;
                default:
                    g.drawLine(xMiddle - 50, yMiddle, xMiddle + 50, yMiddle);
                    break;
            }
        }
    }
}
