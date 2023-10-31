package cn.jnu.test1;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        recyclerView = findViewById(R.id.recycler);

        ArrayList<UserModel> usersList = new ArrayList<>();
        usersList.add(new UserModel("001"));
        usersList.add(new UserModel("002"));
        usersList.add(new UserModel("003"));
        usersList.add(new UserModel("004"));
        usersList.add(new UserModel("005"));
        usersList.add(new UserModel("006"));
        usersList.add(new UserModel("007"));
        usersList.add(new UserModel("008"));
        usersList.add(new UserModel("009"));
        usersList.add(new UserModel("010"));
        usersList.add(new UserModel("011"));
        usersList.add(new UserModel("012"));
        usersList.add(new UserModel("013"));
        usersList.add(new UserModel("014"));
        usersList.add(new UserModel("015"));
        usersList.add(new UserModel("016"));
        usersList.add(new UserModel("017"));

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(MainActivity3.this, usersList);

        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity3.this));

        registerForContextMenu(recyclerView);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        //item.getOrder()
        switch (item.getItemId()) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                return super.onContextItemSelected(item);
        }
        return true;
    }

}
