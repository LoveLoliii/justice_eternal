package monster.loli.justice_eternal.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import monster.loli.justice_eternal.mapper.ThreadMapper;
import monster.loli.justice_eternal.service.ThreadService;
import monster.loli.justice_eternal.util.PaginationBuilder;
import monster.loli.justice_eternal.vo.ThreadVO;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class ThreadServiceImpl implements ThreadService {
    final
    ThreadMapper threadMapper;
    //构造器注入 spring会自动加上 不需要@Autoried
    public ThreadServiceImpl(ThreadMapper threadMapper) {
        this.threadMapper = threadMapper;
    }


    @Override
    public Map<String, Object> queryThread(ThreadVO threadVO) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("id", threadVO.getId());
        paramMap.put("type", threadVO.getTitle());
        paramMap.put("author", threadVO.getAuthor());
        paramMap.put("sort", "createTime");
        paramMap.put("sequence", "DESC");

        Page<Object> page = PageHelper.startPage(threadVO.getCurrentPage(), threadVO.getPageSize());
        List<LinkedHashMap<String, Object>> resultList =  threadMapper.queryThread(paramMap);
        return PaginationBuilder.buildResult(resultList, page.getTotal(), threadVO.getCurrentPage(), threadVO.getPageSize());
    }
}
