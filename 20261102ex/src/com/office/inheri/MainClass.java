package com.office.inheri;

import com.office.inheri.restaurant.ChildRestaurant;

public class MainClass {

	public static void main(String[] args) {
		
//		ParentRestaurant parentRestaurant = new ParentRestaurant();
//		parentRestaurant.makeJajang();
//		parentRestaurant.makeJjamppong();
		
		ChildRestaurant childRestaurant = 
				new ChildRestaurant();
		childRestaurant.makeJajang(ChildRestaurant.CHILD_MENU);	// true: 아들꺼 false: 아빠꺼
		childRestaurant.makeJjamppong();
		childRestaurant.makeBokkeumbap();
		childRestaurant.makeTangsuyuk();
		
		
	}
	
}
