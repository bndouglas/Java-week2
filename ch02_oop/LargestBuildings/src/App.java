import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<LargestVolume> largestVolumeList = new ArrayList<LargestVolume>();

        largestVolumeList.add(new LargestVolume(1,"Boeing Everett Factory","United States","Everet, Washington", 1967,398000));
        largestVolumeList.add(new LargestVolume(2,"Giga Texas","United States","Austin, Texas", 2022,9570000));
        largestVolumeList.add(new LargestVolume(3,"Jean-Luc Lagardier Plant","France","Toulouse-Blagnac", 2004,5600000));
        
        System.out.print("Choose a Largest Building by top 10 position > ");
        Scanner scanner = new Scanner(System.in);

        String response = scanner.nextLine();
        Integer selectedBuilding = Integer.parseInt(response);

        for(LargestVolume largeBuilding:largestVolumeList){
            if(largeBuilding.rank == selectedBuilding){
                System.out.println("You selected >>> " + largeBuilding.name + " in " + largeBuilding.place);
            }
        }
    }
}
