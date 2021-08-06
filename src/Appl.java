import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Appl {
    public static void main(String[] args) {

        List<Car> cars = Arrays.asList(new RenaultKadjar(), new BMW5Series(), new AudiS8(), new FordFocus(), new NissanQashqai(), new SkodaKaroq(), new VolkswagenCaddy(), new VolkswagenTiguan());
        List<User> users = Arrays.asList(new User("Vitalii", Color.BLACK, TypeOfGearbox.AUTOMATE), new User("Andriy", Color.GREY, TypeOfGearbox.MANUAL), new User("Danylo", Color.WHITE, TypeOfGearbox.AUTOMATE));

        for (Car car : cars) {
            for (User user : users) {
                if (car.getPrice() <= user.getSumm() && car.getColor().equals(user.getColor())) {
                    System.out.println(user.getName() + " can buy " + car.getName() + ". " + user.getName() + " have "
                            + user.getSumm() + ", and the price of " + car.getName() + " is " + car.getPrice() + ". The user want "
                            + user.getColor() + " color and the color of car is " + car.getColor() + ". ");

                }
                if (car.getPrice() >= user.getSumm() && car.getColor().equals(user.getColor())) {
                    System.out.println(user.getName() + " can`t buy " + car.getName() + ". " + user.getName() + " have "
                            + user.getSumm() + ", and the price of " + car.getName() + " is " + car.getPrice() + ". The user want "
                            + user.getColor() + " color and the color of car is " + car.getColor() + ". ");

                }


            }
        }
        System.out.println();
        for (Car car : cars) {
            for (User user : users) {
                if (car.getEngineVolume() == user.getEngineVolumeforUser()) {
                    System.out.println("Car " + car.getName() + " with engine " + car.getEngineVolume() + " and user "
                            + user.getName() + " want " + user.getEngineVolumeforUser());
                }
            }
        }

        System.out.println();
        for (Car car : cars) {
            for (User user : users) {
                if (car.getTypeOfGearbox() == user.getTypeOfGearbox()) {
                    System.out.println("Car " + car.getName() + " with gearbox " + car.getTypeOfGearbox() + " and user "
                            + user.getName() + " want " + user.getTypeOfGearbox());
                }
            }
        }

    }
}
