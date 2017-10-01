package uebung2.parameterisierte.factory.methode;

/**
 * Created by rk on 28.09.17.
 */
public class VinylCreator {

    public Vinyl create(String type) {
        if (type.equals("EP")) {
            return new EP();
        } else if (type.equals("LP")) {
            return new LP();
        }
        return null;
    }

}
