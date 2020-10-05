package init;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello there - General Kenobi");
        PluginFactory pluginFactory = new PluginFactory();
        try {
            pluginFactory.init();
            TimeSource timeSource = pluginFactory.instanceOf(TimeSource.class);
            System.out.println("The time is: " + timeSource.currentTimeMillis());
        } catch (Exception e) {
            System.out.println("There is something wrong with your plugins!");
        }
    }
}
