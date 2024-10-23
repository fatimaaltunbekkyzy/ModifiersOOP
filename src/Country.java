public class Country {
    private String name;
    private double population;//Полелери
    private  double area;
    private String language;

    public Country(String name, double population, double area, String language) {
        this.name = name;
        this.population = population;
        this.area =area;
        this.language =language;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Country{" +
                "Name: " + name + "\n" +
                "Population: " + population +
                "Area: " + area +
                "Language: " + language + "\n" +
                '}';
    }

   public  static  Country staticMethod (Country [] countries){
        Country myMethod = countries[0];

        for (Country number : countries){
         if (number.area > myMethod.area ){
             myMethod = number;
         }
        }
    return myMethod;

}}

