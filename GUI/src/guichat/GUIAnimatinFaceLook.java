package guichat;

import java.awt.Color;
import java.awt.Graphics;

class GUIAnimatinFaceLook {
    int h = 100;
    int w = 100;
    int xStart = 0;
    int yStart = 0;

    public void setXY(int x, int y) {
        this.xStart = x;
        this.yStart = y;
    }

    public void setSize(int h, int w) {
        this.h = h;
        this.w = h;
    }

    public GUIAnimatinFaceLook() {
    }

    void makeFace(Graphics g, String emotion) {
        // Draw face components based on the emotion
        makeEyes(g, w / 5);
        makeNose(g, h / 5);
        makeMouth(g, w / 2);
        
        if (emotion.equals("normal")) {
            makeNormalEyebrows(g);
        } else if (emotion.equals("angry")) {
            makeAngryEyebrows(g);
        } else if (emotion.equals("surprised")) {
            makeSurprisedEyebrows(g);
        }
    }

    void makeEyes(Graphics g, int eyeSize) {
        g.setColor(Color.blue);
        g.fillArc(xStart + (h * 2 / 7), yStart + (w * 1 / 3), eyeSize, eyeSize, 0, 300);
        g.setColor(Color.black);
        g.drawOval(xStart + (h * 2 / 7), yStart + (w * 1 / 3), eyeSize, eyeSize);
        g.drawOval(xStart + (h * 4 / 7), yStart + (w * 1 / 3), eyeSize, eyeSize);
    }

    public void makeNose(Graphics g, int noseSize) {
        g.drawLine(xStart + (h * 1 / 2), yStart + (w * 2 / 4), xStart + (h * 1 / 2), yStart + (w * 2 / 4) + noseSize);
    }

    public void makeMouth(Graphics g, int mouthSize) {
        int xMiddle = xStart + h / 2;
        int yMiddle = yStart + 3 * w / 4;
        g.drawLine(xMiddle - mouthSize / 2, yMiddle, xMiddle + mouthSize / 2, yMiddle);
    }

    void makeNormalEyebrows(Graphics g) {
        g.drawLine(xStart + (h * 2 / 7), yStart + (w * 1 / 4), xStart + (h * 3 / 7), yStart + (w * 1 / 4));
        g.drawLine(xStart + (h * 4 / 7), yStart + (w * 1 / 4), xStart + (h * 5 / 7), yStart + (w * 1 / 4));
    }

    void makeAngryEyebrows(Graphics g) {
        g.drawLine(xStart + (h * 1 / 5), yStart + (w * 4 / 5), xStart + (h * 3 / 7), yStart + (w * 1 / 5));
        g.drawLine(xStart + (h * 4 / 7), yStart + (w * 1 / 5), xStart + (h * 4 / 5), yStart + (w * 6 / 7));
    }

    void makeSurprisedEyebrows(Graphics g) {
        g.drawLine(xStart + (h * 2 / 7), yStart + (w * 1 / 5), xStart + (h * 3 / 7), yStart + (w * 1 / 4));
        g.drawLine(xStart + (h * 4 / 7), yStart + (w * 1 / 4), xStart + (h * 5 / 7), yStart + (w * 1 / 5));
    }
}
