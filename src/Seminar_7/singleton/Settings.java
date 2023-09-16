package Seminar_7.singleton;

public class Settings {

    public static Settings getInstance() {
        if (instance == null) {
            instance = new Settings();

            //TODO: Получим настройки, проинициализируем поля объекта
        }
        return instance;
    }

    private Settings(String param1, int param2, boolean param3) {
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
    }


    private Settings() {
    }

    public String getParam1() {
        return param1;
    }

    public int getParam2() {
        return param2;
    }

    public boolean isParam3() {
        return param3;
    }

    private static Settings instance;

    private String param1;

    private int param2;

    private boolean param3;

}
