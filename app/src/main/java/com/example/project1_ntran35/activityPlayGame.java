package com.example.project1_ntran35;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.util.Random;

/**
 *
 */
public class activityPlayGame extends AppCompatActivity {


    int[][]human_field = new int[8][8];
    int[][]computer_field = new int[8][8];
    Random random = new Random();

    //WIn Lose message textview
    TextView message;

    //Initiate HUMAN PLAYER Board
    Button human_0_0, human_0_1, human_0_2, human_0_3, human_0_4, human_0_5, human_0_6, human_0_7;
    Button human_1_0, human_1_1, human_1_2, human_1_3, human_1_4, human_1_5, human_1_6, human_1_7;
    Button human_2_0, human_2_1, human_2_2, human_2_3, human_2_4, human_2_5, human_2_6, human_2_7;
    Button human_3_0, human_3_1, human_3_2, human_3_3, human_3_4, human_3_5, human_3_6, human_3_7;
    Button human_4_0, human_4_1, human_4_2, human_4_3, human_4_4, human_4_5, human_4_6, human_4_7;
    Button human_5_0, human_5_1, human_5_2, human_5_3, human_5_4, human_5_5, human_5_6, human_5_7;
    Button human_6_0, human_6_1, human_6_2, human_6_3, human_6_4, human_6_5, human_6_6, human_6_7;
    Button human_7_0, human_7_1, human_7_2, human_7_3, human_7_4, human_7_5, human_7_6, human_7_7;
    //End human initialize

    // Initiate Computer PLAYER Board
    Button machine_0_0, machine_0_1, machine_0_2, machine_0_3, machine_0_4, machine_0_5, machine_0_6, machine_0_7;
    Button machine_1_0, machine_1_1, machine_1_2, machine_1_3, machine_1_4, machine_1_5, machine_1_6, machine_1_7;
    Button machine_2_0, machine_2_1, machine_2_2, machine_2_3, machine_2_4, machine_2_5, machine_2_6, machine_2_7;
    Button machine_3_0, machine_3_1, machine_3_2, machine_3_3, machine_3_4, machine_3_5, machine_3_6, machine_3_7;
    Button machine_4_0, machine_4_1, machine_4_2, machine_4_3, machine_4_4, machine_4_5, machine_4_6, machine_4_7;
    Button machine_5_0, machine_5_1, machine_5_2, machine_5_3, machine_5_4, machine_5_5, machine_5_6, machine_5_7;
    Button machine_6_0, machine_6_1, machine_6_2, machine_6_3, machine_6_4, machine_6_5, machine_6_6, machine_6_7;
    Button machine_7_0, machine_7_1, machine_7_2, machine_7_3, machine_7_4, machine_7_5, machine_7_6, machine_7_7;
    //ENd computer initialize


