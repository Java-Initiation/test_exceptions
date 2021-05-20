package testexceptions;

public class TestReflectionUtils {

    public static void main(String[] args) {

        Pays pays = new Pays("PaysTest", 3000, 8000);

        try {
            ReflectionUtils.afficherAttributs(pays);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
