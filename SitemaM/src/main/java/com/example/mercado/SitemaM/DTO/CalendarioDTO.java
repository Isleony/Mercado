package com.example.mercado.SitemaM.DTO;
import lombok.Data;
import java.time.LocalDate;

    @Data
    public class CalendarioDTO {

        private String eventName;
        private LocalDate eventDate;
        private String eventLocation;
    }

