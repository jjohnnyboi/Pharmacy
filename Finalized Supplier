package pharmacysystem;

import java.io.Serializable;
import java.util.ArrayList;



public class Supplier implements Serializable {

    private String Sname;
    private String CompanyName;
    private String Address;
    private int SuppPhone;
    private String lastorder;

    public String getSname() {
        return Sname;
    }

    public void setSname(String Sname) {
        this.Sname = Sname;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getSuppPhone() {
        return SuppPhone;
    }

    public void setSuppPhone(int SuppPhone) {
        this.SuppPhone = SuppPhone;
    }

    public String getLastorder() {
        return lastorder;
    }

    public void setLastorder(String lastorder) {
        this.lastorder = lastorder;
    }

    public Supplier() {
        this.Sname = "";
        this.Address = "";
        this.CompanyName = "";
        this.lastorder = "";
        this.SuppPhone = 0;

    }

    public Supplier(String Sname, String CompanyName, String Address, int SuppPhone, String lastorder) {
        this.Sname = Sname;
        this.Address = Address;
        this.CompanyName = CompanyName;
        this.lastorder = lastorder;
        this.SuppPhone = SuppPhone;

    }

     public static ArrayList<Supplier> readAllSupplier() {
        ArrayList<Supplier> supplierList = fileSave.readFile("suplist.dat");
        return supplierList;
    }
    
      public static void addSupplier( Supplier sup ) {
        ArrayList<Supplier> supplierList = readAllSupplier();
        supplierList.add(sup);
        fileSave.saveFile("suplist", supplierList);
    }
}
