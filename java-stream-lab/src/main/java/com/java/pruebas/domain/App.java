package com.java.pruebas.domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class App {

	// Recorremos la colección con un bucle for
	private static void iterateVectorByFor(List<Bill> billList) {

		for (int i = 0; i < billList.size(); i++) {
			System.out.println(billList.get(i));
		}
	}

	// Recorremos la colección con un bucle for sin contador
	private static void iterateVectorByForE(List<Bill> billList) {

		for (Bill singleBill : billList) {
			System.out.println(singleBill);
		}
	}

	// Recorremos la colección con un bucle forEach y una expresión lambda
	private static void iterateVectorByForEachLambda(List<Bill> billList) {

		billList.forEach(singleBill -> System.out.println(singleBill));
	}

	// Recorremos la colección con un stream y contamos el número de elementos
	private static void iterateStream(List<Bill> billList) {

		Stream<Bill> billStream = billList.stream();
		long billCount = billStream.count();

		System.out.println("Bill count: " + billCount);
	}

	// Recorremos la colección con un stream, un forEach y una lambda
	private static void iterateStreamByForEach(List<Bill> billList) {

		Stream<Bill> billStream = billList.stream();
		billStream.forEach(singleBill -> System.out.println(singleBill));
	}

	// Recorremos la colección con un stream, un filtro y un forEach
	private static void iterateStreamByFilterForEach(List<Bill> billList) {

		Stream<Bill> billStream = billList.stream();
		billStream.filter(singleBill -> singleBill.getTotal() > 200)
				.forEach(singleBill -> System.out.println(singleBill));
	}

	// Recorremos la colección con un stream, concatenando filtros
	private static void iterateStreamFilterConcatenate(List<Bill> billList) {

		Stream<Bill> billStream = billList.stream();
		int clientIdSsearch = 3;

		billStream.filter(singleBill -> singleBill.getTotal() > 200)
				.filter(singleBill -> singleBill.getClient().getId() == clientIdSsearch)
				.forEach(singleBill -> System.out.println(singleBill));
	}

	// Recorremos la colección con un stream, múltiples filtros y expresiones lambda
	private static void iterateStreamFilterConcatenateMultipleLines(List<Bill> billList) {

		Stream<Bill> billStream = billList.stream();
		int clientIdSsearch = 3;

		billStream.filter(singleBill -> {
			System.out.println("1: " + singleBill);
			return singleBill.getTotal() > 130;

		}).filter(singleBill -> {
			System.out.println("2: " + singleBill);
			return singleBill.getClient().getId() == clientIdSsearch;

		}).forEach(singleBill -> System.out.println("3: " + singleBill));
	}

	// Recorriendo una coleccion de datos(stream to iterator)
	private static void iterateStreamFilterToIterator(List<Bill> billList) {
		Stream<Bill> billStream = billList.stream();

		Iterator<Bill> it = billStream.filter(singleBill -> {
			System.out.println("1:" + singleBill);
			return singleBill.getTotal() > 130;
		}).iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	// Recorriendo una coleccion de datos(stream -> allMatch)
	public static void iterateStreamAllMatch(List<Bill> billList) {
		Stream<Bill> billStream = billList.stream();
		boolean matchOk = false;

		matchOk = billStream.allMatch(singleBill -> singleBill.getTotal() > 200);
		System.out.println("All bills have > 200$: " + matchOk);
	}

	// Recorriendo una coleccion de datos(stream -> anyMatch)
	public static void iterateStreamAnyMatch(List<Bill> billList) {
		Stream<Bill> billStream = billList.stream();
		boolean matchOk = false;

		matchOk = billStream.anyMatch(singleBill -> singleBill.getTotal() > 200);
		System.out.println("All bills have > 200$: " + matchOk);
	}

	// Obteniendo maximo (Interfaz comparator)
	public static void comparatorStreamMax(List<Bill> billList) {
		Stream<Bill> billStream = billList.stream();

		Comparator<Bill> comparatorLambda = new Comparator<Bill>() {
			public int compare(Bill bill1, Bill bill2) {
				return bill1.getTotal().intValue() - bill2.getTotal().intValue();
			}
		};
		Optional<Bill> billMax = billStream.max(comparatorLambda);

		if (billMax.isPresent()) {
			System.out.println("Bill max: " + billMax.get().getId());
		}

	}

	// Obteniendo minimo (Interfaz comparator)
	public static void comparatorStreamMin(List<Bill> billList) {
		Stream<Bill> billStream = billList.stream();

		Comparator<Bill> comparatorLegacyMode = new Comparator<Bill>() {
			public int compare(Bill bill1, Bill bill2) {
				return bill1.getTotal().intValue() - bill2.getTotal().intValue();
			}
		};
		Optional<Bill> billMin = billStream.min(comparatorLegacyMode);

		if (billMin.isPresent()) {
			System.out.println("Bill min: " + billMin.get().getId());
		}

	}

	public static void streamSkipForEach(List<Bill> billList) {

		Stream<Bill> billStream = billList.stream();

		billStream.skip(3).forEach(singleBill -> System.out.println(singleBill));
	}

	public static void main(String[] args) {

		Client c1 = new Client(1, "C1", "D1", "T1");
		Client c2 = new Client(2, "C2", "D2", "T2");
		Client c3 = new Client(3, "C3", "D3", "T3");

		List<Bill> bills = new ArrayList<Bill>();
		Bill f1 = new Bill(1, "FAC-1", c1, 100D);
		Bill f2 = new Bill(2, "FAC-2", c2, 200D);
		Bill f3 = new Bill(3, "FAC-3", c3, 300D);

		bills.add(f1);
		bills.add(f2);
		bills.add(f3);
		bills.add(new Bill(4, "FAC-4", c1, 125D));
		bills.add(new Bill(5, "FAC-5", c2, 200D));
		bills.add(new Bill(6, "FAC-6", c3, 275D));
		bills.add(new Bill(7, "FAC-7", c1, 150D));
		bills.add(new Bill(8, "FAC-8", c2, 200D));
		bills.add(new Bill(9, "FAC-9", c3, 250D));

		// App.iterateVectorByFor(bills);
		// App.iterateVectorByForE(bills);
		// App.iterateVectorByForEachLambda(bills);
		// App.iterateStream(bills);
		// App.iterateStreamByForEach(bills);
		// App.iterateStreamByFilterForEach(bills);
		// App.iterateStreamFilterConcatenate(bills);
		// App.iterateStreamFilterConcatenateMultipleLines(bills);
		// App.iterateStreamFilterToIterator(bills);
		// App.iterateStreamAllMatch(bills);
		// App.iterateStreamAnyMatch(bills);
		// App.comparatorStreamMax(bills);
		// App.comparatorStreamMin(bills);

		App.streamSkipForEach(bills);
	}

}
