package monster.loli.justice_eternal.service.impl;

import monster.loli.justice_eternal.entity.JeVisit;
import monster.loli.justice_eternal.mapper.JeVisitMapper;
import monster.loli.justice_eternal.service.BaseService;
import monster.loli.justice_eternal.util.SnowFlake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
 @Service
public class BaseServiceImpl implements BaseService {
    final
    JeVisitMapper jeVisitMapper;

     public BaseServiceImpl(JeVisitMapper jeVisitMapper) {
         this.jeVisitMapper = jeVisitMapper;
     }

     @Override
    public Map<String, Object> addVisitCount() {
         SnowFlake sn = new SnowFlake(0,0);
         JeVisit newOne = new JeVisit();
         newOne.setId(sn.nextId());
         newOne.setCreateTime(new Date());
        jeVisitMapper.insertSelective(newOne);

        int counts = jeVisitMapper.count();
         LinkedHashMap<String,Object> data = new LinkedHashMap<>();
         data.put("counts",counts);
        return data;
    }
}
