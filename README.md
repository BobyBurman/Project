import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class DateFilterExample {

    public static void main(String[] args) {
        // Sample filters as strings (you can adapt these based on actual user input)
        String filter1 = "YearToDate";
        String filter2 = "MonthOfYear(September2024)";
        String filter3 = "YearToYear(2024 to 2025)";

        // Parsing and applying filters
        LocalDate fromDate1 = parseFilter(filter1);
        LocalDate toDate1 = LocalDate.now(); // Today's date for YearToDate filter

        LocalDate fromDate2 = parseFilter(filter2);
        LocalDate toDate2 = fromDate2.with(TemporalAdjusters.lastDayOfMonth()); // Last day of September 2024 for MonthOfYear filter

        LocalDate[] dates = parseYearToYearFilter(filter3);
        LocalDate fromDate3 = dates[0];
        LocalDate toDate3 = dates[1];

        // Printing results
        printDateRange("YearToDate", fromDate1, toDate1);
        printDateRange("MonthOfYear(September2024)", fromDate2, toDate2);
        printDateRange("YearToYear(2024 to 2025)", fromDate3, toDate3);
    }

    // Method to parse and apply different filters
    public static LocalDate parseFilter(String filter) {
        LocalDate result = null;
        if (filter.equals("YearToDate")) {
            result = Year.now().atMonth(Month.APRIL).atDay(1);
        } else if (filter.startsWith("MonthOfYear(") && filter.endsWith(")")) {
            String monthYear = filter.substring(12, filter.length() - 1);
            Month month = Month.valueOf(monthYear.toUpperCase().substring(0, monthYear.length() - 4));
            int year = Integer.parseInt(monthYear.substring(monthYear.length() - 4));
            result = Year.of(year).atMonth(month).atDay(1);
        }
        return result;
    }

    // Method to parse and apply YearToYear filter
    public static LocalDate[] parseYearToYearFilter(String filter) {
        LocalDate[] result = new LocalDate[2];
        if (filter.startsWith("YearToYear(") && filter.endsWith(")")) {
            String years = filter.substring(11, filter.length() - 1);
            String[] yearParts = years.split(" to ");
            int year1 = Integer.parseInt(yearParts[0]);
            int year2 = Integer.parseInt(yearParts[1]);
            result[0] = Year.of(year1).atMonth(Month.APRIL).atDay(1);
            result[1] = Year.of(year2).atMonth(Month.MARCH).atEndOfMonth();
        }
        return result;
    }

    // Method to print date range
    public static void printDateRange(String filter, LocalDate fromDate, LocalDate toDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        System.out.println(filter + " from " + formatter.format(fromDate) + " to " + formatter.format(toDate));
    }
}

