package com.developer.Adithya.covid_19tracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private  int positionCountry;
    TextView tvCountry,tvCases,tvRecovered,tvCritical,tvActive,tvTodayCases,tvTotalDeaths,tvTodayDeaths;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        positionCountry = intent.getIntExtra("position",0);

        getSupportActionBar().setTitle("Details of "+ com.developer.Adithya.covid_19tracker.AffectedCountries.countryModelsList.get(positionCountry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ActionBar actionBar;
        actionBar = getSupportActionBar();

        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#1fcbed"));

        actionBar.setBackgroundDrawable(colorDrawable);



        tvCountry = findViewById(R.id.tvCountry);
        tvCases = findViewById(R.id.tvCases);
        tvRecovered = findViewById(R.id.tvRecovered);
        tvCritical = findViewById(R.id.tvCritical);
        tvActive = findViewById(R.id.tvActive);
        tvTodayCases = findViewById(R.id.tvTodayCases);
        tvTotalDeaths = findViewById(R.id.tvDeaths);
        tvTodayDeaths = findViewById(R.id.tvTodayDeaths);

        tvCountry.setText(com.developer.Adithya.covid_19tracker.AffectedCountries.countryModelsList.get(positionCountry).getCountry());
        tvCases.setText(com.developer.Adithya.covid_19tracker.AffectedCountries.countryModelsList.get(positionCountry).getCases());
        tvRecovered.setText(com.developer.Adithya.covid_19tracker.AffectedCountries.countryModelsList.get(positionCountry).getRecovered());
        tvCritical.setText(com.developer.Adithya.covid_19tracker.AffectedCountries.countryModelsList.get(positionCountry).getCritical());
        tvActive.setText(com.developer.Adithya.covid_19tracker.AffectedCountries.countryModelsList.get(positionCountry).getActive());
        tvTodayCases.setText(com.developer.Adithya.covid_19tracker.AffectedCountries.countryModelsList.get(positionCountry).getTodayCases());
        tvTotalDeaths.setText(com.developer.Adithya.covid_19tracker.AffectedCountries.countryModelsList.get(positionCountry).getDeaths());
        tvTodayDeaths.setText(com.developer.Adithya.covid_19tracker.AffectedCountries.countryModelsList.get(positionCountry).getTodayDeaths());


    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
