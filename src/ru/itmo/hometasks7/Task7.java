package ru.itmo.hometasks7;
import java.io.FileNotFoundException;
import java.nio.file.*;
import java.util.jar.JarException;

public class Task7 {
    public enum Status {
        FILE_NOT_FOUND, ACCESS_DENIED, JAR_ERROR
    }
    static void throwException(Status status) throws FileNotFoundException, AccessDeniedException, JarException {
        if (status == Status.FILE_NOT_FOUND) System.out.println("FileNotFoundException");
        if (status == Status.ACCESS_DENIED) System.out.println("AccessDeniedException");
        if (status == Status.JAR_ERROR) System.out.println("JarException");
}

    public static void main(String[] args) throws FileNotFoundException, AccessDeniedException, JarException {

  try { throwException(Status.FILE_NOT_FOUND);
    } catch (FileNotFoundException status) {
        status.printStackTrace();}

  try { throwException(Status.ACCESS_DENIED);
        } catch (AccessDeniedException status) {
            status.printStackTrace();
      System.out.println("Обработка RuntimeException" + status.getMessage());}

  try { throwException(Status.JAR_ERROR);
        } catch (JarException status) {
            status.printStackTrace();}
}
}
