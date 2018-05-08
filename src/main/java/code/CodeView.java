package code;

import com.asprise.ocr.Ocr;

import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Created by lichen@daojia.com on 2018-1-5.
 */
public class CodeView {


    public static String recognize(BufferedImage image) {
        Ocr.setUp();
        Ocr ocr = new Ocr();
        ocr.startEngine("eng", Ocr.SPEED_FASTEST);
        String result = ocr.recognize(image,com.asprise.ocr.Ocr.RECOGNIZE_TYPE_ALL, com.asprise.ocr.Ocr.OUTPUT_FORMAT_PLAINTEXT,0,null);
        ocr.stopEngine();
        return result;
    }

//    public static void main(String[] args) throws IOException {
//        BufferedImage bi = ImageIO.read(new File("E:\\learn\\springcodelearn\\src\\main\\resources\\imgcode.jpg"));
//        System.out.println("recognize"+recognize( bi ));
//    }

    public static void main(String[] args) {
        Ocr.setUp(); // one time setup
        Ocr ocr = new Ocr(); // create a new OCR engine
        ocr.startEngine("eng", Ocr.SPEED_FASTEST); // English
        String s = ocr.recognize(new File[] {new File("E:\\learn\\springcodelearn\\src\\main\\resources\\imgcode.jpg")},
                Ocr.RECOGNIZE_TYPE_ALL, Ocr.OUTPUT_FORMAT_PLAINTEXT); // PLAINTEXT | XML | PDF | RTF
        System.out.println("Result: " + s);
        ocr.stopEngine();
    }
}
