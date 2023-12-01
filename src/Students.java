public class Students {
   int Id;
   String name;

   public Students(int id, String name) {
      Id = id;
      this.name = name;
   }

   @Override
   public String toString() {
      return "Students{" +
              "Id=" + Id +
              ", name='" + name + '\'' +
              '}';
   }
}
