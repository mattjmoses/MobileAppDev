package com.mattiscool.matt.fragmentdemo;

import android.widget.AdapterView;
import android.os.*;
import android.view.*;
import android.app.*;
import android.widget.*;
import android.widget.AdapterView.*;//For onItemClickListener
import android.widget.ArrayAdapter;
import android.widget.Toast;

/**
 * Created by Matt on 2017-11-06.
 */

public class MyListFragment extends ListFragment implements AdapterView.OnItemClickListener
{
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.list_fragment,container,false);
        return view; //So this returns the view that we just created above. If that makes sense....
    }
    @Override
    public  void onActivityCreated(Bundle savedInstanceState)
    {
        //This is where we access the array
        //First order of business is to send the bundle to the superclass
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter adapter =  ArrayAdapter.createFromResource(getActivity(),R.array.Planets, android.R.layout.simple_list_item_1);//For handling the strings xml array
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        Toast.makeText(getActivity(),"Item: "+position,Toast.LENGTH_SHORT).show();
    }

}
