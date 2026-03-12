package question2;

import java.util.HashMap;

public class HashMapChild<String> extends HashMap<String, String>  {
    @Override
    public String put(String user, String pass)  {
        try {
            if(this.containsKey(user)) {
                throw new UserNameExist();
            }
            else {
                super.put(user,pass);
                System.out.println("User Added Successfully !!");
                return user;
            }
        }catch (UserNameExist e) {
            System.out.println("User ALready Exists " + e.getMessage());
        }
        catch (Exception e)  {
            System.out.println(e.getMessage());
        }
        return (String) "";
    }


}
class UserNameExist extends  Exception {
    UserNameExist() {
        super("User Name Already Exist in database");
    }
}
