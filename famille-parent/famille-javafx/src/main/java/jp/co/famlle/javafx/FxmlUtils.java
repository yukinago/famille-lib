/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.famlle.javafx;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author famille
 */
public class FxmlUtils {

    /**
     * 新しい画面を生成する。
     *
     * @param owner 親画面
     * @param root ルート要素
     * @param title 画面タイトル
     * @param isModal モーダルか否か
     * @return 新規画面
     */
    public static Stage createStage(Stage owner, Parent root, String title, boolean isModal) {
        // 新しいウインドウを生成
        Stage stage = new Stage();

        // オーナーを設定
        stage.initOwner(owner);

        // モーダルフラグがONの場合はモーダルウインドウとする
        if (isModal) {
            stage.initModality(Modality.APPLICATION_MODAL);
        }

        // タイトルを設定する
        stage.setTitle(title);

        // シーンを設定する
        stage.setScene(new DefaultScene(root));

        return stage;
    }

    /**
     * FXMLファイルをロードする。
     *
     * @param fxmlName FXMLファイル名
     * @return ロード結果
     */
    public static FxmlInfo loadFromFxml(String fxmlName) {
        FxmlInfo<?> info = null;
        try {
            FXMLLoader loader = new FXMLLoader(FxmlUtils.class.getResource(fxmlName));
            // fxmlファイルをロードする
            Parent root = loader.load();
            // コントローラを取得する
            Object controller = loader.getController();
            
            info = new FxmlInfo(root, controller);
        } catch (IOException ex) {
            Logger.getLogger(FxmlUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return info;
    }
}
