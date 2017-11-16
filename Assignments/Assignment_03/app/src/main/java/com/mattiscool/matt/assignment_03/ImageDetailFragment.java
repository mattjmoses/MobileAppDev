package com.mattiscool.matt.assignment_03;

import android.app.Activity;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mattiscool.matt.assignment_03.dummy.DummyContent;

/**
 * A fragment representing a single Image detail screen.
 * This fragment is either contained in a {@link ImageListActivity}
 * in two-pane mode (on tablets) or a {@link ImageDetailActivity}
 * on handsets.
 */
public class ImageDetailFragment extends Fragment {
    ImageView imView;

    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private DummyContent.DummyItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ImageDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.imageName);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.image_detail, container, false);
        imView =(ImageView) rootView.findViewById(R.id.img_display);
        // Show the dummy content as text in a TextView.//We want it to be an image view...
        if (mItem != null) {
            if(mItem.id.equals("1"))
            {
                imView.setImageResource(R.drawable.image_01);
                return rootView;
            }
//            ((TextView) rootView.findViewById(R.id.image_detail)).setText(mItem.url);
            //This works!

            else if(mItem.id.equals("2"))
            {
                imView.setImageResource(R.drawable.image_02);
                return rootView;
            }
            else if(mItem.id.equals("3"))
            {
                imView.setImageResource(R.drawable.image_03);
                return rootView;
            }
        }

        return rootView;
    }
}
