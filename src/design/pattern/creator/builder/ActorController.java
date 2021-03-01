package design.pattern.creator.builder;

public class ActorController {
  public Actor construct(ActorBuilder builder) {
    builder.buildType();
    builder.buildFace();
    builder.buildSex();
    builder.buildCostume();
    builder.buildHairStyle();

    return builder.createActor();
  }
}
