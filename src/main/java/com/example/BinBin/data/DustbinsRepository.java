package com.example.BinBin.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface DustbinsRepository extends JpaRepository<Dustbins,Integer> {
    @Query("select d from Dustbins d")
    public ArrayList<getLatLongPOJO> getDustbinsQuery();
//    getDustbinsPOJO i=new getDustbinsPOJO(5.55,6.78);
}