    boolean turn_To_Play = true;        // allow/control 1 player at a time
    int hit_counter_human = 0;   // keep track how many time human hit the computer
    int hit_counter_computer = 0; // Number of times computer hit the human

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game);

        //textview WIn/Lose Announcement
        message = findViewById(R.id.resStatus);

        //reflecting button variable and button xml. HUMAN PLAYER
        human_0_0 = findViewById(R.id.btn_00);
        human_0_1 = findViewById(R.id.btn_01);
        human_0_2 = findViewById(R.id.btn_02);
        human_0_3 = findViewById(R.id.btn_03);
        human_0_4 = findViewById(R.id.btn_04);
        human_0_5 = findViewById(R.id.btn_05);
        human_0_6 = findViewById(R.id.btn_06);
        human_0_7 = findViewById(R.id.btn_07);
        human_1_0 = findViewById(R.id.btn_10);
        human_1_1 = findViewById(R.id.btn_11);
        human_1_2 = findViewById(R.id.btn_12);
        human_1_3 = findViewById(R.id.btn_13);
        human_1_4= findViewById(R.id.btn_14);
        human_1_5 = findViewById(R.id.btn_15);
        human_1_6 = findViewById(R.id.btn_16);
        human_1_7 = findViewById(R.id.btn_17);
        human_2_0 = findViewById(R.id.btn_20);
        human_2_1 = findViewById(R.id.btn_21);
        human_2_2 = findViewById(R.id.btn_22);
        human_2_3 = findViewById(R.id.btn_23);
        human_2_4 = findViewById(R.id.btn_24);
        human_2_5 = findViewById(R.id.btn_25);
        human_2_6 = findViewById(R.id.btn_26);
        human_2_7 = findViewById(R.id.btn_27);
        human_3_0 = findViewById(R.id.btn_30);
        human_3_1 = findViewById(R.id.btn_31);
        human_3_2 = findViewById(R.id.btn_32);
        human_3_3 = findViewById(R.id.btn_33);
        human_3_4 = findViewById(R.id.btn_34);
        human_3_5 = findViewById(R.id.btn_35);
        human_3_6 = findViewById(R.id.btn_36);
        human_3_7 = findViewById(R.id.btn_37);
        human_4_0 = findViewById(R.id.btn_40);
        human_4_1 = findViewById(R.id.btn_41);
        human_4_2 = findViewById(R.id.btn_42);
        human_4_3 = findViewById(R.id.btn_43);
        human_4_4 = findViewById(R.id.btn_44);
        human_4_5 = findViewById(R.id.btn_45);
        human_4_6 = findViewById(R.id.btn_46);
        human_4_7 = findViewById(R.id.btn_47);
        human_5_0 = findViewById(R.id.btn_50);
        human_5_1 = findViewById(R.id.btn_51);
        human_5_2 = findViewById(R.id.btn_52);
        human_5_3 = findViewById(R.id.btn_53);
        human_5_4 = findViewById(R.id.btn_54);
        human_5_5 = findViewById(R.id.btn_55);
        human_5_6 = findViewById(R.id.btn_56);
        human_5_7 = findViewById(R.id.btn_57);
        human_6_0 = findViewById(R.id.btn_60);
        human_6_1 = findViewById(R.id.btn_61);
        human_6_2 = findViewById(R.id.btn_62);
        human_6_3 = findViewById(R.id.btn_63);
        human_6_4 = findViewById(R.id.btn_64);
        human_6_5 = findViewById(R.id.btn_65);
        human_6_6 = findViewById(R.id.btn_66);
        human_6_7 = findViewById(R.id.btn_67);
        human_7_0 = findViewById(R.id.btn_70);
        human_7_1 = findViewById(R.id.btn_71);
        human_7_2 = findViewById(R.id.btn_72);
        human_7_3 = findViewById(R.id.btn_73);
        human_7_4 = findViewById(R.id.btn_74);
        human_7_5 = findViewById(R.id.btn_75);
        human_7_6 = findViewById(R.id.btn_76);
        human_7_7 = findViewById(R.id.btn_77);
        //Ended Human Player reflecting

        //reflecting button variable and button xml. COMPUTER PLAYER
        machine_0_0 = findViewById(R.id.zero_0);
        machine_0_1 = findViewById(R.id.zero_1);
        machine_0_2 = findViewById(R.id.zero_2);
        machine_0_3 = findViewById(R.id.zero_3);
        machine_0_4 = findViewById(R.id.zero_4);
        machine_0_5 = findViewById(R.id.zero_5);
        machine_0_6 = findViewById(R.id.zero_6);
        machine_0_7 = findViewById(R.id.zero_7);

        machine_1_0 = findViewById(R.id.one_0);
        machine_1_1 = findViewById(R.id.one_1);
        machine_1_2 = findViewById(R.id.one_2);
        machine_1_3 = findViewById(R.id.one_3);
        machine_1_4 = findViewById(R.id.one_4);
        machine_1_5 = findViewById(R.id.one_5);
        machine_1_6 = findViewById(R.id.one_6);
        machine_1_7 = findViewById(R.id.one_7);

        machine_2_0 = findViewById(R.id.two_0);
        machine_2_1 = findViewById(R.id.two_1);
        machine_2_2 = findViewById(R.id.two_2);
        machine_2_3 = findViewById(R.id.two_3);
        machine_2_4 = findViewById(R.id.two_4);
        machine_2_5 = findViewById(R.id.two_5);
        machine_2_6 = findViewById(R.id.two_6);
        machine_2_7 = findViewById(R.id.two_7);

        machine_3_0 = findViewById(R.id.three_0);
        machine_3_1 = findViewById(R.id.three_1);
        machine_3_2 = findViewById(R.id.three_2);
        machine_3_3 = findViewById(R.id.three_3);
        machine_3_4 = findViewById(R.id.three_4);
        machine_3_5 = findViewById(R.id.three_5);
        machine_3_6 = findViewById(R.id.three_6);
        machine_3_7 = findViewById(R.id.three_7);

        machine_4_0 = findViewById(R.id.four_0);
        machine_4_1 = findViewById(R.id.four_1);
        machine_4_2 = findViewById(R.id.four_2);
        machine_4_3 = findViewById(R.id.four_3);
        machine_4_4 = findViewById(R.id.four_4);
        machine_4_5 = findViewById(R.id.four_5);
        machine_4_6 = findViewById(R.id.four_6);
        machine_4_7 = findViewById(R.id.four_7);

        machine_5_0 = findViewById(R.id.five_0);
        machine_5_1 = findViewById(R.id.five_1);
        machine_5_2 = findViewById(R.id.five_2);
        machine_5_3= findViewById(R.id.five_3);
        machine_5_4 = findViewById(R.id.five_4);
        machine_5_5= findViewById(R.id.five_5);
        machine_5_6 = findViewById(R.id.five_6);
        machine_5_7 = findViewById(R.id.five_7);

        machine_6_0 = findViewById(R.id.six_0);
        machine_6_1 = findViewById(R.id.six_1);
        machine_6_2 = findViewById(R.id.six_2);
        machine_6_3 = findViewById(R.id.six_3);
        machine_6_4 = findViewById(R.id.six_4);
        machine_6_5 = findViewById(R.id.six_5);
        machine_6_6 = findViewById(R.id.six_6);
        machine_6_7 = findViewById(R.id.six_7);


        machine_7_0 = findViewById(R.id.seven_0);
        machine_7_1 = findViewById(R.id.seven_1);
        machine_7_2 = findViewById(R.id.seven_2);
        machine_7_3 = findViewById(R.id.seven_3);
        machine_7_4 = findViewById(R.id.seven_4);
        machine_7_5 = findViewById(R.id.seven_5);
        machine_7_6 = findViewById(R.id.seven_6);
        machine_7_7 = findViewById(R.id.seven_7);
        //Ended COMPUTER Player reflecting

        //Create board field and place the ship for human
        for (int row = 0; row < 8; row++){
            for (int col = 0; col <8; col++){
                if ((row == 0) && (col == 7)) {
                    human_field[row][col] = 1;
                    human_0_7.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    human_0_7.setText("1");
                }
                if ((row == 1) && (col == 7)) {
                    human_field[row][col] = 1;
                    human_1_7.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    human_1_7.setText("1");
                }
                if ((row == 2) && (col == 7)) {
                    human_field[row][col] = 1;
                    human_2_7.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    human_2_7.setText("1");
                }
                if ((row == 3) && (col == 7)) {
                    human_field[row][col] = 1;
                    human_3_7.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    human_3_7.setText("1");
                }
                if ((row == 4) && (col == 7)) {
                    human_field[row][col] = 1;
                    human_4_7.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    human_4_7.setText("1");
                }
                if ((row == 2) && (col == 0)) {
                    human_field[row][col] = 5;
                    human_2_0.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    human_2_0.setText("5");
                }
                if ((row == 2) && (col == 1)) {
                    human_field[row][col] = 5;
                    human_2_1.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    human_2_1.setText("5");
                }
                if ((row == 2) && (col == 3)) {
                    human_field[row][col] = 4;
                    human_2_3.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    human_2_3.setText("4");
                }
                if ((row == 2) && (col == 4)) {
                    human_field[row][col] = 4;
                    human_2_4.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    human_2_4.setText("4");
                }
                if ((row == 2) && (col == 5)) {
                    human_field[row][col] = 4;
                    human_2_5.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    human_2_5.setText("4");
                }
                if ((row == 4) && (col == 2)) {
                    human_field[row][col] = 3;
                    human_4_2.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    human_4_2.setText("3");
                }
                if ((row == 4) && (col == 3)) {
                    human_field[row][col] = 3;
                    human_4_3.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    human_4_3.setText("3");
                }
                if ((row == 4) && (col == 4)) {
                    human_field[row][col] = 3;
                    human_4_4.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    human_4_4.setText("3");
                }
                if ((row == 7) && (col == 1)) {
                    human_field[row][col] = 2;
                    human_7_1.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    human_7_1.setText("2");
                }
                if ((row == 7) && (col == 2)) {
                    human_field[row][col] = 2;
                    human_7_2.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    human_7_2.setText("2");
                }
                if ((row == 7) && (col == 3)) {
                    human_field[row][col] = 2;
                    human_7_3.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    human_7_3.setText("2");
                }
                if ((row == 7) && (col == 4)) {
                    human_field[row][col] = 2;
                    human_7_4.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    human_7_4.setText("2");
                }
                else {
                    if (human_field[row][col] < 1) {
                        human_field[row][col] = 0;
                    }
                }
            }
        }

        //Create board field and place the ship for Computer
        //all comment out portions are for debugging during implementation.
        for (int row = 0; row < 8; row++){
            for (int col = 0; col <8; col++){
                if ((row == 3) && (col == 0)) {
                    computer_field[row][col] = 1;
                    /*machine_3_0.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    machine_3_0.setText("1");*/
                }
                if ((row == 4) && (col == 0)) {
                    computer_field[row][col] = 1;
                    /*machine_4_0.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    machine_4_0.setText("1");*/
                }
                if ((row == 5) && (col == 0)) {
                    computer_field[row][col] = 1;
                    /*machine_5_0.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    machine_5_0.setText("1");*/
                }
                if ((row == 6) && (col == 0)) {
                    computer_field[row][col] = 1;
                    /*machine_6_0.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    machine_6_0.setText("1");*/
                }
                if ((row == 7) && (col == 0)) {
                    computer_field[row][col] = 1;
                    /*machine_7_0.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    machine_7_0.setText("1");*/
                }
                if ((row == 5) && (col == 6)) {
                    computer_field[row][col] = 5;
                   /* machine_5_6.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    machine_5_6.setText("5");*/
                }
                if ((row == 6) && (col == 6)) {
                    computer_field[row][col] = 5;
                   /* machine_6_6.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    machine_6_6.setText("5");*/
                }
                if ((row == 0) && (col == 2)) {
                    computer_field[row][col] = 4;
                   /* machine_0_2.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    machine_0_2.setText("4");*/
                }
                if ((row == 0) && (col == 3)) {
                    computer_field[row][col] = 4;
                   /* machine_0_3.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    machine_0_3.setText("4");*/
                }
                if ((row == 0) && (col == 4)) {
                    computer_field[row][col] = 4;
                   /* machine_0_4.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    machine_0_4.setText("4");*/
                }
                if ((row == 3) && (col == 3)) {
                    computer_field[row][col] = 3;
                   /* machine_3_3.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    machine_3_3.setText("3");*/
                }
                if ((row == 4) && (col == 3)) {
                    computer_field[row][col] = 3;
                    /*machine_4_3.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    machine_4_3.setText("3");*/
                }
                if ((row == 5) && (col == 3)) {
                    computer_field[row][col] = 3;
                    /*machine_5_3.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    machine_5_3.setText("3");*/
                }
                if ((row == 7) && (col == 4)) {
                    computer_field[row][col] = 2;
                   /* machine_7_4.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    machine_7_4.setText("2");*/
                }
                if ((row == 7) && (col == 5)) {
                    computer_field[row][col] = 2;
                 /*   machine_7_5.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    machine_7_5.setText("2");*/
                }
                if ((row == 7) && (col == 6)) {
                    computer_field[row][col] = 2;
                   /* machine_7_6.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    machine_7_6.setText("2");*/
                }
                if ((row == 7) && (col == 7)) {
                    computer_field[row][col] = 2;
                  /*  machine_7_7.setBackgroundColor(Color.parseColor("#CDCDC7"));
                    machine_7_7.setText("2");*/
                }
                else {
                    if (computer_field[row][col] < 1) {
                        computer_field[row][col] = 0;
                    }
                }
            }
        }
        //in onCreate function

    }

    //onclick function call from machine_zero_0. XML
    public void hitMachine_zero_0(View view){
        shootComputerShip(0,0, machine_0_0);
        machine_0_0.setEnabled(false);
    }
    //onclick function call from machine_zero_1. XML
    public void hitMachine_zero_1(View view){
        shootComputerShip(0,1, machine_0_1);
        machine_0_1.setEnabled(false);
    }
    //onclick function call from machine_zero_2. XML
    public void hitMachine_zero_2(View view){
        shootComputerShip(0,2, machine_0_2);
        machine_0_2.setEnabled(false);
    }
    //onclick function call from machine_zero_3. XML
    public void hitMachine_zero_3(View view){
        shootComputerShip(0,3, machine_0_3);
        machine_0_3.setEnabled(false);
    }
    //onclick function call from machine_zero_4. XML
    public void hitMachine_zero_4(View view){
        shootComputerShip(0,4, machine_0_4);
        machine_0_4.setEnabled(false);
    }
    //onclick function call from machine_zero_. XML
    public void hitMachine_zero_5(View view){
        shootComputerShip(0,5, machine_0_5);
        machine_0_5.setEnabled(false);
    }
    //onclick function call from machine_zero_. XML
    public void hitMachine_zero_6(View view){
        shootComputerShip(0,6, machine_0_6);
        machine_0_6.setEnabled(false);
    }
    //onclick function call from machine_zero_. XML
    public void hitMachine_zero_7(View view){
        shootComputerShip(0,7, machine_0_7);
        machine_0_7.setEnabled(false);
    }
    /*----------machine_one_cols*/
    public void hitMachine_1_0(View view){
        shootComputerShip(1,0, machine_1_0);
        machine_1_0.setEnabled(false);
    }
    public void hitMachine_1_1(View view){
        shootComputerShip(1,1, machine_1_1);
        machine_1_1.setEnabled(false);
    }
    public void hitMachine_1_2(View view){
        shootComputerShip(1,2, machine_1_2);
        machine_1_2.setEnabled(false);
    }
    public void hitMachine_1_3(View view){
        shootComputerShip(1,3, machine_1_3);
        machine_1_3.setEnabled(false);
    }
    public void hitMachine_1_4(View view){
        shootComputerShip(1,4, machine_1_4);
        machine_1_4.setEnabled(false);
    }
    public void hitMachine_1_5(View view){
        shootComputerShip(1,5, machine_1_5);
        machine_1_5.setEnabled(false);
    }
    public void hitMachine_1_6(View view){
        shootComputerShip(1,6, machine_1_6);
        machine_1_6.setEnabled(false);
    }
    public void hitMachine_1_7(View view){
        shootComputerShip(1,7, machine_1_7);
        machine_1_7.setEnabled(false);
    }
    /*----------machine_two_cols*/
    public void hitMachine_2_0(View view){
        shootComputerShip(2,0, machine_2_0);
        machine_2_0.setEnabled(false);
    }
    public void hitMachine_2_1(View view){
        shootComputerShip(2,1, machine_2_1);
        machine_2_1.setEnabled(false);
    }
    public void hitMachine_2_2(View view){
        shootComputerShip(2,2, machine_2_2);
        machine_2_2.setEnabled(false);
    }
    public void hitMachine_2_3(View view){
        shootComputerShip(2,3, machine_2_3);
        machine_2_3.setEnabled(false);
    }
    public void hitMachine_2_4(View view){
        shootComputerShip(2,4, machine_2_4);
        machine_2_4.setEnabled(false);
    }
    public void hitMachine_2_5(View view){
        shootComputerShip(2,5, machine_2_5);
        machine_2_5.setEnabled(false);
    }
    public void hitMachine_2_6(View view){
        shootComputerShip(2,6, machine_2_6);
        machine_2_6.setEnabled(false);
    }
    public void hitMachine_2_7(View view){
        shootComputerShip(2,7, machine_2_7);
        machine_2_7.setEnabled(false);
    }
    /*----------machine_three_cols*/
    public void hitMachine_3_0(View view){
        shootComputerShip(3,0, machine_3_0);
        machine_3_0.setEnabled(false);
    }
    public void hitMachine_3_1(View view){
        shootComputerShip(3,1, machine_3_1);
        machine_3_1.setEnabled(false);
    }
    public void hitMachine_3_2(View view){
        shootComputerShip(3,2, machine_3_2);
        machine_3_2.setEnabled(false);
    }
    public void hitMachine_3_3(View view){
        shootComputerShip(3,3, machine_3_3);
        machine_3_3.setEnabled(false);
    }
    public void hitMachine_3_4(View view){
        shootComputerShip(3,4, machine_3_4);
        machine_3_4.setEnabled(false);
    }
    public void hitMachine_3_5(View view){
        shootComputerShip(3,5, machine_3_5);
        machine_3_5.setEnabled(false);
    }
    public void hitMachine_3_6(View view){
        shootComputerShip(3,6, machine_3_6);
        machine_3_6.setEnabled(false);
    }
    public void hitMachine_3_7(View view){
        shootComputerShip(3,7, machine_3_7);
        machine_3_7.setEnabled(false);
    }
    /*----------machine_four_cols*/
    public void hitMachine_4_0(View view){
        shootComputerShip(4,0, machine_4_0);
        machine_4_0.setEnabled(false);
    }
    public void hitMachine_4_1(View view){
        shootComputerShip(4,1, machine_4_1);
        machine_4_1.setEnabled(false);
    }
    public void hitMachine_4_2(View view){
        shootComputerShip(4,2, machine_4_2);
        machine_4_2.setEnabled(false);
    }
    public void hitMachine_4_3(View view){
        shootComputerShip(4,3, machine_4_3);
        machine_4_3.setEnabled(false);
    }
    public void hitMachine_4_4(View view){
        shootComputerShip(4,4, machine_4_4);
        machine_4_4.setEnabled(false);
    }
    public void hitMachine_4_5(View view){
        shootComputerShip(4,5, machine_4_5);
        machine_4_5.setEnabled(false);
    }
    public void hitMachine_4_6(View view){
        shootComputerShip(4,6, machine_4_6);
        machine_4_6.setEnabled(false);
    }
    public void hitMachine_4_7(View view){
        shootComputerShip(4,7, machine_4_7);
        machine_4_7.setEnabled(false);
    }

    /*----------machine_five_cols*/
    public void hitMachine_5_0(View view){
        shootComputerShip(5,0, machine_5_0);
        machine_5_0.setEnabled(false);
    }
    public void hitMachine_5_1(View view){
        shootComputerShip(5,1, machine_5_1);
        machine_5_1.setEnabled(false);
    }
    public void hitMachine_5_2(View view){
        shootComputerShip(5,2, machine_5_2);
        machine_5_2.setEnabled(false);
    }
    public void hitMachine_5_3(View view){
        shootComputerShip(5,3, machine_5_3);
        machine_5_3.setEnabled(false);
    }
    public void hitMachine_5_4(View view){
        shootComputerShip(5,4, machine_5_4);
        machine_5_4.setEnabled(false);
    }
    public void hitMachine_5_5(View view){
        shootComputerShip(5,5, machine_5_5);
        machine_5_5.setEnabled(false);
    }
    public void hitMachine_5_6(View view){
        shootComputerShip(5,6, machine_5_6);
        machine_5_6.setEnabled(false);
    }
    public void hitMachine_5_7(View view){
        shootComputerShip(5,7, machine_5_7);
        machine_5_7.setEnabled(false);
    }

    /*----------machine_six_cols*/
    public void hitMachine_6_0(View view){
        shootComputerShip(6,0, machine_6_0);
        machine_6_0.setEnabled(false);
    }
    public void hitMachine_6_1(View view){
        shootComputerShip(6,1, machine_6_1);
        machine_6_1.setEnabled(false);
    }
    public void hitMachine_6_2(View view){
        shootComputerShip(6,2, machine_6_2);
        machine_6_2.setEnabled(false);
    }
    public void hitMachine_6_3(View view){
        shootComputerShip(6,3, machine_6_3);
        machine_6_3.setEnabled(false);
    }
    public void hitMachine_6_4(View view){
        shootComputerShip(6,4, machine_6_4);
        machine_6_4.setEnabled(false);
    }
    public void hitMachine_6_5(View view){
        shootComputerShip(6,5, machine_6_5);
        machine_6_5.setEnabled(false);
    }
    public void hitMachine_6_6(View view){
        shootComputerShip(6,6, machine_6_6);
        machine_6_6.setEnabled(false);
    }
    public void hitMachine_6_7(View view){
        shootComputerShip(6,7, machine_6_7);
        machine_6_7.setEnabled(false);
    }

    /*----------machine_seven_cols*/
    public void hitMachine_7_0(View view){
        shootComputerShip(7,0, machine_7_0);
        machine_7_0.setEnabled(false);
    }
    public void hitMachine_7_1(View view){
        shootComputerShip(7,1, machine_7_1);
        machine_7_1.setEnabled(false);
    }
    public void hitMachine_7_2(View view){
        shootComputerShip(7,2, machine_7_2);
        machine_7_2.setEnabled(false);
    }
    public void hitMachine_7_3(View view){
        shootComputerShip(7,3, machine_7_3);
        machine_7_3.setEnabled(false);
    }
    public void hitMachine_7_4(View view){
        shootComputerShip(7,4, machine_7_4);
        machine_7_4.setEnabled(false);
    }
    public void hitMachine_7_5(View view){
        shootComputerShip(7,5, machine_7_5);
        machine_7_5.setEnabled(false);
    }
    public void hitMachine_7_6(View view){
        shootComputerShip(7,6, machine_7_6);
        machine_7_6.setEnabled(false);
    }
    public void hitMachine_7_7(View view){
        shootComputerShip(7,7, machine_7_7);
        machine_7_7.setEnabled(false);
    }

    //perform fighting against the computer ship
    public void shootComputerShip (int row, int col, Button location){

        if (computer_field[row][col] == 0) {
            location.setBackgroundColor(Color.parseColor("#F4DD0B"));   //set yellow = miss
        } else {
            location.setBackgroundColor(Color.parseColor("#D11A0D"));   //set red = hit
            hit_counter_human = hit_counter_human + 1;
        }
        computerAttack();
        checkForWiner();

    }

    private void computerAttack() {
        int row = random.nextInt(8);
        int col = random.nextInt(8);
        //int row = 0;    Debug
        //int col = 7;      debug

        if (row == 0){
            if (col == 0){
                shootHumanShip(0, 0, human_0_0);
                human_0_0.setEnabled(false);
            }
            else if (col == 1){
                shootHumanShip(0, 1, human_0_1);
                human_0_1.setEnabled(false);
            }
            else if (col == 2){
                shootHumanShip(0, 2, human_0_2);
                human_0_2.setEnabled(false);
            }
            else if (col == 3) {
                shootHumanShip(0, 3, human_0_3);
                human_0_3.setEnabled(false);
            }
            else if (col == 4 ){
                shootHumanShip(0, 4, human_0_4);
                human_0_4.setEnabled(false);
            }
            else if (col == 5){
                shootHumanShip(0, 5, human_0_5);
                human_0_5.setEnabled(false);
            }
            else if (col == 6){
                shootHumanShip(0, 6, human_0_6);
                human_0_6.setEnabled(false);
            }
            else if (col == 7){
                shootHumanShip(0, 7, human_0_7);
                human_0_7.setEnabled(false);
            }
        }
        else if (row == 1){
            if (col == 0){
                shootHumanShip(1, 0, human_1_0);
                human_1_0.setEnabled(false);
            }
            else if (col == 1) {
                shootHumanShip(1, 1, human_1_1);
                human_1_1.setEnabled(false);
            }
            else if (col == 2) {
                shootHumanShip(1, 2, human_1_2);
                human_1_2.setEnabled(false);
            }
            else if (col == 3) {
                shootHumanShip(1, 3, human_1_3);
                human_1_3.setEnabled(false);
            }
            else if (col == 4) {
                shootHumanShip(1, 4, human_1_4);
                human_1_4.setEnabled(false);
            }
            else if (col == 5) {
                shootHumanShip(1, 5, human_1_5);
                human_1_5.setEnabled(false);
            }
            else if (col == 6) {
                shootHumanShip(1, 6, human_1_6);
                human_1_6.setEnabled(false);
            }
            else if (col == 7) {
                shootHumanShip(1, 7, human_1_7);
                human_1_7.setEnabled(false);
            }
        }
        else if (row == 2){
            if (col == 0){
                shootHumanShip(2, 0, human_2_0);
                human_2_0.setEnabled(false);
            }
            else if (col == 1) {
                shootHumanShip(2, 1, human_2_1);
                human_2_1.setEnabled(false);
            }
            else if (col == 2) {
                shootHumanShip(2, 2, human_2_2);
                human_2_2.setEnabled(false);
            }
            else if (col == 3) {
                shootHumanShip(2, 3, human_2_3);
                human_2_3.setEnabled(false);
            }
            else if (col == 4) {
                shootHumanShip(2,4 , human_2_4);
                human_2_4.setEnabled(false);
            }
            else if (col == 5) {
                shootHumanShip(2, 5, human_2_5);
                human_2_5.setEnabled(false);
            }
            else if (col == 6) {
                shootHumanShip(2, 6, human_2_6);
                human_2_6.setEnabled(false);
            }
            else if (col == 7) {
                shootHumanShip(2, 7, human_2_7);
                human_2_7.setEnabled(false);
            }
        }
        else if (row == 3){
            if (col == 0){
                shootHumanShip(3, 0, human_3_0);
                human_3_0.setEnabled(false);
            }
            else if (col == 1) {
                shootHumanShip(3, 1, human_3_1);
                human_3_1.setEnabled(false);
            }
            else if (col == 2) {
                shootHumanShip(3, 2, human_3_2);
                human_3_2.setEnabled(false);
            }
            else if (col == 3) {
                shootHumanShip(3, 3, human_3_3);
                human_3_3.setEnabled(false);
            }
            else if (col == 4) {
                shootHumanShip(3, 4, human_3_4);
                human_3_4.setEnabled(false);
            }
            else if (col == 5) {
                shootHumanShip(3, 5, human_3_5);
                human_3_5.setEnabled(false);
            }
            else if (col == 6) {
                shootHumanShip(3,6 , human_3_6);
                human_3_6.setEnabled(false);
            }
            else if (col == 7) {
                shootHumanShip(3, 7, human_3_7);
                human_3_7.setEnabled(false);
            }
        }
        else if (row == 4){
            if (col == 0){
                shootHumanShip(4, 0, human_4_0);
                human_4_0.setEnabled(false);
            }
            else if (col == 1) {
                shootHumanShip(4, 1, human_4_1);
                human_4_1.setEnabled(false);
            }
            else if (col == 2) {
                shootHumanShip(4, 2, human_4_2);
                human_4_2.setEnabled(false);
            }
            else if (col == 3) {
                shootHumanShip(4,3 , human_4_3);
                human_4_3.setEnabled(false);
            }
            else if (col == 4) {
                shootHumanShip(4, 4, human_4_4);
                human_4_4.setEnabled(false);
            }
            else if (col == 5) {
                shootHumanShip(4, 5, human_4_5);
                human_4_5.setEnabled(false);
            }
            else if (col == 6) {
                shootHumanShip(4, 6, human_4_6);
                human_4_6.setEnabled(false);
            }
            else if (col == 7) {
                shootHumanShip(4,7 , human_4_7);
                human_4_7.setEnabled(false);
            }
        }
        else if (row == 5){
            if (col == 0){
                shootHumanShip(5, 0, human_5_0);
                human_5_0.setEnabled(false);
            }
            else if (col == 1) {
                shootHumanShip(5, 1, human_5_1);
                human_5_1.setEnabled(false);
            }
            else if (col ==2 ) {
                shootHumanShip(5, 2, human_5_2);
                human_5_2.setEnabled(false);
            }
            else if (col == 3) {
                shootHumanShip(5,3 , human_5_3);
                human_5_3.setEnabled(false);
            }
            else if (col == 4) {
                shootHumanShip(5, 4, human_5_4);
                human_5_4.setEnabled(false);
            }
            else if (col == 5) {
                shootHumanShip(5, 5, human_5_5);
                human_5_5.setEnabled(false);
            }
            else if (col == 6) {
                shootHumanShip(5, 6, human_5_6);
                human_5_6.setEnabled(false);
            }
            else if (col == 7) {
                shootHumanShip(5, 7, human_5_7);
                human_5_7.setEnabled(false);
            }
        }
        else if (row == 6){
            if (col == 0){
                shootHumanShip(6, 0, human_6_0);
                human_6_0.setEnabled(false);
            }
            else if (col == 1) {
                shootHumanShip(6, 1, human_6_1);
                human_6_1.setEnabled(false);
            }
            else if (col == 2) {
                shootHumanShip(6, 2, human_6_2);
                human_6_2.setEnabled(false);
            }
            else if (col == 3) {
                shootHumanShip(6, 3, human_6_3);
                human_6_3.setEnabled(false);
            }
            else if (col == 4) {
                shootHumanShip(6, 4, human_6_4);
                human_6_4.setEnabled(false);
            }
            else if (col == 5) {
                shootHumanShip(6,5 , human_6_5);
                human_6_5.setEnabled(false);
            }
            else if (col == 6) {
                shootHumanShip(6, 6, human_6_6);
                human_6_6.setEnabled(false);
            }
            else if (col == 7) {
                shootHumanShip(6, 7, human_6_7);
                human_6_7.setEnabled(false);
            }
        }
        else if (row == 7){
            if (col == 0){
                shootHumanShip(7, 0, human_7_0);
                human_7_0.setEnabled(false);
            }
            else if (col == 1) {
                shootHumanShip(7, 1, human_7_1);
                human_7_1.setEnabled(false);
            }
            else if (col == 2) {
                shootHumanShip(7, 2, human_7_2);
                human_7_2.setEnabled(false);
            }
            else if (col == 3) {
                shootHumanShip(7, 3, human_7_3);
                human_7_3.setEnabled(false);
            }
            else if (col == 4) {
                shootHumanShip(7, 4, human_7_4);
                human_7_4.setEnabled(false);
            }
            else if (col == 5) {
                shootHumanShip(7, 5, human_7_5);
                human_7_5.setEnabled(false);
            }
            else if (col == 6) {
                shootHumanShip(7,6 , human_7_6);
                human_7_6.setEnabled(false);
            }
            else if (col == 7) {
                shootHumanShip(7, 7, human_7_7);
                human_7_7.setEnabled(false);
            }
        }
    }

    //perform fighting against the your ship
    public void shootHumanShip (int row, int col, Button location){

        if (human_field[row][col] == 0) {
            location.setBackgroundColor(Color.parseColor("#F4DD0B"));   //set yellow = miss
        } else {
            //if (location.isEnabled()) {
            location.setBackgroundColor(Color.parseColor("#D11A0D"));   //set red = hit
            hit_counter_computer = hit_counter_computer + 1;
            // }
        }

    }


    private void checkForWiner() {
        if (hit_counter_human == 17){
            message.setText("Congrats. You won the game!!!");
        }
        if (hit_counter_computer == 17){
            message.setText("ec..YOU LOSE.");
        }
    }

}