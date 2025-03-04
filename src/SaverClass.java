import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SaverClass {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
    TextContainer textContainer = new TextContainer();
    Class<?> cls = textContainer.getClass();
    SaveTo annotation = cls.getAnnotation(SaveTo.class);
    for(Method method : cls.getDeclaredMethods()) {
        if (method.isAnnotationPresent(Saver.class)) {
            String param1 = annotation.param();
            method.invoke(textContainer, param1);
            System.out.println("Method completed!");
          }
       }
    }
}
