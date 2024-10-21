package com.example.controller;

import com.example.entity.Empresary;
import com.example.services.ServiceEmpresary;
import com.example.services.ServiceReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerEmpresary {

    @Autowired
    ServiceEmpresary serviceEmpresary;

    @Autowired
    ServiceReport serviceReport;

    @GetMapping("/getEmpresary")
    public List<Empresary> getEmpresary(){
        return serviceEmpresary.getEmpresary();
    }

    @GetMapping("/report")
    public ResponseEntity<byte[]> getReport() throws Exception {
        byte[] report = serviceReport.exportReport();
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=empresary.xls")
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(report);
    }
}