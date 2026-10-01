
public class BuddyInfo{


    public BuddyInfo(String name, String school, int phoneNumber) {
        this.name = name;
    }

    private String name;

    static void main() {
        BuddyInfo Buddy = new BuddyInfo("Homer", "Carleton", 143);

        System.out.println("Hello " + Buddy.name);
    }

    public String getName(){
        return this.name;
    }
}
