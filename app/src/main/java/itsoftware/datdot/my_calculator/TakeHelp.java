package itsoftware.datdot.my_calculator;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TakeHelp extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        setTitle("");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        ConstraintLayout ConstraintLayout = findViewById(R.id.ConstraintLayout);
        ConstraintLayout.setBackgroundColor(getResources().getColor(R.color.colorBlack));

        TextView TV_GoAway = findViewById(R.id.TV_GoAway);
        TV_GoAway.setTextColor(getResources().getColor(R.color.colorLightGray));

        Button B_Back = findViewById(R.id.B_Back);
        B_Back.setBackgroundColor(getResources().getColor(R.color.colorDarkGray));
        B_Back.setTextColor(getResources().getColor(R.color.colorBlack));
        B_Back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        finish();
        overridePendingTransition(R.anim.slide_from_up, 0);
    }
}
