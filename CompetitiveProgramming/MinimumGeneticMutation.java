public int minMutation(String start, String end, String[] bank) {
	if(bank.length == 0) {
		return -1;
	}
	List<Character> genes = new ArrayList<Character>();
	genes.add('A');
	genes.add('C');
	genes.add('G');
	genes.add('T');
	int level = 0;
	HashSet<String> hashBank = new HashSet<String>();
	for(String str : bank) {
		hashBank.add(str);
	}
	HashSet<String> visited = new HashSet<String>();
	Queue<String> currQueue = new LinkedList<String>();
	Queue<String> nextQueue = new LinkedList<String>();
	currQueue.add(start);
	visited.add(start);
	while(!currQueue.isEmpty()) {
		char[] permutation = currQueue.poll().toCharArray();
		for(int i = 0; i < permutation.length; i++) {
			char hold = permutation[i];
			for(char c : genes) {
				permutation[i] = c;
				String target = String.valueOf(permutation);
				if(hashBank.contains(target) && target.equals(end)) {
					return level + 1;
				}
				if(hashBank.contains(target) && !visited.contains(target)) {
					nextQueue.add(target);
					visited.add(target);
				}
			}
			permutation[i] = hold;
		}
		if(currQueue.isEmpty()) {
			Queue<String> temp = new LinkedList<String>();
			currQueue = nextQueue;
			nextQueue = temp;
			level++;
		}
	}
	return -1;
}