package com.example.bus_reservation.Services;

import com.example.bus_reservation.Model.Ticket;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface TicketApi {
    @POST("/api/AirTicket/")
    Call<Ticket> save(@Body Ticket ticket);
}
