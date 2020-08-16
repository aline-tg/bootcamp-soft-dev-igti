//Script of second part of module 3 in Java
//Created in 2020-08-16 by Aline Guerreiro

public abstract class PersonClass  {
    protected String name;
    protected String document;
    protected String phone;
    protected String address;
    protected String numberAddress;
  
    public abstract String showType();

    public String fullAddress(){
        return address + ", " + numberAddress;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getdocument(){
        return document;
    }
    public void setDocument(String document){
        this.document = document;
    }

    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String getNumberAddress(){
        return numberAddress;
    }

    public void setNumberAddress(String numberAddress){
        this.numberAddress = numberAddress;
    }

    public void updatePersonalData(String name){
        this.name = name;
    }

    public void updatePersonalData(String name, String document){
        this.name = name;
        this.document = document;
    }
}