import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.test.web.servlet.MockMvc;
import ufc.com.vev.models.Player;
import ufc.com.vev.models.Shop;
import ufc.com.vev.models.Skin;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


public class SkinsControllerTest {

    protected static final String BASE_URL = "https://bymykel.github.io/CSGO-API/api/en";

    protected MockMvc mvc;


    @Test
    public void procurarUmaSkinDoCSGO() throws Exception {

        Shop shop = Mockito.mock(Shop.class);


        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(BASE_URL + "/skins.json")
                .get()
                .build();

        Response response = client.newCall(request).execute();

        ResponseBody responseBody = response.body();

        assert responseBody != null;
        String responseString = new String(responseBody.bytes());

        ObjectMapper mapper = new ObjectMapper();
        List<Skin> skins = mapper.readValue(responseString, new TypeReference<List<Skin>>() {
        });
        Mockito.when(shop.adicionarSkinsNaLoja(skins)).thenReturn(true);
        shop.adicionarSkinsNaLoja(skins);

        Player player = new Player("Mykel", "MIBR");

        boolean existsSkin = player.procurarSkinDoCSGO(shop, "Desert Eagle | Urban DDPAT");
        Assert.assertTrue(existsSkin);
    }
}
