package monster.loli.justice_eternal.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import monster.loli.justice_eternal.service.PostService;
import monster.loli.justice_eternal.service.ThreadService;
import monster.loli.justice_eternal.vo.PostVO;
import monster.loli.justice_eternal.vo.ThreadVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@Api(value = "justice_eterlnal controller",tags = {"je 接口"})
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
    @ApiOperation(value = "say hi")
    public String hi(){
        return "hi";
    }

    @ApiOperation(value = "获取thread列表")
    @GetMapping(path = "getThreadList")
    public LinkedHashMap<String,Object> getThreadList(ThreadVO threadVO){
        LinkedHashMap<String,Object> returnData = new LinkedHashMap<>();
        Map<String, Object> list =  threadService.queryThread(threadVO);
        returnData.put("data",list);
        returnData.put("status","success");
        return returnData;
    }

    @ApiOperation(value = "获取Post列表")
    @GetMapping(path = "getPostList")
    public LinkedHashMap<String,Object> getPostList(PostVO postVO){
        LinkedHashMap<String,Object> returnData = new LinkedHashMap<>();
        Map<String, Object> list =  postService.queryPost(postVO);
        returnData.put("data",list);
        returnData.put("status","success");
        return returnData;
    }
}
