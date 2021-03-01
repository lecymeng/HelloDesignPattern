package design.pattern.creator.builder;

public abstract class ActorBuilder {
  protected Actor actor = new Actor();

  public abstract void buildType();
  public abstract void buildFace();
  public abstract void buildSex();
  public abstract void buildCostume();
  public abstract void buildHairStyle();

  public Actor createActor() {
    return actor;
  }
}
