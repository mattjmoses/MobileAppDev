package com.mattiscool.matt.assignment_03.dummy;

import android.content.Context;
import android.content.ContextWrapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.mattiscool.matt.assignment_03.R;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent extends ContextWrapper {
    private String idVal_01 = getString(R.string.img_01);
    private String idVal_02 = getString(R.string.img_02);
    private String idVal_03 = getString(R.string.img_03);
    private String idVal_04 = getString(R.string.img_04);
    private String idVal_05 = getString(R.string.img_05);
    /**
     * An array of sample (dummy) items.
     */
    Context context;
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
//        // Add some sample items.
//        for (int i = 1; i <= COUNT; i++) {
//            addItem(createDummyItem(i));
        addItem(new DummyItem("1","Image_01"));
        addItem(new DummyItem("2","Image_02"));
        addItem(new DummyItem("3","Image_03"));
        addItem(new DummyItem("4","Image_04"));
        addItem(new DummyItem("5","Image_05"));

        }

    public DummyContent(Context base) {
        super(base);

    }


    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

//    private static DummyItem createDummyItem(int position) {
//        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
//    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String imageName;


        public DummyItem(String id, String imageName) {
            this.id = id;
            this.imageName = imageName;

        }

        @Override
        public String toString() {
            return imageName;
        }
    }
}
