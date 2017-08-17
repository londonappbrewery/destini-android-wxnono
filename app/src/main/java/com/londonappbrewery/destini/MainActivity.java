package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storyTextView;
    Button buttonTop;
    Button buttonDown;
    int storyIndex=1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        storyTextView = (TextView) findViewById(R.id.storyTextView);
        buttonTop=(Button) findViewById(R.id.buttonTop);
        buttonDown=(Button) findViewById(R.id.buttonBottom);

        storyTextView.setText(R.string.T1_Story);
        buttonTop.setText(R.string.T1_Ans1);
        buttonDown.setText(R.string.T1_Ans2);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        buttonTop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                storyIndex=storyIndex+1;
                if(storyIndex==2){
                    storyTextView.setText(R.string.T3_Story);
                    buttonTop.setText(R.string.T3_Ans1);
                    buttonDown.setText(R.string.T3_Ans2);
                }
                else if(storyIndex==3&&storyTextView.getText()==getString(R.string.T3_Story)){
                    storyTextView.setText(R.string.T6_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonDown.setVisibility(View.GONE);
                }
                else if(storyIndex==3&&storyTextView.getText()==getString(R.string.T2_Story)){
                    storyTextView.setText(R.string.T3_Story);
                    buttonTop.setText(R.string.T3_Ans1);
                    buttonDown.setText(R.string.T3_Ans2);
                }
                else if(storyIndex==4&&storyTextView.getText()==getString(R.string.T3_Story)){
                    storyTextView.setText(R.string.T6_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonDown.setVisibility(View.GONE);
                }


            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        buttonDown.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                storyIndex=storyIndex+1;
                if(storyIndex==2){
                    storyTextView.setText(R.string.T2_Story);
                    buttonTop.setText(R.string.T2_Ans1);
                    buttonDown.setText(R.string.T2_Ans2);
                }
                else if(storyIndex==3&&storyTextView.getText()==getString(R.string.T3_Story)){
                    storyTextView.setText(R.string.T5_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonDown.setVisibility(View.GONE);
                }
                else if(storyIndex==3&&storyTextView.getText()==getString(R.string.T2_Story)){
                    storyTextView.setText(R.string.T4_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonDown.setVisibility(View.GONE);
                }

                else if(storyIndex==4&&storyTextView.getText()==getString(R.string.T3_Story)){
                    storyTextView.setText(R.string.T5_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonDown.setVisibility(View.GONE);
                }


            }
        });


    }
}
