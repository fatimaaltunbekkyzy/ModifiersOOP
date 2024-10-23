//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Country деген класс тузунуз .
//        Анын поляларын бериниз.
//        Аты , калкы, аянты , тили ушундай полялары болсун .
//        Маанилерин конструктор аркылуу бериниз. 3 объект тузунуз . Ошондой эле 1 static метод кошунуз.
//        Mетод параметирине Country-нин массивин алып бизге аянты боюнча эн чон олкону таап берсин.

    // маанилурин конструктор аркылуу бердик жана 3 Объукт туздук.
    Country country1 = new Country("Egypt",1.00704000 ,10.1 ,"Arabcha ");
Country country2 = new Country("Russia",1.46267288,12.9,"Russian language");
Country country3 = new Country("Kanada",3.9292355,1.5 ,"English and French");

Country [] countries = {country1,country2,country3};//Массивке салдык.
        for (Country country : countries){
            System.out.println(country.toString());

        System.out.println("Самая большая страна: ");
        System.out.println(Country.staticMethod(countries));



    }}}
