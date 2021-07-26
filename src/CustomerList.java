import java.util.ArrayList;
import java.util.Iterator;

public class CustomerList {
    static ArrayList<Customer> customers = new ArrayList<>();
    //����û�����
    public static void addCustomer(String name,char gender,int age,String phone,String mail){
        customers.add(new Customer(name,gender,age,phone,mail));
    }
    //�޸��û�����
    public static void changeCustomer(int i,String name,char gender,int age,String phone,String mail){
        Customer newcus = new Customer();
        Customer oldcus = customers.get(i);
        if (name.equals("defaultValue")){
            newcus.setName(oldcus.getName());
        }else {
            newcus.setName(name);
        }
        if (gender == 'f'){
            newcus.setGender(oldcus.getGender());
        }else {
            newcus.setGender(gender);
        }
        if (age == -1){
            newcus.setAge(oldcus.getAge());
        }else {
            newcus.setAge(age);
        }
        if (phone.equals("defaultValue")){
            newcus.setPhone(oldcus.getPhone());
        }else {
            newcus.setPhone(phone);
        }
        if (mail.equals("defaultValue")){
            newcus.setMail(oldcus.getMail());
        }else {
            newcus.setMail(mail);
        }
        customers.set(i,newcus);
    }
    //ɾ���ͻ�����
    public static void delCustomer(int index){
        customers.remove(index);
    }
    //��ʾ�ͻ��б���
    public static void showCustomer(){
        System.out.println("---------------------------�ͻ��б�---------------------------");
        System.out.println("���\t����\t�Ա�\t����\t�绰\t\t         ����");
        Iterator<Customer> iterator = customers.iterator();
        int count = 1;
        while (iterator.hasNext()) {
            Customer customer = iterator.next();
            System.out.println(count + "\t" + customer.getName() + "\t"
                     + customer.getGender() + "\t" + customer.getAge() + "\t"
                     + customer.getPhone() + "\t\t" + customer.getMail());
            count++;
        }
        System.out.println("-------------------------�ͻ��б����-------------------------");
    }
}
