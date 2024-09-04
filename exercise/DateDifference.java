package exercise;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateDifference {
    private LocalDate startDate;
    private LocalDate endDate;
    private long daysBetween;
    
    public DateDifference(
        int startYear, int startMonth, int startDay,
        int endYear, int endMonth, int endDay
    ) {
        this.startDate = LocalDate.of(startYear, startMonth, startDay);
        this.endDate = LocalDate.of(endYear, endMonth, endDay);
        this.daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
    }
    
    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public long calculateDateDifference() {
        return daysBetween;
    }
}
