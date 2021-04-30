package monster.loli.justice_eternal.mapper;

import monster.loli.justice_eternal.entity.JeVisit;

public interface JeVisitMapper {
    int deleteByPrimaryKey(Long id);

    int insert(JeVisit record);

    int insertSelective(JeVisit record);

    JeVisit selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(JeVisit record);

    int updateByPrimaryKey(JeVisit record);

    int count();
}