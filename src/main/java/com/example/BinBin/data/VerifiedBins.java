package com.example.BinBin.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VerifiedBins {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int binId;
    int latitude;
    int longitude;
}
