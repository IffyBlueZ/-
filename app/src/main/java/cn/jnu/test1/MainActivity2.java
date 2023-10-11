package cn.jnu.test1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        Button button = findViewById(R.id.exp4_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView exp41 = findViewById(R.id.exp41);
                TextView exp42 = findViewById(R.id.exp42);
                if(exp41.getText()=="Hello"){
                    exp41.setText("JNU");
                    exp42.setText("Hello");
                }
                else{
                    exp41.setText("Hello");
                    exp42.setText("JNU");
                }
                Toast.makeText(MainActivity2.this, "交换成功", Toast.LENGTH_SHORT).show();


                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity2.this);
                builder.setTitle("提示");
                builder.setMessage("交换成功！");
                builder.setPositiveButton("确定", (dialog, which)->{});
                builder.setNegativeButton("取消", (dialog, which)->{});

                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });
    }
}