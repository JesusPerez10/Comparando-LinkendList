package umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios;
import java.util.*;

public class EjercicioLinkedList {
	// Problema 1: Eliminar duplicados dejando solo la primera aparición
	public static void removeDuplicates(LinkedList<Integer> list) {
		Set<Integer> seen = new HashSet<>();
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			Integer num = iterator.next();
			if (!seen.add(num)) {
				iterator.remove();
			}
		}
	}

	// Problema 2: Invertir la lista sin usar otra estructura de datos
	public static void reverseLinkedList(LinkedList<String> list) {
		ListIterator<String> left = list.listIterator();
		ListIterator<String> right = list.listIterator(list.size());
		int mid = list.size() / 2;
		for (int i = 0; i < mid; i++) {
			String temp = left.next();
			left.set(right.previous());
			right.set(temp);
		}
	}

	// Problema 3: Intercalar dos listas ordenadas en una nueva lista ordenada
	public static LinkedList<Integer> mergeSortedLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		LinkedList<Integer> mergedList = new LinkedList<>();
		Iterator<Integer> it1 = list1.iterator();
		Iterator<Integer> it2 = list2.iterator();
		Integer num1 = it1.hasNext() ? it1.next() : null;
		Integer num2 = it2.hasNext() ? it2.next() : null;

		while (num1 != null || num2 != null) {
			if (num1 == null) {
				mergedList.add(num2);
				num2 = it2.hasNext() ? it2.next() : null;
			} else if (num2 == null) {
				mergedList.add(num1);
				num1 = it1.hasNext() ? it1.next() : null;
			} else if (num1 <= num2) {
				mergedList.add(num1);
				num1 = it1.hasNext() ? it1.next() : null;
			} else {
				mergedList.add(num2);
				num2 = it2.hasNext() ? it2.next() : null;
			}
		}
		return mergedList;
	}

	public static void main(String[] args) {
		// Prueba del Problema 1
		LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 2, 3, 2, 4, 1, 5));
		removeDuplicates(list1);
		System.out.println("Lista sin duplicados: " + list1);

		// Prueba del Problema 2
		LinkedList<String> list2 = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
		reverseLinkedList(list2);
		System.out.println("Lista invertida: " + list2);

		// Prueba del Problema 3
		LinkedList<Integer> sortedList1 = new LinkedList<>(Arrays.asList(1, 3, 5, 7));
		LinkedList<Integer> sortedList2 = new LinkedList<>(Arrays.asList(2, 4, 6, 8));
		LinkedList<Integer> mergedList = mergeSortedLists(sortedList1, sortedList2);
		System.out.println("Lista intercalada ordenada: " + mergedList);
	}
}


