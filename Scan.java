import java.util.ArrayList;
import java.util.Collections;

public class Scan {
    
    private int firstValue;
    private int routeLength;
    private ArrayList<Integer> right;
    private ArrayList<Integer> left;
    private ArrayList<Integer> route;
    private int[] array;

    public Scan(int[] array) {
        this.array = array;
        this.firstValue = array[0];
        this.right = new ArrayList<>();
        this.left = new ArrayList<>();
        this.route = new ArrayList<>();
        this.routeLength = 0;
        sortingRightSide();
        sortingLeftSide();
        route();
        setRouteLength();
    }

    private void setRouteLength() {
        for(int i = 0; i < route.size() - 1; i++) {
            if(this.route.get(i) < this.route.get(i + 1)) {
                this.routeLength = this.routeLength + (this.route.get(i + 1) - this.route.get(i));
            } else {
                this.routeLength = this.routeLength + (this.route.get(i) - this.route.get(i + 1));
            }
        }
    }    

    private void route() {
        this.route.add(this.firstValue);
        for(int i = 0; i < this.right.size(); i++) {
            this.route.add(this.right.get(i));
        }

        for(int j = this.left.size() - 1; j >= 0; j = j - 1) {
            this.route.add(this.left.get(j));
        }
    }

    private void sortingRightSide() {
        for(int i = 0; i < array.length; i++) {
            if(firstValue < array[i]) {
                right.add(array[i]);
            }
        }
        if(this.right.get(this.right.size() - 1) != 99) {
            this.right.add(99);
        }
        Collections.sort(right);
    }

    private void sortingLeftSide() {
        for(int i = 0; i < array.length; i++) {
            if(firstValue > array[i]) {
                left.add(array[i]);
            }
        }
        Collections.sort(left);    
    }

    public void print2DArray() {
        System.out.println("  0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789");
        for(int i = 0; i < this.route.size(); i++) {
            System.out.print(i + 1);
            if((i + 1) < 10) {
                System.out.print(" ");
            }
            for(int j = 0; j < 100; j++) {                
                if(route.get(i) == j) {
                    System.out.print("O");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

    public int getFirstValue() {
        return this.firstValue;
    }

    public int getRouteLength() {
        return this.routeLength;
    }

    public ArrayList<Integer> getRight() {
        return right;
    }

    public ArrayList<Integer> getLeft() {
        return left;
    }

    public ArrayList<Integer> getRoute() {
        return this.route;
    }
}
