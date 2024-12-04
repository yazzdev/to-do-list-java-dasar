public class AplikasiTodolist {

  public static String[] model = new String[10];

  public static void main(String[] args) {
    testRemoveTodoList();
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
  public static boolean removeTodoList(Integer number) {
    if ((number - 1) >= model.length) {
      return false;
    } else if (model[number - 1] == null) {
      return false;
    } else {
      for (int i = (number - 1); i < model.length; i++) {
        if (i == (model.length - 1)) {
          model[i] = null;
        } else {
          model[i] = model[i + 1];
        }
      }
      return true;
    }
  }

  public static void testRemoveTodoList() {
    addTodoList("satu");
    addTodoList("dua");
    addTodoList("tiga");
    addTodoList("empat");
    addTodoList("lima");

    System.out.println("Data Awal Setelah Tambah");
    showTodoList();
    var result = removeTodoList(20);
    System.out.println(result);

    System.out.println("Testing 1");
    showTodoList();
    result = removeTodoList(7);
    System.out.println(result);

    System.out.println("Testing 2");
    showTodoList();
    result = removeTodoList(2);
    System.out.println(result);

    System.out.println("Hasil Akhir Setelah Hapus");
    showTodoList();
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
