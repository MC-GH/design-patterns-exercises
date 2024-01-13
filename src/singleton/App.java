package singleton;

public class App {

    public static void main(String[] args) {

        MemberList memberList1 = MemberList.getInstance();
        System.out.println("Current members of memberList1: " + memberList1.getMembers());
        System.out.println("Amount: " + memberList1.getAmountOfMembers());
        memberList1.addMemberToList("Vera");
        memberList1.addMemberToList("Peter");

        System.out.println("\n2 members added:");

        System.out.println("Current members of memberList1: " + memberList1.getMembers());
        System.out.println("Amount: " + memberList1.getAmountOfMembers());

        MemberList memberList2 = MemberList.getInstance();
        System.out.println("\nCurrent members of memberList2: " + memberList2.getMembers());
        System.out.println("Amount: " + memberList2.getAmountOfMembers());
    }


}
