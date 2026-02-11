package StringOps;
import java.util.Arrays;
import java.util.List;
public class AlphanumericCodes {
    public static void main(String[] args) {
        List<String> Packages = Arrays.asList("H110-S", "M25-F", "L02-X", "H60-X", "M40-S");
        System.out.println(Packages);
        processPackages(Packages);
    }
    private static void processPackages(List<String> packages) {
        for (String code : packages) {
            char prefix = code.charAt(0);
            String[] part = code.split("-");
            int number = Integer.parseInt(part[0].substring(1));
            char suffix = part[1].charAt(0);
            //---->Critical Statement
            if (prefix == 'H' && suffix == 'X') {
                System.out.println("Packages contains both heavy and hazardous");
                System.out.println("!!Error System ShutDown!!");
                break;
            }
            //----->Weight Constraints
            StringBuilder Status = new StringBuilder();
            if (prefix == 'H' && number > 50) {
                Status.append("Rejected: Too Heavy");
            } else if (prefix == 'L' && number < 5) {
                Status.append("Rejected: Too Small");
            } else {
                Status.append("Weight Accepted");
            }
            //----->Shipping Priority
            if (number % 10 == 0) {
                Status.append("-> Premium Shipping");
            }
            //------>Safety Protocols
            if (suffix == 'F') {
                Status.append("-> Special Handling");
            } else if (suffix == 'X') {
                Status.append("-> Hazardous Flagged");
            }
            // Code and Status 
            System.out.println(code + "->" + Status);
        }
    }
}
