package maps;

public class GoogleStaticMaps {
	public static String getStaticMapURL(String latitude, String longitude) {
		String imageUrl = null;
		try {
			imageUrl = "https://maps.googleapis.com/maps/api/staticmap?center=" 
						+ latitude 
						+ "," 
						+ longitude
						+ "&zoom=15&size=350x250&key=AIzaSyAerudiODqyJdKXcFjS3k82-7jD9ijSZxE";
//https://maps.googleapis.com/maps/api/staticmap?center=40.714%2c%20-73.998&zoom=12&size=400x400&key=AIzaSyAerudiODqyJdKXcFjS3k82-7jD9ijSZxE

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return imageUrl;

	}
}