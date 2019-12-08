package com.example.cs_final_project2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.List;
import java.util.ArrayList;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private List<Password> passwords;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_screen);

        passwords = new ArrayList<>();

        Button saveButton = findViewById(R.id.saveButton);
        final EditText websiteText = findViewById(R.id.websiteText);
        final EditText usernameText = findViewById(R.id.usernameText);

        final String password = "alsdjfsd";
        //code for randomizing password

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String website = websiteText.getText().toString();
                String username = usernameText.getText().toString();

                Password newPass = new Password(website, username, password);
                passwords.add(newPass);

                updateUI();
                setContentView(R.layout.second_screen);
            }
        });
    }

    private void updateUI() {
        LinearLayout savedPasswords = findViewById(R.id.savedPasswords);
        savedPasswords.removeAllViews();

        for (Password password : passwords) {
            View passwordChunk = getLayoutInflater().inflate(R.layout.chunk_password, savedPasswords
        }
    }
}
