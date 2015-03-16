package pbg.se55.mypc.phuketbusguideline;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View searchRouteButton =  findViewById(R.id.btn_search_route);
        searchRouteButton.setOnClickListener(this);
        View findBusStopButton = findViewById(R.id.btn_bus_stop);
        findBusStopButton.setOnClickListener(this);
        View viewAllRouteButton = findViewById(R.id.btn_view);
        viewAllRouteButton.setOnClickListener(this);
        View serviceButton = findViewById(R.id.btn_info);
        serviceButton.setOnClickListener(this);
        View commentButton = findViewById(R.id.btn_comment);
        commentButton.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
    public boolean onTouchEvent(MotionEvent event){
        if(event.getAction() != MotionEvent.ACTION_DOWN)
            return super.onTouchEvent(event);
        //Open MenuActivity.java
        openMenu();
        return true;

    }

    private void openMenu() {
        Intent toMenu = new Intent(getApplicationContext(),MenuActivity.class);
        startActivity(toMenu);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_search_route:
                Intent i1 = new Intent(this, SearchRouteActivity.class);
                startActivity(i1);
                break;
            case R.id.btn_bus_stop:
                Intent i2 = new Intent(this, MapsActivity.class);
                startActivity(i2);
                break;
            case R.id.btn_view:
                Intent i3 = new Intent(this, ViewAllRouteActivity.class);
                startActivity(i3);
                break;
            case R.id.btn_info:
                Intent i4 = new Intent(this, ServiceActivity.class);
                startActivity(i4);
                break;
            case R.id.btn_comment:
                Intent i5 = new Intent(this, CommentActivity.class);
                startActivity(i5);
                break;
        }
    }
}
