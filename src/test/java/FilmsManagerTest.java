import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {

    //Добавление фильмов

    @Test
    public void testAddFilms0() {
        FilmsManager manager = new FilmsManager();

        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddFilms1() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Бладшот");

        String[] actual = manager.findAll();
        String[] expected = {"Бладшот"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddFilms3() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель Белград");

        String[] actual = manager.findAll();
        String[] expected = {
                "Бладшот",
                "Вперёд",
                "Отель Белград"
        };
        Assertions.assertArrayEquals(expected, actual);
    }

    //Поиск последнего фильма

    @Test
    public void testFindLast0() {
        FilmsManager manager = new FilmsManager();

        String[] actual = manager.findLast();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast3() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель Белград");

        String[] actual = manager.findLast();
        String[] expected = {
                "Отель Белград",
                "Вперёд",
                "Бладшот"
        };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast5() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентльмены");
        manager.addFilm("Человек-невидимка");

        String[] actual = manager.findLast();
        String[] expected = {
                "Человек-невидимка",
                "Джентльмены",
                "Отель Белград",
                "Вперёд",
                "Бладшот"
        };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast7() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентльмены");
        manager.addFilm("Человек-невидимка");
        manager.addFilm("Тролли. Мировой тур");
        manager.addFilm("Номер один");

        String[] actual = manager.findLast();
        String[] expected = {
                "Номер один",
                "Тролли. Мировой тур",
                "Человек-невидимка",
                "Джентльмены",
                "Отель Белград"
        };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastCustomLimit3() {
        FilmsManager manager = new FilmsManager(3);

        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентльмены");
        manager.addFilm("Человек-невидимка");
        manager.addFilm("Тролли. Мировой тур");
        manager.addFilm("Номер один");

        String[] actual = manager.findLast();
        String[] expected = {
                "Номер один",
                "Тролли. Мировой тур",
                "Человек-невидимка"
        };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastCustomLimit7() {
        FilmsManager manager = new FilmsManager(7);

        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентльмены");
        manager.addFilm("Человек-невидимка");
        manager.addFilm("Тролли. Мировой тур");
        manager.addFilm("Номер один");

        String[] actual = manager.findLast();
        String[] expected = {
                "Номер один",
                "Тролли. Мировой тур",
                "Человек-невидимка",
                "Джентльмены",
                "Отель Белград",
                "Вперёд",
                "Бладшот"
        };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastCustomLimit() {
        FilmsManager manager = new FilmsManager(3);

        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");

        String[] actual = manager.findLast();
        String[] expected = {
                "Вперёд",
                "Бладшот"
        };
        Assertions.assertArrayEquals(expected, actual);
    }
}
