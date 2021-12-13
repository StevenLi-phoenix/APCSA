# A Sorted Integer List

File IntList.java contains code for an integer list class. Save it to your directory and study it; notice that the only things you can do are create a list of a fixed size and add an element to a list. If the list is already full, a message will be printed. File ListTest.java contains code for a class that creates an IntList, puts some values in it, and prints it. Save this to your directory and compile and run it to see how it works. 

Now write a class SortedIntList that extends IntList. SortedIntList should be just like IntList except that its elements should always be in sorted order from smallest to largest. This means that when an element is inserted into a SortedIntList it should be put into its sorted place, not just at the end of the array.  To do this you’ll need to do two things when you add a new element:
·	Walk down the array until you find the place where the new element should go.  Since the list is already sorted you can just keep looking at elements until you find one that is at least as big as the one to be inserted.  
·	Move down every element that will go after the new element, that is, everything from the one you stop on to the end.  This creates a slot in which you can put the new element.  Be careful about the order in which you move them or you’ll overwrite your data!
Now you can insert the new element in the location you originally stopped on.

All of this will go into your add method, which will override the add method for the IntList class. (Be sure to also check to see if you need to expand the array, just as in the IntList add method.)  What other methods, if any, do you need to override?  

To test your class, modify ListTest.java so that after it creates and prints the IntList, it creates and prints a SortedIntList containing the same elements (inserted in the same order).  When the list is printed, they should come out in sorted order.

# 排序的整数列表

文件 IntList.java 包含整数列表类的代码。将其保存到您的目录中并进行研究；请注意，您唯一能做的就是创建一个固定大小的列表并将一个元素添加到列表中。如果列表已满，则会打印一条消息。文件 ListTest.java 包含用于创建 IntList、在其中放置一些值并打印它的类的代码。将其保存到您的目录中并编译并运行它以查看它是如何工作的。

现在编写一个扩展 IntList 的类 SortedIntList。 SortedIntList 应该和 IntList 一样，只是它的元素应该总是按照从小到大的顺序排列。这意味着当一个元素被插入到 SortedIntList 时，它应该被放到它的排序位置，而不仅仅是在数组的末尾。为此，您在添加新元素时需要做两件事：
· 沿着数组走下去，直到找到新元素应该去的地方。由于列表已经排序，您可以继续查看元素，直到找到至少与要插入的元素一样大的元素。
· 向下移动将跟随新元素的每个元素，即从您停止的元素到结尾的所有元素。这将创建一个插槽，您可以在其中放置新元素。请注意移动它们的顺序，否则会覆盖数据！
现在您可以在最初停止的位置插入新元素。

所有这些都将进入您的 add 方法，该方法将覆盖 IntList 类的 add 方法。 （一定还要检查是否需要扩展数组，就像在 IntList add 方法中一样。）您还需要覆盖哪些其他方法（如果有）？

要测试您的类，请修改 ListTest.java，以便在它创建并打印 IntList 之后，它会创建并打印包含相同元素（以相同顺序插入）的 SortedIntList。打印列表时，它们应该按排序顺序出现。
