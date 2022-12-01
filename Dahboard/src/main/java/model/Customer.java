package model;

public class Customer {
    private String fName;
    private String lName; 
    private String phNumber;
    private String address;
    private String username;
    private String password;

    private int accTypeId;
    private int balance;
       
    

    /**
     * @return int return the custId
     */
 

    /**
     * @return String return the custFname
     */
    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }
    public int getBalance() {
        return balance;
    }

    /**
     * @param custLname the custLname to set
     */
    public void setBalance(int balance) {
        this.balance = balance;
    }

    /**
     * @return String return the custLname
     */
    public String getLName() {
        return lName;
    }

    /**
     * @param custLname the custLname to set
     */
    public void setLname(String custLname) {
        this.lName = custLname;
    }

    /**
     * @return String return the phoneno
     */
    public String getPhoneno() {
        return phNumber;
    }

    public void setPhoneNo(String phNumber) {
        this.phNumber = phNumber;
    }

    /**
     * @return String return the address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }  public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAccTypeId() {
        return accTypeId;
    }

    public void setAccTypeId(int accTypeId) {
        this.accTypeId = accTypeId;
    }


    public Customer(String custFname,String custlname,String phNumber, String address,String username,String password){
        
        this.fName=custFname;
        this.lName=custlname;
        this.phNumber=phNumber;
        this.address=address; 
        this.username=username; 
        this.password=password;
    }



    public Customer(String custFname,String custlname,String phoneno, String address){
        this.fName=custFname;
        this.lName=custlname;
        this.phNumber=phoneno;
        this.address=address;

    }

    public Customer(String custFname,String custlname,String phoneno, String address, int accTypeId, int balance){
        this.fName=custFname;
        this.lName=custlname;
        this.phNumber=phoneno;
        this.address=address;
        this.accTypeId=accTypeId; 
        this.balance=balance;        
    }

    
    public Customer(String custFname,String custlname,String phoneno, String address, int accTypeId){
        this.fName=custFname;
        this.lName=custlname;
        this.phNumber=phoneno;
        this.address=address;
        this.accTypeId=accTypeId; 
               
    }

    public Customer(String custFname,String custLname){
        this.fName=custFname;
        this.lName=custLname;
    }

	public Customer(String fname2, String lname2, char gender, String phoneNo, String address2, String username2,
			String password2) {
	    this.fName=fname2;
        this.lName=lname2;
        this.phNumber=phNumber;
        this.address=address; 
        this.username=username; 
        this.password=password;
		// TODO Auto-generated constructor stub
	}

    
   

}
