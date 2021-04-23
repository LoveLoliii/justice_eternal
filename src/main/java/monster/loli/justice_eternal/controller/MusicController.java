package monster.loli.justice_eternal.controller;

import monster.loli.justice_eternal.service.PostService;
import monster.loli.justice_eternal.service.ThreadService;
import monster.loli.justice_eternal.vo.PostVO;
import monster.loli.justice_eternal.vo.ThreadVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MusicController {

    final
    ThreadService threadService;
    final
    PostService postService;

    public MusicController(ThreadService threadService, PostService postService) {
        this.threadService = threadService;
        this.postService = postService;
    }

    @GetMapping(path = "hi")
    public String hi(){
        return "hi";
    }


    @GetMapping(path = "getThreadList")
    public LinkedHashMap<String,Object> getThreadList(ThreadVO threadVO){
        LinkedHashMap<String,Object> returnData = new LinkedHashMap<>();


        Map<String, Object> list =  threadService.queryThread(threadVO);
        returnData.put("data",list);
        returnData.put("status","success");
        return returnData;
    }

    @GetMapping(path = "getPostList")
    public LinkedHashMap<String,Object> getPostList(PostVO postVO){
        LinkedHashMap<String,Object> returnData = new LinkedHashMap<>();
        Map<String, Object> list =  threadService.queryThread(threadVO);
        returnData.put("data",list);
        returnData.put("status","success");
        return returnData;

    }
}
