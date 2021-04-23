package monster.loli.justice_eternal.mapper;

import monster.loli.justice_eternal.entity.Thread;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface ThreadMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Thread record);

    int insertSelective(Thread record);

    Thread selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Thread record);

    int updateByPrimaryKey(Thread record);

    List<LinkedHashMap<String, Object>> queryThread(Map<String, Object> paramMap);
}