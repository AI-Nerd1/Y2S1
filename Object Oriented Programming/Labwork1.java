// package labwork1;
// public class Labwork1{
//     public static void main(String[] args) {
//         System.out.println("First programme in Java");
//     }
// }

package labwork1;
import java.util.Date;
/**
* Класс сотрудник (Employee)
*/
public class Employee {
// перечисление полей класса
private String name; // ФИО
private double salary; // размер заработной платы
private Date hiredate; // дата приема на работу
// методы класса (геттеры)
// возвращает имя сотрудника
public String getName() {
return name;
}
//возвращает размер заработной платы сотрудника
public double getSalary() {
return salary;
}
// возвращает дату приема на работу
public Date getDate() {
return hiredate;
}
// методы класса (сеттеры)
// устанавливает имя сотрудника
public void setName(String newname) {
name = newname;
}
// устанавливает размер заработной платы сотрудника
public void setSalary(double newsalary) {
if (newsalary > 0) salary = newsalary;
}
// устанавливает дату приема на работу
public void setDate(Date newhiredate) {
hiredate = newhiredate;
}
// пачатает на консоль информацию об объекте
public void toConsole() {
System.out.println("ФИО: " + name);
System.out.println("Зарплата: " + salary + " руб.");
System.out.println("Дата приема на работу: " + hiredate.toString());
}
}