public class BuildingAndSchool {
    public static void main(String[] args) {
        Building school = getSchool();
        Building shop = getBuilding();

        System.out.println(school);
        System.out.println(shop);
    }

    public static Building getSchool() {
        //измените null на объект класса Building или School

        return new School();
    }

    public static Building getBuilding() {
        //измените null на объект класса Building или School
        return new Building();
    }

    public static class School extends Building/*Добавьте сюда ваш код*/ {

        @Override
        public String toString() {
            return "School";
        }
    }

    static class Building /*Добавьте сюда ваш код*/ {

        @Override
        public String toString() {
            return "Building";
        }
    }
}