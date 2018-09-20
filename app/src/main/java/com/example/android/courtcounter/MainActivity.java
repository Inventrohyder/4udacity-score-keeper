package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int penaltiesTeamA = 0;
    int penaltiesTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
     * Red Team is Team A.
     * Blue Team is Team B.
     */

    /**
     * Increase the score of Team A by 3 points.
     */
    public void addThreeForTeamA(View view){
        scoreTeamA = scoreTeamA + 3;
        display(scoreTeamA, R.id.team_a_score);
    }

    /**
     * Increase the score of Team A by 2 points.
     */
    public void addTwoForTeamA(View view){
        scoreTeamA = scoreTeamA + 2;
        display(scoreTeamA, R.id.team_a_score);
    }

    /**
     * Increase the score of Team A by 1 point.
     */
    public void addOneForTeamA(View view){
        scoreTeamA = scoreTeamA + 1;
        display(scoreTeamA, R.id.team_a_score);
    }

    /**
     * Reduce the score of Team A by 1 point.
     * Increase the number of penalties that Team A has committed.
     */
    public void minusOneForTeamA(View view){
        scoreTeamA -= 1;
        penaltiesTeamA += 1;
        display(scoreTeamA, R.id.team_a_score);
        display(penaltiesTeamA, R.id.team_a_fouls);
    }

    /**
     * Increase the score of Team B by 3 points.
     */
    public void addThreeForTeamB(View view){
        scoreTeamB = scoreTeamB + 3;
        display(scoreTeamB, R.id.team_b_score);
    }

    /**
     * Increase the score of Team B by 2 points.
     */
    public void addTwoForTeamB(View view){
        scoreTeamB = scoreTeamB + 2;
        display(scoreTeamB, R.id.team_b_score);
    }

    /**
     * Increase the score of Team B by 1 point.
     */
    public void addOneForTeamB(View view){
        scoreTeamB = scoreTeamB + 1;
        display(scoreTeamB, R.id.team_b_score);
    }

    /**
     * Reduce the score of Team B by 1 point.
     */
    public void minusOneForTeamB(View view){
        scoreTeamB -= 1;
        penaltiesTeamB += 1;
        display(scoreTeamB, R.id.team_b_score);
        display(penaltiesTeamB, R.id.team_b_fouls);
    }

    /**
     * Reset the scores to 0 points.
     */
    public void reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        penaltiesTeamA = 0;
        penaltiesTeamB = 0;
        display(scoreTeamA, R.id.team_a_score);
        display(scoreTeamB, R.id.team_b_score);
        display(penaltiesTeamA, R.id.team_a_fouls);
        display(penaltiesTeamB, R.id.team_b_fouls);
    }

    /**
     * Displays the given number for the given Team.
     */
    public void display(int score, int id) {
        TextView textView = findViewById(id);
        textView.setText(String.valueOf(score));
    }
}

