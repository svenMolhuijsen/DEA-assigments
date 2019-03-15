package nl.han.ica.oose.dea;

import java.util.List;

public class BibliotheekMagazijn {

    private List<BibliotheekItem> bibliotheekitems;

    public BibliotheekMagazijn(List<BibliotheekItem> bibliotheekitems, List<BibliotheekItem> games) {
        this.bibliotheekitems = bibliotheekitems;
        this.bibliotheekitems = games;
    }

    public BibliotheekItem pakItem(String titel) {
        BibliotheekItem bibliotheekItem = null;

        for (BibliotheekItem item : bibliotheekitems) {
            if (item.getTitel().equals(titel)) {
                bibliotheekItem = item;

                break;
            }
        }
        bibliotheekitems.remove(bibliotheekItem);
        return bibliotheekItem;
    }

    public void plaatsItem(BibliotheekItem item) throws TitelisemptyException, TitelAreadyInUseException {
        if(item.getTitel() == null){
            throw new TitelisemptyException();
        }
        for (BibliotheekItem currItem : bibliotheekitems) {
            if (item.getTitel().equals(currItem.getTitel())) {
                throw new TitelAreadyInUseException(currItem.getTitel());
            }
        }
        bibliotheekitems.add(item);
    }

    public int getBibliotheekItems() {
        return bibliotheekitems.size();
    }

}

