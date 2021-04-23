package monster.loli.justice_eternal.service;

import monster.loli.justice_eternal.vo.PostVO;

import java.util.Map;

public interface PostService {
    Map<String, Object> queryPost(PostVO postVO);
}
