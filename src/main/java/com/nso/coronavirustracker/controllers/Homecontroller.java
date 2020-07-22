package com.nso.coronavirustracker.controllers;

import com.nso.coronavirustracker.model.LocationStats;
import com.nso.coronavirustracker.services.CoronavirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class Homecontroller {

    @Autowired
    CoronavirusDataService coronaVirusDataService;

    @GetMapping("/")
    public String home(Model model){
        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
        int totalCases = allStats.stream().mapToInt(s -> s.getLatestTotalCases()).sum();
        model.addAttribute("locationStats", allStats );
        model.addAttribute("totalreportedCases", totalCases );

        return "home";
    }
}
