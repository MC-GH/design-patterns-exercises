package singleton;

import java.util.ArrayList;
import java.util.Arrays;

public class MemberList {
    private static MemberList memberList;
    private ArrayList<String> members;
    private int amountOfMembers;

    private MemberList() {
        members = new ArrayList<>();
        members.addAll(Arrays.asList("Jos","Bert","Michaël"));
        amountOfMembers = members.size();
    }

    public static MemberList getInstance() {
        if(memberList == null) {
            memberList = new MemberList();
        }
        return memberList;
    }

    public void addMemberToList(String name) {
        members.add(name);
        increaseAmountOfMembers();
    }

    private void increaseAmountOfMembers() {
        amountOfMembers++;
    }

    public ArrayList<String> getMembers() {
        return members;
    }

    public int getAmountOfMembers() {
        return amountOfMembers;
    }

}
