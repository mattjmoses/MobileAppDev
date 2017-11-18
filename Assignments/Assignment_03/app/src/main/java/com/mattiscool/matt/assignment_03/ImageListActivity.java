package com.mattiscool.matt.assignment_03;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;


import com.mattiscool.matt.assignment_03.dummy.DummyContent;

import java.util.List;

/**
 * An activity representing a list of Images. This activity
 * has different presentations for handset and tablet-size devices. On
 * handsets, the activity presents a list of items, which when touched,
 * lead to a {@link ImageDetailActivity} representing
 * item details. On tablets, the activity presents the list of items and
 * item details side-by-side using two vertical panes.
 */
public class ImageListActivity extends AppCompatActivity {
    String one = "1";
    String two = "2";
    String three = "3";
    String four = "4";
    String five = "5";
    Context context;
    Button btn_reset;

    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet
     * device.
     */
    private boolean mTwoPane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_list);
        DummyContent dumb = new DummyContent(getApplicationContext());
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getTitle());

        //The reset button.
        btn_reset =(Button)findViewById(R.id.btn_reset);


        if (findViewById(R.id.image_detail_container) != null) {
            // The detail container view will be present only in the
            // large-screen layouts (res/values-w900dp).
            // If this view is present, then the
            // activity should be in two-pane mode.
            mTwoPane = true;
        }

        View recyclerView = findViewById(R.id.image_list);
        assert recyclerView != null;
        setupRecyclerView((RecyclerView) recyclerView);

        //Click listener for the ol reset button.
        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                SharedPreferences sharedPrefs = getSharedPreferences("buttonClicks01",Context.MODE_PRIVATE);
                SharedPreferences.Editor edit = sharedPrefs.edit();
                edit.clear().commit();
            }
        });


    }//End oncreate

    private void setupRecyclerView(@NonNull RecyclerView recyclerView) {
        recyclerView.setAdapter(new SimpleItemRecyclerViewAdapter(this, DummyContent.ITEMS, mTwoPane));
    }
//Removing Static from THIS class signature to see if it works with the thing..
    public class SimpleItemRecyclerViewAdapter
            extends RecyclerView.Adapter<SimpleItemRecyclerViewAdapter.ViewHolder> {

        private final ImageListActivity mParentActivity;
        private final List<DummyContent.DummyItem> mValues;
        private final boolean mTwoPane;
        private final View.OnClickListener mOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DummyContent.DummyItem item = (DummyContent.DummyItem) view.getTag();
                if (mTwoPane) {
                    item.setClicked(true);
                    clicked = true;
                    Bundle arguments = new Bundle();
                    arguments.putString(ImageDetailFragment.ARG_ITEM_ID, item.id);
                    ImageDetailFragment fragment = new ImageDetailFragment();
                    fragment.setArguments(arguments);
                    mParentActivity.getSupportFragmentManager().beginTransaction()
                            .replace(R.id.image_detail_container, fragment)
                            .commit();
                } else {
                    Context context = view.getContext();
                    Intent intent = new Intent(context, ImageDetailActivity.class);
                    intent.putExtra(ImageDetailFragment.ARG_ITEM_ID, item.id);
                    item.setClicked(true);
                    clicked = true;
                    context.startActivity(intent);
                }
            }
        };
        private boolean clicked;

        SimpleItemRecyclerViewAdapter(ImageListActivity parent,
                                      List<DummyContent.DummyItem> items,
                                      boolean twoPane) {
            mValues = items;
            mParentActivity = parent;
            mTwoPane = twoPane;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.image_list_content, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, int position) {
            //Our shared preferences...
            SharedPreferences sharedPrefs = getSharedPreferences("buttonClicks01",Context.MODE_PRIVATE);
            String click_01 = sharedPrefs.getString("img_01","");
            String click_02 = sharedPrefs.getString("img_02","");
            String click_03 = sharedPrefs.getString("img_03","");
            String click_04 = sharedPrefs.getString("img_04","");
            String click_05 = sharedPrefs.getString("img_05","");

            //Here're the buttons..
//            holder.mIdView.setText(mValues.get(position).id);
//            holder.mContentView.setText(mValues.get(position).imageName);
           if(mValues.get(position).id.equals("1"))
           {
               holder.mContentView.setText(R.string.img_01);
                if(click_01.equals("clicked"))
                {
                    holder.mContentView.setBackgroundColor(Color.parseColor("#f44242"));
                }

           }
            //Background color change.
//            holder.mContentView.setBackgroundColor(Color.parseColor("#f44242"));
            else if(mValues.get(position).id.equals("2"))
            {
                holder.mContentView.setText(R.string.img_02);
                if(click_02.equals("clicked"))
                {
                    holder.mContentView.setBackgroundColor(Color.parseColor("#f44242"));
                }
            }
           else if(mValues.get(position).id.equals("3"))
           {
               holder.mContentView.setText(R.string.img_03);
               if(click_03.equals("clicked"))
               {
                   holder.mContentView.setBackgroundColor(Color.parseColor("#f44242"));
               }
           }
           else if(mValues.get(position).id.equals("4"))
           {
               holder.mContentView.setText(R.string.img_04);
               if(click_04.equals("clicked"))
               {
                   holder.mContentView.setBackgroundColor(Color.parseColor("#f44242"));
               }
           }
           else if(mValues.get(position).id.equals("5"))
           {
               holder.mContentView.setText(R.string.img_05);
               if(click_05.equals("clicked"))
               {
                   holder.mContentView.setBackgroundColor(Color.parseColor("#f44242"));
               }
           }

            holder.itemView.setTag(mValues.get(position));
            holder.itemView.setOnClickListener(mOnClickListener);
        }

        @Override
        public int getItemCount() {
            return mValues.size();
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            final TextView mIdView;
            final TextView mContentView;

            ViewHolder(View view) {
                super(view);
                mIdView = (TextView) view.findViewById(R.id.id_text);
                mContentView = (TextView) view.findViewById(R.id.content);
            }
        }
    }


}
