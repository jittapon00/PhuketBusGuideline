package pbg.se55.mypc.phuketbusguideline;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;


public class SearchRouteActivity extends Activity {
    EditText oriText;
    EditText desText;
    ListView originLsv;
    ListView desLsv;

    ArrayAdapter<String> adt, adt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_route);

        oriText = (EditText) findViewById(R.id.originText);
        originLsv = (ListView) findViewById(R.id.originsSearch);
        desText = (EditText) findViewById(R.id.destinationText);
        desLsv = (ListView) findViewById(R.id.destinationsSearch);

        String BusStopTH[] = {"บิ๊กซี","โลตัส","รพ.วชิระ","แยกสตรี","แยกอำเภอ"
                ,"แยกจุ้ยตุ่ย","ซอยภูธร","วงเวียนน้ำพุ","บขส.เก่า","วงเวียนหอนาฬิกา"
                ,"แยกบางเหนียว","สะพานหิน","รร.เฉลิมพระเกียรติ","วิทยาลัยอาชีวศึกษาภูเก็ต","แหลมตุ๊กแก"
                ,"ซุปเปอร์ชีปใหญ่","แยกราชภัฎ","ภูเก็ตวิทยาลัย","ศาลากลาง","เอ็กโป"
                ,"ตลาดเกษตร","รร.เทศบาลเมือง","แหลมชั่น","เทศบาลวิชิตสงคราม","ตลาดสี่มุมเมือง"
                ,"บขส.ใหม่","วงเวียนสะพานหิน","สะพานคลองบางใหญ่","สนง.ขนส่งภูเก็ต","วงเวียนสุริยเดช"
                ,"รร.พุทธมงคลนิมิตร","รร.สตรีภูเก็ต","ไปรษณีย์","รพ.อบจ.ภูเก็ต","ท่าเทียบเรือ"
                ,"การเคหะ"
        };
        final String BusStopEN[] = {"BigC","Tesco Lotus","Wachira Hospital","Yaek Satree","Yaek Amphur"
                ,"Yeak Chuiitui","Soi Putorn","WongWian Nampu","Bus Terminal(Old)","WongWian Hor Nalikar"
                ,"Yaek BangNiau","Saphanhin","Chaloemprakiat School","Ratchapat Phuket University","Tukkae Cape"
                ,"SuperCheap SuperMarket","Yaek Ratchapat","Phuketwittayalai School","Phuket Capitol(Sala Klang)","Expo"
                ,"Kasait Market","Tessaban Muang School","Laem Chan","Wichit Songkram Municipal Office","Si Mum Muang Market"
                ,"Bus Terminal (New)","Wonwian Saphanhin","Klong Bang Yai Bridge","Phuket Province Land Transport Office","Wongwian Suriyadet"
                ,"Phuttamongkolnimit School","Stree Phuket School","Post Office","Phuket City Hospital","Landing Pier"
                ,"Karn Keha"
        };

        adt= new ArrayAdapter<String>(this, R.layout.listview_item,R.id.textViewTitle, BusStopEN);


        oriText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                originLsv.setAdapter(adt);
                oriText.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                        if(oriText.getText().toString().matches(""))
                            adt.getFilter().filter(" ");
                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        if(oriText.getText().toString().matches(""))
                            adt.getFilter().filter(" ");
                        else
                            adt.getFilter().filter(s);

                    }

                    @Override
                    public void afterTextChanged(Editable s) {

                    }
                });
            }
        });
        originLsv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                oriText.setText((String) parent.getItemAtPosition(position));
                adt.getFilter().filter(" ");
            }
        });



        adt2= new ArrayAdapter<String>(this, R.layout.listview_item,R.id.textViewTitle, BusStopEN);
        desText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desLsv.setAdapter(adt2);

                desText.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        if(oriText.getText().toString().matches(""))
                            adt.getFilter().filter(" ");
                        else
                            adt.getFilter().filter(s);

                    }

                    @Override
                    public void afterTextChanged(Editable s) {

                    }
                });
            }
        });
        desLsv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                desText.setText((String) parent.getItemAtPosition(position));
                adt2.getFilter().filter(" ");
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_search_route, menu);
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
