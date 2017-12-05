package itsoftware.datdot.my_calculator;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
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

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mTextView.setTextColor(getResources().getColor(R.color.colorWhite));

            B_GetHelp.setBackgroundTintList(getResources().getColorStateList(R.color.colorDarklyGray));
            B_GetHelp.setTextColor(getResources().getColor(R.color.colorDarkly));

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
            B_0.setTextColor(getResources().getColor(R.color.colorDarkly));
            B_1.setTextColor(getResources().getColor(R.color.colorDarkly));
            B_2.setTextColor(getResources().getColor(R.color.colorDarkly));
            B_3.setTextColor(getResources().getColor(R.color.colorDarkly));
            B_4.setTextColor(getResources().getColor(R.color.colorDarkly));
            B_5.setTextColor(getResources().getColor(R.color.colorDarkly));
            B_6.setTextColor(getResources().getColor(R.color.colorDarkly));
            B_7.setTextColor(getResources().getColor(R.color.colorDarkly));
            B_8.setTextColor(getResources().getColor(R.color.colorDarkly));
            B_9.setTextColor(getResources().getColor(R.color.colorDarkly));

            B_Plus.setBackgroundTintList(getResources().getColorStateList(R.color.colorLightlyOrange));
            B_Minus.setBackgroundTintList(getResources().getColorStateList(R.color.colorLightlyOrange));
            B_Divide.setBackgroundTintList(getResources().getColorStateList(R.color.colorLightlyOrange));
            B_Multiply.setBackgroundTintList(getResources().getColorStateList(R.color.colorLightlyOrange));
            B_GetResult.setBackgroundTintList(getResources().getColorStateList(R.color.colorDarklyOrange));
            B_Plus.setTextColor(getResources().getColor(R.color.colorDarkly));
            B_Minus.setTextColor(getResources().getColor(R.color.colorDarkly));
            B_Divide.setTextColor(getResources().getColor(R.color.colorDarkly));
            B_Multiply.setTextColor(getResources().getColor(R.color.colorDarkly));
            B_GetResult.setTextColor(getResources().getColor(R.color.colorDarkly));

            B_Comma.setBackgroundTintList(getResources().getColorStateList(R.color.colorGreen));
            B_AllClear.setBackgroundTintList(getResources().getColorStateList(R.color.colorGreen));
            B_Backspace.setBackgroundTintList(getResources().getColorStateList(R.color.colorGreen));
            B_ChangeSign.setBackgroundTintList(getResources().getColorStateList(R.color.colorGreen));
            B_Percentage.setBackgroundTintList(getResources().getColorStateList(R.color.colorGreen));
            B_Comma.setTextColor(getResources().getColor(R.color.colorDarkly));
            B_AllClear.setTextColor(getResources().getColor(R.color.colorDarkly));
            B_Backspace.setTextColor(getResources().getColor(R.color.colorDarkly));
            B_ChangeSign.setTextColor(getResources().getColor(R.color.colorDarkly));
            B_Percentage.setTextColor(getResources().getColor(R.color.colorDarkly));

            ConstraintLayout.setBackgroundColor(getResources().getColor(R.color.colorDarkly));
        }

        mIntent = new Intent(MainActivity.this, TakeHelp.class);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        ConstraintLayout.setBackgroundColor(getResources().getColor(R.color.colorBlack));
        SwitchMode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        mTextView.setTextColor(getResources().getColor(R.color.colorBlack));

                        B_0.setBackgroundTintList(getResources().getColorStateList(R.color.colorDarkly));
                        B_1.setBackgroundTintList(getResources().getColorStateList(R.color.colorDarkly));
                        B_2.setBackgroundTintList(getResources().getColorStateList(R.color.colorDarkly));
                        B_3.setBackgroundTintList(getResources().getColorStateList(R.color.colorDarkly));
                        B_4.setBackgroundTintList(getResources().getColorStateList(R.color.colorDarkly));
                        B_5.setBackgroundTintList(getResources().getColorStateList(R.color.colorDarkly));
                        B_6.setBackgroundTintList(getResources().getColorStateList(R.color.colorDarkly));
                        B_7.setBackgroundTintList(getResources().getColorStateList(R.color.colorDarkly));
                        B_8.setBackgroundTintList(getResources().getColorStateList(R.color.colorDarkly));
                        B_9.setBackgroundTintList(getResources().getColorStateList(R.color.colorDarkly));
                        B_0.setTextColor(getResources().getColor(R.color.colorLightlyGray));
                        B_1.setTextColor(getResources().getColor(R.color.colorLightlyGray));
                        B_2.setTextColor(getResources().getColor(R.color.colorLightlyGray));
                        B_3.setTextColor(getResources().getColor(R.color.colorLightlyGray));
                        B_4.setTextColor(getResources().getColor(R.color.colorLightlyGray));
                        B_5.setTextColor(getResources().getColor(R.color.colorLightlyGray));
                        B_6.setTextColor(getResources().getColor(R.color.colorLightlyGray));
                        B_7.setTextColor(getResources().getColor(R.color.colorLightlyGray));
                        B_8.setTextColor(getResources().getColor(R.color.colorLightlyGray));
                        B_9.setTextColor(getResources().getColor(R.color.colorLightlyGray));

                        B_Plus.setBackgroundTintList(getResources().getColorStateList(R.color.colorLightlyOrangeDark));
                        B_Minus.setBackgroundTintList(getResources().getColorStateList(R.color.colorLightlyOrangeDark));
                        B_Divide.setBackgroundTintList(getResources().getColorStateList(R.color.colorLightlyOrangeDark));
                        B_Multiply.setBackgroundTintList(getResources().getColorStateList(R.color.colorLightlyOrangeDark));
                        B_GetResult.setBackgroundTintList(getResources().getColorStateList(R.color.colorDarklyOrangeDark));
                        B_Plus.setTextColor(getResources().getColor(R.color.colorLightlyGray));
                        B_Minus.setTextColor(getResources().getColor(R.color.colorLightlyGray));
                        B_Divide.setTextColor(getResources().getColor(R.color.colorLightlyGray));
                        B_Multiply.setTextColor(getResources().getColor(R.color.colorLightlyGray));
                        B_GetResult.setTextColor(getResources().getColor(R.color.colorLightlyGray));

                        B_Comma.setBackgroundTintList(getResources().getColorStateList(R.color.colorDarklyGreen));
                        B_AllClear.setBackgroundTintList(getResources().getColorStateList(R.color.colorDarklyGreen));
                        B_Backspace.setBackgroundTintList(getResources().getColorStateList(R.color.colorDarklyGreen));
                        B_ChangeSign.setBackgroundTintList(getResources().getColorStateList(R.color.colorDarklyGreen));
                        B_Percentage.setBackgroundTintList(getResources().getColorStateList(R.color.colorDarklyGreen));
                        B_Comma.setTextColor(getResources().getColor(R.color.colorLightlyGray));
                        B_AllClear.setTextColor(getResources().getColor(R.color.colorLightlyGray));
                        B_Backspace.setTextColor(getResources().getColor(R.color.colorLightlyGray));
                        B_ChangeSign.setTextColor(getResources().getColor(R.color.colorLightlyGray));
                        B_Percentage.setTextColor(getResources().getColor(R.color.colorLightlyGray));

                        ConstraintLayout.setBackgroundColor(getResources().getColor(R.color.colorLightlyGray));
                    }
                } else {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        mTextView.setTextColor(getResources().getColor(R.color.colorWhite));

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
                        B_0.setTextColor(getResources().getColor(R.color.colorDarkly));
                        B_1.setTextColor(getResources().getColor(R.color.colorDarkly));
                        B_2.setTextColor(getResources().getColor(R.color.colorDarkly));
                        B_3.setTextColor(getResources().getColor(R.color.colorDarkly));
                        B_4.setTextColor(getResources().getColor(R.color.colorDarkly));
                        B_5.setTextColor(getResources().getColor(R.color.colorDarkly));
                        B_6.setTextColor(getResources().getColor(R.color.colorDarkly));
                        B_7.setTextColor(getResources().getColor(R.color.colorDarkly));
                        B_8.setTextColor(getResources().getColor(R.color.colorDarkly));
                        B_9.setTextColor(getResources().getColor(R.color.colorDarkly));

                        B_Plus.setBackgroundTintList(getResources().getColorStateList(R.color.colorLightlyOrange));
                        B_Minus.setBackgroundTintList(getResources().getColorStateList(R.color.colorLightlyOrange));
                        B_Divide.setBackgroundTintList(getResources().getColorStateList(R.color.colorLightlyOrange));
                        B_Multiply.setBackgroundTintList(getResources().getColorStateList(R.color.colorLightlyOrange));
                        B_GetResult.setBackgroundTintList(getResources().getColorStateList(R.color.colorDarklyOrange));
                        B_Plus.setTextColor(getResources().getColor(R.color.colorDarkly));
                        B_Minus.setTextColor(getResources().getColor(R.color.colorDarkly));
                        B_Divide.setTextColor(getResources().getColor(R.color.colorDarkly));
                        B_Multiply.setTextColor(getResources().getColor(R.color.colorDarkly));
                        B_GetResult.setTextColor(getResources().getColor(R.color.colorDarkly));

                        B_Comma.setBackgroundTintList(getResources().getColorStateList(R.color.colorGreen));
                        B_AllClear.setBackgroundTintList(getResources().getColorStateList(R.color.colorGreen));
                        B_Backspace.setBackgroundTintList(getResources().getColorStateList(R.color.colorGreen));
                        B_ChangeSign.setBackgroundTintList(getResources().getColorStateList(R.color.colorGreen));
                        B_Percentage.setBackgroundTintList(getResources().getColorStateList(R.color.colorGreen));
                        B_Comma.setTextColor(getResources().getColor(R.color.colorDarkly));
                        B_AllClear.setTextColor(getResources().getColor(R.color.colorDarkly));
                        B_Backspace.setTextColor(getResources().getColor(R.color.colorDarkly));
                        B_ChangeSign.setTextColor(getResources().getColor(R.color.colorDarkly));
                        B_Percentage.setTextColor(getResources().getColor(R.color.colorDarkly));

                        ConstraintLayout.setBackgroundColor(getResources().getColor(R.color.colorDarkly));
                    }
                }
            }
        });
    }

    @Override
    public void onClick(View view) {
        final Animation ButtonNumbers = AnimationUtils.loadAnimation(this, R.anim.button_alpha_change);
        final Animation ButtonAction = AnimationUtils.loadAnimation(this, R.anim.button_action_change);
        final Animation ButtonFunction = AnimationUtils.loadAnimation(this, R.anim.button_function);
        if (mString.length() != 7) {
            switch (view.getId()) {
                case R.id.B_GetHelp:
                    startActivity(mIntent);
                    overridePendingTransition(R.anim.slide_from_down, 0);
                    break;
                case R.id.B_Comma:
                    view.startAnimation(ButtonAction);
                    mString = classic.Comma(mString);
                    mTextView.setText(mString);
                    break;
                case R.id.B_AllClear:
                    view.startAnimation(ButtonAction);
                    mString = classic.AllClear();
                    mTextView.setText(mString);
                    break;
                case R.id.B_Backspace:
                    view.startAnimation(ButtonAction);
                    mString = classic.Backspace(mString);
                    mTextView.setText(mString);
                    break;
                case R.id.B_ChangeSign:
                    view.startAnimation(ButtonAction);
                    mString = classic.ChangeSign(mString);
                    mTextView.setText(mString);
                    break;
                case R.id.B_Percentage:
                    view.startAnimation(ButtonAction);
                    break;
                case R.id.B_Plus:
                    view.startAnimation(ButtonFunction);
                    mString = classic.Plus(mString);
                    mTextView.setText(mString);
                    break;
                case R.id.B_Minus:
                    view.startAnimation(ButtonFunction);
                    break;
                case R.id.B_Divide:
                    view.startAnimation(ButtonFunction);
                    break;
                case R.id.B_Multiply:
                    view.startAnimation(ButtonFunction);
                    break;
                case R.id.B_GetResult:
                    view.startAnimation(ButtonFunction);
                    break;
                default:
                    view.startAnimation(ButtonNumbers);
                    mString = classic.EnterNumber(view.getId(), mString);
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