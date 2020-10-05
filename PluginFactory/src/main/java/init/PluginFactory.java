package init;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

final class PluginFactory {
    private static final Map<String, String> interfaceToImpl = new LinkedHashMap<>();

    static void init() throws Exception {
        Map<String, String> config = new LinkedHashMap<>();
        config.put(TimeSource.class.getName(), SystemClock.class.getName());
        //config.put(TimeSource.class.getName(), SystemClockAndDate.class.getName());
        interfaceToImpl.putAll(config);
    }

    <T> T instanceOf(Class<T> aInterface) throws
            ClassNotFoundException, InstantiationException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException, NoSuchMethodException,
            SecurityException {
        T result = null;
        for(String interfaceName : interfaceToImpl.keySet()) {
            if (interfaceName.equals(aInterface.getName())) {
                String implName = interfaceToImpl.get(interfaceName);
                Class<? extends T> implClass = (Class<? extends T>)Class.forName(implName);
                result = implClass.getDeclaredConstructor().newInstance();
            }
        }
        if (result == null) {
            throw new InstantiationException("The interface " + aInterface.getName() + " has no mapping to an impl.");
        }
        return result;
    }
}

