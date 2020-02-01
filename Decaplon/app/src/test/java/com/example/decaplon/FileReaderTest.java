/*package com.example.decaplon;

import com.example.decaplon.Model.ContentItemShop;
import com.example.decaplon.Utils.XmlParser;

import org.junit.Test;
import org.xmlpull.v1.XmlPullParserException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class FileReaderTest {
    private static List<ContentItemShop.ItemShop> tmp = null;

    static{
        try {
            String fileName = "C:/Users/user/Desktop/Quallog/Decaplon/app/src/main/java/com/example/decaplon/Save/Data.xml";
            File file = new File(fileName);
            FileInputStream is = new FileInputStream(file);
            tmp = XmlParser.parse(is);
        }catch (IOException e){
            e.printStackTrace();
        }catch (XmlPullParserException xe){
            xe.printStackTrace();
        }
    }

    @Test
    public void _isReading() {
        assertNotNull(tmp);
    }

    @Test
    public void _isIdNaN(){
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher matcher = pattern.matcher(tmp.get(0).id);
        assertTrue(matcher.find());
    }

    @Test
    public void _isIDLoaded(){
        assertNotNull(tmp.get(0).id);
        assertNotEquals(tmp.get(0).id,"");
    }

    @Test
    public void _isCategLoaded(){
        assertNotNull(tmp.get(0).category);
        assertNotEquals(tmp.get(0).category,"");
    }

    @Test
    public void _isContentLoaded(){
        assertNotNull(tmp.get(0).content);
        assertNotEquals(tmp.get(0).content,"");
    }

    @Test
    public void _areDetailsLoaded(){
        assertNotNull(tmp.get(0).details);
        assertNotEquals(tmp.get(0).details,"");

    }
}*/
