package com.example.decaplon.Model;

import android.os.Environment;

import com.example.decaplon.Utils.XmlParser;

import org.xmlpull.v1.XmlPullParserException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContentItemShop {

    public static final List<ItemShop> ITEMS = new ArrayList<ItemShop>();
    public static final Map<String, ItemShop> ITEM_MAP = new HashMap<String, ItemShop>();

    static {
        addItem();
    }

    private static void addItem() {
        try {
            String fileName = "Save/Data.xml";
            String path = Environment.getExternalStorageDirectory()+"/"+fileName;
            File file = new File(path);
            FileInputStream is = new FileInputStream(file);
            List<ItemShop> temp = XmlParser.parse(is);
            for (ItemShop item:temp
                 ) {
                ITEMS.add(item);
                ITEM_MAP.put(item.id, item);
            }
        }catch(IOException e){
            e.printStackTrace();
        }catch (XmlPullParserException xe){
            xe.printStackTrace();
        }
    }

    public static class ItemShop {
        public final String id;
        public final String category;
        public final String content;
        public final String details;

        public ItemShop(String id, String category, String content, String details) {
            this.id = id;
            this.category = category;
            this.content = content;
            this.details = details;
        }

        public ItemShop(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
            category = null;
        }

        @Override
        public String toString() {
            return content;
        }
    }

}
