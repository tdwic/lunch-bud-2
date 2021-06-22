package com.example.dd.controller;

import com.example.dd.entity.Friend;
import com.example.dd.entity.User;
import com.example.dd.models.FriendModel;
import com.example.dd.models.UserModel;
import com.example.dd.services.FriendService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class FriendController {

    private FriendService friendService;

    public FriendController(FriendService friendService) {
        this.friendService = friendService;
    }

    @RequestMapping(value = "/getAllFriends", method = RequestMethod.GET)
    public List<Friend> GetAllFriends(){
        return friendService.GetAllFriends();
    }

    @RequestMapping(value = "/newFriend", method = RequestMethod.POST)
    public FriendModel NewFriend(@RequestBody FriendModel friendModel){
        return friendService.RegisterNewFriend(friendModel);
    }

    @RequestMapping(value = "/removeFriendByID/{friendID}", method = RequestMethod.DELETE)
    public boolean RemoveFriendByID(@PathVariable  String friendID){
        return friendService.RemoveFriendByID(friendID);
    }
}
