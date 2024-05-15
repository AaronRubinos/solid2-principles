# solid2-principles

The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers.

Currently, the Student object has methods like borrowBook(), borrowJournal() with a parameter of title, which directly depend on specific resource types.

To adhere to the Dependency Inversion Principle (DIP) and ensure flexibility for future changes (such as introducing audio books or e-journals), we need to refactor the program while maintaining SOLID principles. The goal is to create a robust system that can seamlessly accommodate new resource types in the future.

# UML DIAGRAM
![Solid](https://github.com/AaronRubinos/solid2-principles/assets/142986554/d7bdbd80-2c40-4231-987f-7c9e2d5d9728)
