package lab02;

public class Cart {
	private int qtyOrdered = 0;
	private static final int MAX_NUMBERS_ORDERED = 20;
	private final DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	public Cart() {
		
	}
	
	public int getqtyOrdered() {
        return qtyOrdered;
    }
	
	//de private lai bao loi =((
	public void setqtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }
	
	void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered <= 20) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered ++;
            System.out.println("The disc has been added"); 
        } else System.out.println("The cart is almost full"); 
    }
	
	void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int count = qtyOrdered;
        DigitalVideoDisc currentDisc = null;
        for (int i = 0; i < qtyOrdered; i++) {
            currentDisc = itemsOrdered[i];
            if (currentDisc == disc) {
                for (int j = i + 1; j < qtyOrdered; j++) {
                    itemsOrdered[j - 1] = itemsOrdered[j];
                }
                itemsOrdered[qtyOrdered] = null;
                qtyOrdered --;
            }
        }
        if (qtyOrdered != count) System.out.println((count - qtyOrdered) + " item(s) has/have been removed.");
        else System.out.println("Can't found item."); 
    }

	public double totalCost() {
        if (qtyOrdered <= 0) return 0;
        double cost = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            cost += itemsOrdered[i].getCost();
        }
        return cost;
    }
	
	public void displayCart() {
		if (qtyOrdered <= 0) System.out.println("Nothing");
		else {
			for (int i = 0; i < qtyOrdered; i++) {
				itemsOrdered[i].printDetail();
			}
		}
	}
}
