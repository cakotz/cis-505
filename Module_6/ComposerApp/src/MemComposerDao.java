/*
Kotz, C. (2024). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

import java.util.ArrayList;
import java.util.List;

public class MemComposerDao implements ComposerDao{
    //Creates three composer objects to be added to the composers List.
    Composer composerOne = new Composer(1, "Franz Schubert", "Classical, Religious");
    Composer composerTwo = new Composer(2, "Frederic Chopin", "Classical, Jazz");
    Composer composerThree = new Composer(3, "Gabriel Faure", "Classical, Vocal, Latin");

    //Creates the composers list and adds the above three composer objects to it.
    private List<Composer> composers = new ArrayList<>() {{
        add(composerOne);
        add(composerTwo);
        add(composerThree);
    }};

    //Default constructor
    MemComposerDao() {}

    //Overrides the findAll method to return the composers list.
    @Override
    public List<Composer> findAll() {
        return composers;
    }

    //Overrides the findBy method to return a composer from the composers list that has an id matching the key.
    @Override
    public Composer findBy(Integer key) {
        for (Composer composer : composers) {
            if (composer.getId() == key) {
                return composer;
            }
        }

        return new Composer();
    }

    //Overrides the insert method to add a composer object top the composers list.
    @Override
    public void insert(Composer entity) {
        composers.add(entity);
    }
}
