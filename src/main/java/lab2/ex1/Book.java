package lab2.ex1;

public class Book {
	private String[] chapters;
    private static final int DEFAULT_CHAPTERS = 10;

    public Book(){
        chapters = new String[DEFAULT_CHAPTERS];
        for(int i = 0; i < chapters.length; i++){
            chapters[i] = "Chapter " + i;
        }
    }
    public Book(String[] array) {
        chapters = new String[array.length];
        chapters = array;
    }

    public String getChapter(int i) {
        if (i < 0 || i >= chapters.length)
            return "invalid chapter";
        return chapters[i];
    }

    public String[] getChapters() {
        return chapters;
    }
}
