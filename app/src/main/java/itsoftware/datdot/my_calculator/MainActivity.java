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
        classic = new Classic();

        Button B_GetHelp = (Button) findViewById(R.id.B_GetHelp);

        B_GetHelp.setOnClickListener(this);

        final Button B_0 = (Button) findViewById(R.id.B_0);
        final Button B_1 = (Button) findViewById(R.id.B_1);
        final Button B_2 = (Button) findViewById(R.id.B_2);
        final Button B_3 = (Button) findViewById(R.id.B_3);
        final Button B_4 = (Button) findViewById(R.id.B_4);
        final Button B_5 = (Button) findViewById(R.id.B_5);
        final Button B_6 = (Button) findViewById(R.id.B_6);
        final Button B_7 = (Button) findViewById(R.id.B_7);
        final Button B_8 = (Button) findViewById(R.id.B_8);
        final Button B_9 = (Button) findViewById(R.id.B_9);

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

        final Button B_Plus = (Button) findViewById(R.id.B_Plus);
        final Button B_Minus = (Button) findViewById(R.id.B_Minus);
        final Button B_Divide = (Button) findViewById(R.id.B_Divide);
        final Button B_Multiply = (Button) findViewById(R.id.B_Multiply);
        final Button B_GetResult = (Button) findViewById(R.id.B_GetResult);

        final Button B_Comma = (Button) findViewById(R.id.B_Comma);
        final Button B_AllClear = (Button) findViewById(R.id.B_AllClear);
        final Button B_Backspace = (Button) findViewById(R.id.B_Backspace);
        final Button B_ChangeSign = (Button) findViewById(R.id.B_ChangeSign);
        final Button B_Percentage = (Button) findViewById(R.id.B_Percentage);

        B_Comma.setOnClickListener(this);
        B_AllClear.setOnClickListener(this);
        B_Backspace.setOnClickListener(this);

        setTitle("");
        mTextView = findViewById(R.id.TV_Pole);
        mIntent = new Intent(MainActivity.this, TakeHelp.class);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        final ConstraintLayout ConstraintLayout = findViewById(R.id.ConstraintLayout);
        ConstraintLayout.setBackgroundColor(getResources().getColor(R.color.colorBlack));

        final Switch SwitchMode = (Switch) findViewById(R.id.SwitchMode);
        SwitchMode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    ConstraintLayout.setBackgroundColor(getResources().getColor(R.color.colorSilver));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        B_0.setBackgroundTintList(getResources().getColorStateList(R.color.colorBlack));
                        B_1.setBackgroundTintList(getResources().getColorStateList(R.color.colorBlack));
                        B_2.setBackgroundTintList(getResources().getColorStateList(R.color.colorBlack));
                        B_3.setBackgroundTintList(getResources().getColorStateList(R.color.colorBlack));
                        B_4.setBackgroundTintList(getResources().getColorStateList(R.color.colorBlack));
                        B_5.setBackgroundTintList(getResources().getColorStateList(R.color.colorBlack));
                        B_6.setBackgroundTintList(getResources().getColorStateList(R.color.colorBlack));
                        B_7.setBackgroundTintList(getResources().getColorStateList(R.color.colorBlack));
                        B_8.setBackgroundTintList(getResources().getColorStateList(R.color.colorBlack));
                        B_9.setBackgroundTintList(getResources().getColorStateList(R.color.colorBlack));

                        B_0.setTextColor(getResources().getColor(R.color.colorSilver));
                        B_1.setTextColor(getResources().getColor(R.color.colorSilver));
                        B_2.setTextColor(getResources().getColor(R.color.colorSilver));
                        B_3.setTextColor(getResources().getColor(R.color.colorSilver));
                        B_4.setTextColor(getResources().getColor(R.color.colorSilver));
                        B_5.setTextColor(getResources().getColor(R.color.colorSilver));
                        B_6.setTextColor(getResources().getColor(R.color.colorSilver));
                        B_7.setTextColor(getResources().getColor(R.color.colorSilver));
                        B_8.setTextColor(getResources().getColor(R.color.colorSilver));
                        B_9.setTextColor(getResources().getColor(R.color.colorSilver));

                        mTextView.setTextColor(getResources().getColor(R.color.colorBLACK));

                        B_Plus.setTextColor(getResources().getColor(R.color.colorSilver));
                        B_Minus.setTextColor(getResources().getColor(R.color.colorSilver));
                        B_Divide.setTextColor(getResources().getColor(R.color.colorSilver));
                        B_Multiply.setTextColor(getResources().getColor(R.color.colorSilver));
                        B_GetResult.setTextColor(getResources().getColor(R.color.colorSilver));

                        B_Comma.setTextColor(getResources().getColor(R.color.colorSilver));
                        B_AllClear.setTextColor(getResources().getColor(R.color.colorSilver));
                        B_Backspace.setTextColor(getResources().getColor(R.color.colorSilver));
                        B_ChangeSign.setTextColor(getResources().getColor(R.color.colorSilver));
                        B_Percentage.setTextColor(getResources().getColor(R.color.colorSilver));
                    }
                } else {
                    ConstraintLayout.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        B_0.setBackgroundTintList(getResources().getColorStateList(R.color.colorSilver));
                        B_1.setBackgroundTintList(getResources().getColorStateList(R.color.colorSilver));
                        B_2.setBackgroundTintList(getResources().getColorStateList(R.color.colorSilver));
                        B_3.setBackgroundTintList(getResources().getColorStateList(R.color.colorSilver));
                        B_4.setBackgroundTintList(getResources().getColorStateList(R.color.colorSilver));
                        B_5.setBackgroundTintList(getResources().getColorStateList(R.color.colorSilver));
                        B_6.setBackgroundTintList(getResources().getColorStateList(R.color.colorSilver));
                        B_7.setBackgroundTintList(getResources().getColorStateList(R.color.colorSilver));
                        B_8.setBackgroundTintList(getResources().getColorStateList(R.color.colorSilver));
                        B_9.setBackgroundTintList(getResources().getColorStateList(R.color.colorSilver));

                        mTextView.setTextColor(getResources().getColor(R.color.colorWhite));

                        B_0.setTextColor(getResources().getColor(R.color.colorBlack));
                        B_1.setTextColor(getResources().getColor(R.color.colorBlack));
                        B_2.setTextColor(getResources().getColor(R.color.colorBlack));
                        B_3.setTextColor(getResources().getColor(R.color.colorBlack));
                        B_4.setTextColor(getResources().getColor(R.color.colorBlack));
                        B_5.setTextColor(getResources().getColor(R.color.colorBlack));
                        B_6.setTextColor(getResources().getColor(R.color.colorBlack));
                        B_7.setTextColor(getResources().getColor(R.color.colorBlack));
                        B_8.setTextColor(getResources().getColor(R.color.colorBlack));
                        B_9.setTextColor(getResources().getColor(R.color.colorBlack));

                        B_Plus.setTextColor(getResources().getColor(R.color.colorBlack));
                        B_Minus.setTextColor(getResources().getColor(R.color.colorBlack));
                        B_Divide.setTextColor(getResources().getColor(R.color.colorBlack));
                        B_Multiply.setTextColor(getResources().getColor(R.color.colorBlack));
                        B_GetResult.setTextColor(getResources().getColor(R.color.colorBlack));

                        B_Comma.setTextColor(getResources().getColor(R.color.colorBlack));
                        B_AllClear.setTextColor(getResources().getColor(R.color.colorBlack));
                        B_Backspace.setTextColor(getResources().getColor(R.color.colorBlack));
                        B_ChangeSign.setTextColor(getResources().getColor(R.color.colorBlack));
                        B_Percentage.setTextColor(getResources().getColor(R.color.colorBlack));
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
            Toast.makeText(getApplicationContext(), "Error!", Toast.LENGTH_SHORT).show();
        }
    }
}