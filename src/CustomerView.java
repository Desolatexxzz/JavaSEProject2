public class CustomerView {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag){
            System.out.println("-----------------客户信息管理软件-----------------\n");
            System.out.println("                 1 添 加 客 户                     ");
            System.out.println("                 2 修 改 客 户                     ");
            System.out.println("                 3 删 除 客 户                     ");
            System.out.println("                 4 客 户 列 表                     ");
            System.out.println("                 5 退      出                     ");
            System.out.println("                 请选择(1-5)：                     ");
            char key = CMUtility.readMenuSelection();
            switch (key){
                case '1':
                    System.out.println("---------------------添加客户---------------------");
                    System.out.println("姓名：");
                    String name = CMUtility.readString(5);
                    System.out.println("性别：");
                    char gender = CMUtility.readChar();
                    System.out.println("年龄：");
                    int age = CMUtility.readInt();
                    System.out.println("电话：");
                    String phone = CMUtility.readString(11);
                    System.out.println("邮箱：");
                    String mail = CMUtility.readString(17);
                    CustomerList.addCustomer(name,gender,age,phone,mail);
                    System.out.println("---------------------添加完成---------------------");
                    break;
                case '2':
                    System.out.println("---------------------修改客户---------------------");
                    System.out.println("请选择待修改客户编号(-1退出)：");
                    int index = CMUtility.readInt();
                    if (index == -1){
                        break;
                    }else {
                        Customer customer = CustomerList.customers.get(index - 1);
                        System.out.print("姓名(" + customer.getName() + ")：");
                        String newName = CMUtility.readString(5,"defaultValue");
                        System.out.print("性别(" + customer.getGender() + ")：");
                        char newGender = CMUtility.readChar('f');
                        System.out.print("年龄(" + customer.getAge() + ")：");
                        int newAge = CMUtility.readInt(-1);
                        System.out.print("电话(" + customer.getPhone() + ")：");
                        String newPhone = CMUtility.readString(11,"defaultValue");
                        System.out.print("邮箱(" + customer.getMail() + ")：");
                        String newMail = CMUtility.readString(17,"defaultValue");
                        CustomerList.changeCustomer(index - 1,newName,newGender,newAge,newPhone,newMail);
                        System.out.println("");
                    }
                    System.out.println("---------------------修改完成---------------------");
                    break;
                case '3':
                    System.out.println("---------------------删除客户---------------------");
                    System.out.println("请选择待删除客户编号(-1退出)：");
                    int index1 = CMUtility.readInt();
                    if (index1== -1){
                        break;
                    }else {
                        System.out.println("确认是否删除(Y/N)：");
                        char se = CMUtility.readConfirmSelection();
                        if (se == 'Y'){
                            CustomerList.delCustomer(index1 - 1);
                        }
                    }
                    System.out.println("---------------------删除完成---------------------");
                    break;
                case '4':
                    CustomerList.showCustomer();
                    break;
                case '5':
                    System.out.println("确认是否退出(Y/N)：");
                    char ss = CMUtility.readConfirmSelection();
                    if (ss == 'Y'){
                        flag = false;
                    }
                    break;
            }
        }
    }
}
