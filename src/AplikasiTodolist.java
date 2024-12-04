public class AplikasiTodolist {

  public static String[] model = new String[10];

  public static void main(String[] args) {
    testShowTodoList();
  }

  /**
   * Business Logic
   */

  // Menampilkan todo list
  public static void showTodoList() {
    for (var i = 0; i < model.length; i++) {
      var todo = model[i];
      var no = i + 1;

      if (todo != null) {
        System.out.println(no + ". " + todo);
      }
    }
  }

  private static void testShowTodoList() {
    model[0] = "Belajar Java Dasar";
    model[1] = "Studi Kasus Java Dasar: Todolist";

    showTodoList();
  }

  // Menambahkan todo ke list
  public static void addTodoList() {

  }

  // Menghapus todo dari list
  public static void removeTodoList() {

  }

  /**
   * View
   */

  // View menampilkan todo list
  public static void viewShowTodoList() {

  }

  // View menambahkan todo ke list
  public static void viewAddTodoList() {

  }

  // View menghapus todo dari list
  public static void viewRemoveTodoList() {

  }
}
