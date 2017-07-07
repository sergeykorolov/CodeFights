int makeArrayConsecutive2(int[] statues) {
    int result;
    ArrayList list = new ArrayList();

    Arrays.sort(statues);

    for (int i = statues[0]; i <= statues[statues.length - 1]; i++) {
        list.add(i);
    }
    result = list.size() - statues.length;

    return result;
}