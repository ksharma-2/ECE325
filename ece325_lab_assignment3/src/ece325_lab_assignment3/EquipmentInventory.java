package ece325_lab_assignment3;

import java.util.ArrayList;

public class EquipmentInventory {
	// your inventory of items
	ArrayList<InventoryItem> inventory;

	public EquipmentInventory() {
	}

	/**
	 * Stow equipment into the trunk of the bus. Note: every type of equipment
	 * should only occur once in the inventory. Make sure to check if you are not
	 * accidentally taking someone else's equipment.
	 * 
	 * @param equip  The type of equipment to stow
	 * @param number The number of items to stow
	 */
	public void addEquipmentToBus(Equipment equip, int number) {
		InventoryItem item = new InventoryItem(equip, number);
		inventory.add(item);
		inventory.get(inventory.indexOf(item)).addToBus(number);
	}

	/**
	 * Add equipment to your inventory. Note: every type of equipment
	 * should only occur once in the inventory. Whenever you acquire new
	 * equipment, it is always outside the bus. 
	 * 
	 * @param equip  The type of equipment to add to your inventory
	 * @param number The number of items to add
	 */
	public void addEquipmentToInventory(Equipment equip, int number) {
		InventoryItem item = new InventoryItem(equip, number);
		if (!inventory.contains(item)){
			inventory.add(item);
		}	
	}

	
	/**
	 * Returns a list of items that are still missing from the bus. 
	 * @return List of missing items.
	 */
	public ArrayList<InventoryItem> getMissingItems() {
		ArrayList<InventoryItem> missingItems = new ArrayList<InventoryItem>();

		for(int i = 0; i < inventory.size(); i++){
			if (inventory.get(i).getInBus() < inventory.get(i).getInInventory()){
				missingItems.add(inventory.get(i));
			}
		}

		return missingItems;
	}

	/**
	 * Returns a list of items that still need wrapping. Note that these items might still 
	 * be (partially) missing from the bus too. 
	 * @return List of items that still need to be wrapped.
	 */
	public ArrayList<InventoryItem> getNeedsWrappingItems() {
		ArrayList<InventoryItem> needsWrapping = new ArrayList<InventoryItem>();

		for (int i = 0; i < inventory.size(); i++){
			if(!inventory.get(i).needsWrapping()){
				needsWrapping.add(inventory.get(i));
			}
		}

		return needsWrapping;

	}

	/**
	 * Wrap items of the same type as e.
	 * @param The type of equipment you want to wrap. 
	 */
	public void wrapItems(Equipment e) {
		inventory.get(inventory.indexOf(e));
	}

	/** 
	 * Returns a string representation of the inventory.
	 */
	public String toString() {

	}

	/** 
	 * Returns true iff the inventory is complete, wrapped and you are ready to go.
	 * @return true iff inventory is complete and wrapped
	 */
	public boolean getReadyToGo() {

	}

	public static void main(String[] args) {
		
		EquipmentInventory myInv = new EquipmentInventory();
		//Add 2 microphones, 4 guitars and 12 chairs to Equipment Inventory
		
		/*
		 * Fill out code here
		 */

		System.out.println(myInv);

		System.out.println("Printing missing items: ");
		ArrayList<InventoryItem> missing = myInv.getMissingItems();
		System.out.println(missing);

		System.out.println("Printing items that need wrapping: ");
		ArrayList<InventoryItem> needsWrapping = myInv.getNeedsWrappingItems();
		System.out.println(needsWrapping);
		
		//Try to add 15 chairs to bus
		
		/*
		 * Fill out code here
		 */
		
		System.out.println(myInv);

		System.out.println(myInv.getReadyToGo());
		
		//Try to add 4 guitars and 2 microphones to bus
		
		/*
		 * Fill out code here
		 */
		
		System.out.println(myInv.getReadyToGo());

		//Wrap items that need wrapping but have not been wrapped yet

		/*
		 * Fill out code here
		 */

		System.out.println(myInv.getReadyToGo());
		
	}
}
