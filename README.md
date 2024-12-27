# Java TodoList Application

Welcome to the **Java TodoList Application**, a simple and functional console-based program to manage your tasks effectively! This application is created using fundamental Java concepts such as arrays, methods, and user input handling. It also provides options to add, update, and remove todos.

## Features
- **View Todo List**: Display all the tasks in your Todo List.
- **Add Todo**: Add a new task to your Todo List.
- **Update Todo**: Modify an existing task.
- **Remove Todo**: Delete a task from your Todo List.
- **Dynamic Array Resizing**: Automatically resizes the list when it reaches its capacity.

## Menu Options
1. **Add Todo**: Adds a new task to the list.
2. **Remove Todo**: Deletes a task by its number.
3. **Update Todo**: Updates an existing task by its number.
4. **Exit**: Closes the application.

## Usage
1. **Run the Program**
   Compile and execute the program using the following commands:
   ```bash
   javac AplikasiTodolist.java
   java AplikasiTodolist
   ```
2. **Interact with the Menu**
    - Choose an option from the menu by entering the corresponding number or `x` to exit.
    - Follow the prompts to add, update, or remove tasks.

## Sample Output
Here is an example of how the application works:
```
----------------
>>> TODOLIST <<<
1. Learn Java Basics
2. Complete Java Project
Menu
1. Tambah
2. Hapus
3. Update
x. Keluar
Pilih : 3
>> UPDATE TODO <<
Nomor Todo yang akan diupdate (x for cancel): 1
Todo baru: Learn Advanced Java
Todo berhasil diupdate!
----------------
>>> TODOLIST <<<
1. Learn Advanced Java
2. Complete Java Project
```

## Highlights
- **Error Handling**: Provides meaningful error messages for invalid inputs (e.g., invalid task number for update or delete).
- **User-Friendly Input**: Clear prompts to guide the user throughout the application.
- **Expandable Todo List**: Automatically increases the size of the array when adding more tasks.

## How It Works
### Core Logic
- The application uses a fixed-size array (`model`) to store tasks.
- Dynamic resizing ensures that users can add unlimited tasks.
- Methods are structured to separate business logic (e.g., adding, updating, removing) from user interaction.

### Key Functions
- `addTodoList(String todo)`: Adds a new task to the list.
- `removeTodoList(int number)`: Removes a task by its index.
- `updateTodoList(int number, String newTodo)`: Updates an existing task.
- `showTodoList()`: Displays the list of tasks.

## Future Improvements
- Implement persistent storage (e.g., save tasks to a file or database).
- Add more advanced features like task prioritization, due dates, and search functionality.
- Build a graphical user interface (GUI) for a better user experience.

## Author
© 2024 Dyaz Amrullah

Created by a passionate Java learner as part of a study project. Contributions are always welcome!

---