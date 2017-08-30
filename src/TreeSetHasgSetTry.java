import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetHasgSetTry implements Comparator<TreeSet<String>> ,Comparable<String>{

	public static void main(String[] args) {
		// TreeMap<Integer, TreeMap<String, Integer>> map = new
		// TreeMap<Integer,TreeMap<String, Integer>>();
		// TreeMap<String, Integer> inner = new TreeMap<String, Integer>();
		//
		// inner.put("kolio 1 ", 5);
		// inner.put("kolio 2 ", 4);
		// inner.put("kolio 3 ", 3);
		// inner.put("kolio 0 ", 2);
		// inner.put("kolio 5 ", 1);
		// map.put(1, inner);
		//// map.put(2, "vtore opit");
		//// map.put(3, "treto opit");
		//// map.put(4, "chetv opit");
		//// map.put(5, "pet opit");
		//// map.put(6, "shest opit");
		// System.out.println(map);
		//
		// System.out.println( map.get(1).containsKey("kolio 0 "));
		// for (Entry<Integer, TreeMap<String , Integer>> entr : map.entrySet())
		// {
		// System.out.println("key " + entr.getKey());
		// for (Entry<String , Integer> entr2 : entr.getValue().entrySet()) {
		// System.out.println(" key " + entr2.getKey());
		// System.out.println(" value " + entr2.getValue());
		//
		// }
		//
		// }

		// HashMap<Integer, HashMap<String, Integer>> map = new HashMap<Integer,
		// HashMap<String, Integer>>();
		// HashMap<String, Integer> inner = new HashMap<String, Integer>();
		//
		// inner.put("kolio 1 ", 5);
		// inner.put("kolio 2 ", 4);
		// inner.put("kolio 3 ", 3);
		// inner.put("kolio 0 ", 211111);
		// inner.put(new String("kolio 0 "), 2222);
		// inner.put("kolio 5 ", 1);
		// map.put(1, inner);
		//// map.put(2, "vtore opit");
		//// map.put(3, "treto opit");
		//// map.put(4, "chetv opit");
		//// map.put(5, "pet opit");
		//// map.put(6, "shest opit");
		// System.out.println(map);
		//
		// System.out.println( map.get(1).containsKey("kolio 0 "));
		// for (Entry<Integer, HashMap<String , Integer>> entr : map.entrySet())
		// {
		// System.out.println("key " + entr.getKey());
		// for (Entry<String , Integer> entr2 : entr.getValue().entrySet()) {
		// System.out.println(" key " + entr2.getKey());
		// System.out.println(" value " + entr2.getValue());
		//
		// }
		//
		// }

		 TreeSet<TreeSet<String>> map = new TreeSet<TreeSet<String>>();
		TreeSet<String> inner = new TreeSet<String>();
		TreeSet<String> inner2 = new TreeSet<String>();
		TreeSet<String> inner3 = new TreeSet<String>();

		inner.add("kolio 1");
		inner.add("kolio 4");
		inner.add("kolio 3");
		inner.add("kolio 2");
		inner2.add("pop 1");
		inner2.add("pooo 4");
		inner2.add("popo 3");
		inner3.add("poop 2");
		 map.add(inner);
		 map.add(inner2);
		 map.add(inner3);
		// map.add(4);
		// map.add(5);
		// map.add(36);
		// map.add(36);
		// System.out.println(map.contains(4));
		// System.out.println("SIZE " + map.size());

		 for (Iterator<TreeSet<String>> iterator = map.iterator();
		 iterator.hasNext();) {
		 System.out.println("iter1 " + iterator.next().hashCode());
		for (Iterator<String> iterator2 = inner.iterator(); iterator2.hasNext();) {
			// System.out.println("iter1 "+iterator.next());
			System.out.println(" iter2 " + iterator2.next());
		}
		System.out.println();
		 }

		// for (HashSet<String> in : map) {
		// System.out.println(in);
		// if(iterator.next().equals(3)){
		// iterator.next()
		// System.out.println("eto q troikata");
		// }

		// for(String s : in){
		//
		// }
		// }
		// for (Iterator iterator2 = inner.iterator(); iterator2.hasNext();) {
		// System.out.println(iterator2.next());
		// System.out.println(iterator2.hashCode());
		// }

		// System.out.println(iterator.next());

	}

	@Override
	public int compare(TreeSet<String> w, TreeSet<String> we) {
		// TODO Auto-generated method stub
		return w.size() - we.size();
	}

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return this.compareTo(o);
	}

	// @Override
	// public int compareTo(T arg0) {
	// // TODO Auto-generated method stub
	// return 0;
	// }

	// @Override
	// public int compareTo(TreeSet<String> o ,TreeSet<String> o) {
	// return this.size() - o.size();
	// }

}
