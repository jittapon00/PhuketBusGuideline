package pbg.se55.mypc.phuketbusguideline;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ViewAllRouteActivity extends ActionBarActivity implements AdapterView.OnItemClickListener {
    ArrayAdapter<String> adt;
    ListView selectRouteView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all_route);
        selectRouteView = (ListView) findViewById(R.id.selectOneRoute);

        String RouteText[] = {"From Big C to Ratchapat Phuket University","From Super Cheap to Si Mum Muang Market","From 2nd Bus Terminal to 1st Bus Terminal","From Saphanhin to Tukkae Cape"};

        adt= new ArrayAdapter<String>(this, R.layout.listview_item,R.id.textViewTitle, RouteText);

        selectRouteView.setAdapter(adt);


        selectRouteView.setOnItemClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_view_all_route, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent i = new Intent(this, ShowOneRouteActivity.class);
            String s = (String) parent.getItemAtPosition(position);
            i.putExtra("txtRouteSelected",s);
            startActivity(i);
    }
}
