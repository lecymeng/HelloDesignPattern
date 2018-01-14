package design.pattern.creator.builder;

public class BuilderClient {
    public static void main(String[] args) {
        ActorController ac = new ActorController();
        ActorBuilder actorBuilder = new HeroBuilder();
        Actor actor = ac.construct(actorBuilder);

        System.out.println("角色类型：" + actor.getType() + "\n");
        System.out.println("长相：" + actor.getFace() + "\n");
        System.out.println("性别：" + actor.getSex() + "\n");
        System.out.println("穿着：" + actor.getCostume() + "\n");
        System.out.println("发型：" + actor.getHairStyle());
    }
}
