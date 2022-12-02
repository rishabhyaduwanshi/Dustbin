package com.example.BinBin.data;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Date;

@Entity
public class Dustbins {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double latitude;
    private double longitude;
    @Lob
    private Blob blobcol;
    private Date stamp;
    private int userid;

    public Dustbins() {
    }

    @Autowired
    public Dustbins(double latitude, double longitude, Blob image, Date date, int userId) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.blobcol = image;
        this.stamp = date;
        this.userid = userId;
    }
}
