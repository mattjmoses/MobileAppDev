package com.mattiscool.matt.assignment_03;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //So first we need to create a new image fragment object
        ImageFragment imageFrag = new ImageFragment();

        //Next you need the ol Fragment Manager to manage all the fragments
        FragmentManager manager = getFragmentManager();
        //THEN the Fragment transaction which links to the manager we just created
        FragmentTransaction transaction = manager.beginTransaction();
        //NEXT we do the transaction
        transaction.add(R.id.fragmentContainer, imageFrag);
        //THEN we commit the transaciton
        transaction.commit();
    }

    /**
     * Created by Matt on 2017-11-10.
     */

    //Fragments need to extend the Fragment class...
    public static class ImageFragment extends Fragment
    {
        @Nullable
        @Override //Need this for the fragment to work.
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
            //When this is called it inflates the image_fragment layout.
            View view = inflater.inflate(R.layout.image_fragment, container,false);

            return view;
        }
    }
}
