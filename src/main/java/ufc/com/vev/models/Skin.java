package ufc.com.vev.models;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Skin {
    public boolean isStattrak() {
        return stattrak;
    }

    public void setStattrak(boolean stattrak) {
        this.stattrak = stattrak;
    }

    public String getPaint_index() {
        return paint_index;
    }

    public void setPaint_index(String paint_index) {
        this.paint_index = paint_index;
    }

    public Skin(String id,
                String name,
                String description,
                String weapon,
                String pattern,
                int min_float,
                int max_float,
                String rarity,
                String image, boolean stattrak, String paint_index) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.weapon = weapon;
        this.pattern = pattern;
        this.min_float = min_float;
        this.max_float = max_float;
        this.rarity = rarity;
        this.image = image;

    }

    private String id;
    private String name;
    private String description;
    private String weapon;
    private String pattern;
    private int min_float;
    private int max_float;
    private String rarity;

    private boolean stattrak;
    private String paint_index;
    private String image;

    public String getName() {
        return name;
    }

    @JsonCreator
    public Skin(@JsonProperty("name") String name,
                @JsonProperty("description") String description,
                @JsonProperty("weapon") String weapon,
                @JsonProperty("pattern") String pattern,
                @JsonProperty("min_float") int min_float,
                @JsonProperty("max_float") int max_float,
                @JsonProperty("rarity") String rarity,
                @JsonProperty("image") String image,
                @JsonProperty("stattrak") boolean stattrak,
                @JsonProperty("paint_index") String paint_index) {
        this.name = name;
        this.description = description;
        this.weapon = weapon;
        this.pattern = pattern;
        this.min_float = min_float;
        this.max_float = max_float;
        this.rarity = rarity;
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public int getMin_float() {
        return min_float;
    }

    public void setMin_float(int min_float) {
        this.min_float = min_float;
    }

    public int getMax_float() {
        return max_float;
    }

    public void setMax_float(int max_float) {
        this.max_float = max_float;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
