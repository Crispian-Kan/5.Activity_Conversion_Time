package com.example.time_exchange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.btn1);
        button.setOnClickListener(the_Time);
    }
    private View.OnClickListener the_Time = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //字串格式化
            DecimalFormat time = new DecimalFormat("0");
            EditText year = (EditText)findViewById(R.id.editV1);
            EditText mouth = (EditText)findViewById(R.id.editV2);
            EditText day = (EditText)findViewById(R.id.editV3);
            EditText hour = (EditText)findViewById(R.id.editV4);
            EditText minute = (EditText)findViewById(R.id.editV5);
            EditText secord = (EditText)findViewById(R.id.editV6);
            //定義時間資料格式
            int years = Integer.parseInt(year.getText().toString());
            int mouths = Integer.parseInt(mouth.getText().toString());
            int days = Integer.parseInt(day.getText().toString());
            int hours = Integer.parseInt(hour.getText().toString());
            int minutes = Integer.parseInt(minute.getText().toString());
            int secords = Integer.parseInt(secord.getText().toString());

            //格式化輸出年/月/日
            TextView ymd = (TextView)findViewById(R.id.set_ymd);
            ymd.setText(time.format(years) + "/" + time.format(mouths) + "/" + time.format(days));
            //格式化輸出時/分/秒
            TextView hms = (TextView)findViewById(R.id.set_hms);
            hms.setText(time.format(hours) + ":" + time.format(minutes) + ":" + time.format(secords));
            TextView leap = (TextView)findViewById(R.id.set_leapYear);
            //判定閏年
            if (years % 4 == 0)
                leap.setText("是");
            else if (years % 100 == 0)
                leap.setText("是");
            else if (years % 400 == 0)
                leap.setText("是");
            else
                leap.setText("不是");
        }
    };
}