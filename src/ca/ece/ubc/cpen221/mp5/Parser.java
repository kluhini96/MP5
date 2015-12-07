package ca.ece.ubc.cpen221.mp5;

public class Parser {

	public String getName(String jsonString) {
		String name = null;
		int start, end;
		
		for (int i = 0; i < RestaurantDB.Restaurantsize(); i++) {
			if (RestaurantDB.getRes().get(i).contains(jsonString)) {
				name = RestaurantDB.getRes().get(i);
				start = name.indexOf("name");
				end = name.indexOf("categories");
				name.substring(start + 8, end -4);
			}
		}

		return name;

	}

	public static String getID(String name) {
		String ID = null;
		int start;

		for (int i = 0; i < RestaurantDB.Restaurantsize(); i++) {
			if (RestaurantDB.getRes().get(i).contains(name)) {
				ID = RestaurantDB.getRes().get(i);
				start = ID.indexOf("id");
				ID.substring(start + 6, start + 28);
			}
		}

		return ID;
	}
	
	public static double getLongitude(String name){ //x value 
		String longitude = null;
		int start,end;
		
		for (int i = 0; i < RestaurantDB.Restaurantsize(); i++) {
			if (RestaurantDB.getRes().get(i).contains(name)) {
				longitude = RestaurantDB.getRes().get(i);
				start = longitude.indexOf("longitude");
				end = longitude.indexOf("neighborhoods");
				longitude.substring(start + 12, end -3);
			}
		}

		return Double.parseDouble(longitude);

	}
	
	public static double getLatitude(String name){ //y value 
		String latitude = null;
		int start,end;
		
		for (int i = 0; i < RestaurantDB.Restaurantsize(); i++) {
			if (RestaurantDB.getRes().get(i).contains(name)) {
				latitude = RestaurantDB.getRes().get(i);
				start = latitude.indexOf("latitude");
				end = latitude.indexOf("price");
				latitude.substring(start + 11, end -3);
			}
		}

		return Double.parseDouble(latitude);

	}
		
	public static String getNamefromID(String ID) {
		String name = null;
		int start,end;

		for (int i = 0; i < RestaurantDB.Restaurantsize(); i++) {
			if (RestaurantDB.getRes().get(i).contains(ID)) {
				name = RestaurantDB.getRes().get(i);
				start = name.indexOf("name");
				end = name.indexOf("categories");
				name.substring(start + 8, end -4);
			}
		}

		return name;
	}	
	
	
	public static String getRating(String name) {
		String rating = null;
		int start;

		for (int i = 0; i < RestaurantDB.Restaurantsize(); i++) {
			if (RestaurantDB.getRes().get(i).contains(name)) {
				rating = RestaurantDB.getRes().get(i);
				start = rating.indexOf("stars");
				rating.substring(start + 8, start + 11);
			}
		}

		return rating;
	}
	
	public static String getPrice(String name) {
		String price = null;
		int start;

		for (int i = 0; i < RestaurantDB.Restaurantsize(); i++) {
			if (RestaurantDB.getRes().get(i).contains(name)) {
				price = RestaurantDB.getRes().get(i);
				start = price.indexOf("price");
				price.substring(start + 8, start + 9);
			}
		}

		return price;
	}
	
	public static String getCategory(String name) {
		String category = null;
		int start;
		int end;

		for (int i = 0; i < RestaurantDB.Restaurantsize(); i++) {
			if (RestaurantDB.getRes().get(i).contains(name)) {
				category = RestaurantDB.getRes().get(i);
				start = category.indexOf("category");
				end  = category.indexOf("state");
				category.substring(start + 15, end -5);
			}
		}

		return category;
	}


}




