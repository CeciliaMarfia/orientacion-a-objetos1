package ar.edu.unlp.info.oo1.ejercicio18_filteredSet;
import java.util.*;

public class EvenNumberSet extends HashSet<Integer>{


		private static final long serialVersionUID = 1L;

		public void add(int number) {
			if (number % 2 == 0) {
				super.add(number);
			}
		}
		
}
