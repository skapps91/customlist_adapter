package com.skapps.listadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.skapps.listadapter.resource.adapter.ListViewAdapter;

import java.util.ArrayList;
import java.util.HashMap;

import static com.skapps.listadapter.resource.AppConstant.CDESC;
import static com.skapps.listadapter.resource.AppConstant.CNAME;
import static com.skapps.listadapter.resource.AppConstant.CNO;

public class MainActivity extends AppCompatActivity {

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.list);

        ArrayList<HashMap<String, String>> arr = new ArrayList<>();

        for( int i=0; i< 3; i++ ){

            HashMap map = new HashMap();

            if( i==0 ){
                map.put( CNAME, "John Doe" );
                map.put( CDESC, "Dummy data" );
                map.put( CNO, "123456789" );
                arr.add( map );
            }

            if( i==1 ){
                map.put( CNAME, "Jane Doe" );
                map.put( CDESC, "Dummy" );
                map.put( CNO, "9874561230" );
                arr.add( map );
            }
            if( i==2 ){
                map.put( CNAME, "Ali" );
                map.put( CDESC, "Head" );
                map.put( CNO, "13456789" );
                arr.add( map );
            }

        }


        ListViewAdapter adp = new ListViewAdapter(MainActivity.this, arr );

        list.setAdapter( adp );


    }
}
