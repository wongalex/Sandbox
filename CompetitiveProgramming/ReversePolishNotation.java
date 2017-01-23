public int evalRPN(String[] tokens) {
	if(tokens.length == 0) {
		return 0;
	}
	Set<String> operators = new HashSet<String>();
	operators.add("+");
	operators.add("-");
	operators.add("*");
	operators.add("/");
	operators.add("%");
	Stack<String> stack = new Stack<String>();
	for(String s : tokens) {
		if(operators.contains(s)) {
			int num2 = Integer.parseInt(stack.pop());
			int num1 = Integer.parseInt(stack.pop());
			int sum = 0;
			if(s.equals("+")) {
				sum = num1 + num2;
			}
			else if(s.equals("-")) {
				sum = num1 - num2;
			}
			else if(s.equals("*")) {
				sum = num1 * num2;
			}
			else if(s.equals("/")) {
				sum = num1 / num2;
			}
			else if(s.equals("%")) {
				sum = num1 % num2;
			}
			stack.push(String.valueOf(sum));
		}
		else {
			stack.push(s);
		}
	}
	return Integer.parseInt(stack.pop());
}