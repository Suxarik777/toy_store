import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class StoreToy {

    private List<Toys> toys;

    public StoreToy(List<Toys> toys) {
        this.toys = toys;
    }

    public Toys getToyPrice() {
        RandomSuccessfullyToy random = new RandomSuccessfullyToy();
        Toys toy = random.chooseOnWeight(toys);
        return toy;
    }


    public void saveLottery() {
        Toys toy = getToyPrice();
        String text;
        text = toy.toString();
        try(FileWriter writer = new FileWriter("Toys.txt", true))
        {
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        toys.remove(toy);
    }
}
