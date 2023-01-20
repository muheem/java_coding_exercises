package com.techreturners.exercise004;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.ZoneOffset;



public class Exercise004 {

    private long gigaSeconds = 1000000000;
    private LocalDateTime gigaDateTime;

    private void AddGigaSeconds(LocalDateTime dateTime) {
        long secs = dateTime.toEpochSecond(ZoneOffset.ofHours(0));
        gigaDateTime = LocalDateTime.ofEpochSecond(secs+gigaSeconds, 0, ZoneOffset.ofHours(0));
    }

    public Exercise004(LocalDateTime dateTime) {
        this.AddGigaSeconds(dateTime);
    }

    public Exercise004(LocalDate date) {
        LocalDateTime localDateTime =  LocalDateTime.of( date, LocalTime.of(0, 0));
        this.AddGigaSeconds(localDateTime);
    }

    public LocalDateTime getDateTime() {
        return gigaDateTime;
    }
}
