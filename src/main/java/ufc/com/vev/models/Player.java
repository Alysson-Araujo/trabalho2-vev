package ufc.com.vev.models;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private String team;
    private List<Skin> skins;
//    private String pix;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public List<Skin> getSkins() {
        return skins;
    }

    public void addSkin(Skin skin) {
        skins.add(skin);
    }

    public Player(String name, String team) {
        this.name = name;
        this.team = team;
    }

    public void comprarSkin(Skin skin, Shop shop, String nomeDaSkin) {
        List<Skin> listSkinsDisponiveis = shop.getSkinsDisponiveis();

        for (Skin skinDisponivel : listSkinsDisponiveis) {
            if (skinDisponivel.getName().equals(nomeDaSkin)) {
                this.skins.add(skinDisponivel);
                break;
            }
        }
    }

    public boolean procurarSkinDoCSGO(Shop shop, String nomeDaSkin) {

        for (Skin skinDisponivel : shop.getSkinsDisponiveis()) {
            System.out.println(skinDisponivel.getName());
            if (skinDisponivel.getName().equals(nomeDaSkin)) {
                return true;
            }
        }
        return false;
    }
}
