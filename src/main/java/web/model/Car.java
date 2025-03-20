package web.model;

public class Car {
    private String modelName;
    private int year;
    private String series;

    public Car(String modelName, int year, String series) {
        this.modelName = modelName;
        this.year = year;
        this.series = series;
    }
    public String getModelName() { return this.modelName; }
    public int getYear() { return this.year; }
    public String getSeries() { return this.series; }
    public void setModelName(String modelName) { this.modelName = modelName; }
    public void setYear(int year) { this.year = year; }
    public void setSeries(String series) { this.series = series; }
}
