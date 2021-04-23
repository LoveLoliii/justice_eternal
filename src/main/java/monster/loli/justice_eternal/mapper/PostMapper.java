package monster.loli.justice_eternal.mapper;

import monster.loli.justice_eternal.entity.Post;import java.util.LinkedHashMap;import java.util.List;import java.util.Map;

public interface PostMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Post record);

    int insertSelective(Post record);

    Post selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKey(Post record);

    List<LinkedHashMap<String, Object>> queryPost(Map<String, Object> paramMap);
}