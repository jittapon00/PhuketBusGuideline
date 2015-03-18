package pbg.se55.mypc.phuketbusguideline;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;


public class ShowOneRouteActivity extends ActionBarActivity {
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_one_route);
        Bundle extras = getIntent().getExtras();
        String selected = extras.getString("txtRouteSelected");
        img = (ImageView) findViewById(R.id.imageView3);

        switch (selected){
            case "From Big C to Ratchapat Phuket University": img.setImageResource(R.drawable.route1);break;
            case "From Super Cheap to Si Mum Muang Market": img.setImageResource(R.drawable.route2_1);break;
            case "From 2nd Bus Terminal to 1st Bus Terminal": img.setImageResource(R.drawable.route2_2);break;
            case "From Saphanhin to Tukkae Cape": img.setImageResource(R.drawable.route3);break;
        }


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_show_one_route, menu);
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
}
