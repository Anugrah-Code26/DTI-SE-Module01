package exercise.utility;

public class FormatNumber {
    public static String formatNumber(double number) {
        if (number < 1_000) {
            return String.format("%.0f", number);
        } else if (number < 1_000_000) {
            return String.format("%.2fK", number / 1_000);
        } else if (number < 1_000_000_000) {
            return String.format("%.2fM", number / 1_000_000);
        } else if (number < 1_000_000_000_000L) {
            return String.format("%.2fB", number / 1_000_000_000);
        } else {
            return String.format("%.2fT", number / 1_000_000_000_000L);
        }
    }
}
