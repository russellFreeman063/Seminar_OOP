package Seminar_5;

import Seminar_5.models.TableModel;
import Seminar_5.presenters.BookingPresenter;
import Seminar_5.views.BookingView;

import java.util.Date;

public class Program {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     * Метод changeReservationTable должен ЗАРАБОТАТЬ!
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        TableModel model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(model, view);
        bookingPresenter.updateTablesUI();

        view.reservationTable(new Date(), 3, "Станислав");

        view.changeReservationTable(101, new Date(), 1, "Станислав");
    }

}
