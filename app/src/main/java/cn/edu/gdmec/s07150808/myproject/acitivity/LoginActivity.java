package cn.edu.gdmec.s07150808.myproject.acitivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import cn.edu.gdmec.s07150808.myproject.R;

public class LoginActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.login);
    }
}