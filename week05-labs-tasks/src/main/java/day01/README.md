Day01 Feladatleírás

Készíts egy day01.Movie nevű osztályt, melyben szerepel a film címe, illetve időpontok listája amikor játszák a moziban (LocalDateTime). Mind a két attribútumot konstruktorban állítsuk be.

Készítsd el a day01.Cinema nevű osztályt, melyben filmek listája szerepel. Legyen egy addMovie(Movie movie) metódus, amivel filmet lehet hozzáadni a listához.

Készíts egy findMovieByTime(LocalDateTime time) nevű metódust, ami listában visszaadja azon filmek címét, amiket a paraméterül kapott időpontban játszanak.

A feladathoz tartozó main metódus:

public static void main(String[] args) {
Cinema cinema = new Cinema();

        cinema.addMovie(new Movie("Titanic", Arrays.asList(
                LocalDateTime.of(2021,11,8,12,45),
                LocalDateTime.of(2021,11,8,22,25)
                )));
        cinema.addMovie(new Movie("Jurassic Park", Arrays.asList(
                LocalDateTime.of(2021,11,8,19,45),
                LocalDateTime.of(2021,11,8,20,25),
                LocalDateTime.of(2021,11,8,22,25)
        )));

        System.out.println(cinema.findMovieByTime(LocalDateTime.of(2021,11,8,10,45))); // []
        System.out.println(cinema.findMovieByTime(LocalDateTime.of(2021,11,8,19,45))); // [Jurassic Park]
        System.out.println(cinema.findMovieByTime(LocalDateTime.of(2021,11,8,22,25))); // [Titanic, Jurassic Park]

    }