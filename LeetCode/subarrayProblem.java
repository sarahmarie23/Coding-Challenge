public static int subarrayProblem(int[] arr, int k) {
		int count = 0;
		int length = arr.length;
		
		Set<List<Integer>> set = new HashSet<List<Integer>>();
		
		//Adding all the subarrays to the set
		//They need to be converted into Integer lists first though
		for(int i = 0; i < length; i++) {
			for(int j = length-1; j >= i; j--) {
				int[] subSet = Arrays.copyOfRange(arr, i, j+1); //The subset we are currently dealing with
				Integer[] subSetInteger = Arrays.stream(subSet).boxed().toArray(Integer[]::new); //converting it to an Integer array
				List<Integer> subSetList = Arrays.asList(subSetInteger); //then converting it to a List so we can deal with duplicates
				set.add(subSetList);
			}
		}
		
		//Now we need to go through each List in the Set, and only add up the ones that have <= k odd numbers
		int oddCount = 0;
		
		for(List<Integer> list : set) {
			for(int a = 0; a < list.size(); a++) {
				int currElement = list.get(a);
				if(currElement%2 == 1) {
					oddCount++;
				}
			}
			if(oddCount > k) {
				oddCount = 0;
			} else {
				count++;
				oddCount = 0;
			}
		}
		
		return count;
	}
