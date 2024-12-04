public class AplikasiTodolist {

  public static String[] model = new String[10];

  public static void main(String[] args) {
    testAddTodoList();
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

  static void testShowTodoList() {
    model[0] = "Belajar Java Dasar";
    model[1] = "Studi Kasus Java Dasar: Todolist";

    showTodoList();
  }

  // Menambahkan todo ke list
  public static void addTodoList(String todo) {
    // Cek apakah model penuh?
    var isFull = true;
    for (var i = 0; i < model.length; i++) {
      if (model[i] == null) {
        // Model masih ada yang kosong
        isFull = false;
        break;
      }
    }

    // Jika penuh, resize ukuran array menjadi 2x lipat
    if (isFull) {
      var temp = model;
      model = new String[model.length * 2];

      for (var i = 0; i < temp.length; i++) {
        model[i] = temp[i];
      }
    }

    // Tambahkan  ke posisi yang data array nya kosong/NULL
    for (var i = 0; i < model.length; i++) {
      if (model[i] == null) {
        model[i] = todo;
        break;
      }
    }
  }

  public static void testAddTodoList() {
    for (var i = 0; i < 25; i++) {
      addTodoList("Testing todo ke-" + i);
    }

    showTodoList();
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
