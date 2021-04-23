package monster.loli.justice_eternal.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import monster.loli.justice_eternal.mapper.PostMapper;
import monster.loli.justice_eternal.mapper.ThreadMapper;
import monster.loli.justice_eternal.service.PostService;
import monster.loli.justice_eternal.util.PaginationBuilder;
import monster.loli.justice_eternal.vo.PostVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostMapper postMapper;
    @Override
    public Map<String, Object> queryPost(PostVO postVO) {
        Map<String, Object> paramMap = new HashMap<>();
        
        paramMap.put("id", postVO.getId());
        paramMap.put("content", postVO.getContent());
        paramMap.put("author", postVO.getAuthor());
        paramMap.put("sort", "createTime");
        paramMap.put("sequence", "DESC");

        Page<Object> page = PageHelper.startPage(postVO.getCurrentPage(), postVO.getPageSize());
        List<LinkedHashMap<String, Object>> resultList =  postMapper.queryPost(paramMap);

        return PaginationBuilder.buildResult(resultList, page.getTotal(), postVO.getCurrentPage(), postVO.getPageSize());
    }
}
