public class Entry{
    private String service;
    private String username;
    private String password;

    public Entry(String service, String username, String password){
      this.service = service;
      this.username = username;
      this.password = password;}

    public String getService(){
        return service;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public String toFileString(){
        return service + "," + username + "," + password;
    }
}
