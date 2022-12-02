package com.example.BinBin.web;

import com.example.BinBin.business.DustbinsService;
import com.example.BinBin.data.DustbinDTO;
import com.example.BinBin.data.getLatLongPOJO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;
@RestController
@RequestMapping("/dustbins")
public class DustbinsController {
    final DustbinsService dustbinsService;
    public DustbinsController(DustbinsService dustbinsService) {
        this.dustbinsService = dustbinsService;
    }
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public String addDustbin(@RequestBody DustbinDTO dustbinDTO){

        try {
            this.dustbinsService.addDustbin(dustbinDTO);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println("i got a request");
        return "Done!";
    }
    @RequestMapping("/get")
    public ArrayList<getLatLongPOJO> getDustbin(){
        System.out.println("i returned the location");
        return this.dustbinsService.getDustbins();
    }
}
