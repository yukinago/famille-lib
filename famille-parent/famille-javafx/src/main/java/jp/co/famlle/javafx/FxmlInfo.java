/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.famlle.javafx;

import javafx.scene.Parent;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author yukinago
 */
public class FxmlInfo<T> {
    
    public FxmlInfo(Parent root, T controller) {
        setRoot(root);
        setController(controller);
    }

    /**
     * 親項目
     */
    @Setter
    @Getter
    private Parent root;

    /**
     * コントローラ
     */
    @Setter
    @Getter
    private T controller;

}
