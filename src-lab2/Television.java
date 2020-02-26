/**
 * The purpose of this class is to model a television
 * @author Yuehong Zhang 3109345 2019-01-18
 */
public class Television {

	private String MANUFACTURER;// The brand name
	private int SCREEN_SIZE;//// The size of the television screen
	private boolean powerOn;// Represent if the power is on or off.
	private int channel;// Value of the channel station that the television is showing
	private int volume;// A number value representing the loudness

	/**
	   The constructor set manufacturer's name as brand, and screen size as screenSize.
	   The initialized power state is off, the volume is 20, and the channel is 2.
	   @param brand      The MANUFACTURER.
	   @param screenSize The SCREEN_SIZE.
	 */
	public Television(String brand, int screenSize) {
		MANUFACTURER = brand;
		SCREEN_SIZE = screenSize;
		powerOn = false;
		volume = 20;
		channel = 2;
	}

	/**
	   The getVolume method returns the value of volume. 
	   @return The value in the volume field.
	 */
	public int getVolume() {
		return volume;
	}

	/**
	   The getChannel method returns the value of channel.
	   @return The value in the channel field.
	 */
	public int getChannel() {
		return channel;
	}

	/**
	   The getManufacturer method returns the name of manufacturer.
	   @return The value in the MANUFACTURER field.
	 */
	public String getManufacturer() {
		return MANUFACTURER;
	}

	/**
	   The getScreenSize method returns the size of the screen.
	   @return The value in the SCREEN_SIZE field.
	 */
	public int getScreenSize() {
		return SCREEN_SIZE;
	}

	/**
	   The setChannel method returns the value of the channel.
	   @param station The value to store in the channel field.
	 */
	public void setChannel(int station) {
		channel = station;
	}

	/**
	   The power method changes the power state from true to false or from false to
	   true.
	 */
	public void power() {
		powerOn = !powerOn;
	}

	/**
	   The increaseVolume method will increase the volume by 1
	 */
	public void increaseVolume() {
		volume++;
	}

	/**
	   The decreaseVolume method will decrease the volume by 1
	 */
	public void decreaseVolume() {
		volume--;
	}
}
