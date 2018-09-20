package com.wampinfotech.scorekeeper;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This activity keeps track of the wrestling score for 2 wrestler.
 */
public class MainActivity extends AppCompatActivity {

    // Tracks the score for Wrestler A
    int scoreWrestlerA = 0;

    // Tracks the score for Wrestler B
    int scoreWrestlerB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Wrestler A by 1 point.
     */
    public void addOneForWrestlerA(View v) {
        scoreWrestlerA += 1;
        displayForWrestlerA(scoreWrestlerA);
    }

    /**
     * Increase the score for Wrestler A by 2 points.
     */
    public void addTwoForWrestlerA(View v) {
        scoreWrestlerA += 2;
        displayForWrestlerA(scoreWrestlerA);
    }

    /**
     * Increase the score for Wrestler A by 3 points.
     */
    public void addThreeForWrestlerA(View v) {
        scoreWrestlerA += 3;
        displayForWrestlerA(scoreWrestlerA);
    }

    /**
     * Increase the score for Wrestler B by 1 point.
     */
    public void addOneForWrestlerB(View v) {
        scoreWrestlerB += 1;
        displayForWrestlerB(scoreWrestlerB);
    }

    /**
     * Increase the score for Wrestler B by 2 points.
     */
    public void addTwoForWrestlerB(View v) {
        scoreWrestlerB += 2;
        displayForWrestlerB(scoreWrestlerB);
    }

    /**
     * Increase the score for Wrestler B by 3 points.
     */
    public void addThreeForWrestlerB(View v) {
        scoreWrestlerB += 3;
        displayForWrestlerB(scoreWrestlerB);
    }

    /**
     * Resets the score for both wrestlers back to 0.
     */
    public void resetScore(View v) {
        scoreWrestlerA = 0;
        scoreWrestlerB = 0;
        displayForWrestlerA(scoreWrestlerA);
        displayForWrestlerB(scoreWrestlerB);
    }

    /**
     * Displays the given score for Wrestler A.
     */
    public void displayForWrestlerA(int score) {
        TextView scoreView = findViewById(R.id.wrestler_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Wrestler B.
     */
    public void displayForWrestlerB(int score) {
        TextView scoreView = findViewById(R.id.wrestler_b_score);
        scoreView.setText(String.valueOf(score));
    }
}