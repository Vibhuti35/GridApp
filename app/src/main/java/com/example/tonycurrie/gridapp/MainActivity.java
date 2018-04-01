package com.example.tonycurrie.gridapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
//import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public GridView gv;
    /** public String[] items=new String[81]; */
    public ArrayList<String> items = new ArrayList<String>();
    CustomGridAdaptor gridadapter;
    int i;
    public Button A,B,C,D,E,F,G,H,I,Sort;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        gv=(GridView) this.findViewById(R.id.MyGrid);
        A=(Button)findViewById(R.id.btnA);
        B=(Button)findViewById(R.id.btnB);
        C=(Button)findViewById(R.id.btnC);
        D=(Button)findViewById(R.id.btnD);
        E=(Button)findViewById(R.id.btnE);
        F=(Button)findViewById(R.id.btnF);
        G=(Button)findViewById(R.id.btnG);
        H=(Button)findViewById(R.id.btnH);
        I=(Button)findViewById(R.id.btnI);
        Sort=(Button)findViewById(R.id.Sort);

        for(i=0;i<81;)
        {
            items.add ("*"); /** Integer.toString(++i); */
        }

        gridadapter=new CustomGridAdaptor(MainActivity.this,items);
        gv.setAdapter(gridadapter);

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view,final int pos, long l) {

                Toast.makeText(MainActivity.this, "" + pos, Toast.LENGTH_SHORT).show();
          /**  }
        }); */

                A.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        items.set(pos,(String)A.getText());
                        gv.setAdapter(gridadapter);                    }
                });

                B.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        items.set(pos,(String)B.getText());
                        gv.setAdapter(gridadapter);                    }
                });

                C.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        items.set(pos,(String)C.getText());
                        gv.setAdapter(gridadapter);                    }
                });

                D.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        items.set(pos,(String)D.getText());
                        gv.setAdapter(gridadapter);                    }
                });

                E.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        items.set(pos,(String)E.getText());
                        gv.setAdapter(gridadapter);                    }
                });

                F.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        items.set(pos,(String)F.getText());
                        gv.setAdapter(gridadapter);                    }
                });

                G.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        items.set(pos,(String)G.getText());
                        gv.setAdapter(gridadapter);                    }
                });

                H.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        items.set(pos,(String)H.getText());
                        gv.setAdapter(gridadapter);                    }
                });

                I.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        items.set(pos,(String)I.getText());
                        gv.setAdapter(gridadapter);                    }
                });
            }
        });

        Sort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Random R=new Random();
             String[] chars={"A","B","C","D","E","F","G","H","I"};

             for(i=0;i<81;i++) {
                 if (items.get(i) == "*") {
                    items.set(i,chars[R.nextInt(9)]);
                 }
             }

             for(i=0;i<72;i++)
             {
                 Collections.sort(items.subList(i,i+9));
             }
             }


        });

    }
}
