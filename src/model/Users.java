package model;
public abstract class Users {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public Users(String name, String email){
        this.name = name;
        this.email = email;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return this.address;
    }

    public void setPhoneNumber(String phoneNumber){
        if(phoneNumber.length()>8){
            System.out.println("El número telefónico debe ser de 8 dígitos máximo");
        }else if(phoneNumber.length()==8){
            this.phoneNumber = phoneNumber;
        }
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    @Override
    public String toString() {
        return "User: "+name+", Email: "+email+"\nAddress: "+address+". Phone: "+phoneNumber;
    }

    public abstract void showDataUser();
}

