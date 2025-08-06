package com.example.dto;

import java.time.LocalDate;

public class DepartureDatesDTO {
    private LocalDate departDate;
    private LocalDate endDate;

    public DepartureDatesDTO(LocalDate departDate, LocalDate endDate) {
        this.departDate = departDate;
        this.endDate = endDate;
    }

    // ✅ Getters and setters (required for serialization)
    public LocalDate getDepartDate() {
        return departDate;
    }

    public void setDepartDate(LocalDate departDate) {
        this.departDate = departDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
