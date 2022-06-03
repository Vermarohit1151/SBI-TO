
public class InstrumentTest {
	public static void main(String[] args) {
//		MusicalInstrument mi = new MusicalInstrument();
//		StringBasedMusicalInstrument  sbmi = new StringBasedMusicalInstrument();
		Guitar g = new Guitar();
		g.play();
		g.tuneStrings();
		g.pluck();
		
	}
}
abstract class Instrument{
	abstract void use();
}

abstract class MusicalInstrument extends Instrument
{
	abstract void play();
}
abstract class MedicalInstrument extends Instrument{
	
}
abstract class StringBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneStrings();
}

abstract class AirBasedMusicalInstrument extends MusicalInstrument {
	abstract void checkAir();
}

abstract class DrumBasedMusicalInstrument extends MusicalInstrument{
	abstract void adjustTension(); 
}

abstract class SurgicalMedicalInstrument extends MedicalInstrument{
	abstract void operate();
}

abstract class PathalogicalMedicalInstrument extends MedicalInstrument{
	abstract void diagnose();
}

interface Plucking{
	void pluck();
}

interface Strumming{
	void strum();
}

class Guitar extends StringBasedMusicalInstrument implements Plucking, Strumming
{
	void tuneStrings() {
		System.out.println("Tuning the guitar strings....");
	}
	void play() {
		System.out.println("Playing guitar.....");
	}
	
	@Override
	void use() {
		System.out.println("Using guitar");
		
	}
	
	@Override
	public void strum() {
		System.out.println("Strumming the strings of guitar...");
		
	}
	
	@Override
	public void pluck() {
		System.out.println("Plucking the strings of the guitar....");
		
	}
}

interface Bowing{
	void bowing();
}



class Violin extends StringBasedMusicalInstrument implements Bowing, Strumming
{
	void tuneStrings() {
		System.out.println("Tuning the Violin strings....");
	}
	void play() {
		System.out.println("Playing Violin .....");
	}
	public void bowing() {
		System.out.println("Bowing the strings of the violin....");
	}
	@Override
	void use() {
		System.out.println("Using Violin....");
		
	}
	@Override
	public void strum() {
		System.out.println("Strumming the strings of violin...");
		
	}
}

interface Beating{
	void beat();
}

interface Tempo{
	void tempo();
}

class Dhol extends DrumBasedMusicalInstrument implements Beating,Tempo{
	
	
	
	@Override
	void adjustTension() {
		System.out.println("Adjusting tension of beater...");	
	}
	
	
	@Override
	public void tempo() {
		System.out.println("Changing tempo of tune...");
	}

	@Override
	public void beat() {
		System.out.println("Beating the dhol...");
		
	}


	@Override
	void play() {
		System.out.println("Playing Dhol...");
		
	}


	@Override
	void use() {
		System.out.println("Using Dhol...");
		
	}
	
}
interface Dissecting{
	void dissect();
}

class Scalpel extends SurgicalMedicalInstrument implements Dissecting{

	@Override
	void operate() {
		System.out.println("Scalpel is used to Operate...");
		
	}

	@Override
	void use() {
		System.out.println("Scalpel is being used as Medical Instrument");
		
	}

	@Override
	public void dissect() {
		System.out.println("Dissecting with scalpel...");
		
	}
	
}

interface MeasureBloodSugar{
	void measureSugar();
}

interface MeasureHeartRate{
	void measureHeartRate();
}
class Glucometer extends PathalogicalMedicalInstrument implements MeasureBloodSugar{

	@Override
	void diagnose() {
		System.out.println("Running Diagnostics with Glucometer...");
		
	}

	@Override
	void use() {
		System.out.println("Using Glucometer...");
		
	}
	@Override
	public void measureSugar() {
		System.out.println("checking blood sugar...");
		
	}
	

	
	
}

class ECGMachine extends PathalogicalMedicalInstrument implements MeasureHeartRate {
	
	@Override
	public void measureHeartRate() {
		System.out.println("Measuring heart rate....");
		
	}
	
	@Override
	void diagnose() {
		System.out.println("Running Diagnostics with ECG Machine");
		
	}

	@Override
	void use() {
		System.out.println("using ECG Machine");
		
	}
}