package com.app.aungpyaephyo.autotextwritter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    String test="♡ေနာက္ပိုး♡ \n\n"+
            "ပ်ိဳေလးအိမ္ စုံစမ္းလို႔ \n"+
            "အုတ္လမ္း ခပ္သာသာ \n"+
            "ညေနတိုင္း လာ။ \n\n"+

            "တညခါ \n"+
            "လသာမွာ ၾကံဳႀကိဳက္။ \n\n"+

            "ပ်ိဳေလးအိမ္ သည္ဟာလားတဲ့ \n"+
            "စကားျဖစ္ရုံ ေျပာရွာရ \n"+
            "ေမာတုန္လို႔ ဟိုက္။ ။ \n\n";
    int charlength=0;
    TextView textV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textV = (TextView)findViewById(R.id.mainTextView);
        textV.setTextSize(14);
        AnimateText(test);
    }

    private void AnimateText(final CharSequence text)
    {
        if(charlength<text.length()){
            charlength+=1;
            CharSequence mtext=text.subSequence(0, charlength);
            textV.setText(mtext);
        }
        new Handler().postDelayed(new Runnable(){

            @Override
            public void run()
            {
                AnimateText(text);
            }

        },100);

    }
}
