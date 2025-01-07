package day2.exam.filmManager;

public class Film {
    private String title;
    private int yearEX;
    private String director;
    private Genre genre;


    public Film(String title, int yearEX, String director, Genre genre) {
        this.title = title;
        this.yearEX = yearEX;
        this.director = director;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearEX() {
        return yearEX;
    }

    public void setYearEX(int yearEX) {
        this.yearEX = yearEX;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String toString() {
        return "Tên phim : " + getTitle() +  "Năm sản xuất: " + getYearEX() + ", Đạo diễn : " + getDirector() + ",Thể loại: " + getGenre();
    }
}
