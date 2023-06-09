package ufc.com.vev.models;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String name;
    private List<Skin> skinsDisponiveis;

    public Shop(String name, List<Skin> skinsDisponiveis) {
        this.name = name;
        this.skinsDisponiveis = skinsDisponiveis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Skin> getSkinsDisponiveis() {
        return skinsDisponiveis;
    }

    public boolean adicionarSkinsNaLoja(List<Skin> skinsDisponiveis) {
        this.skinsDisponiveis = skinsDisponiveis;
        return true;
    }
}
