package com.example.bus_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.bus_reservation.Model.Ticket;
import com.example.bus_reservation.Services.RetrofitService;
import com.example.bus_reservation.Services.TicketApi;

import java.text.BreakIterator;
import java.util.Date;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeComponents();
    }

    private void initializeComponents() {
        EditText date = findViewById(R.id.t_date);
        EditText firstnme = findViewById(R.id.first_name);
        EditText lastnme = findViewById(R.id.last_name);
        EditText gender = findViewById(R.id.gender);
        EditText phoneno = findViewById(R.id.phone_no);
        EditText day = findViewById(R.id.day);
        EditText time = findViewById(R.id.time);
        Button submit = (Button) findViewById(R.id.submit);
    }
    RetrofitService retrofitService = new RetrofitService();
    com.example.bus_reservation.Services.TicketApi TicketApi = retrofitService.getRetrofit().create(TicketApi.class);

        submit.setOnClickListener(Ticket -> {
        String date = String.valueOf(t_date.getText());
        String first_nam = String.valueOf(first_name.getText());
        String last_nam = String.valueOf(last_name.getText());
        String gende = String.valueOf(gender.getText());
        String phoneno = String.valueOf(phone_no.getText());
        String day = String.valueOf(day.getText());
        String time = String.valueOf(time.getText());


        Ticket airTicket = new Ticket();
        airTicket.date (date);
        airTicket.first_nam(first_name);
        airTicket.last_nam(last_name);
        airTicket.setgende(gender);
        airTicket.setphonenp(phone_no);
        airTicket.setDay(day);
        airTicket.settime(t_date);

        TicketApi.submit(Ticket)
                .enqueue(new Callback<Ticket>() {
                    @Override
                    public void onResponse(Call<Ticket> call, Response<Ticket> response) {
                        Toast.makeText(MainActivity.this, "Save Successfully.!", Toast.LENGTH_SHORT).show();
                    }


                    @Override
                    public void onFailure(Call<Ticket> call, Throwable t) {
                        Toast.makeText(MainActivity.this, "Failed to Save..!!!:", Toast.LENGTH_SHORT).show();
                        Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE, "Error Occurred", t);
                    }


                }
}