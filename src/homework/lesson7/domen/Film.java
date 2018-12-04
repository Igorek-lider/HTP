package homework.lesson7.domen;

public class Film {

    private Country countryProdaction;

    private Language language;

    private double costOfFilming;

    MovieInfo movieInfo;


    public Film (Country countryProdaction, Language language, double costOfFilming, int duration,
                FilmGenre filmGenre, String producer) {
        this.countryProdaction = countryProdaction;
        this.language = language;
        this.costOfFilming = costOfFilming;

        movieInfo = new MovieInfo(duration, filmGenre, producer);
    }

    public Country getCountryProdaction() {
        return countryProdaction;
    }

    public void setCountryProdaction(Country countryProdaction) {
        this.countryProdaction = countryProdaction;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public double getCostOfFilming() {
        return costOfFilming;
    }

    public void setCostOfFilming(double costOfFilming) {
        this.costOfFilming = costOfFilming;
    }

    public MovieInfo getMovieInfo() {
        return movieInfo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Film { ");
        sb.append(" countryProdaction = '").append(countryProdaction).append('\'');
        sb.append(", language = '").append(language).append('\'');
        sb.append(", costOfFilming = ").append(costOfFilming);
        sb.append(", movieInfo = ").append(movieInfo);
        sb.append('}');
        return sb.toString();
    }

    /**
     * класс-контейнер для хранения информации о фильме
     */
    class MovieInfo {

        private int duration;

        private FilmGenre filmGenre;

        private String producer;


        public MovieInfo(int duration, FilmGenre filmGenre, String producer) {
            this.duration = duration;
            this.filmGenre = filmGenre;
            this.producer = producer;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public FilmGenre getFilmGenre() {
            return filmGenre;
        }

        public void setFilmGenre(FilmGenre filmGenre) {
            this.filmGenre = filmGenre;
        }

        public String getProducer() {
            return producer;
        }

        public void setProducer(String producer) {
            this.producer = producer;
        }


        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("{ duration = ").append(duration);
            sb.append(", filmGenre = ").append(filmGenre);
            sb.append(", producer = '").append(producer).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }
}
