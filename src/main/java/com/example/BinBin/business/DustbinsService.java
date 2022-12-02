package com.example.BinBin.business;

import com.example.BinBin.data.*;
import org.springframework.stereotype.Service;

import javax.sql.rowset.serial.SerialBlob;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;

@Service
public class DustbinsService {
    final DustbinsRepository dustbinsRepository;

    public DustbinsService(DustbinsRepository dustbinsRepository) {
        this.dustbinsRepository = dustbinsRepository;
    }
    public void addDustbin(DustbinDTO dustbinDTO) throws SQLException {
        if(dustbinDTO ==null){
            throw new RuntimeException("Guest cannot be null");
        }
        double latitude= dustbinDTO.getLatitude();
        double longitude= dustbinDTO.getLongitude();
        String str=dustbinDTO.getImage();
        Date date=new Date();
        int userId=101;
        byte[] decodedByte = Base64.getDecoder().decode(str);
            Blob b = new SerialBlob(decodedByte);
            Dustbins dustbin = new Dustbins(latitude, longitude, b, date, userId);
            dustbinsRepository.save(dustbin);
    }
    public ArrayList<getLatLongPOJO> getDustbins(){
        return dustbinsRepository.getDustbinsQuery();
    }
}
