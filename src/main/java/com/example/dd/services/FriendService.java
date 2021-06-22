package com.example.dd.services;

import com.example.dd.entity.Friend;
import com.example.dd.entity.User;
import com.example.dd.models.FriendModel;
import com.example.dd.models.UserModel;
import com.example.dd.repository.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FriendService {

    @Autowired
    private FriendRepository friendRepository;

    public List<Friend> GetAllFriends(){
        List<Friend> friendList =new ArrayList<>();

        try {
            friendList = friendRepository.findAll();
        } catch (Exception ex) {
            System.out.println("Friend Exception " + ex);
            throw ex;
        }

        return  friendList;
    }

    public FriendModel RegisterNewFriend(FriendModel friend) {

        Friend friendObject = new Friend();
        friendObject.setId(friend.getId());
        friendObject.setFirstName(friend.getFirstName());
        friendObject.setLastName(friend.getLastName());
        friendObject.setPhoneNumber(friend.getPhoneNumber());

        try{
            friendObject = friendRepository.save(friendObject);
        }catch (Exception ex){
            System.out.println("New Friend Exception " + ex);
            throw ex;
        }

        FriendModel friendReturnModel = new FriendModel();
        friendReturnModel.setId(friendObject.getId());
        friendReturnModel.setFirstName(friendObject.getFirstName());
        friendReturnModel.setLastName(friendObject.getLastName());
        friendReturnModel.setPhoneNumber(friendObject.getPhoneNumber());

        return  friendReturnModel;
    };

    public boolean RemoveFriendByID(String ID){
        try{
            friendRepository.deleteById(ID);
            return true;
        }catch (Exception ex){
            System.out.println("Remove Friend Exception " + ex);
            return false;
        }
    }

}
