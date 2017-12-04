package itsoftware.datdot.my_calculator;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    private String mString = "";
    private Intent mIntent;
    private Classic classic;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("");
        classic = new Classic();
        mTextView = findViewById(R.id.TV_Pole);

        final Button B_GetHelp = findViewById(R.id.B_GetHelp);

        final Button B_0 = findViewById(R.id.B_0);
        final Button B_1 = findViewById(R.id.B_1);
        final Button B_2 = findViewById(R.id.B_2);
        final Button B_3 = findViewById(R.id.B_3);
        final Button B_4 = findViewById(R.id.B_4);
        final Button B_5 = findViewById(R.id.B_5);
        final Button B_6 = findViewById(R.id.B_6);
        final Button B_7 = findViewById(R.id.B_7);
        final Button B_8 = findViewById(R.id.B_8);
        final Button B_9 = findViewById(R.id.B_9);

        final Button B_Plus = findViewById(R.id.B_Plus);
        final Button B_Minus = findViewById(R.id.B_Minus);
        final Button B_Divide = findViewById(R.id.B_Divide);
        final Button B_Multiply = findViewById(R.id.B_Multiply);
        final Button B_GetResult = findViewById(R.id.B_GetResult);

        final Button B_Comma = findViewById(R.id.B_Comma);
        final Button B_AllClear = findViewById(R.id.B_AllClear);
        final Button B_Backspace = findViewById(R.id.B_Backspace);
        final Button B_ChangeSign = findViewById(R.id.B_ChangeSign);
        final Button B_Percentage = findViewById(R.id.B_Percentage);

        final ConstraintLayout ConstraintLayout = findViewById(R.id.ConstraintLayout);
        final Switch SwitchMode = findViewById(R.id.SwitchMode);

        B_GetHelp.setOnClickListener(this);

        B_0.setOnClickListener(this);
        B_1.setOnClickListener(this);
        B_2.setOnClickListener(this);
        B_3.setOnClickListener(this);
        B_4.setOnClickListener(this);
        B_5.setOnClickListener(this);
        B_6.setOnClickListener(this);
        B_7.setOnClickListener(this);
        B_8.setOnClickListener(this);
        B_9.setOnClickListener(this);

        B_Plus.setOnClickListener(this);
        B_Minus.setOnClickListener(this);
        B_Divide.setOnClickListener(this);
        B_Multiply.setOnClickListener(this);
        B_GetResult.setOnClickListener(this);

        B_Comma.setOnClickListener(this);
        B_AllClear.setOnClickListener(this);
        B_Backspace.setOnClickListener(this);
        B_ChangeSign.setOnClickListener(this);
        B_Percentage.setOnClickListener(this);

        mIntent = new Intent(MainActivity.this, TakeHelp.class);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        ConstraintLayout.setBackgroundColor(getResources().getColor(R.color.colorBlack));
        SwitchMode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

                    }
                } else {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

                    }
                }
            }
        });
    }

    @Override
    public void onClick(View view) {
        if (mString.length() != 7) {
            switch (view.getId()) {
                case R.id.B_AllClear:
                    mString = classic.AllClear(mString);
                    mTextView.setText(mString);
                    break;
                case R.id.B_GetHelp:
                    startActivity(mIntent);
                    overridePendingTransition(R.anim.slide_from_down, 0);
                    break;
                case R.id.B_Backspace:
                    mString = classic.Backspace(mString);
                    mTextView.setText(mString);
                    break;
                case R.id.B_Comma:
                    mString = classic.Comma(mString);
                    mTextView.setText(mString);
                    break;
                default:
                    mString = mString + classic.EnterNumber(view.getId());
                    mTextView.setText(mString);
                    break;
            }
        } else {
            mString = "";
            mTextView.setText(mString);
            Toast.makeText(getApplicationContext(), "Error!", Toast.LENGTH_SHORT).show();
        }
    }
}