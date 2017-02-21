import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		Stream<CPU> streamCPU = Stream.of(new CPU("Intel", "i5 551","1151", 34.90, 4),
											new CPU("Intel", "i3 221","1150", 32.80, 2),
											new CPU("Intel", "i5 578","1151", 32.90, 4),
											new CPU("Intel", "i7 757","1151", 40.90, 4),
											new CPU("AMD", "FM2 2589","FM2+", 32.80, 4),
											new CPU("AMD", "FM2 8952","FM2+", 28.10, 2),
											new CPU("AMD", "FM2 5126","FM2+", 34.90, 4));
		
		Map<String, List<CPU>> cpuMap = streamCPU.collect(Collectors.groupingBy(CPU::getBrand));
		
		for (Map.Entry<String, List<CPU>> item : cpuMap.entrySet()) {
			
			System.out.println("Brand: " + item.getKey());
			System.out.println("");
			
			for (CPU cpu : item.getValue()) {
				System.out.println("Model: " + cpu.getModel());
				System.out.println("Soket: " + cpu.getSoket());
				System.out.println("Power: " + cpu.getPower());
				System.out.println("Cores: " + cpu.getCores());
				System.out.println("");
			}
			System.out.println("");
			System.out.println("");
		}

	}

}
