package mn.icode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SensorTest {

	@Test
	public void testTemperaturSensor() {
		TemperatureSensor sensor = new TemperatureSensor(46);

		Assertions.assertEquals(sensor.readValue(), 46);
		Assertions.assertEquals(sensor.unit(), "°C");
	}

	@Test
	public void testPressureSensor() {
		PressureSensor sensor = new PressureSensor(35);

		Assertions.assertEquals(sensor.readValue(), 35);
		Assertions.assertEquals(sensor.unit(), "hPa");
	}

	@Test
	public void testHumiditySensor() {
		HumiditySensor sensor = new HumiditySensor(36);

		Assertions.assertEquals(sensor.readValue(), 36);
		Assertions.assertEquals(sensor.unit(), "%");
	}

}
