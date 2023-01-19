package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;


public class Controller {

    private Stage stage;
    private Scene scene;
    private Parent parent;


    @FXML
    private TextField FileNameField;

    @FXML
    private TextField FilePathField;

    @FXML
    private TextField countField;

    @FXML
    private TextField destinationWord;

    @FXML
    private TextArea paragraphField;

    @FXML
    private TextArea payloadDisplayArea;

    @FXML
    private TextField sourceWord;

    @FXML
    private TextArea wordField;


    @FXML
    void characterPayload(ActionEvent event) {
        JOptionPane.showMessageDialog(null,"wait for result !! \n انتظر قليلا");
        int con = 0;
        for (int i = 0; i < 10000; i++) {
            payloadDisplayArea.appendText( "æ" + "\t");

            con += 1;
            if (con == 15) {
                payloadDisplayArea.appendText("\n");
                con = 0;
            }
        }
    }


    @FXML
    void customPayload(ActionEvent event) {
        JOptionPane.showMessageDialog(null,"Alert !!تحذير \n do not type more than 5000 in GUI counter if your device is lower performance\n ما تكتبش اكتر من 5000 في العداد لو هتستخدم الواجهة اذا كان جهازك ضعيف");

        String counter = countField.getText();
        boolean flag = true;
        int count = 0;
        char[] s = counter.toCharArray();
        if (wordField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "type any word \n اطبعلك اي اكنب اى حاجة");
        }else if (countField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "enter number of count ! ..\nحدد العدد المطلوب !");
        }else{
            for (int d = 0; d < s.length; d++) {
                if (!Character.isDigit(s[d])) {
                    JOptionPane.showMessageDialog(null, counter + " !!\n type number to count \n اكتب ارقام في العداد مش حروف");
                    flag = false;
                    break;
                }
            }
            if (flag==true) {
                if (countField.getText().isEmpty()||Integer.parseInt(counter)<=2){
                    JOptionPane.showMessageDialog(null, "the count less than 3 ! ..\n دول اقل من 3 انسخهم يعم وخلاص");
                }else {
                    JOptionPane.showMessageDialog(null,"wait for result !! \n انتظر قليلا");

                    for (int i = 1; i <= Integer.parseInt(counter); i++) {
                        count += 1;
                        payloadDisplayArea.appendText(wordField.getText()+"\n \n");

                    }
                }
            }
        }
    }


    @FXML
    void customPayload1(ActionEvent event) {
        JOptionPane.showMessageDialog(null,"Alert !!تحذير \n do not type more than 5000 in GUI counter if your device is lower performance\n ما تكتبش اكتر من 5000 في العداد لو هتستخدم الواجهة اذا كان جهازك ضعيف");

        String counter = countField.getText();
        boolean flag = true;
        int count = 0;
        char[] s = counter.toCharArray();
        if (wordField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "type any word \n اطبعلك اي اكنب اى حاجة");
        }else if (countField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "enter number of count ! ..\nحدد العدد المطلوب !");
        }else{
            for (int d = 0; d < s.length; d++) {
                if (!Character.isDigit(s[d])) {
                    JOptionPane.showMessageDialog(null, counter + " !!\n type number to count \n اكتب ارقام في العداد مش حروف");
                    flag = false;
                    break;
                }
            }
            if (flag==true) {
                if (countField.getText().isEmpty()||Integer.parseInt(counter)<=2){
                    JOptionPane.showMessageDialog(null, "the count less than 3 ! ..\n دول اقل من 3 انسخهم يعم وخلاص");
                }else {
                    JOptionPane.showMessageDialog(null,"wait for result !! \n انتظر قليلا");

                    for (int i = 1; i <= Integer.parseInt(counter); i++) {
                        count += 1;
                       payloadDisplayArea.appendText(i+"-"+wordField.getText()+"\n \n");

                    }
                }
            }
        }
    }


    @FXML
    void dotsPayload(ActionEvent event) {
        JOptionPane.showMessageDialog(null,"wait for result !! \n انتظر قليلا");
        int con = 0;
        for (int i = 0; i < 10000; i++) {
            payloadDisplayArea.appendText("."+"\t");
            con += 1;
            if (con == 20) {
                payloadDisplayArea.appendText("\n");
                con = 0;
            }
        }
    }


    @FXML
    void randomPayload(ActionEvent event) {
        JOptionPane.showMessageDialog(null,"wait for result !! \n انتظر قليلا");
        int count = 0;
        for (int i = 0; i < 10000; i++) {
            payloadDisplayArea.appendText("űęđçņĳĵŀłïå");
            count += 1;
            if (count == 6) {
                payloadDisplayArea.appendText("\n");
                count = 0;
            }
        }
    }


    @FXML
    void sympolPayload(ActionEvent event) {
        JOptionPane.showMessageDialog(null,"wait for result !! \n انتظر قليلا");
        String pharaonic = "☾ ♁   ❅ ❆ ☬ \uD80C\uDDA9 \uD80C\uDC12\uD80C\uDDAA ▽ \uD81A\uDD0D \uD80C\uDD54 \uD80C\uDD53 \uD80C\uDCE0 \uD80C\uDDA9 \uD80C\uDDAA ® \uD80C\uDD5F ☽\uD81A\uDC30 \uD81A\uDC31 \uD81A\uDC32 \uD81A\uDC33 \uD81A\uDC34 \uD81A\uDC35 \uD81A\uDC36 \uD81A\uDC37 \uD81A\uDC38 \uD81A\uDC57 \uD81A\uDC58 \uD81A\uDC59 \uD81A\uDC5A \uD81A\uDC5B \uD81A\uDC5C \uD81A\uDC5D \uD81A\uDC5E \uD81A\uDC5F \uD81A\uDC60 \uD81A\uDC61 \uD81A\uDC62 \uD81A\uDC63 \uD81A\uDC64 \uD81A\uDC65 \uD81A\uDC66 \uD81A\uDC67 \uD81A\uDC68 \uD81A\uDC69 \uD81A\uDC6A \uD81A\uDC6B \uD81A\uDC6C \uD81A\uDC6D \uD81A\uDC6E \uD81A\uDC6F \uD81A\uDC70 \uD81A\uDC71 \uD81A\uDC72 \uD80C\uDD45 \uD80C\uDD46 \uD80C\uDD47 \uD80C\uDD48 \uD80C\uDD49 \uD80C\uDD4A \uD80C\uDD4B \uD80C\uDD4C \uD80C\uDD4D \uD80C\uDD4E \uD80C\uDD4F \uD80C\uDD50 \uD80C\uDD51 \uD80C\uDD52 \uD80C\uDD53 \uD80C\uDD54\uD80C\uDD55 \uD80C\uDD56 \uD80C\uDD57 \uD80C\uDD58 \uD80C\uDD59 \uD80C\uDD5A \uD80C\uDD5B \uD80C\uDD5C \uD80C\uDD5D \uD80C\uDD5E \uD80C\uDD5F \uD80C\uDD60 \uD80C\uDD61 \uD80C\uDD62 \uD80C\uDD63 \uD80C\uDD64 \uD80C\uDD65 \uD80C\uDD66 \uD80C\uDD67 \uD80C\uDD68 \uD80C\uDD69 \uD80C\uDD6B \uD80C\uDD6C \uD80C\uDD6D \uD80C\uDD6E \uD80C\uDD6F \uD80C\uDD70 \uD80C\uDD71 \uD80C\uDD72 \uD80C\uDD73 \uD80C\uDD74 \uD80C\uDD75 \uD80C\uDD76 \uD80C\uDD77 \uD80C\uDD78 \uD80C\uDD79 \uD80C\uDD7A \uD80C\uDD7B \uD80C\uDD7E \uD80C\uDD7F \uD80C\uDD80 \uD80C\uDD81 \uD80C\uDD82 \uD80C\uDFFE \uD80C\uDFFF \uD80D\uDC00 \u200F\uD80C\uDC00 \uD80C\uDC01 \uD80C\uDC02 \uD80C\uDC03 \uD80C\uDC04 \uD80C\uDC05 \uD80C\uDC06 \uD80C\uDC07 \uD80C\uDC08 \uD80C\uDC09 \uD80C\uDC0A \uD80C\uDC0B \uD80C\uDC0C \uD80C\uDC0D \uD80C\uDC0E \uD80C\uDC0F \uD80C\uDC10 \uD80C\uDC11 \uD80C\uDC12 \uD80C\uDC13 \uD80C\uDC14 \uD80C\uDC15 \uD80C\uDC16 \uD80C\uDC17 \uD80C\uDC18 \uD80C\uDC19 \uD80C\uDC1A \uD80C\uDC1B \uD80C\uDC1C \uD80C\uDC1D \uD80C\uDC1E \uD80C\uDC1F \uD80C\uDC20 \uD80C\uDC21 \uD80C\uDC22 \uD80C\uDC23 \uD80C\uDC24 \uD80C\uDC25 \uD80C\uDC26 \uD80C\uDC27 \uD80C\uDC28 \uD80C\uDC29 \uD80C\uDC2A \uD80C\uDC2B \uD80C\uDC2C \uD80C\uDC2D \uD80C\uDC2E \uD80C\uDC2F \uD80C\uDC30 \uD80C\uDC31 \uD80C\uDC32 \uD80C\uDC33 \uD80C\uDC34 \uD80C\uDC35 \uD80C\uDC36 \uD80C\uDC37 \uD80C\uDC38 \uD80C\uDC39 \uD80C\uDC3A \uD80C\uDC3B \uD80C\uDC3C \uD80C\uDC3D \uD80C\uDC3E \uD80C\uDC3F \uD80C\uDC40 \uD80C\uDC41 \uD80C\uDC42 \uD80C\uDC43 \uD80C\uDC44 \uD80C\uDC45 \uD80C\uDC46 \uD80C\uDC47 \uD80C\uDC48 \uD80C\uDC49 \uD80C\uDC4A \uD80C\uDC4B \uD80C\uDC4C \uD80C\uDC4D \uD80C\uDC4E \uD80C\uDC4F \uD80C\uDC50 \uD80C\uDC51 \uD80C\uDC52 \uD80C\uDC53 \uD80C\uDC54 \uD80C\uDC55 \uD80C\uDC56 \uD80C\uDC57 \uD80C\uDC58 \uD80C\uDC59 \uD80C\uDC5A \uD80C\uDC5B \uD80C\uDC5C \uD80C\uDC5D \uD80C\uDC5E \uD80C\uDC5F \uD80C\uDC60 \uD80C\uDC61 \uD80C\uDC62 \uD80C\uDC63 \uD80C\uDC64 \uD80C\uDC65 \uD80C\uDC66 \uD80C\uDC67 \uD80C\uDC68 \uD80C\uDC69 \uD80C\uDC6A \uD80C\uDC6B \uD80C\uDC6C \uD80C\uDC6D \uD80C\uDC6E \uD80C\uDC6F \uD80C\uDC70 \uD80C\uDC71 \uD80C\uDC72 \uD80C\uDC73 \uD80C\uDC74 \uD80C\uDC75 \uD80C\uDC76 \uD80C\uDC77 \uD80C\uDC78 \uD80C\uDC79 \uD80C\uDC7A \uD80C\uDC7B \uD80C\uDC7C \uD80C\uDC7D \uD80C\uDC7E \uD80C\uDC7F \uD80C\uDC80\uD80C\uDC85 \uD80C\uDC86 \uD80C\uDC87 \uD80C\uDC88 \uD80C\uDC89 \uD80C\uDC8A \uD80C\uDC8B \uD80C\uDC8C \uD80C\uDC8D \uD80C\uDC8E \uD80C\uDC8F \uD80C\uDC90 \uD80C\uDC91 \uD80C\uDC92 \uD80C\uDC93 \uD80C\uDC94 \uD80C\uDC95 \uD80C\uDC96 \uD80C\uDC97 \uD80C\uDC98 \uD80C\uDC99 \uD80C\uDC9A \uD80C\uDC9B \uD80C\uDC9C \uD80C\uDC9D \uD80C\uDC9E \uD80C\uDC9F \uD80C\uDCA0 \uD80C\uDCA1 \uD80C\uDCA2 \uD80C\uDCA3 \uD80C\uDCA4 \uD80C\uDCA5 \uD80C\uDCA6 \uD80C\uDCA7 \uD80C\uDCA8 \uD80C\uDCA9 \uD80C\uDCAA \uD80C\uDCAB \uD80C\uDCAC \uD80C\uDCAD \uD80C\uDCAE \uD80C\uDCAF \uD80C\uDCB0 \uD80C\uDCB1 \uD80C\uDCB2 \uD80C\uDCB3 \uD80C\uDCB4 \uD80C\uDCB5 \uD80C\uDCB6 \uD80C\uDCB7 \uD80C\uDCB8 \uD80C\uDCB9 \uD80C\uDCBA \uD80C\uDCBB \uD80C\uDCBC \uD80C\uDCBD \uD80C\uDCBE \uD80C\uDCBF \uD80C\uDCC0 \uD80C\uDCC1 \uD80C\uDCC2 \uD80C\uDCC3 \uD80C\uDCC5 \uD80C\uDCC6 \uD80C\uDCC7 \uD80C\uDCC8 \uD80C\uDCC9 \uD80C\uDCCA \uD80C\uDCCB \uD80C\uDCCC \uD80C\uDCCD \uD80C\uDCCE \uD80C\uDCCF \uD80C\uDCD0 \uD80C\uDCD1 \uD80C\uDCD2 \uD80C\uDCD3 \uD80C\uDCD4 \uD80C\uDCD5 \uD80C\uDCD6 \uD80C\uDCD7 \uD80C\uDCD8 \uD80C\uDCD9 \uD80C\uDCDA \uD80C\uDCDB \uD80C\uDCDC \uD80C\uDCDD \uD80C\uDCDE \uD80C\uDCDF \uD80C\uDCE0 \uD80C\uDCE1 \uD80C\uDCE2 \uD80C\uDCE3 \uD80C\uDCE4 \uD80C\uDCE5 \uD80C\uDCE6 \uD80C\uDCE7 \uD80C\uDCE8 \uD80C\uDCE9 \uD80C\uDCEA \uD80C\uDCEB \uD80C\uDCEC \uD80C\uDCED \uD80C\uDCEE \uD80C\uDCEF \uD80C\uDCF0 \uD80C\uDCF1 \uD80C\uDCF2 \uD80C\uDCF3 \uD80C\uDCF4 \uD80C\uDCF5 \uD80C\uDCF6 \uD80C\uDCF7 \uD80C\uDCF8 \uD80C\uDCF9 \uD80C\uDCFA \uD80C\uDCFB \uD80C\uDCFC \uD80C\uDCFD \uD80C\uDCFE \uD80C\uDCFF \uD80C\uDD00 \uD80C\uDD01 \uD80C\uDD02 \uD80C\uDD03 \uD80C\uDD04 \uD80C\uDD05 \uD80C\uDD06 \uD80C\uDD07 \uD80C\uDD08 \uD80C\uDD09 \uD80C\uDD0A \uD80C\uDD0B \uD80C\uDD0C \uD80C\uDD0D \uD80C\uDD0E \uD80C\uDD0F \uD80C\uDD10 \uD80C\uDD11 \uD80C\uDD12 \uD80C\uDD13 \uD80C\uDD14 \uD80C\uDD15 \uD80C\uDD16 \uD80C\uDD19 \uD80C\uDD1A \uD80C\uDD1B \uD80C\uDD1C \uD80C\uDD1D \uD80C\uDD1E \uD80C\uDD1F \uD80C\uDD20 \uD80C\uDD21 \uD80C\uDD22 \uD80C\uDD23 \uD80C\uDD24 \uD80C\uDD25 \uD80C\uDD26 \uD80C\uDD27 \uD80C\uDD28 \uD80C\uDD29 \uD80C\uDD2A \uD80C\uDD2B \uD80C\uDD2C \uD80C\uDD2D \uD80C\uDD2E \uD80C\uDD2F \uD80C\uDD30 \uD80C\uDD31 \uD80C\uDD32 \uD80C\uDD33 \uD80C\uDD34 \uD80C\uDD35 \uD80C\uDD36 \uD80C\uDD37 \uD80C\uDD38 \uD80C\uDD39 \uD80C\uDD3C \uD80C\uDD3D \uD80C\uDD3E \uD80C\uDD3F \uD80C\uDD40 \uD80C\uDD41 \uD80C\uDD42 \uD80C\uDD43 \uD80C\uDD44 \uD80C\uDD45 \uD80C\uDD46 \uD80C\uDD47 \uD80C\uDD48 \uD80C\uDD49 \uD80C\uDD4A \uD80C\uDD4B \uD80C\uDD4C \uD80C\uDD4D \uD80C\uDD4E \uD80C\uDD4F \uD80C\uDD50 \uD80C\uDD51 \uD80C\uDD52 \uD80C\uDD53 \uD80C\uDD54 \uD80C\uDD55 \uD80C\uDD56 \uD80C\uDD57 \uD80C\uDD58 \uD80C\uDD59 \uD80C\uDD5A \uD80C\uDD5B \uD80C\uDD5C \uD80C\uDD5D \uD80C\uDD5E \uD80C\uDD5F \uD80C\uDD60 \uD80C\uDD61 \uD80C\uDD62 \uD80C\uDD63 \uD80C\uDD64 \uD80C\uDD65 \uD80C\uDD66 \uD80C\uDD67 \uD80C\uDD68 \uD80C\uDD69 \uD80C\uDD6A \uD80C\uDD6B \uD80C\uDD6C \uD80C\uDD6D \uD80C\uDD6E \uD80C\uDD6F \uD80C\uDD70 \uD80C\uDD71 \uD80C\uDD72 \uD80C\uDD73 \uD80C\uDD74 \uD80C\uDD75 \uD80C\uDD76 \uD80C\uDD77 \uD80C\uDD78 \uD80C\uDD79 \uD80C\uDD7A \uD80C\uDD7B \uD80C\uDD7C \uD80C\uDD7D \uD80C\uDD7E \uD80C\uDD7F \uD80C\uDD80 \uD80C\uDD81 \uD80C\uDD82 \uD80C\uDD83 \uD80C\uDD84 \uD80C\uDD85 \uD80C\uDD86 \uD80C\uDD87 \uD80C\uDD88 \uD80C\uDD89 \uD80C\uDD8A \uD80C\uDD8B \uD80C\uDD8C \uD80C\uDD8D \uD80C\uDD8E \uD80C\uDD90 \uD80C\uDD91 \uD80C\uDD92 \uD80C\uDD93 \uD80C\uDD94 \uD80C\uDD95 \uD80C\uDD96 \uD80C\uDD97 \uD80C\uDD98 \uD80C\uDD99 \uD80C\uDD9A \uD80C\uDD9B \uD80C\uDD9C \uD80C\uDD9D \uD80C\uDD9E \uD80C\uDD9F \uD80C\uDDA0 \uD80C\uDDA1 \uD80C\uDDA2 \uD80C\uDDA3 \uD80C\uDDA4 \uD80C\uDDA5 \uD80C\uDDA6 \uD80C\uDDA7 \uD80C\uDDA8 \uD80C\uDDA9\uD80C\uDDAA \uD80C\uDDAB \uD80C\uDDAC \uD80C\uDDAE \uD80C\uDDAF \uD80C\uDDB0 \uD80C\uDDB1 \uD80C\uDDB2 \uD80C\uDDB3 \uD80C\uDDB4 \uD80C\uDDB5 \uD80C\uDDB6 \uD80C\uDDB7 \uD80C\uDDB8 \uD80C\uDDB9 \uD80C\uDDBA \uD80C\uDDBB \uD80C\uDDBC \uD80C\uDDBD \uD80C\uDDBE \uD80C\uDDBF \uD80C\uDDC0 \uD80C\uDDC1 \uD80C\uDDC2 \uD80C\uDDC3 \uD80C\uDDC4 \uD80C\uDDC5 \uD80C\uDDC6 \uD80C\uDDC7 \uD80C\uDDC8 \uD80C\uDDC9 \uD80C\uDDCA \uD80C\uDDCB \uD80C\uDDCC \uD80C\uDDCD \uD80C\uDDCE \uD80C\uDDCF \uD80C\uDDD0 \uD80C\uDDD1 \uD80C\uDDD2 \uD80C\uDDD3 \uD80C\uDDD4 \uD80C\uDDD5 \uD80C\uDDD6 \uD80C\uDDD7 \uD80C\uDDD8 \uD80C\uDDD9 \uD80C\uDDDA \uD80C\uDDDB \uD80C\uDDDC \uD80C\uDDDD \uD80C\uDDDE \uD80C\uDDDF \uD80C\uDDE0 \uD80C\uDDE1 \uD80C\uDDE2 \uD80C\uDDE3 \uD80C\uDDE4 \uD80C\uDDE5 \uD80C\uDDE6 \uD80C\uDDE7 \uD80C\uDDE8 \uD80C\uDDE9 \uD80C\uDDEA \uD80C\uDDEB \uD80C\uDDEC \uD80C\uDDED \uD80C\uDDEE \uD80C\uDDEF \uD80C\uDDF0 \uD80C\uDDF1 \uD80C\uDDF2 \uD80C\uDDF3 \uD80C\uDDF4 \uD80C\uDDF5 \uD80C\uDDF6 \uD80C\uDDF7 \uD80C\uDDF8 \uD80C\uDDF9 \uD80C\uDDFA \uD80C\uDDFB \uD80C\uDDFC \uD80C\uDDFE \uD80C\uDDFF \uD80C\uDE00 \uD80C\uDE01 \uD80C\uDE02 \uD80C\uDE03 \uD80C\uDE04 \uD80C\uDE05 \uD80C\uDE06 \uD80C\uDE07 \uD80C\uDE08 \uD80C\uDE09 \uD80C\uDE0A \uD80C\uDE0B \uD80C\uDE0C \uD80C\uDE0D \uD80C\uDE0E \uD80C\uDE0F \uD80C\uDE10 \uD80C\uDE11 \uD80C\uDE12 \uD80C\uDE13 \uD80C\uDE14 \uD80C\uDE15 \uD80C\uDE16 \uD80C\uDE17 \uD80C\uDE18 \uD80C\uDE19 \uD80C\uDE1A \uD80C\uDE1B \uD80C\uDE1C \uD80C\uDE1D \uD80C\uDE1E \uD80C\uDE1F \uD80C\uDE20 \uD80C\uDE21 \uD80C\uDE22 \uD80C\uDE23 \uD80C\uDE24 \uD80C\uDE25 \uD80C\uDE26 \uD80C\uDE27 \uD80C\uDE28 \uD80C\uDE29 \uD80C\uDE2A \uD80C\uDE2B \uD80C\uDE2C \uD80C\uDE2D \uD80C\uDE2E \uD80C\uDE2F \uD80C\uDE30 \uD80C\uDE31 \uD80C\uDE32 \uD80C\uDE33 \uD80C\uDE34 \uD80C\uDE35 \uD80C\uDE36 \uD80C\uDE37 \uD80C\uDE38 \uD80C\uDE39 \uD80C\uDE3A \uD80C\uDE3B \uD80C\uDE3C \uD80C\uDE3D \uD80C\uDE3E \uD80C\uDE3F \uD80C\uDE40 \uD80C\uDE41 \uD80C\uDE42 \uD80C\uDE43 \uD80C\uDE44 \uD80C\uDE45 \uD80C\uDE46 \uD80C\uDE47 \uD80C\uDE48 \uD80C\uDE49 \uD80C\uDE4A \uD80C\uDE4B \uD80C\uDE4C \uD80C\uDE4D \uD80C\uDE4E \uD80C\uDE4F \uD80C\uDE50 \uD80C\uDE51 \uD80C\uDE52 \uD80C\uDE53 \uD80C\uDE54 \uD80C\uDE55 \uD80C\uDE56 \uD80C\uDE57 \uD80C\uDE58 \uD80C\uDE59 \uD80C\uDE5A \uD80C\uDE5B \uD80C\uDE5C \uD80C\uDE5D \uD80C\uDE5E \uD80C\uDE5F \uD80C\uDE60 \uD80C\uDE61 \uD80C\uDE62 \uD80C\uDE63 \uD80C\uDE64 \uD80C\uDE65 \uD80C\uDE66 \uD80C\uDE67 \uD80C\uDE68 \uD80C\uDE69 \uD80C\uDE6A \uD80C\uDE6B \uD80C\uDE6C \uD80C\uDE6D \uD80C\uDE6E \uD80C\uDE6F \uD80C\uDE70 \uD80C\uDE71 \uD80C\uDE72 \uD80C\uDE73 \uD80C\uDE74 \uD80C\uDE75 \uD80C\uDE76 \uD80C\uDE77 \uD80C\uDE78 \uD80C\uDE79 \uD80C\uDE7A \uD80C\uDE7B \uD80C\uDE7C \uD80C\uDE7D \uD80C\uDE7E \uD80C\uDE7F \uD80C\uDE80 \uD80C\uDE81 \uD80C\uDE82 \uD80C\uDE83 \uD80C\uDE84 \uD80C\uDE85 \uD80C\uDE88 \uD80C\uDE89 \uD80C\uDE8A \uD80C\uDE8B \uD80C\uDE8C \uD80C\uDE8D \uD80C\uDE8E \uD80C\uDE8F \uD80C\uDE90 \uD80C\uDE91 \uD80C\uDE92 \uD80C\uDE93 ?? \uD80C\uDE95 \uD80C\uDE96 \uD80C\uDE97 \uD80C\uDE98 \uD80C\uDE99 \uD80C\uDE9A \uD80C\uDE9B \uD80C\uDE9C \uD80C\uDE9D \uD80C\uDE9E \uD80C\uDE9F \uD80C\uDEA0 \uD80C\uDEA1 \uD80C\uDEA2 \uD80C\uDEA3 \uD80C\uDEA4 \uD80C\uDEA5 \uD80C\uDEA6 \uD80C\uDEA7 \uD80C\uDEA8 \uD80C\uDEA9 \uD80C\uDEAA \uD80C\uDEAB \uD80C\uDEAC \uD80C\uDEAD \uD80C\uDEAE \uD80C\uDEAF \uD80C\uDEB0 \uD80C\uDEB1 \uD80C\uDEB2 \uD80C\uDEB3 \uD80C\uDEB4 \uD80C\uDEB5 \uD80C\uDEB6 \uD80C\uDEB7 \uD80C\uDEB8 \uD80C\uDEB9 \uD80C\uDEBA \uD80C\uDEBB \uD80C\uDEBC \uD80C\uDEBD \uD80C\uDEBE \uD80C\uDEBF \uD80C\uDEC0 \uD80C\uDEC1 \uD80C\uDEC2 \uD80C\uDEC3 \uD80C\uDEC4 \uD80C\uDEC5 \uD80C\uDEC6 \uD80C\uDEC7 \uD80C\uDEC8 \uD80C\uDEC9 \uD80C\uDECA \uD80C\uDECB \uD80C\uDECC \uD80C\uDECD \uD80C\uDECE \uD80C\uDECF \uD80C\uDED0 \uD80C\uDED1 \uD80C\uDED2 \uD80C\uDED3 \uD80C\uDED4 \uD80C\uDED5 \uD80C\uDED6 \uD80C\uDED7 \uD80C\uDED8 \uD80C\uDED9 \uD80C\uDEDA \uD80C\uDEDB \uD80C\uDEDC \uD80C\uDEDD \uD80C\uDEDE \uD80C\uDEDF \uD80C\uDEE0 \uD80C\uDEE1 \uD80C\uDEE2 \uD80C\uDEE3 \uD80C\uDEE4 \uD80C\uDEE5 \uD80C\uDEE6 \uD80C\uDEE7 \uD80C\uDEE8 \uD80C\uDEE9 \uD80C\uDEEA \uD80C\uDEEB \uD80C\uDEEC \uD80C\uDEED \uD80C\uDEEE \uD80C\uDEEF \uD80C\uDEF0 \uD80C\uDEF1 \uD80C\uDEF2 \uD80C\uDEF3 \uD80C\uDEF4 \uD80C\uDEF5 \uD80C\uDEF6 \uD80C\uDEF7 \uD80C\uDEF8 \uD80C\uDEF9 \uD80C\uDEFA \uD80C\uDEFB \uD80C\uDEFC \uD80C\uDEFD \uD80C\uDEFE \uD80C\uDEFF \uD80C\uDF00 \uD80C\uDF01 \uD80C\uDF02 \uD80C\uDF03 \uD80C\uDF04 \uD80C\uDF05 \uD80C\uDF06 \uD80C\uDF07 \uD80C\uDF08 \uD80C\uDF09 \uD80C\uDF0A \uD80C\uDF0B \uD80C\uDF0C \uD80C\uDF0D \uD80C\uDF0E \uD80C\uDF0F \uD80C\uDF10 \uD80C\uDF11";

        for (int i = 0; i < 3000; i++) {
            payloadDisplayArea.appendText(pharaonic+"\n");
        }
    }


    @FXML
    void CustomWriter(ActionEvent event) {
        String destwort = destinationWord.getText();
        String sourceword = sourceWord.getText();
        String paragraph = paragraphField.getText();

        if (paragraphField.getText().startsWith(" ")) {
            JOptionPane.showMessageDialog(null, "remove the space in the beginning of paragraph \n شيل المسافةاللي في الاول  ");
        }else if (paragraphField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"type any paragraph \n اكتب حاجة اشتغل عليها ");
        }else if (sourceWord.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "type old word ! ..\nحدد الكلمة الي عايزها تتشال  !");
        } else if (destinationWord.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "type new word .. if you want to add new word type space ! ..\n اكتب الكلمة الجديده  .. لو مش عايز كلمة اكتب مسافة !");
        }else if (!paragraphField.getText().contains(sourceword)) {
            JOptionPane.showMessageDialog(null, "the unwanted word dose not exist ! ..\n الكلمة اللي عاوز تغيرها مش موجوده!");
        }
        else {
            JOptionPane.showMessageDialog(null,"wait for result !! \n انتظر قليلا");
            payloadDisplayArea.appendText("\n"+ReplaceTxte(paragraph,sourceword,destwort));
        }
    }


    @FXML
    void FileCharacterPayload(ActionEvent event) {

        int count = 0;

        if (FilePathField.getText().isEmpty() || FileNameField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "enter file path and file name \n اكتب اسم للفايل و المكان الي عايوه يتحط فيه");
        } else {
            String fullpath = FilePathField.getText() + '\\' + FileNameField.getText() + ".txt";
            File payfile = new File(fullpath);
            try {
                PrintWriter pf = new PrintWriter(fullpath);
                for (int i = 0; i < 100000; i++) {
                    count += 1;
                    pf.print("æ");
                    if (count == 30) {
                        pf.print("\n");
                        count = 0;
                    }
                }
                pf.close();
                payloadDisplayArea.setText("The file is in the path >> " + payfile.getAbsolutePath()+"\n");
                payloadDisplayArea.appendText("هتلاقي الفايل الجديد في المسار ده >> "+ payfile.getAbsolutePath());
                FileNameField.setText("");            } catch (Exception h) {
                JOptionPane.showMessageDialog(null, " المسار مش موجود يا غلط دي مشكلتك file path is wrong \n");
            }
        }
    }


    @FXML
    void FileCustomPayload(ActionEvent event) {

        String counter = countField.getText();
        boolean flag = true;
        int count = 0;
        char[] s = counter.toCharArray();
        if (wordField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "type any word \n اطبعلك اي اكنب اى حاجة");
        }else if (countField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "enter number of count ! ..\nحدد العدد المطلوب !");
        }else{
            for (int d = 0; d < s.length; d++) {
                if (!Character.isDigit(s[d])) {
                    JOptionPane.showMessageDialog(null, counter + " !!\ntype number to count \n اكتب ارقام في العداد مش حروف");
                    flag = false;
                    break;
                }
            }
            if (flag==true) {
                if (FilePathField.getText().isEmpty() || FileNameField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "enter file path and file name \n اكتب اسم الفايل و المسار المطلوب");
                }else if (countField.getText().isEmpty()||Integer.parseInt(counter)<=2){
                    JOptionPane.showMessageDialog(null, "the count less than 3 ! ..\n دول اقل من 3 انسخهم يعم وخلاص");
                }else {
                    String fullpath = FilePathField.getText() + '\\' + FileNameField.getText() + ".txt";
                    File payfile = new File(fullpath);
                    try {
                        JOptionPane.showMessageDialog(null,"wait for result !! \n انتظر قليلا");

                        PrintWriter pf = new PrintWriter(fullpath);
                        for (int i = 1; i <= Integer.parseInt(counter); i++) {
                            count += 1;
                            pf.print(wordField.getText()+"\n \n");

                            payloadDisplayArea.setText("The file is in the path >> " + payfile.getAbsolutePath()+"\n");
                            payloadDisplayArea.appendText("هتلاقي الفايل الجديد في المسار ده >> "+ payfile.getAbsolutePath());
                            FileNameField.setText("");
                        }
                        pf.close();

                    } catch (Exception h) {
                        JOptionPane.showMessageDialog(null, " المسار مش موجود يا غلط دي مشكلتك file path is wrong \n");
                    }
                }
            }
        }
    }


    @FXML
    void FileCustomPayload1(ActionEvent event) {

        String counter = countField.getText();
        boolean flag = true;
        int count = 0;
        char[] s = counter.toCharArray();
        if (wordField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "type any word \n اطبعلك اي اكنب اى حاجة");
        }else if (countField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "enter number of count ! ..\nحدد العدد المطلوب !");
        }else{
            for (int d = 0; d < s.length; d++) {
                if (!Character.isDigit(s[d])) {
                    JOptionPane.showMessageDialog(null, counter + " !!\ntype number to count \n اكتب ارقام في العداد مش حروف");
                    flag = false;
                    break;
                }
            }
            if (flag==true) {
                if (FilePathField.getText().isEmpty() || FileNameField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "enter file path and file name \n اكتب اسم الفايل و المسار المطلوب");
                }else if (countField.getText().isEmpty()||Integer.parseInt(counter)<=2){
                    JOptionPane.showMessageDialog(null, "the count less than 3 ! ..\n دول اقل من 3 انسخهم يعم وخلاص");
                }else {
                    String fullpath = FilePathField.getText() + '\\' + FileNameField.getText() + ".txt";
                    File payfile = new File(fullpath);
                    try {
                        JOptionPane.showMessageDialog(null,"wait for result !! \n انتظر قليلا");

                        PrintWriter pf = new PrintWriter(fullpath);
                        for (int i = 1; i <= Integer.parseInt(counter); i++) {
                            count += 1;
                            pf.print(i+"-"+wordField.getText()+"\n \n");

                            payloadDisplayArea.setText("The file is in the path >> " + payfile.getAbsolutePath()+"\n");
                            payloadDisplayArea.appendText("هتلاقي الفايل الجديد في المسار ده >> "+ payfile.getAbsolutePath());
                            FileNameField.setText("");
                        }
                        pf.close();

                    } catch (Exception h) {
                        JOptionPane.showMessageDialog(null, " المسار مش موجود يا غلط دي مشكلتك file path is wrong \n");
                    }
                }
            }
        }
    }


    @FXML
    void FileCustomWriter(ActionEvent event) {
        String paragraph=paragraphField.getText();
        String oldwrd=sourceWord.getText();
        String newWrd=destinationWord.getText();

        if (destinationWord.getText().isEmpty() || sourceWord.getText().isEmpty()||paragraphField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "enter your paragraph ,old word & new word \n if you wont to add new word type space \n اكتب الكلام الي عاليز تعدله و الكلمة الي عايزها تتشال و الكلمة الجديده \n لو عايز متحطش كلمة جديده حط مسافة");

        }else if (paragraphField.getText().startsWith(" ")){
            JOptionPane.showMessageDialog(null,"remove the space in the beginning of paragraph \n شيل المسافةاللي في الاول ");
        }
        else if (FilePathField.getText().isEmpty() || FileNameField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "enter the file path and new file name \n اكتب اسم الفايل و المسار الي عايز الفايل فيه");
        }else if (oldwrd.equals(newWrd)){
            JOptionPane.showMessageDialog(null, "the old word is as same as new word \n الكلمة الجديدة زي الكلمه القديمة   ");
        }

        else {
            String fullpath = FilePathField.getText() + '\\' + FileNameField.getText() + ".txt";
            File payfile = new File(fullpath);

            try {
                PrintWriter pf = new PrintWriter(fullpath);
                pf.print(ReplaceTxte(paragraph,oldwrd,newWrd));
                pf.close();
                payloadDisplayArea.setText("The file is in the path >> " + payfile.getAbsolutePath()+"\n");
                payloadDisplayArea.appendText("هتلاقي الفايل الجديد في المسار ده >> "+ payfile.getAbsolutePath());
                FileNameField.setText("");
            } catch (Exception h) {

                JOptionPane.showMessageDialog(null, " المسار مش موجود يا غلط دي مشكلتك file path is wrong \n");

            }
        }
    }


    @FXML
    void FileDotsPayload(ActionEvent event) {

        int count = 0;
        if (FilePathField.getText().isEmpty() || FileNameField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "enter path and file name to create new file in \n اتكب مسار و اسم للفايل الجديد");
        } else {
            String fullpath = FilePathField.getText() + '\\' + FileNameField.getText() + ".txt";
            File payfile = new File(fullpath);

            try {

                PrintWriter pf = new PrintWriter(fullpath);
                for (int i = 0; i < 100000; i++) {
                    count += 1;
                    pf.print(".");
                    if (count == 50) {
                        pf.print("\n");
                        count = 0;
                    }
                }
                pf.close();
                payloadDisplayArea.setText("The file is in the path >> " + payfile.getAbsolutePath()+"\n");
                payloadDisplayArea.appendText("هتلاقي الفايل الجديد في المسار ده >> "+ payfile.getAbsolutePath());
                FileNameField.setText("");
            } catch (Exception h) {

                JOptionPane.showMessageDialog(null, " المسار مش موجود يا غلط دي مشكلتك file path is wrong \n");

            }
        }
    }


    @FXML
    void FileRandomPayload(ActionEvent event) {
        String randoms= "űęđçņĳĵŀłïå";
        int count = 0;
        if (FilePathField.getText().isEmpty() || FileNameField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "enter path and file name to create new file in \n اتكب مسار و اسم للفايل الجديد");
        } else {
            String fullpath = FilePathField.getText() + '\\' + FileNameField.getText() + ".txt";
            File payfile = new File(fullpath);

            try {

                PrintWriter pf = new PrintWriter(fullpath);
                for (int i = 0; i < 50000; i++) {
                    count += 1;
                    pf.print(randoms);
                    if (count == 20) {
                        pf.print("\n");
                        count = 0;
                    }
                }
                pf.close();
                payloadDisplayArea.setText("The file is in the path >> " + payfile.getAbsolutePath()+"\n");
                payloadDisplayArea.appendText("هتلاقي الفايل الجديد في المسار ده >> "+ payfile.getAbsolutePath());
                FileNameField.setText("");
            } catch (Exception h) {

                JOptionPane.showMessageDialog(null, " المسار مش موجود يا غلط دي مشكلتك file path is wrong \n");

            }
        }
    }


    @FXML
    void FileSympolPayload(ActionEvent event) {
        String pharaonic = "☾ ♁   ❅ ❆ ☬ \uD80C\uDDA9 \uD80C\uDC12\uD80C\uDDAA ▽ \uD81A\uDD0D \uD80C\uDD54 \uD80C\uDD53 \uD80C\uDCE0 \uD80C\uDDA9 \uD80C\uDDAA ® \uD80C\uDD5F ☽\uD81A\uDC30 \uD81A\uDC31 \uD81A\uDC32 \uD81A\uDC33 \uD81A\uDC34 \uD81A\uDC35 \uD81A\uDC36 \uD81A\uDC37 \uD81A\uDC38 \uD81A\uDC57 \uD81A\uDC58 \uD81A\uDC59 \uD81A\uDC5A \uD81A\uDC5B \uD81A\uDC5C \uD81A\uDC5D \uD81A\uDC5E \uD81A\uDC5F \uD81A\uDC60 \uD81A\uDC61 \uD81A\uDC62 \uD81A\uDC63 \uD81A\uDC64 \uD81A\uDC65 \uD81A\uDC66 \uD81A\uDC67 \uD81A\uDC68 \uD81A\uDC69 \uD81A\uDC6A \uD81A\uDC6B \uD81A\uDC6C \uD81A\uDC6D \uD81A\uDC6E \uD81A\uDC6F \uD81A\uDC70 \uD81A\uDC71 \uD81A\uDC72 \uD80C\uDD45 \uD80C\uDD46 \uD80C\uDD47 \uD80C\uDD48 \uD80C\uDD49 \uD80C\uDD4A \uD80C\uDD4B \uD80C\uDD4C \uD80C\uDD4D \uD80C\uDD4E \uD80C\uDD4F \uD80C\uDD50 \uD80C\uDD51 \uD80C\uDD52 \uD80C\uDD53 \uD80C\uDD54\uD80C\uDD55 \uD80C\uDD56 \uD80C\uDD57 \uD80C\uDD58 \uD80C\uDD59 \uD80C\uDD5A \uD80C\uDD5B \uD80C\uDD5C \uD80C\uDD5D \uD80C\uDD5E \uD80C\uDD5F \uD80C\uDD60 \uD80C\uDD61 \uD80C\uDD62 \uD80C\uDD63 \uD80C\uDD64 \uD80C\uDD65 \uD80C\uDD66 \uD80C\uDD67 \uD80C\uDD68 \uD80C\uDD69 \uD80C\uDD6B \uD80C\uDD6C \uD80C\uDD6D \uD80C\uDD6E \uD80C\uDD6F \uD80C\uDD70 \uD80C\uDD71 \uD80C\uDD72 \uD80C\uDD73 \uD80C\uDD74 \uD80C\uDD75 \uD80C\uDD76 \uD80C\uDD77 \uD80C\uDD78 \uD80C\uDD79 \uD80C\uDD7A \uD80C\uDD7B \uD80C\uDD7E \uD80C\uDD7F \uD80C\uDD80 \uD80C\uDD81 \uD80C\uDD82 \uD80C\uDFFE \uD80C\uDFFF \uD80D\uDC00 \u200F\uD80C\uDC00 \uD80C\uDC01 \uD80C\uDC02 \uD80C\uDC03 \uD80C\uDC04 \uD80C\uDC05 \uD80C\uDC06 \uD80C\uDC07 \uD80C\uDC08 \uD80C\uDC09 \uD80C\uDC0A \uD80C\uDC0B \uD80C\uDC0C \uD80C\uDC0D \uD80C\uDC0E \uD80C\uDC0F \uD80C\uDC10 \uD80C\uDC11 \uD80C\uDC12 \uD80C\uDC13 \uD80C\uDC14 \uD80C\uDC15 \uD80C\uDC16 \uD80C\uDC17 \uD80C\uDC18 \uD80C\uDC19 \uD80C\uDC1A \uD80C\uDC1B \uD80C\uDC1C \uD80C\uDC1D \uD80C\uDC1E \uD80C\uDC1F \uD80C\uDC20 \uD80C\uDC21 \uD80C\uDC22 \uD80C\uDC23 \uD80C\uDC24 \uD80C\uDC25 \uD80C\uDC26 \uD80C\uDC27 \uD80C\uDC28 \uD80C\uDC29 \uD80C\uDC2A \uD80C\uDC2B \uD80C\uDC2C \uD80C\uDC2D \uD80C\uDC2E \uD80C\uDC2F \uD80C\uDC30 \uD80C\uDC31 \uD80C\uDC32 \uD80C\uDC33 \uD80C\uDC34 \uD80C\uDC35 \uD80C\uDC36 \uD80C\uDC37 \uD80C\uDC38 \uD80C\uDC39 \uD80C\uDC3A \uD80C\uDC3B \uD80C\uDC3C \uD80C\uDC3D \uD80C\uDC3E \uD80C\uDC3F \uD80C\uDC40 \uD80C\uDC41 \uD80C\uDC42 \uD80C\uDC43 \uD80C\uDC44 \uD80C\uDC45 \uD80C\uDC46 \uD80C\uDC47 \uD80C\uDC48 \uD80C\uDC49 \uD80C\uDC4A \uD80C\uDC4B \uD80C\uDC4C \uD80C\uDC4D \uD80C\uDC4E \uD80C\uDC4F \uD80C\uDC50 \uD80C\uDC51 \uD80C\uDC52 \uD80C\uDC53 \uD80C\uDC54 \uD80C\uDC55 \uD80C\uDC56 \uD80C\uDC57 \uD80C\uDC58 \uD80C\uDC59 \uD80C\uDC5A \uD80C\uDC5B \uD80C\uDC5C \uD80C\uDC5D \uD80C\uDC5E \uD80C\uDC5F \uD80C\uDC60 \uD80C\uDC61 \uD80C\uDC62 \uD80C\uDC63 \uD80C\uDC64 \uD80C\uDC65 \uD80C\uDC66 \uD80C\uDC67 \uD80C\uDC68 \uD80C\uDC69 \uD80C\uDC6A \uD80C\uDC6B \uD80C\uDC6C \uD80C\uDC6D \uD80C\uDC6E \uD80C\uDC6F \uD80C\uDC70 \uD80C\uDC71 \uD80C\uDC72 \uD80C\uDC73 \uD80C\uDC74 \uD80C\uDC75 \uD80C\uDC76 \uD80C\uDC77 \uD80C\uDC78 \uD80C\uDC79 \uD80C\uDC7A \uD80C\uDC7B \uD80C\uDC7C \uD80C\uDC7D \uD80C\uDC7E \uD80C\uDC7F \uD80C\uDC80\uD80C\uDC85 \uD80C\uDC86 \uD80C\uDC87 \uD80C\uDC88 \uD80C\uDC89 \uD80C\uDC8A \uD80C\uDC8B \uD80C\uDC8C \uD80C\uDC8D \uD80C\uDC8E \uD80C\uDC8F \uD80C\uDC90 \uD80C\uDC91 \uD80C\uDC92 \uD80C\uDC93 \uD80C\uDC94 \uD80C\uDC95 \uD80C\uDC96 \uD80C\uDC97 \uD80C\uDC98 \uD80C\uDC99 \uD80C\uDC9A \uD80C\uDC9B \uD80C\uDC9C \uD80C\uDC9D \uD80C\uDC9E \uD80C\uDC9F \uD80C\uDCA0 \uD80C\uDCA1 \uD80C\uDCA2 \uD80C\uDCA3 \uD80C\uDCA4 \uD80C\uDCA5 \uD80C\uDCA6 \uD80C\uDCA7 \uD80C\uDCA8 \uD80C\uDCA9 \uD80C\uDCAA \uD80C\uDCAB \uD80C\uDCAC \uD80C\uDCAD \uD80C\uDCAE \uD80C\uDCAF \uD80C\uDCB0 \uD80C\uDCB1 \uD80C\uDCB2 \uD80C\uDCB3 \uD80C\uDCB4 \uD80C\uDCB5 \uD80C\uDCB6 \uD80C\uDCB7 \uD80C\uDCB8 \uD80C\uDCB9 \uD80C\uDCBA \uD80C\uDCBB \uD80C\uDCBC \uD80C\uDCBD \uD80C\uDCBE \uD80C\uDCBF \uD80C\uDCC0 \uD80C\uDCC1 \uD80C\uDCC2 \uD80C\uDCC3 \uD80C\uDCC5 \uD80C\uDCC6 \uD80C\uDCC7 \uD80C\uDCC8 \uD80C\uDCC9 \uD80C\uDCCA \uD80C\uDCCB \uD80C\uDCCC \uD80C\uDCCD \uD80C\uDCCE \uD80C\uDCCF \uD80C\uDCD0 \uD80C\uDCD1 \uD80C\uDCD2 \uD80C\uDCD3 \uD80C\uDCD4 \uD80C\uDCD5 \uD80C\uDCD6 \uD80C\uDCD7 \uD80C\uDCD8 \uD80C\uDCD9 \uD80C\uDCDA \uD80C\uDCDB \uD80C\uDCDC \uD80C\uDCDD \uD80C\uDCDE \uD80C\uDCDF \uD80C\uDCE0 \uD80C\uDCE1 \uD80C\uDCE2 \uD80C\uDCE3 \uD80C\uDCE4 \uD80C\uDCE5 \uD80C\uDCE6 \uD80C\uDCE7 \uD80C\uDCE8 \uD80C\uDCE9 \uD80C\uDCEA \uD80C\uDCEB \uD80C\uDCEC \uD80C\uDCED \uD80C\uDCEE \uD80C\uDCEF \uD80C\uDCF0 \uD80C\uDCF1 \uD80C\uDCF2 \uD80C\uDCF3 \uD80C\uDCF4 \uD80C\uDCF5 \uD80C\uDCF6 \uD80C\uDCF7 \uD80C\uDCF8 \uD80C\uDCF9 \uD80C\uDCFA \uD80C\uDCFB \uD80C\uDCFC \uD80C\uDCFD \uD80C\uDCFE \uD80C\uDCFF \uD80C\uDD00 \uD80C\uDD01 \uD80C\uDD02 \uD80C\uDD03 \uD80C\uDD04 \uD80C\uDD05 \uD80C\uDD06 \uD80C\uDD07 \uD80C\uDD08 \uD80C\uDD09 \uD80C\uDD0A \uD80C\uDD0B \uD80C\uDD0C \uD80C\uDD0D \uD80C\uDD0E \uD80C\uDD0F \uD80C\uDD10 \uD80C\uDD11 \uD80C\uDD12 \uD80C\uDD13 \uD80C\uDD14 \uD80C\uDD15 \uD80C\uDD16 \uD80C\uDD19 \uD80C\uDD1A \uD80C\uDD1B \uD80C\uDD1C \uD80C\uDD1D \uD80C\uDD1E \uD80C\uDD1F \uD80C\uDD20 \uD80C\uDD21 \uD80C\uDD22 \uD80C\uDD23 \uD80C\uDD24 \uD80C\uDD25 \uD80C\uDD26 \uD80C\uDD27 \uD80C\uDD28 \uD80C\uDD29 \uD80C\uDD2A \uD80C\uDD2B \uD80C\uDD2C \uD80C\uDD2D \uD80C\uDD2E \uD80C\uDD2F \uD80C\uDD30 \uD80C\uDD31 \uD80C\uDD32 \uD80C\uDD33 \uD80C\uDD34 \uD80C\uDD35 \uD80C\uDD36 \uD80C\uDD37 \uD80C\uDD38 \uD80C\uDD39 \uD80C\uDD3C \uD80C\uDD3D \uD80C\uDD3E \uD80C\uDD3F \uD80C\uDD40 \uD80C\uDD41 \uD80C\uDD42 \uD80C\uDD43 \uD80C\uDD44 \uD80C\uDD45 \uD80C\uDD46 \uD80C\uDD47 \uD80C\uDD48 \uD80C\uDD49 \uD80C\uDD4A \uD80C\uDD4B \uD80C\uDD4C \uD80C\uDD4D \uD80C\uDD4E \uD80C\uDD4F \uD80C\uDD50 \uD80C\uDD51 \uD80C\uDD52 \uD80C\uDD53 \uD80C\uDD54 \uD80C\uDD55 \uD80C\uDD56 \uD80C\uDD57 \uD80C\uDD58 \uD80C\uDD59 \uD80C\uDD5A \uD80C\uDD5B \uD80C\uDD5C \uD80C\uDD5D \uD80C\uDD5E \uD80C\uDD5F \uD80C\uDD60 \uD80C\uDD61 \uD80C\uDD62 \uD80C\uDD63 \uD80C\uDD64 \uD80C\uDD65 \uD80C\uDD66 \uD80C\uDD67 \uD80C\uDD68 \uD80C\uDD69 \uD80C\uDD6A \uD80C\uDD6B \uD80C\uDD6C \uD80C\uDD6D \uD80C\uDD6E \uD80C\uDD6F \uD80C\uDD70 \uD80C\uDD71 \uD80C\uDD72 \uD80C\uDD73 \uD80C\uDD74 \uD80C\uDD75 \uD80C\uDD76 \uD80C\uDD77 \uD80C\uDD78 \uD80C\uDD79 \uD80C\uDD7A \uD80C\uDD7B \uD80C\uDD7C \uD80C\uDD7D \uD80C\uDD7E \uD80C\uDD7F \uD80C\uDD80 \uD80C\uDD81 \uD80C\uDD82 \uD80C\uDD83 \uD80C\uDD84 \uD80C\uDD85 \uD80C\uDD86 \uD80C\uDD87 \uD80C\uDD88 \uD80C\uDD89 \uD80C\uDD8A \uD80C\uDD8B \uD80C\uDD8C \uD80C\uDD8D \uD80C\uDD8E \uD80C\uDD90 \uD80C\uDD91 \uD80C\uDD92 \uD80C\uDD93 \uD80C\uDD94 \uD80C\uDD95 \uD80C\uDD96 \uD80C\uDD97 \uD80C\uDD98 \uD80C\uDD99 \uD80C\uDD9A \uD80C\uDD9B \uD80C\uDD9C \uD80C\uDD9D \uD80C\uDD9E \uD80C\uDD9F \uD80C\uDDA0 \uD80C\uDDA1 \uD80C\uDDA2 \uD80C\uDDA3 \uD80C\uDDA4 \uD80C\uDDA5 \uD80C\uDDA6 \uD80C\uDDA7 \uD80C\uDDA8 \uD80C\uDDA9\uD80C\uDDAA \uD80C\uDDAB \uD80C\uDDAC \uD80C\uDDAE \uD80C\uDDAF \uD80C\uDDB0 \uD80C\uDDB1 \uD80C\uDDB2 \uD80C\uDDB3 \uD80C\uDDB4 \uD80C\uDDB5 \uD80C\uDDB6 \uD80C\uDDB7 \uD80C\uDDB8 \uD80C\uDDB9 \uD80C\uDDBA \uD80C\uDDBB \uD80C\uDDBC \uD80C\uDDBD \uD80C\uDDBE \uD80C\uDDBF \uD80C\uDDC0 \uD80C\uDDC1 \uD80C\uDDC2 \uD80C\uDDC3 \uD80C\uDDC4 \uD80C\uDDC5 \uD80C\uDDC6 \uD80C\uDDC7 \uD80C\uDDC8 \uD80C\uDDC9 \uD80C\uDDCA \uD80C\uDDCB \uD80C\uDDCC \uD80C\uDDCD \uD80C\uDDCE \uD80C\uDDCF \uD80C\uDDD0 \uD80C\uDDD1 \uD80C\uDDD2 \uD80C\uDDD3 \uD80C\uDDD4 \uD80C\uDDD5 \uD80C\uDDD6 \uD80C\uDDD7 \uD80C\uDDD8 \uD80C\uDDD9 \uD80C\uDDDA \uD80C\uDDDB \uD80C\uDDDC \uD80C\uDDDD \uD80C\uDDDE \uD80C\uDDDF \uD80C\uDDE0 \uD80C\uDDE1 \uD80C\uDDE2 \uD80C\uDDE3 \uD80C\uDDE4 \uD80C\uDDE5 \uD80C\uDDE6 \uD80C\uDDE7 \uD80C\uDDE8 \uD80C\uDDE9 \uD80C\uDDEA \uD80C\uDDEB \uD80C\uDDEC \uD80C\uDDED \uD80C\uDDEE \uD80C\uDDEF \uD80C\uDDF0 \uD80C\uDDF1 \uD80C\uDDF2 \uD80C\uDDF3 \uD80C\uDDF4 \uD80C\uDDF5 \uD80C\uDDF6 \uD80C\uDDF7 \uD80C\uDDF8 \uD80C\uDDF9 \uD80C\uDDFA \uD80C\uDDFB \uD80C\uDDFC \uD80C\uDDFE \uD80C\uDDFF \uD80C\uDE00 \uD80C\uDE01 \uD80C\uDE02 \uD80C\uDE03 \uD80C\uDE04 \uD80C\uDE05 \uD80C\uDE06 \uD80C\uDE07 \uD80C\uDE08 \uD80C\uDE09 \uD80C\uDE0A \uD80C\uDE0B \uD80C\uDE0C \uD80C\uDE0D \uD80C\uDE0E \uD80C\uDE0F \uD80C\uDE10 \uD80C\uDE11 \uD80C\uDE12 \uD80C\uDE13 \uD80C\uDE14 \uD80C\uDE15 \uD80C\uDE16 \uD80C\uDE17 \uD80C\uDE18 \uD80C\uDE19 \uD80C\uDE1A \uD80C\uDE1B \uD80C\uDE1C \uD80C\uDE1D \uD80C\uDE1E \uD80C\uDE1F \uD80C\uDE20 \uD80C\uDE21 \uD80C\uDE22 \uD80C\uDE23 \uD80C\uDE24 \uD80C\uDE25 \uD80C\uDE26 \uD80C\uDE27 \uD80C\uDE28 \uD80C\uDE29 \uD80C\uDE2A \uD80C\uDE2B \uD80C\uDE2C \uD80C\uDE2D \uD80C\uDE2E \uD80C\uDE2F \uD80C\uDE30 \uD80C\uDE31 \uD80C\uDE32 \uD80C\uDE33 \uD80C\uDE34 \uD80C\uDE35 \uD80C\uDE36 \uD80C\uDE37 \uD80C\uDE38 \uD80C\uDE39 \uD80C\uDE3A \uD80C\uDE3B \uD80C\uDE3C \uD80C\uDE3D \uD80C\uDE3E \uD80C\uDE3F \uD80C\uDE40 \uD80C\uDE41 \uD80C\uDE42 \uD80C\uDE43 \uD80C\uDE44 \uD80C\uDE45 \uD80C\uDE46 \uD80C\uDE47 \uD80C\uDE48 \uD80C\uDE49 \uD80C\uDE4A \uD80C\uDE4B \uD80C\uDE4C \uD80C\uDE4D \uD80C\uDE4E \uD80C\uDE4F \uD80C\uDE50 \uD80C\uDE51 \uD80C\uDE52 \uD80C\uDE53 \uD80C\uDE54 \uD80C\uDE55 \uD80C\uDE56 \uD80C\uDE57 \uD80C\uDE58 \uD80C\uDE59 \uD80C\uDE5A \uD80C\uDE5B \uD80C\uDE5C \uD80C\uDE5D \uD80C\uDE5E \uD80C\uDE5F \uD80C\uDE60 \uD80C\uDE61 \uD80C\uDE62 \uD80C\uDE63 \uD80C\uDE64 \uD80C\uDE65 \uD80C\uDE66 \uD80C\uDE67 \uD80C\uDE68 \uD80C\uDE69 \uD80C\uDE6A \uD80C\uDE6B \uD80C\uDE6C \uD80C\uDE6D \uD80C\uDE6E \uD80C\uDE6F \uD80C\uDE70 \uD80C\uDE71 \uD80C\uDE72 \uD80C\uDE73 \uD80C\uDE74 \uD80C\uDE75 \uD80C\uDE76 \uD80C\uDE77 \uD80C\uDE78 \uD80C\uDE79 \uD80C\uDE7A \uD80C\uDE7B \uD80C\uDE7C \uD80C\uDE7D \uD80C\uDE7E \uD80C\uDE7F \uD80C\uDE80 \uD80C\uDE81 \uD80C\uDE82 \uD80C\uDE83 \uD80C\uDE84 \uD80C\uDE85 \uD80C\uDE88 \uD80C\uDE89 \uD80C\uDE8A \uD80C\uDE8B \uD80C\uDE8C \uD80C\uDE8D \uD80C\uDE8E \uD80C\uDE8F \uD80C\uDE90 \uD80C\uDE91 \uD80C\uDE92 \uD80C\uDE93 ?? \uD80C\uDE95 \uD80C\uDE96 \uD80C\uDE97 \uD80C\uDE98 \uD80C\uDE99 \uD80C\uDE9A \uD80C\uDE9B \uD80C\uDE9C \uD80C\uDE9D \uD80C\uDE9E \uD80C\uDE9F \uD80C\uDEA0 \uD80C\uDEA1 \uD80C\uDEA2 \uD80C\uDEA3 \uD80C\uDEA4 \uD80C\uDEA5 \uD80C\uDEA6 \uD80C\uDEA7 \uD80C\uDEA8 \uD80C\uDEA9 \uD80C\uDEAA \uD80C\uDEAB \uD80C\uDEAC \uD80C\uDEAD \uD80C\uDEAE \uD80C\uDEAF \uD80C\uDEB0 \uD80C\uDEB1 \uD80C\uDEB2 \uD80C\uDEB3 \uD80C\uDEB4 \uD80C\uDEB5 \uD80C\uDEB6 \uD80C\uDEB7 \uD80C\uDEB8 \uD80C\uDEB9 \uD80C\uDEBA \uD80C\uDEBB \uD80C\uDEBC \uD80C\uDEBD \uD80C\uDEBE \uD80C\uDEBF \uD80C\uDEC0 \uD80C\uDEC1 \uD80C\uDEC2 \uD80C\uDEC3 \uD80C\uDEC4 \uD80C\uDEC5 \uD80C\uDEC6 \uD80C\uDEC7 \uD80C\uDEC8 \uD80C\uDEC9 \uD80C\uDECA \uD80C\uDECB \uD80C\uDECC \uD80C\uDECD \uD80C\uDECE \uD80C\uDECF \uD80C\uDED0 \uD80C\uDED1 \uD80C\uDED2 \uD80C\uDED3 \uD80C\uDED4 \uD80C\uDED5 \uD80C\uDED6 \uD80C\uDED7 \uD80C\uDED8 \uD80C\uDED9 \uD80C\uDEDA \uD80C\uDEDB \uD80C\uDEDC \uD80C\uDEDD \uD80C\uDEDE \uD80C\uDEDF \uD80C\uDEE0 \uD80C\uDEE1 \uD80C\uDEE2 \uD80C\uDEE3 \uD80C\uDEE4 \uD80C\uDEE5 \uD80C\uDEE6 \uD80C\uDEE7 \uD80C\uDEE8 \uD80C\uDEE9 \uD80C\uDEEA \uD80C\uDEEB \uD80C\uDEEC \uD80C\uDEED \uD80C\uDEEE \uD80C\uDEEF \uD80C\uDEF0 \uD80C\uDEF1 \uD80C\uDEF2 \uD80C\uDEF3 \uD80C\uDEF4 \uD80C\uDEF5 \uD80C\uDEF6 \uD80C\uDEF7 \uD80C\uDEF8 \uD80C\uDEF9 \uD80C\uDEFA \uD80C\uDEFB \uD80C\uDEFC \uD80C\uDEFD \uD80C\uDEFE \uD80C\uDEFF \uD80C\uDF00 \uD80C\uDF01 \uD80C\uDF02 \uD80C\uDF03 \uD80C\uDF04 \uD80C\uDF05 \uD80C\uDF06 \uD80C\uDF07 \uD80C\uDF08 \uD80C\uDF09 \uD80C\uDF0A \uD80C\uDF0B \uD80C\uDF0C \uD80C\uDF0D \uD80C\uDF0E \uD80C\uDF0F \uD80C\uDF10 \uD80C\uDF11";
        int count = 0;
        if (FilePathField.getText().isEmpty() || FileNameField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "enter path and file name to create new file in \n اتكب مسار و اسم للفايل الجديد");
        } else {
            String fullpath = FilePathField.getText() + '\\' + FileNameField.getText() + ".txt";
            File payfile = new File(fullpath);

            try {

                PrintWriter pf = new PrintWriter(fullpath);
                for (int i = 0; i < 10000; i++) {
                    count += 1;
                    pf.print(pharaonic);
                    if (count == 1) {
                        pf.print("\n");
                        count = 0;
                    }
                }
                payloadDisplayArea.setText("The file is in the path >> " + payfile.getAbsolutePath()+"\n");
                payloadDisplayArea.appendText("هتلاقي الكلام الجديد في الفايل الي في المسار ده >> "+ payfile.getAbsolutePath());
                FileNameField.setText("");
                pf.close();
            } catch (Exception h) {

                JOptionPane.showMessageDialog(null, " المسار مش موجود يا غلط دي مشكلتك file path is wrong \n");

            }
        }
    }


    @FXML
    void ClearDisplayArea(ActionEvent event) {
        payloadDisplayArea.setText("");
    }


    @FXML
    void copyToClipboard(ActionEvent event) {
        String myString = payloadDisplayArea.getText();
        StringSelection stringSelection = new StringSelection(myString);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }


    @FXML
    void getMousaInfo(ActionEvent event) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://www.facebook.com/profile.php?id=100048557241878"));
    }


    @FXML
    void getYoussefInfo(ActionEvent event) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://www.instagram.com/_youssefelkhodary/"));
    }


    @FXML
    private void changeToCustomPayload(ActionEvent event)throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("payload.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    private void changeToWriter(ActionEvent event)throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("writer.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    private void changeToDeliveryPayload(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    String ReplaceTxte(String paragraph, String oldWrd,String NewWrd) {
       String replased=paragraph.replaceAll(oldWrd,NewWrd) ;
       return replased ;
    }

    String RemoveTxte(String paragraph, String oldWrd,String NewWrd) {
        String replased=paragraph.replaceAll(oldWrd,NewWrd) ;
        return replased ;
    }


}