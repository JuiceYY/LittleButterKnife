package cn.istary.littlebutterknife.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import cn.istary.littlebutterknife.R;
import cn.istary.littlebutterknife.myKnife.LittleKnife;
import cn.istary.littlebutterknife.myKnife.annotation.BindView;
import cn.istary.littlebutterknife.myKnife.annotation.ContentView;
import cn.istary.littlebutterknife.myKnife.annotation.OnClick;
import cn.istary.littlebutterknife.myKnife.annotation.OnLongClick;

@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn1)
    private Button button1;
    @BindView(R.id.btn2)
    private Button button2;
    @BindView(R.id.btn3)
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LittleKnife.getInstance().inject(this);
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "button1", Toast.LENGTH_SHORT).show();
//            }
//        });
//        button2.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                return false;
//            }
//        });

    }

    @OnClick({R.id.btn1, R.id.btn2, R.id.btn3})
    public void myMethod(View v){
        switch (v.getId()){
            case R.id.btn1:
                Toast.makeText(this, "button1 onClick", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn2:
                Toast.makeText(this, "button2 onClick", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn3:
                //startActivity(new Intent(this, RecyclerViewActivity.class));
                break;
        }
    }

    @OnLongClick({R.id.btn2})
    public boolean myLongClick(View v){
        switch (v.getId()){
            case R.id.btn2:
                Toast.makeText(this, "button2 onLongClick", Toast.LENGTH_SHORT).show();
                return true;
        }
        return false;
    }
}

