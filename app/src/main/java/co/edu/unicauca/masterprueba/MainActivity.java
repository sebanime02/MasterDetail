package co.edu.unicauca.masterprueba;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;
    private String[] items;
    private ActionBar actionBar;
    private List<RowItem> rowItems;
    public static final Integer[] images = {R.drawable.edit,R.drawable.edit,R.drawable.edit,R.drawable.ic_action_action_settings,R.drawable.ic_action_action_help,R.drawable.ic_action_content_report};
    public static final String[] titles= {"Lista de Pacientes","Notificaciones","Tips para el cuidador","Perfil de usuario","Ayuda","Salir"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rowItems = new ArrayList<RowItem>();
        for (int i = 0; i < titles.length; i++) {
            RowItem item = new RowItem(images[i], titles[i]);
            rowItems.add(item);
        }

        listView = (ListView) findViewById(R.id.lista);
        Adapter adapter = new Adapter(this,
                R.layout.item_list, rowItems);
        listView = (ListView)  findViewById(R.id.lista);
        listView.setOnItemClickListener(this);

        /*
        items = new String[]{"Lista de Pacientes","Notificaciones","Tips"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
         */
        listView.setAdapter(adapter);



        actionBar = getSupportActionBar();
        actionBar.setTitle("Lista de Pacientes");
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_white_24dp);



       getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new ListPatientFragment())
                .commit();



/*
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:

                   getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container, new ListPatientFragment())
                            .commit();
                    case 1:
                     getSupportFragmentManager().beginTransaction()
                                .replace(R.id.container, new ListNotificationsFragment())
                                .commit();
                    case 2:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.container, new ListTipsFragment())
                                .commit();
                }

            }
        });
      */
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Log.d("Presionado",position+"");
            switch (position) {
                case 0:


                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container, new ListPatientFragment())
                            .commit();
                    actionBar.setTitle("Lista de Pacientes");
                    break;
                case 1:
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container, new ListNotificationsFragment())
                            .commit();
                    actionBar.setTitle("Notificaciones de Supervisor");

                    break;
                case 2:
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container, new ListTipsFragment())
                            .commit();
                    actionBar.setTitle("Tips para el cuidador");

                    break;
                case 3:
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container, new ListTipsFragment())
                            .commit();
                    actionBar.setTitle("Tips para el cuidador");


        }
    }
}
