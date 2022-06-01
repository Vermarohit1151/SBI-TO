// Association Test
public class MobileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone s1 = new SmartPhone();
		//SOC newChip = new SOC();  // Has-A relationship
		s1.manufacture(154541212,"Xiaomi", "Bar", 4520, 48, "Mi 11X", "Android 11", 8);
		s1.printNewDevice();
	}

}

class CellularDevice{
	int IMEI;
	String Brand;
	String type;
	
}

class SmartPhone extends CellularDevice		//Is A relationship
{
	int batteryCapacity;
	//String chipsetModel;
	int cameraMP;
	String modelName;
	String operatingSystem;
	int memoryCapacity;
	
	String chipsetName, variant;
	int series,clockSpeed;
	
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public int getCameraMP() {
		return cameraMP;
	}
	public void setCameraMP(int cameraMP) {
		this.cameraMP = cameraMP;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public int getMemoryCapacity() {
		return memoryCapacity;
	}
	public void setMemoryCapacity(int memoryCapacity) {
		this.memoryCapacity = memoryCapacity;
	}
	public String getChipsetName() {
		return chipsetName;
	}
	public void setChipsetName(String chipsetName) {
		this.chipsetName = chipsetName;
	}
	public String getVariant() {
		return variant;
	}
	public void setVariant(String variant) {
		this.variant = variant;
	}
	public int getSeries() {
		return series;
	}
	public void setSeries(int series) {
		this.series = series;
	}
	public int getClockSpeed() {
		return clockSpeed;
	}
	public void setClockSpeed(int clockSpeed) {
		this.clockSpeed = clockSpeed;
	}
	
	
	
	public void printNewDevice() {
		System.out.println("Model Name :"+modelName);
		System.out.println("Brand      :"+Brand);
		System.out.println("IMEI       :"+IMEI);
		System.out.println("Battery    :"+batteryCapacity+"mAH");
		System.out.println("RAM        :"+memoryCapacity+"GB");
		System.out.println("Camera     :"+cameraMP+" MP");
		System.out.println("OS         :"+operatingSystem);
		System.out.println("Clock Speed:"+clockSpeed);
	}
	
	
	public SmartPhone() {
		
	}
	public SmartPhone manufacture(int IMEI, String Brand, String Type,int batteryCapacity,int cameraMP,String modelName,String operatingSystem,int memoryCapacity)
	{
		
		SmartPhone Alioth1013 = new SmartPhone();
		return Alioth1013;
		
	}
					
}

class SOC{
	public SOC(String chipsetName,String variant,int series,int clockSpeed){
	
	}
}


