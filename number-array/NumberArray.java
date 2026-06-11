int max = array[0];
int index = 1;
for (int j = 0; j < array.length; j++) {
    if (array[j] > max) {
        max = array[j];
        index = j + 1;
    }
}
System.out.println("The largest property value in the list is " + max + " ,at position " + index);