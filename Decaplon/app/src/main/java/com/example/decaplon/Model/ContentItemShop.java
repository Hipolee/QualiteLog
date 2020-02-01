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

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createItemShop(i));
        }
    }

    //Code non fonctionnel de lecture du fichier
    /*static {
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
    }*/

    private static void addItem(ItemShop item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static ItemShop createItemShop(int position) {
        return new ItemShop(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        builder.append("\nMore details information here.");
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
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
