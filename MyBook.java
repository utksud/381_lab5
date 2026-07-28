package edu.ucalgary.oop;

public class MyBook {
    public static void main(String[] args){

    }
}

class Book{
    private String isbn;
    private int publicationYear;
    private int pages;

    public Book(){

    }
        public Book(String isbn, int pages){
            this.isbn= isbn;
            this.pages= pages;
        }
        public String getIsbn(){
            return isbn;
        }
        public void setIsbn(String isbn){
            this.isbn= isbn;
        }
        public int getPublicationYear(){
            return publicationYear;
        }
        public void setPublicationYear(int year){
            publicationYear = year;
        }
        public int getPages(){
            return pages;
        }
        public void setPages( int pages){
            this.pages = pages;
        }
    }

class Hardcover extends Book{
    public  String binding(){
        return "Method binding called from Hardcover";
    }

}

class Paperback extends Book{
    public String coverArt(){
        return "Method coverArt called from Paperback";
    }

}

class Classic extends Hardcover{
    private int origPubYear = 1860;
    private Author theAuthor;
    private Publisher[] BookPublisher;

    public String createNotes(){
        return "";
    }

    public int getOrigPubYear() {
        return origPubYear;
    }

    public void setOrigPubYear(int origPubYear) {
        this.origPubYear = origPubYear;
    }

    public Author getTheAuthor() {
        return theAuthor;
    }

    public void setTheAuthor(Author theAuthor) {
        this.theAuthor = theAuthor;
    }

    public Publisher[] getBookPublisher() {
        return BookPublisher;
    }

    public void setBookPublisher(Publisher[] BookPublisher) {
        this.BookPublisher = BookPublisher;
    }
}

class Nonfiction extends Paperback{
    private Category deweyClassification;

    public String topic(){
        return "Method topic called from Nonfiction";
    }
    public Category getDeweyClassification(){
        return deweyClassification;
    }

    public void setDeweyClassification(Category deweyClassification) {
        this.deweyClassification = deweyClassification;
    }
}

class Fiction extends Paperback{
    @Override
    public String coverArt(){
        return "Method coverArt called from Fiction";
    }
    public String genre(){
        return "Method genre called from Fiction";
    }

}

class Novel extends Fiction{
    private Author[] theAuthor;
    private Series mySeries;

    @Override
    public String coverArt(){
        return "Method coverArt called from Novel";
    }
    public String theme(){
        return"Method theme called from Novel";
    }

    public Author[] getTheAuthor() {
        return theAuthor;
    }

    public void setTheAuthor(Author[] theAuthor) {
        this.theAuthor = theAuthor;
    }

    public Series getMySeries() {
        return mySeries;
    }

    public void setMySeries(Series mySeries) {
        this.mySeries = mySeries;
    }
}
class Anthology extends Fiction{
    private Story[] story;

    @Override
    public String coverArt(){
        return "Method coverArt called from Anthology";
    }
    public String storyOrder(){
        return "Method storyOrder called from Anthology";
    }

    public Story[] getStory() {
        return story;
    }

    public void setStory(Story[] story) {
        this.story = story;
    }
}

class Category{
    private Category subCategory;
    private  Category superCategory;
    private String category;

    public String sort(){
        return "Method sort called from Category";
    }

    public Category getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(Category subCategory) {
        this.subCategory = subCategory;
    }

    public Category getSuperCategory() {
        return superCategory;
    }

    public void setSuperCategory(Category superCategory) {
        this.superCategory = superCategory;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

class Story{
    private Author[] theAuthor;

    public String plot(){
        return "Method plot called from Story";
    }

    public Author[] getTheAuthor() {
        return theAuthor;
    }

    public void setTheAuthor(Author[] theAuthor) {
        this.theAuthor = theAuthor;
    }
}

class Publisher{
    private String name;
    private String address;
    private Classic[] classicsCatalog;

    public Publisher(String name, String address){
        this.name = name;
        this.address= address;
    }
    public String printLetterhead(){
        return "Method printLetterhead called from Publisher";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Classic[] getClassicsCatalog() {
        return classicsCatalog;
    }

    public void setClassicsCatalog(Classic[] classicsCatalog) {
        this.classicsCatalog = classicsCatalog;
    }
}

class Author{
    private String name = "Unknown";
    private String address;
    private int age;

    public Author(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }
    public String write(){
        return "Method write called from Author";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Series{
    private String seriesName;

    public String theme(){
        return "Method theme called from Fiction";
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }
}
