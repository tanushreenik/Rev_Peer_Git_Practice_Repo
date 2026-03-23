class InvalidCustomerNameException extends Exception {}
class InvalidMovieException extends Exception {}
class InvalidTicketCountException extends Exception {}
class InsufficientSeatsException extends Exception {}
class PaymentFailedException extends Exception {}
class CancellationNotAllowedException extends Exception {}

public class MovieBookingMain {

    static int availableSeats = 5;
    static boolean cancelled = false;

    public static void main(String[] args) {

        try {
            String name = "Tanu";
            String movie = "Leo";
            int tickets = 2;
            double payment = 500;

            if(name.isEmpty()) throw new InvalidCustomerNameException();

            if(!(movie.equals("Leo") || movie.equals("Jailer") || movie.equals("Vikram")))
                throw new InvalidMovieException();

            if(tickets <= 0) throw new InvalidTicketCountException();

            if(tickets > availableSeats) throw new InsufficientSeatsException();

            double total = tickets * 200;

            if(payment < total) throw new PaymentFailedException();

            availableSeats -= tickets;

            System.out.println("Booking successful");

            if(cancelled) throw new CancellationNotAllowedException();

            cancelled = true;
            System.out.println("Booking cancelled");

        } catch(Exception e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Process completed");
        }
    }
}