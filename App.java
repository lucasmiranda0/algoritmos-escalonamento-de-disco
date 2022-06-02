public class App {

    public static void main(String[] args) {
        ArrayGenerator arrayGenerator = new ArrayGenerator();
        int[] array = arrayGenerator.generateNumber();
                
        System.out.println("SCAN");
        Scan scan = new Scan(array);        
                                
        for (int i : scan.getRoute()) {
            System.out.print(i + " ");
        }
        
        System.out.println();

        System.out.println("Route length: " + scan.getRouteLength());
        scan.print2DArray();
        

        System.out.println();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        
        System.out.println("LOOK");
        Look look = new Look(array);        
                                
        for (int i : look.getRoute()) {
            System.out.print(i + " ");
        }
        
        System.out.println();
        System.out.println("Route length: " + look.getRouteLength());
        look.print2DArray();
        
    }
}