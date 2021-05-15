package za.ac.cput.baronmukenyi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CollectionClassTest {

    Collection<CollectionClass> crossplatformGames;
    List<CollectionClass> playstationGames;
    Set<CollectionClass> xBoxGames;
    Map<String, CollectionClass> nintendoGames;

    @BeforeEach
    public void setUp(){
        crossplatformGames = new HashSet<>();
        playstationGames = new ArrayList<>();
        xBoxGames = new HashSet<>();
        nintendoGames = new HashMap<>();
    }


    //COLLECTION SET
    @Test
    public void addCollection(){
        CollectionClass gameName1 = new CollectionClass.CollectionClassBuilder().setGameName("Grand Theft Auto").setGenreName("Action").setPrice(50).build();
        CollectionClass gameName2 = new CollectionClass.CollectionClassBuilder().setGameName("Fifa").setGenreName("Sport").setPrice(500).build();
        CollectionClass gameName3 = new CollectionClass.CollectionClassBuilder().setGameName("The Witcher").setGenreName("RPG").setPrice(150).build();

        crossplatformGames.add(gameName1);
        crossplatformGames.add(gameName2);
        crossplatformGames.add(gameName3);
        assertNotNull(crossplatformGames);
        System.out.print("Crossplatform games added to the list: \n" + crossplatformGames);
    }

    @Test
    public void findCollection(){
        addCollection();
        CollectionClass gameName1 = new CollectionClass.CollectionClassBuilder().setGameName("Grand Theft Auto").setGenreName("Action").setPrice(50).build();
        assertTrue(crossplatformGames.contains(gameName1));

        System.out.println("Game found" + gameName1);

    }
    @Test
    public void removeCollection(){
        addCollection();
        CollectionClass gameName1 = new CollectionClass.CollectionClassBuilder().setGameName("Grand Theft Auto").setGenreName("Action").setPrice(50).build();
        assertTrue(crossplatformGames.remove(gameName1));
        System.out.println("Games remaining" + crossplatformGames);

    }


    //LIST SET
    @Test
    public void addList(){
        CollectionClass gameName4 = new CollectionClass.CollectionClassBuilder().setGameName("Uncharted").setGenreName("Adventure").setPrice(250).build();
        CollectionClass gameName5 = new CollectionClass.CollectionClassBuilder().setGameName("Gran Tourismo").setGenreName("Racing").setPrice(650).build();
        CollectionClass gameName6 = new CollectionClass.CollectionClassBuilder().setGameName("The Last of Us").setGenreName("Survival").setPrice(850).build();

        playstationGames.add(0, gameName4);
        playstationGames.add(1, gameName5);
        playstationGames.add(2, gameName6);
        assertNotNull(playstationGames);
        System.out.println("PlayStation exclusive games added: \n" + playstationGames);
    }
    @Test
    public void findList(){
        addList();
        CollectionClass gameName5 = new CollectionClass.CollectionClassBuilder().setGameName("Gran Tourismo").setGenreName("Racing").setPrice(650).build();
        assertTrue(playstationGames.contains(gameName5));
        System.out.println("Game found" + gameName5);
    }
    @Test
    public void removeList(){
        addList();
        CollectionClass gameName6 = new CollectionClass.CollectionClassBuilder().setGameName("The Last of Us").setGenreName("Survival").setPrice(850).build();
        assertTrue(playstationGames.remove(gameName6));
        System.out.println("PlayStation exclusive games remaining on the list " + playstationGames);
    }


    //SET
    @Test
    public void addSet(){
        CollectionClass gameName7 = new CollectionClass.CollectionClassBuilder().setGameName("Halo").setGenreName("FPS").setPrice(800).build();
        CollectionClass gameName8 = new CollectionClass.CollectionClassBuilder().setGameName("Age of Empire").setGenreName("Strategy").setPrice(700).build();

        xBoxGames.add(gameName7);
        xBoxGames.add(gameName8);
        assertNotNull(xBoxGames);
        System.out.println("List added to Xbox exclusive games: \n" + xBoxGames);
    }
    @Test
    public void findSet(){
        addSet();
        CollectionClass gameName7 = new CollectionClass.CollectionClassBuilder().setGameName("Halo").setGenreName("FPS").setPrice(800).build();
        assertTrue(xBoxGames.contains(xBoxGames));
        System.out.println("Game found" + gameName7);
    }
    @Test
    public void removeTest(){
        addSet();
        CollectionClass game7 = new CollectionClass.CollectionClassBuilder().setGameName("Halo").setGenreName("FPS").setPrice(800).build();
        assertTrue(xBoxGames.remove(xBoxGames));
        System.out.println("PlayStation exclusive games remaining on the list " + xBoxGames);
    }

    //MAP SET
    @Test
    public void addMap(){
        CollectionClass gameName9 = new CollectionClass.CollectionClassBuilder().setGameName("Super Mario").setGenreName("Platformer").setPrice(200).build();
        CollectionClass gameName10 = new CollectionClass.CollectionClassBuilder().setGameName("Legend of Zelda").setGenreName("Adventure").setPrice(800).build();
        CollectionClass gameName11 = new CollectionClass.CollectionClassBuilder().setGameName("Super Smash Bros").setGenreName("Fighting").setPrice(800).build();

        nintendoGames.put(gameName9.getGameName(), gameName9);
        nintendoGames.put(gameName10.getGameName(), gameName10);
        nintendoGames.put(gameName11.getGameName(), gameName11);
        assertNotNull(nintendoGames);
        System.out.println("Nintendo games that are exlusive are added: \n" + nintendoGames);
    }
    @Test
    public void findMap(){
        addMap();
        CollectionClass gameName11 = new CollectionClass.CollectionClassBuilder().setGameName("Super Smash Bros").setGenreName("Fighting").setPrice(800).build();
        assertTrue(nintendoGames.containsValue(gameName11));
        System.out.println("Game found" + gameName11);
    }
    @Test
    public void deleteMap(){
        addMap();
        CollectionClass gameName11 = new CollectionClass.CollectionClassBuilder().setGameName("Super Smash Bros").setGenreName("Fighting").setPrice(800).build();
        nintendoGames.remove(gameName11.getGameName());
        assertEquals(1, nintendoGames.size());
        System.out.println(nintendoGames);
    }

}