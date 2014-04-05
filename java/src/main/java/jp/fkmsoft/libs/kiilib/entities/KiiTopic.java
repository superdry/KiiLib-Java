package jp.fkmsoft.libs.kiilib.entities;

/**
 * Describes topic
 * @author fkm
 *
 */
public class KiiTopic implements AccessControllable {

    private final BucketOwnable owner;
    private final String name;
    
    private static BucketOwnable APP_SCOPE = new KiiApp();
    
    public KiiTopic(BucketOwnable owner, String name) {
        if (owner == null) {
            owner = APP_SCOPE;
        }
        this.owner = owner;
        this.name = name;
    }
    
    public String getResourcePath() {
        return owner.getResourcePath() + "/topics/" + name;
    }

    public String getName() {
        return name;
    }
}
