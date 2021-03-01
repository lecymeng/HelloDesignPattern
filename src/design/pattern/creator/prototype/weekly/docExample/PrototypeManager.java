package design.pattern.creator.prototype.weekly.docExample;

import java.util.Hashtable;

public class PrototypeManager {
  private Hashtable<String, OfficialDocument> hashTable = new Hashtable<String, OfficialDocument>();

  private static class PrototypeManagerHolder {
    private static final PrototypeManager INSTANCE = new PrototypeManager();
  }

  private PrototypeManager() {
    hashTable.put("far", new FeasibilityDoc());
    hashTable.put("srs", new SoftwareRSDoc());
  }

  public static PrototypeManager getInstance() {
    return PrototypeManagerHolder.INSTANCE;
  }

  public void addOfficialDoc(String key, OfficialDocument doc) {
    hashTable.put(key, doc);
  }

  public OfficialDocument getOfficialDoc(String key) {
    return hashTable.get(key).clone();
  }
}
