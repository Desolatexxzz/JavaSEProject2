public class CustomerView {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag){
            System.out.println("-----------------�ͻ���Ϣ�������-----------------\n");
            System.out.println("                 1 �� �� �� ��                     ");
            System.out.println("                 2 �� �� �� ��                     ");
            System.out.println("                 3 ɾ �� �� ��                     ");
            System.out.println("                 4 �� �� �� ��                     ");
            System.out.println("                 5 ��      ��                     ");
            System.out.println("                 ��ѡ��(1-5)��                     ");
            char key = CMUtility.readMenuSelection();
            switch (key){
                case '1':
                    System.out.println("---------------------��ӿͻ�---------------------");
                    System.out.println("������");
                    String name = CMUtility.readString(5);
                    System.out.println("�Ա�");
                    char gender = CMUtility.readChar();
                    System.out.println("���䣺");
                    int age = CMUtility.readInt();
                    System.out.println("�绰��");
                    String phone = CMUtility.readString(11);
                    System.out.println("���䣺");
                    String mail = CMUtility.readString(17);
                    CustomerList.addCustomer(name,gender,age,phone,mail);
                    System.out.println("---------------------������---------------------");
                    break;
                case '2':
                    System.out.println("---------------------�޸Ŀͻ�---------------------");
                    System.out.println("��ѡ����޸Ŀͻ����(-1�˳�)��");
                    int index = CMUtility.readInt();
                    if (index == -1){
                        break;
                    }else {
                        Customer customer = CustomerList.customers.get(index - 1);
                        System.out.print("����(" + customer.getName() + ")��");
                        String newName = CMUtility.readString(5,"defaultValue");
                        System.out.print("�Ա�(" + customer.getGender() + ")��");
                        char newGender = CMUtility.readChar('f');
                        System.out.print("����(" + customer.getAge() + ")��");
                        int newAge = CMUtility.readInt(-1);
                        System.out.print("�绰(" + customer.getPhone() + ")��");
                        String newPhone = CMUtility.readString(11,"defaultValue");
                        System.out.print("����(" + customer.getMail() + ")��");
                        String newMail = CMUtility.readString(17,"defaultValue");
                        CustomerList.changeCustomer(index - 1,newName,newGender,newAge,newPhone,newMail);
                        System.out.println("");
                    }
                    System.out.println("---------------------�޸����---------------------");
                    break;
                case '3':
                    System.out.println("---------------------ɾ���ͻ�---------------------");
                    System.out.println("��ѡ���ɾ���ͻ����(-1�˳�)��");
                    int index1 = CMUtility.readInt();
                    if (index1== -1){
                        break;
                    }else {
                        System.out.println("ȷ���Ƿ�ɾ��(Y/N)��");
                        char se = CMUtility.readConfirmSelection();
                        if (se == 'Y'){
                            CustomerList.delCustomer(index1 - 1);
                        }
                    }
                    System.out.println("---------------------ɾ�����---------------------");
                    break;
                case '4':
                    CustomerList.showCustomer();
                    break;
                case '5':
                    System.out.println("ȷ���Ƿ��˳�(Y/N)��");
                    char ss = CMUtility.readConfirmSelection();
                    if (ss == 'Y'){
                        flag = false;
                    }
                    break;
            }
        }
    }
}
