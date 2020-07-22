package com.example.project7_h_2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;


public class MainActivity extends AppCompatActivity {

    RadioGroup radiogroup;
    Button btn;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        radiogroup = (RadioGroup) findViewById(R.id.group);

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                View dlgView = View.inflate(MainActivity.this,R.layout.dialog,null);

                img = (ImageView) dlgView.findViewById(R.id.imageView1);
                dlg.setView(dlgView);

                switch (radiogroup.getCheckedRadioButtonId())
                {
                    case R.id.rdb1:
                        dlg.setTitle("강아지");
                        img.setImageResource(R.drawable.dog);
                        break;
                     case R.id.rdb2:
                         dlg.setTitle("고양이");
                         img.setImageResource(R.drawable.cat);
                         break;

                     case R.id.rdb3:
                         dlg.setTitle("토끼");
                         img.setImageResource(R.drawable.rabbit);
                         break;
                     case R.id.rdb4:
                         dlg.setTitle("말");
                         img.setImageResource(R.drawable.horse);
                         break;
                }

                dlg.setPositiveButton("닫기",null);
                dlg.show();
            }
        });
    }
}
