package stream;

import java.util.Set;

public class Singer {

    private String singerName;
    private Country country;
    private Type type;

    public Singer(Type type, String name, Country country) {
         this.type = type;
         this.singerName = name;
         this.country = country;
    }

    public Type getType() {
            return type;
        }

    public String getName() {
            return singerName;
        }

    public Country getCountry() {
            return country;
        }
    @Override
    public String toString() {
        return "Исполнитель {" +
                "Тип:" + type +
                ", Имя:'" + singerName + '\'' +
                ", Страна:" + country+
                '}';
    }
}
