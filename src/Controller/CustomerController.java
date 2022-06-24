package Controller;

import Entity.CustomerEntity;
import GUI.AllObjectController;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CustomerController {
   public void insertData(int id_customer, String nama_customer,String username, String password, String noTelp){
       AllObjectModel.cstmModel.insertData(new CustomerEntity(id_customer,nama_customer,username,password,noTelp));
   }

   public void deleteData(String username){
       AllObjectModel.cstmModel.deleteData(username);
   }

    public void updatePassword(String password, String username){
       AllObjectModel.cstmModel.updatePassword(password,username);
    }

    public void login (int id, String password){
       AllObjectModel.cstmModel.cekLogin(id,password);
    }

    public DefaultTableModel viewCustomer(){
       return AllObjectController.customerController.viewCustomer();
    }
}
