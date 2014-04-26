/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.famlle.javafx;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.paint.Paint;

/**
 *
 * @author yukinago
 */
public class DefaultScene extends Scene {
    
    private static String[] defaultStyleSheet;

    public static void setDefaultStyleSheet(String... styleSheets) {
        defaultStyleSheet = styleSheets;
    }
    
    public DefaultScene(Parent root) {
        super(root);
        initStyleSheet();
    }

    public DefaultScene(Parent root, Paint fill) {
        super(root, fill);
        initStyleSheet();
    }

    public DefaultScene(Parent root, double width, double height) {
        super(root, width, height);
        initStyleSheet();
    }

    public DefaultScene(Parent root, double width, double height, Paint fill) {
        super(root, width, height, fill);
        initStyleSheet();
    }

    public DefaultScene(Parent root, double width, double height, boolean depthBuffer) {
        super(root, width, height, depthBuffer);
        initStyleSheet();
    }

    public DefaultScene(Parent root, double width, double height, boolean depthBuffer, SceneAntialiasing antiAliasing) {
        super(root, width, height, depthBuffer, antiAliasing);
        initStyleSheet();
    }
    
    private void initStyleSheet() {
        this.getStylesheets().addAll(defaultStyleSheet);
    }
}
